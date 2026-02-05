package mathandgeometry.greatestcommondivisorofstring;

import arraysandhashing.print.PrintItem;

public class OptimalSolution {
    public static void main(String[] args) {
        String str1 = "ABAB", str2 = "AB";
        String str3 = "NANANA", str4 = "NANA";
        PrintItem.print(gcdOfStrings(str1,str2));
        PrintItem.print(gcdOfStrings(str3,str4));
    }
    public static String gcdOfStrings(String str1, String str2) {
        // 1. Pattern compatibility check
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // 2. GCD of lengths
        int gcdLen = gcd(str1.length(), str2.length());

        // 3. Largest common divisor string
        return str1.substring(0, gcdLen);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
/*
int gcdLen = gcd(str1.length(), str2.length());
Why GCD?
If a common string divides both:

Its length must divide both string lengths

The largest possible length is:

gcd(length of str1, length of str2)
Example:

"ABAB" (4), "AB" (2)
gcd(4, 2) = 2

🔹 Step 3: Extract the Answer

return str1.substring(0, gcdLen);
What this does:
Takes the first gcdLen characters from str1

This substring is the largest repeating unit

Why from str1?

Pattern check already guarantees correctness

🔹 GCD Helper Function (Euclidean Algorithm)

private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}
How this works:
Uses the Euclidean Algorithm

Recursively reduces the problem size

Example:

scss
Copy code
gcd(6, 4)
→ gcd(4, 2)
→ gcd(2, 0)
→ 2

🧪 Example Walkthrough
Input

str1 = "NANANA"
str2 = "NANA"

Step 1:

"NANANA" + "NANA" == "NANA" + "NANANA" ✔

Step 2:
gcd(6, 4) = 2
Step 3:

str1.substring(0, 2) → "NA"
✅ Output: "NA"

⏱ Complexity Analysis
Metric	Value
Time	O(n)
Space	O(1)

Concatenation & comparison → O(n)

GCD calculation → O(log n)

Substring → O(n) (bounded by 1000)

🎯 Interview One-Liner (Memorize This)
“If two strings share a repeating base, concatenating them in both orders must give the same result. Then the length of the largest such base is the GCD of their lengths.”
 */
