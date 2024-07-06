# Laboratory №3 - Linked list

## Task №1: Merge two sorted lists

You are given the headers of two sorted linked lists, list1 and list2.

Merge the two lists into one sorted list. The list should be created by joining the nodes of the first two lists.

Return the header of the combined linked list.

**Example №1:**

Node1 (1) --> Node1 (2) --> Node1 (4)

Node2 (1) --> Node2 (3) --> Node2 (4)

Node1 (1) --> Node2 (1) --> Node1 (2) --> Node2 (3) --> Node1 (4) --> Node2 (4)

_Input:_ list1 = [ 1, 2, 4 ], list2 = [ 1, 3, 4 ]

_Output:_ [ 1, 1, 2, 3, 4, 4 ]

**Example №2:**

_Input:_ list1 = [ ], list2 = [ ]

_Output:_ [ ]

**Example №3:**

_Input:_ list1 = [ ], list2 = [ 0 ]

_Output:_ [ 0 ]

_Limitations:_

- The number of nodes in both lists is in the range [ 0, 50 ].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order.

## Task №2: Remove duplicates from a sorted list

Given the head of a sorted linked list, remove all duplicates so that each item appears only once. Return the linked list also sorted.

**Example №1:**

_Input:_ head = [ 1, 1, 2 ]

_Output:_ [ 1, 2 ]

**Example №2:**

_Input:_ head = [ 1, 1, 2, 3, 3 ]

_Output:_ [ 1, 2, 3 ]

_Limitations:_

- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## Task №3: Loop of a linked list

The linked list head determines whether the linked list contains a loop.

A linked list has a loop if there is a node in the list that can be returned to again by continually following the next pointer. Internally, pos is used to indicate the index of the node to which the next tail pointer is connected. Note that pos is not passed as a parameter.

Returns true if the linked list contains a loop. Otherwise, return false.

**Example №1:**

_Input:_ head = [ 3, 2, 0, -4 ], pos = 1

_Output:_ true

_Explanation:_ There is a loop in the linked list where the tail connects to the 1st node (with index 0).

**Example №2:**

_Input:_ head = [ 1, 2 ], pos = 0

_Output:_ true

_Explanation:_ There is a loop in the linked list where the tail connects to the 0th node.

**Example №3:**

_Input:_ head = [ 1 ], pos = -1

_Output:_ false

_Explanation:_ There is no loop in the linked list.

_Constraints:_

- The number of nodes in the list is in the range [0, 10 000].
- -100 000 <= Node.val <= 100 000
- pos is -1 or a valid index in the linked list.

## Task №4: Reorder the list

You are provided with the head of a one-to-one list. The list can be represented in the form:

L0 → L1 → ... → Ln - 1 → Ln

Reorder the list in the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → ...

You cannot change the values in the list nodes. You can only change the nodes themselves.

**Example №1:**

_Input:_ head = [ 1, 2, 3, 4 ]

_Output:_ [ 1, 4, 2, 3 ]

**Example №2:**

_Input:_ head = [ 1, 2, 3, 4, 5 ]

_Output:_ [ 1, 5, 2, 4, 3 ]

_Limitations:_

- The number of nodes in the list is in the range [ 1, 5 * 10 000 ].
- 1 <= Node.val <= 1 000

## Task №5: Delete a node in a linked list

There exists a head of a list with a single relationship, and we want to delete a node in it.

You are provided with the node you want to delete. You will not be given access to the first node in the head.

All values in the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the specified node. Note that by deleting a node, we do not mean deleting it from memory. We mean:

- The value of this node should not exist in the linked list.
- The number of nodes in the linked list should be reduced by one.
- All values before the node must be in the same order.
- All values after the node must be in the same order.

Custom testing:

- For input, you must provide the full head of the linked list and the node to which node will be assigned. node does not have to be the last node in the list, but must be an actual node in the list.
- We will create the linked list and pass the node to your function.
- The result will be the entire list after your function is called.

