1. What is a Heap?

A heap is a special kind of binary tree with two main properties:
1.	Complete Binary Tree
•	All levels are fully filled except possibly the last, which is filled from left to right.
2.	Heap Property (depends on type):
•	Max Heap: Parent ≥ children → largest element is at the root
•	Min Heap: Parent ≤ children → smallest element is at the root

⸻

Example: Max Heap

Array: [10, 5, 2, 1, 3]

       10
      /  \
     5    2
    / \
   1   3

	•	Root = 10 (largest)
	•	Every parent ≥ children
	•	Complete tree → no gaps except possibly last level

⸻

2. How Heap is Stored in an Array

For a node at index i:
•	Left child = 2*i + 1
•	Right child = 2*i + 2
•	Parent = (i-1)/2 (integer division)

Example: [10, 5, 2, 1, 3]
•	10 → index 0 (root)
•	left = 5 → index 1
•	right = 2 → index 2
•	5 → index 1
•	left = 1 → index 3
•	right = 3 → index 4

⸻

3. Heap Operations

a) Heapify
•	Ensures heap property holds for a node and its children
•	Used after insertion or extraction in heap sort

Max Heapify Example (simplified):
•	Array: [3, 5, 2]
•	Root = 3, children = 5 and 2
•	5 > 3 → swap root with 5 → [5,3,2]

⸻

b) Insert
1.	Add element at end of array (maintain complete tree)
2.	Bubble up: swap with parent until heap property is satisfied

⸻

c) Extract Max / Min
1.	Remove root (max in max-heap, min in min-heap)
2.	Move last element to root
3.	Heapify root to restore heap property

⸻

4. How Heap Sort Uses Heap
    1.	Build Max Heap → largest element moves to root
    2.	Swap root with last element → largest element goes to final position
    3.	Reduce heap size by 1, heapify root
    4.	Repeat until heap size = 1

Example with [5, 10, 2, 1, 3]:
•	Build Max Heap → [10,5,2,1,3]
•	Swap root & last → [3,5,2,1,10] → heapify root → [5,3,2,1,10]
•	Swap root & last → [1,3,2,5,10] → heapify root → [3,1,2,5,10]
•	Swap root & last → [2,1,3,5,10] → heapify root → [2,1,3,5,10]
•	Swap root & last → [1,2,3,5,10] → sorted

Build Max Heap → [10,5,2,1,3]

Swap → [3,5,2,1,10]
Heapify → [5,3,2,1,10] (since root is change, check with root with its child and rearrange)

Swap → [1,3,2,5,10]
Heapify → [3,1,2,5,10]

Swap → [2,1,3,5,10]
Heapify → no change

Swap → [1,2,3,5,10]
Done

⸻

✅ Key Points
•	Heap is complete binary tree stored in array
•	Max heap → largest at root, used for heap sort
•	Min heap → smallest at root, used for priority queues
•	Heap operations: insert, extract, heapify
•	Heap Sort: build max heap → repeatedly extract max → O(n log n)

Let’s do the same step-by-step walkthrough, but now using a Min Heap with the same input.

Input

[5, 10, 2, 1, 3]


⸻

🔽 Min Heap Rule

Parent ≤ children

⸻

✅ Step 1: Build Min Heap

Heapify bottom-up:

        1
       / \
      3   2
     / \
    10  5

Array representation:

[1, 3, 2, 10, 5]

✅ Correct Min Heap

⸻

🔁 Heap Sort Using Min Heap

👉 This will sort the array in descending order

⸻

✅ Iteration 1

Swap root & last

[5, 3, 2, 10, 1]

Heapify (heap size = 4)
•	Compare 5 with children 3 and 2 → swap with 2

[2, 3, 5, 10, 1]


⸻

✅ Iteration 2

Swap root & last (heap size = 4 → index 3)

[10, 3, 5, 2, 1]

Heapify (heap size = 3)
•	Compare 10 with children 3 and 5 → swap with 3

[3, 10, 5, 2, 1]


⸻

⚠️ Iteration 3

Swap root & last (heap size = 3 → index 2)

[5, 10, 3, 2, 1]

Heapify (heap size = 2)
•	Compare 5 with child 10 → already valid

[5, 10, 3, 2, 1]


⸻

⚠️ Iteration 4

Swap root & last (heap size = 2 → index 1)

[10, 5, 3, 2, 1]

Heap size = 1 → stop

⸻

✅ Final Output (Descending Order)

[10, 5, 3, 2, 1]


⸻

📌 Important Notes (INTERVIEW GOLD)

🔹 Max Heap → Ascending sort

🔹 Min Heap → Descending sort

Because:
•	Max heap removes largest first
•	Min heap removes smallest first

⸻

⏱ Time & Space Complexity

Phase	TC
Build Heap	O(n)
Sorting	O(n log n)
Total	O(n log n)
Space	O(1) (in-place)


⸻

🎯 One-Line Interview Summary ⭐

“Using a min heap in heap sort places the smallest element at the end each iteration, producing a descending-order sorted array.”

⸻
