# Laboratory №2 - Arrays

## Task №1: The maximum number of repetitions

The input is a binary array of nums, return the maximum number of repetitions of the 1st element in the array

**Example №1**

_Input:_ nums = [1,1,0,1,1,1]

_Output:_ 3

**Example №2**

_Input:_ nums = [1,0,1,1,0,1]

_Output:_ 2

_Constraints:_

- 1 <= nums.length <= 100 000
- nums[i] can be 0 or 1

## Task №2: Find the numbers with even number of digits

Given an array of nums integers, return how many of them contain an even number of digits.

**Example №1**

_Input:_ nums = [12, 345, 2, 6, 7896]

_Output:_ 2

_Explanation:_

- 12 contains 2 digits (even number of digits).
- 345 contains 3 digits (odd number of digits).
- 2 contains 1 digit (odd number of digits).
- 6 contains 1 digit (odd number of digits).
- 7896 contains 4 digits (even number of digits).
- Therefore, only 12 and 7896 contain an even number of digits.

**Example №2**

_Input:_ nums = [555, 901, 482, 1771]

_Output:_ 1

_Constraints:_

- 1 <= nums.length <= 500
- 1 <= nums[i] <= 100 000

## Task №3: Squares of a sorted array

Given an array of integers nums, sorted in non-decreasing order, returns an array of squares of each number, sorted in non-decreasing order.

**Example №1**

_Input:_ nums = [ -4, -1, 0, 3, 10]

_Output:_ [ 0, 1, 9, 16, 100]

**Example №2**

_Input:_ nums = [ -7, -3, 2, 3, 11]

_Output:_ [ 4, 9, 9, 49, 121]

_Constraints:_

- 1 <= nums.length <= 10 000
- 10 000 <= nums[i] <= 10 000

## Task №4: Double zeros

Given an array of integers of fixed length arr, duplicate each occurrence of zero, shifting the other elements to the right.

**Example №1**

_Input:_ arr = [ 1, 0, 2, 3, 0, 4, 5, 0]

_Output:_ [ 1, 0, 0, 2, 3, 0, 0, 4]

**Example №2**

_Input:_ arr = [ 1, 2, 3]

_Output:_ [ 1, 2, 3]

_Constraints:_

- 1 <= arr.length <= 10 000
- 0 <= arr[i] <= 9

## Task №5: Merge a sorted array

You are given two arrays of integers nums1 and nums2, sorted in descending order, and two integers m and n, representing the number of elements in nums1 and nums2, respectively.

Combine nums1 and nums2 into one array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead stored in the nums1 array. To do this, nums1 has length m + n, where the first m elements indicate the elements to be merged, and the last n elements have the value 0 and should be ignored. nums2 has length n.

**Example №1**

_Input:_ nums1 = [ 1, 2, 3, 0, 0, 0], m = 3, nums2 = [ 2, 5, 6], n = 3

_Output:_ [ 1, 2, 2, 3, 5, 6]

**Example №2**

_Input:_ nums1 = [ 1 ], m = 1, nums2 = [ ], n = 0

_Output:_ [ 1 ]

**Example №3**

_Input:_ nums1 = [ 0 ], m = 0, nums2 = [ 1 ], n = 1

_Output:_ [ 1 ]

_Constraints:_

- nums1.length == m + n
- nums2.length == n
- 0 <= m, n <= 200
- 1 <= m + n <= 200
- -10 <= nums1[i], nums2[j] <= 10

## Task №6: Remove duplicates from a sorted array

Given an integer array of nums sorted in non-decreasing order, remove duplicates in place so that each unique element appears only once. The relative order of the elements must be unchanged. Then returns the number of unique elements in nums.

Assuming that the number of unique elements in nums is k, you must do the following to be accepted:

- Modify the array nums so that the first k elements of nums contain unique elements in the order they were originally present in nums. The remaining elements of nums are not important, nor is the size of nums.
- Return k.

**Example №1**

_Input:_ nums = [ 1, 1, 2 ]

_Output:_ 2, nums = [ 1, 2, _ ]

**Example №2**

_Input:_ nums = [ 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 ]

_Output:_ 5, nums = [ 0, 1, 2, 3, 4, _, _, _, _, _, _ ]

Constraints.

- 1 <= nums.length <= 3 \* 10 000
- -100 <= nums[i] <= 100
- nums are sorted in ascending order.

## Task №7: Check if N and its duplicate exist

Given an array arr of integers, check if there are two indices i and j such that

- i != j
- 0 <= i, j < arr.length
- arr[ i ] == 2 \* arr[ j ]

**Example №1**

_Input:_ arr = [10,2,5,3]

_Output:_ true

_Explanation._
For i = 0 and j = 2, arr[ i ] == 10 == 2 _ 5 == 2 _ arr[ j ]

**Example №2**

_Input:_ arr = [ 3, 1, 7, 11]

_Output:_ false

_Explanation._
There are no i and j that satisfy the conditions

Constraints

- 2 <= arr.length <= 500
- 1 000 <= arr[i] <= 1 000

## Task №8: A real mountain range

Given an array of integers arr, it returns true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i from 0 < i < arr.length - 1 such that:
  - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
  - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Real mountain range:

- [ 0, 1, 2, 3, 4, 2, 1 ]
- from 0 to 4 strictly increasing
- from 4 to 1 strictly decreasing

Invalid mountain range:

- [ 0, 2, 3, 3, 5, 2, 1 ]
- from 0 to 5 not strictly increasing
- from 5 to 1 strictly decreasing

**Example №1**

_Input:_ arr = [ 2, 1]

_Output:_ false

**Example №2**

_Input:_ arr = [ 3, 5, 5]

_Output:_ false

**Example №3**

_Input:_ arr = [ 0, 3, 2, 1]

_Output:_ true

_Constraints:_

- 1 <= arr.length <= 10 000
- 0 <= arr[ i ] <= 10 000

## Task №9: Replace elements with the largest element on the right side

Given an array arr, replace each element in this array with the largest element among the elements to its right and replace the last element with -1.

After that, return the array.

**Example №1**

_Input:_ arr = [ 17, 18, 5, 4, 6, 1]

_Output:_ [ 18, 6, 6, 6, 1, -1]

**Example №2**

_Input:_ arr = [ 400 ]

_Output:_ [ -1 ]

_Constraints:_

- 1 <= arr.length <= 10 000
- 1 <= arr[i] <= 100 000

## Task №10: Sort an array by parity

Given an array of integers nums, move all even integers to the beginning of the array, and then all odd integers.

Returns any array that satisfies this condition.

**Example №1**

_Input:_ nums = [ 3, 1, 2, 4]

_Output:_ [ 2, 4, 3, 1]

_Explanation:_ the results [ 4, 2, 3, 1], [ 2, 4, 1, 3], and [ 4, 2, 1, 3] are acceptable.

**Example №2**

_Input:_ nums = [0]

_Output:_ [0]

_Constraints:_

- 1 <= nums.length <= 5000
- 0 <= nums[i] <= 5000
