# Laboratory 4.2 - Queue

## Task №1: First unique character in the string

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

**Example №1:**

_Input:_ s = "leopard"

_Output:_ 0

**Example №2:**

_Input:_ s = "loveleopard"

_Output:_ 2

**Example №3:**

_Input:_ s = "aabb"

_Output:_ -1

_Constraints:_

- 1 <= s.length <= 100 000
- s consists of only lowercase English letters.

## Task №2: Implementing a stack using queues

Implement a last-in, first-out (LIFO) stack using only two queues. The implemented stack must support all the functions of a regular stack (push, top, pop, and empty).

Implement the MyStack class:

- void push(int x) Places element x on top of the stack.
- int pop() Removes an element from the top of the stack and returns it.
- int top() Returns the element at the top of the stack.
- boolean empty() Returns true if the stack is empty and false otherwise.

_Notes:_

- You should only use standard queue operations, which means that only push to back, peek/pop from front, size, and is empty are valid.
- Depending on your language, the queue may not be supported natively. You can simulate a queue with a list or two queues (two-way queue) if you only use standard queue operations.

**Example**

_Input:_

["MyStack", "push", "push", "top", "pop", "empty"]

[[], [1], [2], [], [], []]

_Output:_ [null, null, null, 2, 2, false]

_Explanation:_

MyStack myStack = new MyStack();

myStack.push(1);

myStack.push(2);

myStack.top(); // return 2

myStack.pop(); // return 2

myStack.empty(); // return False

_Constraints:_

- 1 <= x <= 9
- A maximum of 100 calls will be made to push, pop, top and empty.
- All calls to pop and top are valid.

## Task №3.1: Number of recent calls

You have a RecentCounter class that counts the number of recent requests within a certain period of time.

Implement the RecentCounter class:

- RecentCounter() Initializes the counter with zero recent requests.
- int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that have occurred in the last 3000 milliseconds (including the new request). In particular, return the number of requests that occurred in the inclusive range [t - 3000, t].
- It is guaranteed that each ping call uses a strictly larger value of t than the previous call.

**Example:**

_Input:_

["RecentCounter", "ping", "ping", "ping", "ping"]

[[], [1], [100], [3001], [3002]]

_Output:_ [null, 1, 2, 3, 3]

_Explanation:_

RecentCounter recentCounter = new RecentCounter();

recentCounter.ping(1); // requests = [1], range is [-2999,1], return 1

recentCounter.ping(100); // requests = [1, 100], range is [-2900,100], return 2

recentCounter. ping(3001); // requests = [1, 100, 3001], range is [1,3001], return 3

recentCounter.ping(3002); // requests = [1, 100, 3001, 3002], range is [2,3002], return 3

_Constraints:_

- 1 <= t <= 1 000 000 000
- Each test case will call ping with strictly increasing values of t.
- At most 10,000 calls will be made to ping

## Task №3.2: Design of a closed two-way queue (Deque)

Design your own implementation of a circular two-way queue (deque).

Implement the MyCircularDeque class:

- MyCircularDeque(int k) Initializes a deque with a maximum size of k.
- boolean insertFront() Adds an element to the beginning of the deque. Returns true if the operation is successful, or false otherwise.
- boolean insertLast() Inserts an element at the back of the Deque. Returns true if the operation is successful, or false otherwise.
- boolean deleteFront() Deletes an item from the front of the Deque. Returns true if the operation is successful, or false otherwise.
- boolean deleteLast() Deletes the item from the back of the Deque. Returns true if the operation is successful, or false otherwise.
- int getFront() Returns the front item from the Deque. Returns -1 if the queue is empty.
- int getRear() Returns the last element from the Deque. Returns -1 if the queue is empty.
- boolean isEmpty() Returns true if the queue is empty, or false otherwise.
- boolean isFull() Returns true if the queue is full, or false otherwise.

**Example:**

_Input:_

["MyCircularDeque", "insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"]

[[3], [1], [2], [3], [4], [], [], [], [4], []]

_Output:_ [null, true, true, true, true, true, false, 2, true, true, true, true, true, 4]

_Explanation:_

MyCircularDeque myCircularDeque = new MyCircularDeque(3);

myCircularDeque.insertLast(1); // return True

myCircularDeque.insertLast(2); // return True

myCircularDeque.insertFront(3); // return True

myCircularDeque. insertFront(4); // return False, the queue is full.

myCircularDeque.getRear(); // return 2

myCircularDeque.isFull(); // return True

myCircularDeque.deleteLast(); // return True

myCircularDeque.insertFront(4); // return True

myCircularDeque.getFront(); // return 4

_Constraints:_

- 1 <= k <= 1000
- 0 <= value <= 1000
- At most 2000 calls will be made to insertFront, insertLast, deleteFront, deleteLast, getFront, getRear, isEmpty, isFull.

## Task №4: Design a closed queue

Design your own implementation of a circular queue. A circular queue is a linear data structure in which operations are performed on a first-in, first-out (FIFO) basis, and the last position is connected to the first to form a circle. It is also called a "ring buffer".

One of the advantages of a circular queue is that we can use the space in front of the queue. In a regular queue, when the queue fills up, we cannot insert the next element, even if there is a space before the queue. But using a circular queue, we can use the space to store new values.

