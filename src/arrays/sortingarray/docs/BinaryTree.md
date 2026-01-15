
1. Definition

A binary tree is a tree data structure where:
1.	Each node has at most two children.
2.	Children are called:
•	Left child
•	Right child
3.	The top node is called the root.
4.	Nodes with no children are called leaves.

⸻

Binary Tree Example

        10        <- root
       /  \
      5    20     <- children of root
     / \   / \
    3   7 15 25   <- leaves

	•	10 → root
	•	5 → left child of 10
	•	20 → right child of 10
	•	3, 7, 15, 25 → leaves

⸻

2. Properties
   •	Depth / Height: Number of edges from root to deepest leaf
   •	Levels: Root is level 0, children of root level 1, etc.
   •	Nodes: Each element in the tree

⸻

3. Types of Binary Trees
    1.	Full Binary Tree
          •	Every node has 0 or 2 children

        10
       /  \
   5    20

    2.	Complete Binary Tree
          •	All levels fully filled except last, which is filled from left to right
          •	Used in heaps

        10
       /  \
   5    20
   / \
   3   7

    3.	Perfect Binary Tree
          •	Complete + all leaves are at the same level

        10
       /  \
   5    20
   / \  / \
   3  7 15 25

    4.	Balanced Binary Tree
          •	Height difference between left and right subtree ≤ 1
          •	Examples: AVL tree, Red-Black tree
    5.	Binary Search Tree (BST)
          •	Left child < parent < right child
          •	Enables fast search, insert, delete

        10
       /  \
   5    20
   / \   \
   3   7   25


⸻

4. Why Binary Trees Are Useful
   •	Efficient search, insert, delete (especially BSTs)
   •	Represent hierarchies (like folder structure)
   •	Foundation for heaps, priority queues, expression trees

⸻

5. Array Representation of a Complete Binary Tree
   •	For a node at index i:
   •	Left child = 2*i + 1
   •	Right child = 2*i + 2
   •	Parent = (i-1)/2

Example [10, 5, 20, 3, 7]:

        10
       /  \
      5    20
     / \
    3   7

	•	Root 10 → index 0
	•	Left 5 → index 1, right 20 → index 2
	•	Left 3 → index 3, right 7 → index 4

⸻

💡 Key Intuition:

Binary tree = hierarchical structure where each node has at most 2 children.
Complete binary tree = perfect for heaps because we can store it in an array.
u want me to do that?