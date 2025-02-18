package leetCodeProblems;

//Question: https://leetcode.com/problems/merge-two-sorted-lists/

public class mergeTwoSortedLists {
	
    int val;
    mergeTwoSortedLists next;
    mergeTwoSortedLists() {}
    mergeTwoSortedLists(int val) { this.val = val; }
    mergeTwoSortedLists(int val, mergeTwoSortedLists next) { this.val = val; this.next = next; }


		
}

class solution {
    public mergeTwoSortedLists mergeTwoLists(mergeTwoSortedLists list1, mergeTwoSortedLists list2) {
		return list1;
        
    }
}


//============================================================
//Sources
//============================================================
/*
TOPICS
1.Linked List
- WHat is it: https://www.w3schools.com/java/java_linkedlist.asp
- Demonstration: https://www.youtube.com/watch?v=N6dOwBde7-M
2.Recursion 
- What is it: https://www.w3schools.com/java/java_recursion.asp
3.Extra Topics

 
WHAT I LEARNT - Linked Lists
Linked Lists data structures that contain a series of nodes
Each node contains data and a address
Elements in linked lists uses pointers
There are 2 types of linkedLists
1. Singly Linked lists
2. Doubly Linked Lists

There are no indexes, but each node points to another node
You can tell end of linked list with when address is null.
These are bad at searching, we start at start and end at tail of linkedlist
This takes more memory compared to arrays. 
There is a doublelinked list which allows us to go to start to end and end to start but takes more memory
Each node contains memory next and oprevious nodeLinked lists contains start and end nodes

They are good for inserting and deleting nodes (better than arrays) HOWEVER you need to look over entire linkedList
- You overcome this by using index

Advantages 
1. Dynamic Data structure (allocates needed memory while running(
2. Insertion and Deletion of Nodes is easy O(1)
3. No. Low memory waste 

Disadvantages
1. Greater memory usage (additional pointer)
2/ No random access of elements (no index [i])
3. Accessing/searching elements is more time consuming. O(n)

Uses
1. Implement Stacks/Queues
2. GPS navigation 
3. Music playlist
 *  
*/