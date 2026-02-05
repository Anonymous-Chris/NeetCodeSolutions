package arraysandhashing.designhashset;

import java.util.LinkedList;

public class MyHashSetSolution {
private static int SIZE = 1000;
private LinkedList<Integer>[] buckets;
public MyHashSetSolution() {
    buckets = new LinkedList[SIZE];
    for (int i = 0; i < SIZE; i++) {
        buckets[i] = new LinkedList<>();
    }
    }

    private int hash(int key){
        return key % SIZE;
    }

    public void add(int key) {
        int index = hash(key);
        if(!buckets[index].contains(key)){
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        buckets[index].remove((Integer) key);
    }

    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].contains(key);

    }
    }
/*
⏱ Time Complexity (TC)

Let:
	•	n = number of elements stored
	•	k = number of elements in one bucket (collisions)
	•	SIZE = number of buckets

⸻

🔹 add(key)
	•	Average Case: O(1)
	•	Hash function maps key directly to bucket
	•	Bucket length is small on average
	•	Worst Case: O(n)
	•	All keys collide into one bucket

⸻

🔹 contains(key)
	•	Average Case: O(1)
	•	Direct bucket access + short linked list
	•	Worst Case: O(n)
	•	Must scan entire bucket

⸻

🔹 remove(key)
	•	Average Case: O(1)
	•	Hash lookup + short linked list
	•	Worst Case: O(n)
	•	All keys in one bucket

⸻

🔹 Constructor
	•	Time: O(SIZE)
	•	Initialize all buckets

⸻

🧠 Space Complexity (SC)

🔹 Total Space
	•	O(n + SIZE)

Breakdown:
	•	n → number of stored keys
	•	SIZE → fixed number of buckets

Since SIZE is constant:
	•	Effective Space Complexity: O(n)

⸻

📊 Summary Table

Operation	Avg TC	Worst TC	SC
add	        O(1)	O(n)	O(1)
contains	O(1)	O(n)	O(1)
remove	    O(1)	O(n)	O(1)
overall	    —	    —	    O(n)


⸻

🎯 Interview One-Liner ⭐

“HashSet operations run in O(1) average time using hashing with separate chaining, with O(n) worst-case due to collisions. Space complexity is O(n).”

⸻

🔗 HashMap vs HashSet (Quick Comparison)

Feature	            HashMap	        HashSet
Stores	            key → value	    keys only
Collision handling	LinkedList of Nodes	LinkedList of keys
Average TC	        O(1)	        O(1)
Worst TC	        O(n)	        O(n)


⸻
 */