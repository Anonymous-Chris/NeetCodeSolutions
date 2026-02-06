

🔹 What is a LinkedList?

A LinkedList is a linear data structure where:
•	Elements are stored in nodes
•	Each node contains:

•	Data
•	Reference (pointer) to the next node

👉 Unlike arraysandhashing, elements are NOT stored in contiguous memory.



🔹 Structure of a Node

class Node {
    int data;
    Node next;
}

Visually:

[data | next] → [data | next] → [data | next] → null

🔹 Types of Linked Lists

1️⃣ Singly Linked List

A → B → C → null

	•	Each node points to the next node


2️⃣ Doubly Linked List

null ← A ⇄ B ⇄ C → null

	•	Each node has:
	•	prev
	•	next


3️⃣ Circular Linked List

A → B → C
↑         ↓
←←←←←←←←←←


🔹 Why Use LinkedList?

✅ Advantages
•	Dynamic size (no resizing like arraysandhashing)
•	Fast insertions & deletions (O(1) if node is known)
•	Efficient for frequent modifications

❌ Disadvantages
•	No random access (must traverse → O(n))
•	Extra memory for twopointers
•	Cache-unfriendly

🔹 LinkedList vs Array (Important)

Operation	            Array	LinkedList
Access by index	        O(1)	O(n)
Insert/Delete at start	O(n)	O(1)
Insert/Delete at middle	O(n)	O(1)*
Memory	                Less	More

Arrays store elements in contiguous memory, so inserting or deleting at the start or middle requires shifting elements, which takes O(n) time.

* O(1) only if you already have the node reference.

🔹 Example: Insertion

Insert at head (O(1))

Node newNode = new Node(5);
newNode.next = head;
head = newNode;

Insert at tail (O(n))

Node curr = head;
while (curr.next != null) {
curr = curr.next;
}
curr.next = new Node(10);

🔹 Example: Deletion

Node curr = head;
while (curr.next != null) {
if (curr.next.data == target) {
curr.next = curr.next.next;
break;
}
curr = curr.next;
}

🔹 Why LinkedList is Used in HashMap

In HashMap (separate chaining):
•	Each bucket stores multiple key-value pairs
•	Collisions handled by storing entries in a LinkedList

Bucket[3]:
(key1, val1) → (key2, val2) → null

✔ Allows multiple values in same bucket
✔ Simple collision handling

🔹 Time Complexity Summary

Operation	    TC
Insert (head)	O(1)
Insert (tail)	O(n)
Search	        O(n)
Delete	        O(n)

🔹 One-Line Interview Explanation ⭐

“A linked list stores elements in nodes where each node points to the next one, allowing efficient insertions and deletions but slower access compared to arraysandhashing.”
