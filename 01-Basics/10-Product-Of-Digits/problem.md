**# Problem 10: Product of Digits**

**## Problem Statement**

Calculate the product of all digits in a given integer.

**## Example**

Input: 12345

Output: 120

**## Approach**

Repeatedly extract the last digit using modulo, multiply it with the running product, and remove the last digit using integer division.

**## Complexity**

\- Time: O(d), where d is the number of digits

\- Auxiliary Space: O(1)