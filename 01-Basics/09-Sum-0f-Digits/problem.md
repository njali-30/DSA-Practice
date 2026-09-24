**# Problem 9: Sum of Digits**

**## Problem Statement**

Calculate the sum of all digits in a given integer.

**## Example**

Input: 12345

Output: 15

**## Approach**

Repeatedly extract the last digit using modulo, add it to a running total, and remove the last digit using integer division.

**## Complexity**

\- Time: O(d), where d is the number of digits

\- Auxiliary Space: O(1)