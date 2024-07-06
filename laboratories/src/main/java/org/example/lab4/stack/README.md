# Laboratory 4.1 - Stack

## Task №1: Valid brackets

Given a string s containing only the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The input string is valid if:

- Open brackets must be closed with brackets of the same type.
- The open brackets must be closed in the correct order.
- Each closed parenthesis has a corresponding open parenthesis of the same type.

**Example №1:**

_Input:_ s = "()"

_Output:_ true

**Example №2:**

_Input:_ s = "()[]{}"

_Output:_ true

**Example №3:**

_Input:_ s = "()"

_Output:_ false

_Constraints:_

- 1 <= s.length <= 10 000
- s consists of parentheses only '()[]{}'

## Task №2: Inorder Traversal of a binary tree

Given the root of a binary tree, return an Inorder Traversal of the values of its nodes.

**Example №1:**

    (1)
        ->
        (2)
            ->
                (3)

_Input:_ root = [1,null,2,3]

_Output:_ [1,3,2]

**Example №2:**

_Input:_ root = []

_Output:_ []

**Example №3:**

_Input:_ root = [1]

_Output:_ [1]

_Constraints:_

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

## Task №3: Minimum stack

Create a stack that supports sending, pushing, starting, and receiving a minimum element in constant time.

Implement the MinStack class:

MinStack() initializes a stack object.

- void push(int val) moves the element val to the stack.
- void pop() removes the element at the top of the stack.
- int top() gets the top element of the stack.
- int getMin() gets the minimum element on the stack.

You must implement a solution with O(1) time complexity for each function.

**Example:**

_Input:_

["MinStack","push","push","push","getMin","pop","top","getMin"]

[[],[-2],[0],[-3],[],[],[],[]]

_Output:_ [null,null,null,null,-3,null,0,-2]

_Explanation:_

MinStack minStack = new MinStack();

minStack.push(-2);

minStack.push(0);

minStack.push(-3);

minStack.getMin(); // return -3

minStack.pop();

minStack.top(); // return 0

minStack.getMin(); // return -2

_Restrictions:_
The pop, top and getMin methods of operations will always be called in a non-empty stack

## Task №4: Implement a queue using stacks

Implement a FIFO queue using only two stacks. The implemented queue must support all the functions of a regular queue (push, peek, pop, and empty).

Implement the MyQueue class:

- void push(int x) Moves element x to the end of the queue.
- int pop() Removes an element from the beginning of the queue and returns it.
- int peek() Returns the item at the beginning of the queue.
- boolean empty() Returns true if the queue is empty, and false otherwise.

_Notes:_

- You should only use standard stack operations, which means that only push to top, peek/pop from top, size, and is empty are valid.
- Depending on your language, the stack may not be supported natively. You can simulate a stack using a list or a queue (a queue with two ends) if you only use standard stack operations.

**Example:**

_Input:_

["MyQueue", "push", "push", "peek", "pop", "empty"]

[[], [1], [2], [], [], []]

_Output:_ [null, null, null, 1, 1, false]

_Explanation:_

MyQueue myQueue = new MyQueue();

myQueue.push(1); // queue is: [1]

myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)

myQueue.peek(); // return 1

myQueue.pop(); // return 1, queue is [2]

myQueue.empty(); // return false

_Constraints:_

- 1 <= x <= 9
- A maximum of 100 calls will be made to push, pop, peek, and empty.
- All calls to pop and peek are valid.

## Task №5: Decode a string

Given an encoded string, return its decoded string.

The encoding rule is as follows: k[encoded_string], where encoded_string in square brackets is repeated exactly k times. Note that k is guaranteed to be a positive integer.

You can assume that the input string is always valid; there are no extra spaces, square brackets are properly formed, etc. You can also assume that the input does not contain any digits and that the digits are only for the repeating number, k. For example, there will be no input such as 3a or 2[4].

The test cases are generated in such a way that the length of the result will never exceed 100,000.

**Example №1:**

_Input:_ s = "3[a]2[bc]"

_Output:_ "aaabcbc"

**Example №2:**

_Input:_ s = "3[a2[c]]"

_Output:_ "accaccacc"

**Example №3:**

_Input:_ s = "2[abc]3[cd]ef"

_Output:_ "abcabccdcdcdef"

_Constraints:_

- 1 <= s.length <= 30
- s consists of lowercase English letters, numbers and square brackets '[]'.
- s is guaranteed to be a valid input.
- All integers in s are in the range [1, 300].

## Task №6: Evaluate the reverse Polish notation

You are given an array of string tokens representing an arithmetic expression in reverse Polish notation.

Evaluate the expression. Returns an integer representing the value of the expression.

Note that:

- The operators "+", "-", "\*", and "/" are valid.
- Each operand can be an integer or another expression.
- The division between two integers is always reduced to zero.
- There is no division by zero.
- The input is a real arithmetic expression in backward polished notation.
- The answer and all intermediate calculations can be represented as a 32-bit integer.

**Example №1:**

_Input:_ tokens = ["2", "1", "+", "3", "*"]

_Output:_ 9

_Explanation:_ ((2 + 1) \* 3) = 9

**Example №2:**

_Input:_ tokens = ["4", "13", "5","/", "+"]

_Output:_ 6

_Explanation:_ (4 + (13 / 5)) = 6

**Example №3:**

_Input:_ tokens = ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]

_Output:_ 22

_Explanation:_ ((10 _ (6 / ((9 + 3) _ -11))) + 17) + 5 = ((10 _ (6 / (12 _ -11))) + 17) + 5 = ((10 _ (6 / -132)) + 17) + 5 = ((10 _ 0) + 17) + 5 = (0 + 17) + 5 = 17 + 5 = 22

_Constraints:_

- 1 <= tokens.length <= 104
- tokens[i] is either an operator: "+", "-", "\*", or "/", or an integer in the range [-200, 200].

## Task №7: The longest real brackets

Given a string containing only the characters "(" and ")", return the length of the longest real (correctly formed) braces of the substrings.

**Example №1:**

_Input:_ s = "(()"

_Output:_ 2

_Explanation:_ the longest valid substring bracket is "()".

**Example №2:**

_Input:_ s = ")()()())"

_Output:_ 4

_Explanation:_ the longest valid bracketed substring is "()()".

**Example №3:**

_Input:_ s = ""

_Output:_ 0

_Constraints:_

- 0 <= s.length <= 3 \* 104
- s[i] is '(' or ')'.
