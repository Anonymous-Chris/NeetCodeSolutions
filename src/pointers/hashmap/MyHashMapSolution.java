package pointers.hashmap;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashMapSolution {
    //use linkedlist to solve this
    private static class Node{
        int key;
        int value;
        Node (int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private int SIZE = 1000;
    private LinkedList<Node>[] buckets;

    public MyHashMapSolution(){
        buckets = new LinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key){
        return key%SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Node node: buckets[index]){
            if(node.key == key){
                //update
                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        for (Node node : buckets[index]) {
            if (node.key == key) {
                return node.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Iterator<Node> it = buckets[index].iterator();
        while (it.hasNext()) {
            if (it.next().key == key) {
                it.remove();
                return;
            }
        }
    }
    }
/*
SIZE defines the number of buckets used to distribute keys and reduce collisions.
In Neetcode / LeetCode constraints: ≤ 10⁴ operations
📌 In real HashMaps:
	•	Size is often prime
	•	Automatically resized

	•	% SIZE ensures index stays in range [0, SIZE-1]
key = 1023
1023 % 1000 = 23
→ goes into bucket[23]

⸻

⏱ Time Complexity (TC)

Let:
	•	n = total number of key-value pairs stored
	•	k = number of elements in a single bucket (due to collisions)
	•	SIZE = number of buckets (1000)

🔹 put(key, value)
	•	Average Case: O(1)
	•	Hashing gives direct bucket access
	•	Few elements per bucket when well distributed
	•	Worst Case: O(n)
	•	All keys collide into the same bucket

⸻

🔹 get(key)
	•	Average Case: O(1)
	•	Direct bucket lookup + short linked list
	•	Worst Case: O(n)
	•	Full traversal of one bucket

⸻

🔹 remove(key)
	•	Average Case: O(1)
	•	Hash lookup + short linked list
	•	Worst Case: O(n)
	•	All elements in one bucket

⸻

🔹 Constructor MyHashMap()
	•	Time: O(SIZE)
	•	Initializing all buckets

⸻

🧠 Space Complexity (SC)

🔹 Total Space
	•	O(n + SIZE)

Breakdown:
	•	n → number of stored key-value pairs (Nodes)
	•	SIZE → fixed number of LinkedList buckets (1000)

Since SIZE is constant:
	•	Effective Space Complexity: O(n)

⸻

📊 Summary Table

Operation	Avg TC	Worst TC	SC
put	        O(1)	O(n)	O(1)
get	        O(1)	O(n)	O(1)
remove	    O(1)	O(n)	O(1)
overall	    —	    —	    O(n)


⸻

🎯 Interview One-Liner (Very Important)

“All operations run in O(1) average time using hashing with separate chaining, and degrade to O(n) in the worst case due to collisions. Space complexity is O(n).”

 */