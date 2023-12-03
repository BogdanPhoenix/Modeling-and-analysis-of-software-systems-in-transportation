### 1. Same Tree (Task1)
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
- Input: p = [1,2,3], q = [1,2,3] 
- Output: true

Example 2:
- Input: p = [1,2], q = [1,null,2] 
- Output: false

Example 3:
- Input: p = [1,2,1], q = [1,1,2] 
- Output: false

Constraints:
- The number of nodes in both trees is in the range [ 0, 100]
- -104 <= Node.val <= 104

### 2. Symmetrical tree (Task2)
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

Example 1:
- Input: root = [1,2,2,3,4,4,3] 
- Output: true

Example 2:
- Input: root = [ 1, 2, 2, null, 3, null, 3] 
- Output: false

Constraints:
- The number of nodes in the tree is in the range [ 0, 1000]
- -10 000 <= Node.val <= 10 000

### 3. Invert binary tree (Task3)
Given the root of a binary tree, invert the tree, and return its root.

Example 1:
- Input: root = [4,2,7,1,3,6,9] 
- Output: [4,7,2,9,6,3,1]

Example 2:
- Input: root = [2,1,3] 
- Output: [2,3,1]

Example 3:
- Input: root = [] 
- Output: []

Constraints:
- The number of nodes in the tree is in the range [ 0, 100]
- -100 <= Node.val <= 100

### 4. K-th smallest element in BST (Task4)
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

Example 1:
- Input: root = [3,1,4,null,2], k = 1 
- Output: 1

Example 2:
- Input: root = [5,3,6,2,4,null,null,1], k = 3 
- Output: 3

Constraints:
- The number of nodes in the tree is n.
- 1 <= k <= n <= 10 000
- 0 <= Node.val <= 10 000

### 5. Serialize and Deserialize Binary Tree (Task5)
Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.

Example 1:
- Input: root = [1,2,3,null,null,4,5] 
- Output: [1,2,3,null,null,4,5]

Example 2:
- Input: root = [] 
- Output: []

Constraints:
- Кількість вузлів у дереві знаходиться в діапазоні [0, 10 000].
- -1000 <= Node.val <= 1000

### 6. Binary Tree Maximum Path Sum (Task6)
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.

Example 1:
- Input: root = [1,2,3] 
- Output: 6 
- Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

Example 2:
- Input: root = [-10,9,20,null,null,15,7] 
- Output: 42 
- The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.

Constraints:
- The number of nodes in the tree is in the range  [1, 3 * 10 000].
- -1000 <= Node.val <= 1000

### 7. Binary Tree Cameras (Task7)
You are given the root of a binary tree. We install cameras on the tree nodes where each camera at a node can monitor its parent, itself, and its immediate children.

Return the minimum number of cameras needed to monitor all nodes of the tree.

Example 1:
- Input: root = [0,0,null,0,0]
- Output: 1 
- Explanation: One camera is enough to monitor all nodes if placed as shown.

Example 2:
- Input: root = [0,0,null,0,null,0,null,null,0]
- Output: 2 
- Explanation: At least two cameras are needed to monitor all nodes of the tree. The above image shows one of the valid configurations of camera placement.

Constraints:
- The number of nodes in the tree is in the range [1, 1000].
- Node.val == 0

### 8. Vertical Order Traversal of a Binary Tree (Task8)
Given the root of a binary tree, calculate the vertical order traversal of the binary tree.

For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).

The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.

Return the vertical order traversal of the binary tree.

Example 1:
- Input: root = [3,9,20,null,null,15,7] 
- Output: [[9],[3,15],[20],[7]]
- Explanation:
  - Column -1: Only node 9 is in this column.
  - Column 0: Nodes 3 and 15 are in this column in that order from top to bottom.
  - Column 1: Only node 20 is in this column.
  - Column 2: Only node 7 is in this column.

Example 2:
- Input: root = [1,2,3,4,5,6,7] 
- Output: [[4],[2],[1,5,6],[3],[7]] 
- Explanation:
  - Column -2: Only node 4 is in this column.
  - Column -1: Only node 2 is in this column.
  - Column 0: Nodes 1, 5, and 6 are in this column. 1 is at the top, so it comes first. 5 and 6 are at the same position (2, 0), so we order them by their value, 5 before 6.
  - Column 1: Only node 3 is in this column.
  - Column 2: Only node 7 is in this column.

Example 3:
- Input: root = [1,2,3,4,6,5,7] 
- Output: [[4],[2],[1,5,6],[3],[7]] 
- Explanation: 
  - This case is the exact same as example 2, but with nodes 5 and 6 swapped. 
  - Note that the solution remains the same since 5 and 6 are in the same location and should be ordered by their values.

Constraints:
- The number of nodes in the tree is in the range [1, 1000].
- 0 <= Node.val <= 1000

### 9. Recover a Tree From Preorder Traversal (Task9)
We run a preorder depth-first search (DFS) on the root of a binary tree.

At each node in this traversal, we output D dashes (where D is the depth of this node), then we output the value of this node.  If the depth of a node is D, the depth of its immediate child is D + 1.  The depth of the root node is 0.

If a node has only one child, that child is guaranteed to be the left child.

Given the output traversal of this traversal, recover the tree and return its root.

Example 1:
- Input: traversal = "1-2--3--4-5--6--7" 
- Output: [1,2,5,3,4,6,7]

Example 2:
- Input: traversal = "1-2--3---4-5--6---7" 
- Output: [1,2,5,3,null,6,null,4,null,7]

Example 3:
- Input: traversal = "1-401--349---90--88" 
- Output: [1,401,null,349,88,90]

Constraints:
- The number of nodes in the original tree is in the range [1, 1000].
- 0 <= Node.val <= 1 000 000 000