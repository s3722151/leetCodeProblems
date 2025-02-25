package leetCodeProblems;
//Question:https://leetcode.com/problems/invert-binary-tree/ 
public class invertBinaryTree {

}

//Solution 
/*
 class Solution {
    public TreeNode invertTree(TreeNode root) {
         // Base case: if the tree is empty, return null
        if (root == null){
        	return root; //This means there is nothing to invert
        }
        
        // Recursively invert the left subtree
        TreeNode left = invertTree(root.left);
        
        // Recursively invert the right subtree
        TreeNode right = invertTree(root.right);
        
        // Swap the left and right children of the current node
        root.right = left;
        root.left = right;
        
        // Return the root of the inverted tree
        return root;

    }
   }
 */



//============================================================
//Research topics
//============================================================
/*
Topics
1.Tree
	https://www.geeksforgeeks.org/introduction-to-tree-data-structure/
2.Nodes
	https://www.codecademy.com/learn/getting-started-with-data-structures-java/modules/nodes-java/cheatsheet
3. Depth-First Search(DFS)
	https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
	https://www.youtube.com/watch?v=Urx87-NMm6c
	https://www.youtube.com/watch?v=by93qH4ACxo
4. Breadth-First Search(BFS)
	https://www.youtube.com/watch?v=HZ5YTanv5QE
	https://www.youtube.com/watch?v=7Cox-J7onXw

When to use DFS or BFS
https://www.youtube.com/watch?v=cS-198wtfj0
Questions to consider:
	i) Do I need to explore all complete paths?
	ii) Do we need to backtrack to explore different branches?
	iii) DO we need to do a level order traversal?
	iv) Do we need to find shortest path between 2 nodes

5. Binary Tree
	https://www.geeksforgeeks.org/introduction-to-binary-tree/
	


Solution 
	https://www.youtube.com/watch?v=fKgZiCXb6zs
	More detailed: https://www.youtube.com/watch?v=JUyhWTDT2YI

Explanations
Tree data structure is a hierarchical structure that is non-linear
-Used to represent and organize data in the form of parent child relationship.
- E.g. Folder structure, tag structure in HTML
- Top node is root, each node can have child nodes
- Data in a tree is not sequential (order) 
- There are 3 types of binary trees
	i)Binary: Each node maximum of 2 children
	ii)Ternary: Each node has at most 3 child nodes
	iii)Generic: Each node is a data structure 

DFS is an algorithm to search a graph or tree structure
- Step 1: Pick a route
- Step 2: Keep going through nodes until reach dead end or previously visited a node
- Step 3: Backtrack to last node that has unvisited adjacent neighbours
- In this graph we mark what we visit and what we need to visit
- When nothing is left in stack, code is finish

BFS is an algorithm to search a graph 
- Similar to DFS
- After selecting a node, we hold in queue adjacent nodes
- Difference is that we visit nodes at same level before we progress vertically
- This means before we reach bottom/end of graph (leaf)

Binary Tree
This is a non-linar data structure
Top most node is "root", bottom-most node is called "leaves"
 */

//============================================================
//Solution explanations
//============================================================
/*
(Base)Here is a binary tree
     4
   /   \
  2     7
 / \   / \
1   3 6   9

(Middle)First switch the child nodes
     4
   /   \
  2     7
 / \   / \
3   1 9   6

(Final)After inverting parent nodes:
     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
