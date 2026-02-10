package arraysandhashing.productsofarrayexceptself;

import print.PrintArray;

public class PrefixAndSuffixSolution {
    static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        PrintArray.printArray(productExceptSelf(nums));
        int[] nums1 = {-1,0,1,2,3};
        PrintArray.printArray(productExceptSelf(nums1));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        int [] result = new int[n];
        prefix[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        suffix[n - 1] = 1; // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}
/*
Idea

prefix[i] → product of elements left of i
suffix[i] → product of elements right of i
Multiply both

Time Complexity: O(n) - We have three separate loops, each iterating through the array of size n.
Space Complexity: O(n) - We are using three additional arrays of size n to store the prefix products, suffix products, and the final results.

---

## 🔢 Example Input
nums = [1, 2, 3, 4]

Expected output:
[24, 12, 8, 6]

## Step 1️⃣ Initialize arrays

n = 4
prefix = [0, 0, 0, 0]
suffix = [0, 0, 0, 0]
result = [0, 0, 0, 0]

## Step 2️⃣ Build `prefix` array

prefix[0] = 1;

### Loop:

prefix[i] = prefix[i - 1] * nums[i - 1]

| i | Calculation           | prefix         |
| - | --------------------- | -------------- |
| 0 | given                 | `[1, 0, 0, 0]` |
| 1 | `1 * nums[0] = 1 * 1` | `[1, 1, 0, 0]` |
| 2 | `1 * nums[1] = 1 * 2` | `[1, 1, 2, 0]` |
| 3 | `2 * nums[2] = 2 * 3` | `[1, 1, 2, 6]` |

✅ **prefix[i] = product of elements LEFT of i**

## Step 3️⃣ Build `suffix` array

suffix[n - 1] = 1;

### Loop:

suffix[i] = suffix[i + 1] * nums[i + 1]

| i | Calculation             | suffix           |
| - | ----------------------- | ---------------- |
| 3 | given                   | `[0, 0, 0, 1]`   |
| 2 | `1 * nums[3] = 1 * 4`   | `[0, 0, 4, 1]`   |
| 1 | `4 * nums[2] = 4 * 3`   | `[0, 12, 4, 1]`  |
| 0 | `12 * nums[1] = 12 * 2` | `[24, 12, 4, 1]` |

✅ **suffix[i] = product of elements RIGHT of i**

---

## Step 4️⃣ Build `result` array

result[i] = prefix[i] * suffix[i];

| i | prefix[i] | suffix[i] | result[i] |
| - | --------- | --------- | --------- |
| 0 | 1         | 24        | 24        |
| 1 | 1         | 12        | 12        |
| 2 | 2         | 4         | 8         |
| 3 | 6         | 1         | 6         |

---

## ✅ Final Output


[24, 12, 8, 6]

---

## 🧠 Key Intuition (Interview Gold)

* `prefix[i]` → everything **before** index `i`
* `suffix[i]` → everything **after** index `i`
* Multiply them → product of array **except self**

--- **Optimization**: We can optimize space by using the `result` array to store prefix products and then multiplying with suffix products on the fly, eliminating the need for a separate `suffix` array. This would reduce space complexity to O(1) (excluding the output array).

 */