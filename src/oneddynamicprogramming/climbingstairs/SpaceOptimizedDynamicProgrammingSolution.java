package oneddynamicprogramming.climbingstairs;

import arrays.print.PrintItem;

public class SpaceOptimizedDynamicProgrammingSolution {
    public static void main(String[] args) {
        int n = 2;
        PrintItem.print(climbStairs(n));
        int n1 =3;
        PrintItem.print(climbStairs(n1));
        int n2 =5;
        PrintItem.print(climbStairs(n2));
    }

    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int prev1 = 1;
        int prev2 = 2;

        for(int i=3; i<=n;i++){
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;

    }
}
/*
TC: O(n)
SC: O(1)

---
## ⭐ Space-Optimized DP Logic (Core Idea)

### 🔑 Observation

To reach step `n`, you only need:

* ways to reach step `n - 1`
* ways to reach step `n - 2`

You **do NOT** need the entire DP array.

---

## 🧠 Why DP Array Is Wasteful

In bottom-up DP:

```
dp[i] = dp[i-1] + dp[i-2]
```

Once `dp[i]` is computed:

* `dp[i-3]`, `dp[i-4]`, etc. are **never used again**
* Only the **last two values** matter

So instead of storing `dp[1..n]`, we keep **just two variables**.

---

## 🔄 Variable Meaning

Think of it like this:

| Variable | Represents                 |
| -------- | -------------------------- |
| `prev1`  | ways to reach step `i - 2` |
| `prev2`  | ways to reach step `i - 1` |
| `curr`   | ways to reach step `i`     |

At every step, we **slide forward**.

---

## 🪜 Step-by-Step Logic (Conceptual)

### Initial State

For the first two steps:

* Step 1 → 1 way
* Step 2 → 2 ways

So:

```
prev1 = 1   // step 1
prev2 = 2   // step 2
```

---

### Loop Forward

For each new step `i`:

```
curr = prev1 + prev2
```

Why?

* From `i-1` → 1 step jump
* From `i-2` → 2 step jump

Then shift:

```
prev1 = prev2
prev2 = curr
```

This mimics moving from:

```
(i-2, i-1) → (i-1, i)
```

---

## 🧪 Example (n = 5)

| Step | prev1 | prev2 | curr |
| ---- | ----- | ----- | ---- |
| Init | 1     | 2     | —    |
| i=3  | 1     | 2     | 3    |
| i=4  | 2     | 3     | 5    |
| i=5  | 3     | 5     | 8    |

Final answer = `prev2 = 8`

---

## 🔁 What’s Really Happening

This is **Fibonacci sequence** starting from:

```
1, 2, 3, 5, 8 ...
```

Each number depends only on the previous two.

---

## ⏱ Complexity (Why This Is Best)

| Metric | Value    |
| ------ | -------- |
| Time   | **O(n)** |
| Space  | **O(1)** |

* Same speed as DP array
* **Constant memory**
* Cleanest and most efficient

---

## 🎯 Interview One-Liner

> “Since each state depends only on the previous two, I optimized space by keeping just two variables instead of a DP array.”
 */