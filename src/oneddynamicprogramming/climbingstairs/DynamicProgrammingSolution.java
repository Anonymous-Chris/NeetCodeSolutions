package oneddynamicprogramming.climbingstairs;

import arraysandhashing.print.PrintItem;

public class DynamicProgrammingSolution {
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
        int [] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
/*
No recursion
If n = 1 → only 1 way
If n = 2 → 2 ways (1+1, 2)
--
int[] dp = new int[n + 1];
What this means:
    dp[i] = number of ways to reach step i
    Array size is n + 1 because:
    We want to access index n
    Index 0 is unused (for simplicity)
--
TC: O(n)
SC: O(n)

--

## 🚶 Problem Recap (n = 5)

You can climb:

* **1 step** or
* **2 steps**

Goal: **How many distinct ways** to reach step 5?

---

## 🧠 DP Definition (Very Important)

We define:

```
dp[i] = number of ways to reach step i
```

---

## 🪜 Step-by-Step Walkthrough

### 🔹 Step 1: Create DP Array

```java
int[] dp = new int[n + 1];
```

For `n = 5`, array size = `6`:

```
Index: 0  1  2  3  4  5
dp:    0  0  0  0  0  0
```

(We ignore index `0`.)

---

### 🔹 Step 2: Fill Base Cases

```java
dp[1] = 1;
dp[2] = 2;
```

Why?

* Step 1 → only **1 way**
* Step 2 → **(1+1), (2)**

Now array becomes:

```
Index: 0  1  2  3  4  5
dp:    0  1  2  0  0  0
```

---

### 🔹 Step 3: Start the Loop (i = 3)

Formula:

```
dp[i] = dp[i - 1] + dp[i - 2]
```

#### For i = 3

```java
dp[3] = dp[2] + dp[1]
dp[3] = 2 + 1 = 3
```

Ways:

* 1 + 1 + 1
* 1 + 2
* 2 + 1

Array now:

```
Index: 0  1  2  3  4  5
dp:    0  1  2  3  0  0
```

---

### 🔹 Step 4: i = 4

```java
dp[4] = dp[3] + dp[2]
dp[4] = 3 + 2 = 5
```

Ways:

* 1+1+1+1
* 1+1+2
* 1+2+1
* 2+1+1
* 2+2

Array now:

```
Index: 0  1  2  3  4  5
dp:    0  1  2  3  5  0
```

---

### 🔹 Step 5: i = 5

```java
dp[5] = dp[4] + dp[3]
dp[5] = 5 + 3 = 8
```

Ways:

1. 1+1+1+1+1
2. 1+1+1+2
3. 1+1+2+1
4. 1+2+1+1
5. 2+1+1+1
6. 1+2+2
7. 2+1+2
8. 2+2+1

Final array:

```
Index: 0  1  2  3  4  5
dp:    0  1  2  3  5  8
```

---

## ✅ Final Answer

```java
return dp[5]; // 8
```

➡️ **There are 8 distinct ways to climb 5 steps**

---

## 🔑 Key Insight (Interview Gold)

Every step’s answer is built from:

* the previous step (`i - 1`)
* the step before that (`i - 2`)

This is **exactly Fibonacci**:

```
1, 2, 3, 5, 8, ...
```

 */