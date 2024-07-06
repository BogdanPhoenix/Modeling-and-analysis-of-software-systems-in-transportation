# Laboratory №1 - The recursion

## General terms and conditions:

- All tasks must be written in a recursive manner, without using loops
- Do not use libraries that solve these tasks
- You need to write your own function to solve the task

## Task №1

Create a function that takes a string and prints it in reverse order.
_For example_, the input string "tiger", the output should be printed "regit"

## Task №2

Given a linked list, swap every two adjacent nodes and rotate its head. You must solve the problem without changing the values in the nodes of the list (i.e., you can only change the nodes themselves).

**Example №1 (see Image 1)**

_Input:_ head = [1,2,3,4]

_Output:_ [2,1,4,3]

**Example №2**

_Input:_ head = []

_Output:_ []

**Example №3**

_Input:_ head = [1]

_Output:_ [1]

**Limitations of this task:**

- the number of nodes will be in the range [0, 100].
- 0 <= Node.val <= 100

![The algorithm for exchanging elements in an array is shown.](./images/swap.jpg "Scheme of exchange of elements.")

## Task №3

The Fibonacci numbers, usually denoted by _F(n)_, form a sequence called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting with 0 and 1. That

F(0) = 0, F(1) = 1

F(n) = F(n - 1) + F(n - 2), for n > 1.

The function is passed n, calculate F(n)

**Example №1**

_Input:_ n = 2

_Output:_ 1

_Explanation:_ F(2) = F(1) + F(0) = 1 + 0 = 1.

**Example №2**

_Input:_ n = 3

_Output:_ 2

_Explanation:_ F(3) = F(2) + F(1) = 1 + 1 = 2.

**Example №3**

_Input:_ n = 4

_Output:_ 3

_Explanation:_ F(4) = F(3) + F(2) = 2 + 1 = 3.

## Task №4

You are climbing a flight of stairs. It takes n steps to reach the top.
You can take 1 or 2 steps at a time. How many unique combinations can you have to reach the top?

**Example №1**

_Input:_ n = 2

_Output:_ 2

_Explanation:_ There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps

**Example №2**

_Input:_ n = 3

_Output:_ 3

_Explanation:_ There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

_Limitations of this task:_

- 1 <= n <= 45

## Task №5

Implement your own power function pow(x, n), which calculates x raised to the power of n.

**Example №1**

_Input:_ x = 2.00000, n = 10

_Output:_ 1024.00000

**Example №2**

_Input:_ x = 2.10000, n = 3

_Output:_ 9.26100

**Example №3**

_Input:_ x = 2.00000, n = -2

_Output:_ 0.25000

_Explanation:_ 2 pow(-2) = 1/2 pow(2) = 1/4 = 0.25

_Limitations of this problem:_

--100.0 < x < 100.0

-2 pow(31) <= n <= 2 pow(31)-1

n is an integer.

Either x is not zero or n > 0.

-10 pow(4) <= x pow(n) <= 10 pow(4)