**Example №1:**

_Input:_ head = [ 4, 5, 1, 9 ], node = 5

_Output:_ [ 4, 1, 9 ]

_Explanation:_ You are given a second node with the value 5, the linked list should become 4 -> 1 -> 9 after your function is called.

**Example №2:**

_Input:_ head = [ 4, 5, 1, 9 ], node = 1

_Output:_ [ 4, 5, 9 ]

_Limitation:_

- The number of nodes in the provided list is in the range [2, 1000].
- -1000 <= Node.val <= 1000
- The value of each node in the list is unique.
- The node to be removed is in the list and is not a tail node.

## Task №6: Double a number represented as a linked list

You are given the head of a non-empty linked list, representing a non-negative integer with no zeros at the beginning.

Return the head of the linked list after doubling it.

**Example №1:**

_Input:_ head = [ 1, 8, 9 ]

_Output:_ [ 3, 7, 8 ]

_Explanation:_ The number above corresponds to this linked list, which represents the number 189. So, the returned linked list represents the number 189 \* 2 = 378

**Example №2:**

_Input:_ head = [ 9, 9, 9 ]

_Output:_ [ 1, 9, 9, 8 ]

_Limitations:_

- The number of nodes in the list is in the range [1, 10 000].
- 0 <= Node.val <= 9
- The input is created in such a way that the list represents a number that has no leading zeros, except for the number 0 itself.

## Task №7: Merge k sorted lists

You are given an array of k linked lists, each linked list is sorted in ascending order.

Merge all the linked lists into one sorted linked list and return it.

**Example №1:**

_Input:_ lists = [ [ 1, 4, 5 ], [ 1, 3, 4 ], [ 2, 6 ] ]

_Output:_ [ 1, 1, 2, 3, 3, 4, 4, 5, 6 ]

_Explanation:_ Linked lists are:

    [1 -> 4 -> 5,

    1 -> 3 -> 4,

    2 -> 6 ]

by combining them into one sorted list: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6

**Example №2:**

_Input:_ lists = [ ].

_Output:_ [ ].

**Example №3:**

_Input:_ lists = [ [ ] ]

_Output:_ [ ]

_Limitations:_

- k == lists.length
- 0 <= k <= 10 000
- 0 <= lists[ i ].length <= 500
- -104 <= lists[ i ][ j ] <= 10 000
- lists[ i ] is sorted in ascending order.
- The sum of lists[ i ].length does not exceed 10 000

## Task №8: Flip nodes in a k-group

Given the head of the linked list, flip the nodes of the list k at a time and return the modified list.

k is a positive integer and less than or equal to the length of the linked list. If the number of nodes is not a multiple of k, then the skipped nodes must ultimately remain as they are.

You can't change the values in the nodes of the list, only the nodes themselves.

**Example №1:**

_Input:_ head = [ 1, 2, 3, 4, 5 ], k = 2

_Output:_ [ 2, 1, 4, 3, 5 ]

**Example №2:**

_Input:_ head = [ 1, 2, 3, 4, 5 ], k = 3

_Output:_ [ 3, 2, 1, 4, 5 ]

_Limitations:_

- The number of nodes in the list is n.
- 1 <= k <= n <= 5000
- 0 <= Node.val <= 1000

## Task №9: Split a list

Given the head of the linked list and a value of x, split it so that all nodes less than x come before nodes greater than or equal to x.

You must keep the original relative order of the nodes in each of the two sections.

**Example №1:**

_Input:_ head = [ 1, 4, 3, 2, 5, 2 ], x = 3

_Output:_ [ 1, 2, 2, 4, 3, 5 ]

**Example №2:**

_Input:_ head = [ 2, 1 ], x = 2

_Output:_ [ 1, 2 ]

_Limitations:_

- The number of nodes in the list is in the range [0, 200].
- -100 <= Node.val <= 100
- -200 <= x <= 200
