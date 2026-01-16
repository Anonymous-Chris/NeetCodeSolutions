🔹 What is Bit Manipulation?

Bit manipulation means working directly with binary digits (bits) of numbers.
•	Computers store numbers in binary (0s and 1s)
•	Using bitwise operators lets us solve problems faster and with O(1) space

Example:

5  = 101 (binary)
3  = 011 (binary)


⸻

🔹 Binary Basics

Decimal	Binary
0	0000
1	0001
2	0010
3	0011
4	0100
5	0101
6	0110
7	0111


⸻

🔹 Bitwise Operators (MOST IMPORTANT)

1️⃣ AND (&)

1 & 1 = 1
1 & 0 = 0

Example:

5 & 3
101
011
---
001 = 1

Use cases:
•	Check even/odd

n & 1 == 0  // even

	•	Clear bits

⸻

2️⃣ OR (|)

1 | 0 = 1
0 | 0 = 0

Example:

5 | 3
101
011
---
111 = 7

Use cases:
•	Set a bit

n | (1 << i)


⸻

3️⃣ XOR (^) ⭐ MOST IMPORTANT

1 ^ 1 = 0
1 ^ 0 = 1

Properties

a ^ a = 0
a ^ 0 = a
a ^ b ^ a = b

Example:

5 ^ 3
101
011
---
110 = 6

Use cases:
•	Single Number problem
•	Swap numbers
•	Find missing number

⸻

4️⃣ NOT (~)

Flips all bits.

Example:

~5

5  = 00000000 00000101
~5 = 11111111 11111010  (=-6)

⚠️ Because of two’s complement, result is negative.

⸻

5️⃣ Left Shift (<<)

Shifts bits left, multiplies by 2.

5 << 1  // 10

101 → 1010

Rule

n << k = n × 2^k


⸻

6️⃣ Right Shift (>>)

Shifts bits right, divides by 2.

5 >> 1  // 2

101 → 10

Rule

n >> k = n / 2^k


⸻

🔹 Common Bit Tricks (VERY IMPORTANT)

1️⃣ Check Even or Odd

(n & 1) == 0  // even


⸻

2️⃣ Check if Power of Two

n > 0 && (n & (n - 1)) == 0

Example:

8 = 1000
7 = 0111
AND = 0000 ✔


⸻

3️⃣ Turn Off Rightmost Set Bit

n & (n - 1)

Example:

12 = 1100
11 = 1011
----
1000


⸻

4️⃣ Isolate Rightmost Set Bit

n & (-n)

Example:

12 = 1100
-12 = 0100


⸻

5️⃣ Count Set Bits (Brian Kernighan)

int count = 0;
while (n != 0) {
n = n & (n - 1);
count++;
}


⸻

🔹 XOR Deep Dive (Interview Favorite)

Single Number Problem

int result = 0;
for (int num : nums) {
result ^= num;
}
return result;

Why it works

2 ^ 2 = 0
0 ^ 3 = 3

Duplicates cancel out.

⸻

🔹 Swap Without Temp Variable

a = a ^ b;
b = a ^ b;
a = a ^ b;


⸻

🔹 Negative Numbers & Two’s Complement (Important)
•	Java uses two’s complement
•	To get negative:

~n + 1

Example:

5 → 00000101
~5 → 11111010
+1 → 11111011 = -5


⸻

🔹 Common Interview Problems Using Bit Manipulation

Problem	Technique
Single Number	XOR
Missing Number	XOR / Sum
Power of Two	n & (n-1)
Count Bits	n & (n-1)
Subset generation	Bitmask
Reverse Bits	Shifting
Gray Code	XOR


⸻

🔹 When to Think About Bit Manipulation?
•	O(1) space required
•	Numbers appear twice / thrice
•	Parity (even/odd)
•	Powers of two
•	Binary representation matters

⸻

🔹 One-Line Interview Summary

“Bit manipulation uses binary operations like AND, OR, XOR, and shifts to optimize time and space complexity.”
