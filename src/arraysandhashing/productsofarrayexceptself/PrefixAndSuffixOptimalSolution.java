package arraysandhashing.productsofarrayexceptself;

import print.PrintArray;

public class PrefixAndSuffixOptimalSolution {
    static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        PrintArray.printArray(productExceptSelf(nums));
        int[] nums1 = {-1,0,1,2,3};
        PrintArray.printArray(productExceptSelf(nums1));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0]=1 ; // No elements to the left of the first element
        for(int i = 1;i<n;i++){
            prefix[i] = prefix[i-1]* nums[i-1];
        }
        int suffix = 1; // No elements to the right of the last element
        for(int i = n-1; i>=0;i--){
            prefix[i] = prefix[i]*suffix;
            suffix = suffix*nums[i];
        }
        return prefix;
    }
}
/*

This is the **optimal solution** that uses only one additional array (for prefix products) and a variable for suffix product.
TC: O(n) - We have two separate loops, each iterating through the array of size n.
SC: O(n) - We are using one additional array of size n to store the prefix

## The suffix code (focus part)

```java
int suffix = 1;
for (int i = n - 1; i >= 0; i--) {
    result[i] *= suffix;
    suffix *= nums[i];
}
```

---

## 🧠 What is `suffix`?

`suffix` stores the **product of all elements to the RIGHT of index `i`**.

Instead of a suffix array, we **build it on the fly** while moving from right → left.

---

## 🔢 Example Walkthrough

### Input

```java
nums = [1, 2, 3, 4]
```

After the **prefix loop**, `result` already contains:

```java
result = [1, 1, 2, 6]
```

(These are prefix products)

---

## Step-by-step suffix loop

### Initial

```java
suffix = 1
```

---

### 🔹 i = 3

```java
result[3] *= suffix;   // 6 * 1 = 6
suffix *= nums[3];     // 1 * 4 = 4
```

State:

```java
result = [1, 1, 2, 6]
suffix = 4
```

👉 No elements on the right of index 3, so suffix = 1 was correct.

---

### 🔹 i = 2

```java
result[2] *= suffix;   // 2 * 4 = 8
suffix *= nums[2];     // 4 * 3 = 12
```

State:

```java
result = [1, 1, 8, 6]
suffix = 12
```

👉 Right side of index 2 is `[4]`

---

### 🔹 i = 1

```java
result[1] *= suffix;   // 1 * 12 = 12
suffix *= nums[1];     // 12 * 2 = 24
```

State:

```java
result = [1, 12, 8, 6]
suffix = 24
```

👉 Right side of index 1 is `[3, 4]`

---

### 🔹 i = 0

```java
result[0] *= suffix;   // 1 * 24 = 24
suffix *= nums[0];     // 24 * 1 = 24
```

Final:

```java
result = [24, 12, 8, 6]
```

---

## ✅ Why this works

At each index `i`:

```
result[i] = (product of elements LEFT of i)
          × (product of elements RIGHT of i)
```

* **Left product** → already stored in `result[i]`
* **Right product** → stored in `suffix`

---

## 🔁 Mental Model (Easy to remember)

* First loop:
  👉 “Carry prefix from left to right”
* Second loop:
  👉 “Carry suffix from right to left”

---

## ⏱ Complexity

* **Time**: `O(n)`
* **Extra Space**: `O(1)` (result array doesn’t count)

---

## ⭐ Interview Tip (One-liner explanation)

> “I first store prefix products in the result array, then multiply them with a running suffix product while traversing from the right.”
 */