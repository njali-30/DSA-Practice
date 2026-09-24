**# Problem 6: Reverse a Number**

**## Problem Statement**

Reverse the digits of a given integer without converting it into a string.

**## Example**

Input: 12345

Output: 54321

**## Approach**

Extract the last digit using modulo, add it to the reversed number, and remove the last digit using integer division.

**## Complexity**

\- Time: O(d), where d is the number of digits

\- Auxiliary Space: O(1)