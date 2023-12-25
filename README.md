
# LeetCode Challenge D9

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2496.  Maximum Value of a String in an Array](https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/) Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement
The  **value**  of an alphanumeric string can be defined as:
-   The  **numeric**  representation of the string in base  `10`, if it comprises of digits  **only**.
-   The  **length**  of the string, otherwise.
Given an array  `strs`  of alphanumeric strings, return  _the  **maximum value**  of any string in_ `strs`..


**Example**

>**Input:** strs = ["alic3","bob","3","4","00000"]
>
>**Output:** 5
>
>**Explanation:** 
>- "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
>- "bob" consists only of letters, so its value is also its length, i.e. 3.
>- "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
>- "4" also consists only of digits, so its value is 4.
>- "00000" consists only of digits, so its value is 0.
>Hence, the maximum value is 5, of "alic3".

**Language Used**
> Java

**Difficulty**

> Easy



## Solution Overview

The solution employs an iterative approach by traversing the array of alphanumeric strings. During each iteration, the algorithm analyzes each string by first checking if it comprises only digits. In the case of a digit-only string, it attempts to convert it to an integer. If the conversion is successful, the numeric value is utilized; otherwise, the length of the string is considered. Throughout the iteration, the algorithm keeps track of the maximum value encountered. Finally, the solution returns the computed maximum value, providing a comprehensive and efficient method for determining the maximum value of alphanumeric strings within the given array.