Implement the MyCircularQueue class:

- MyCircularQueue(k) Initializes an object with a queue size k.
- int Front() Gets the front element of the queue. If the queue is empty, return -1.
- int Rear() Gets the last element in the queue. If the queue is empty, return -1.
- boolean enQueue(int value) Inserts an element into a cyclic queue. Returns true if the operation is successful.
- boolean deQueue() Removes the item from the cyclic queue. Returns true if the operation is successful.
- boolean isEmpty() Checks whether the cyclic queue is empty or not.
- boolean isFull() Checks if the loop is full.

You must solve the problem without using the built-in queue data structure in your programming language.

**Example:**

_Input:_

["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]

[[3], [1], [2], [3], [4], [], [], [], [4], []]

_Output:_ [null, true, true, true, false, 3, true, true, true, 4]

_Explanation:_

MyCircularQueue myCircularQueue = new MyCircularQueue(3);

myCircularQueue.enQueue(1); // return True

myCircularQueue.enQueue(2); // return True

myCircularQueue.enQueue(3); // return True

myCircularQueue.enQueue(4); // return False

myCircularQueue.Rear(); // return 3

myCircularQueue.isFull(); // return True

myCircularQueue.deQueue(); // return True

myCircularQueue.enQueue(4); // return True

myCircularQueue.Rear(); // return 4

_Constraints:_

- 1 <= k <= 1000
- 0 <= value <= 1000
- A maximum of 3000 calls will be made to enQueue, deQueue, Front, Rear, isEmpty, and isFull.

## Task №5: Stamping a sequence

You are given two strings stamp and target. First, there is a string s of length target.length with all s[i] == '?

In one move, you can put stamp on top of s and replace each letter in s with the corresponding letter in stamp.

For example, if stamp = "abc" and target = "abcba", then s means "?????" initially. In one move, you can:

- place stamp at index 0 of s to get "abc??",
- place a stamp at index 1 of s to get "?abc?", or
- place the stamp at index 2 s to get "??abc".

Note that stamp must be completely within s to stamp (i.e., you cannot place stamp at index 3 of s).

We want to convert s to target using at most 10 \* target.length turns.

Returns an array of the index of the leftmost letter that is stamped at each turn. If we can't get target from s within 10 \* target.length turns, we return an empty array.

**Example №1:**

_Input:_ stamp = "abc", target = "ababc"

_Output:_ [0,2]

_Explanation:_ Initially s = "?????." - Place stamp at index 0 to get "abc??" [1,0,2] would also be accepted as an answer, as well as some other answers.

**Example №2:**

_Input:_ stamp = "abca", target = "aabcaca"

_Output:_ [3,0,1]

_Explanation:_

- Initially s = "???????".
- Place stamp at index 3 to get "???abca".
- Place stamp at index 0 to get "abcabca".
- Place stamp at index 1 to get "aabcaca". return True
- myCircularQueue.enQueue(4); // return True
- myCircularQueue.Rear(); // return 4

_Constraints:_

- 1 <= stamp.length <= target.length <= 1000
- stamp and target consist of lowercase English letters.

## Task №6: Maximum of the floating window

You are given an array of integers nums, and a floating window of size k that moves from the leftmost edge of the array to the rightmost edge. You can see only k numbers in the window. Each time the sliding window moves one position to the right.

Return the maximum sliding window.

**Example №1:**

_Input:_ nums = [1,3,-1,-3,5,3,6,7], k = 3

_Output:_ [3,3,5,5,6,7]

_Explanation:_

    Window position                Max

    ---------------               -----

    [1 3 -1] -3 5 3 6 7             3

    1 [3 -1 -3] 5 3 6 7             3

    1 3 [-1 -3 5] 3 6 7             5

    1 3 -1 [-3 5 3] 6 7             5

    1 3 -1 -3 [5 3 6] 7             6

    1 3 -1 -3 5 [3 6 7]             7

**Example №2:**

_Input:_ nums = [1], k = 1

_Output:_ [1]

_Constraints:_

- 1 <= nums.length <= 100 000
- -10 000 <= nums[i] <= 10 000
- 1 <= k <= nums.length

## Task №7: The maximum sum of a subsequence

Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence of this array such that for every two consecutive integers in the subsequence, nums[i] and nums[j], where i < j, the condition j - i <= k is satisfied.

A subsequence of an array is obtained by removing a certain number of elements (can be zero) from the array, leaving the remaining elements in the original order.

**Example №1:**

_Input:_ nums = [10,2,-10,5,20], k = 2

_Output:_ 37

_Explanation:_ The subsequence is [10, 2, 5, 20].

**Example №2:**

_Input:_ nums = [-1,-2,-3], k = 1

_Output:_ -1

_Explanation:_ The subsequence must not be empty so that we can choose the maximum number.

**Example №3:**

_Input:_ nums = [10,-2,-10,-5,20], k = 2

_Output:_ 23

_Explanation:_ The subsequence is [10, -2, -5, 20].

_Constraints:_

- 1 <= k <= nums.length <= 100 000
- -10 000 <= nums[i] <= 10 000
