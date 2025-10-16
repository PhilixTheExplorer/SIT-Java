## Question 1
Given an array of integer numbers, remove the largest and smallest numbers, and calculate the average of the remaining numbers.

The input is the size of numbers in the list, followed by list of integer numbers. The output is the average number that rounded to the nearest whole number. (you can use Math.round(double d) ).

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 4 <br>4 5 7 100| 6 |
| 7 <br> 5 4 54 4 6 46 56 | 23 |
| 5 <br> 10 25 5 15 20| 15 |
| 7 <br> 5 4 54 4 6 46 56 | 23 |
| 5 <br> 18 16 20 18 3 | 17 |
| 8 <br> 4 6 46 466 4666 5 54 544| 187 |


## Question 2
Write a Java program that calculates the sum of the elements in the upper and lower triangular parts of a given N x N square matrix, including the diagonal elements. Your program must separately print the sum of the elements in the upper triangular matrix and the sum of the elements in the lower triangular matrix.

Input:
- The first line contains a single integer N, the size of the matrix.
- The next N lines contain N integers each, representing the elements of the matrix.

Output:

Print two integers on separate lines. The first integer is the sum of the elements in the upper triangular matrix, including the diagonal. The second integer is the sum of the elements in the lower triangular matrix, including the diagonal.
For example, the matrix of size 3 has following list of integer.

1	2	3  
4	5	6  
7	8	9

The upper triangular matrix is:   
1	2	3  
0	5	6  
0	0	9  
Thus, the sum of upper trianular matrix is 1+2+3+5+6+9 = 26

The lower triangular matrix is:  
1	0 0  
4	5	0  
7	8	9  
Thus, the sum of lower trianular matrix is 1+5+9+4+8+7 = 34

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 3 <br> 1 2 3 <br> 4 5 6 <br> 7 8 9| 26 <br> 34|
| 5 <br> 12 4 5 6 10 <br> 7 8 14 6 21 <br> 11 2 3 6 16 <br> 3 6 7 9 1 <br> 8 9 1 2 4| 125 <br> 92|
| 5 <br> 1 1 1 1 1 <br> 1 1 1 1 1 <br> 1 1 1 1 1 <br> 1 1 1 1 1 <br> 1 1 1 1 1| 15 <br> 15|
| 10 <br> 14 15 13 95 21 4 77 48 40 51 <br> 87 98 100 89 10 19 49 55 31 44 <br> 1 7 83 33 72 50 64 53 96 81 <br> 10 29 35 56 47 8 44 10 88 78 <br> 89 100 12 41 22 100 18 96 45 25 <br> 60 39 8 77 15 22 8 13 45 16 <br> 15 96 77 59 87 59 45 7 66 31 <br> 72 89 100 18 79 20 24 9 25 15 <br> 63 77 47 23 95 96 58 68 33 18 <br> 28 99 19 73 9 67 9 58 31 24| 2419 <br> 2731|
## Question 3
Minesweeper is a game providing a board with cells. There are mines randomly distributed.

![Mine Sweeper](minesweeper.jpg)

You are going to create a minesweeper 2D board of 20X20. The input is a 2D array with 30 rows and 30 column and number of mines together with the position that those mines are distributed in row and column. Your task is to assign numbers in the board indicating number of mines nearby. Use -1 to indicate in the cell containing a mine.


### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 10 <br> 0 0 <br> 12 9 <br> 8 7 <br> 15 17 <br> 4 10 <br> 19 9 <br> 13 11 <br> 8 18 <br> 5 9 <br> 10 13| -1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 <br> 1 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 2 -1 1 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 -1 2 1 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 1 1 1 <br> 0 0 0 0 0 0 1 -1 1 0 0 0 0 0 0 0 0 1 -1 1 <br> 0 0 0 0 0 0 1 1 1 0 0 0 1 1 1 0 0 1 1 1  <br> 0 0 0 0 0 0 0 0 0 0 0 0 1 -1 1 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 1 1 0 1 1 1 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 -1 2 1 1 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 1 2 -1 1 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 0 0 1 1 1 0 0 0 1 1 1 0 <br> 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 -1 1 0 <br> 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 0 <br> 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 <br> 0 0 0 0 0 0 0 0 1 -1 1 0 0 0 0 0 0 0 0 0|
|75 <br> 4 10 <br> 13 19 <br> 9 16 <br> 3 4 <br> 7 13 <br> 5 1 <br> 9 9 <br> 5 7 <br> 14 15 <br> 5 18 <br> 15 16 <br> 3 3 <br> 4 18 <br> 17 12 <br> 12 4 <br> 2 4 <br> 19 0 <br> 19 6 <br> 17 6 <br> 15 3 <br> 9 4 <br> 18 0 <br> 15 12 <br> 10 12 <br> 14 3 <br> 1 19 <br> 8 1 <br> 1 1 <br> 13 18 <br> 10 10 <br> 12 16 <br> 9 16 <br> 13 5 <br> 19 9 <br> 13 10 <br> 6 3 <br> 3 8 <br> 4 2 <br> 9 17 <br> 2 1 <br> 3 11 <br> 10 4 <br> 19 18 <br> 14 13 <br> 13 5 <br> 18 14 <br> 0 14 <br> 8 1 <br> 9 15 <br> 13 9 <br> 0 12 <br> 10 9 <br> 11 2 <br> 13 11 <br> 7 13 <br> 19 1 <br> 17 1 <br> 18 9 <br> 5 11 <br> 13 3 <br> 17 5 <br> 3 13 <br> 11 3 <br> 18 0 <br> 5 11 <br> 1 2 <br> 12 6 <br> 1 10 <br> 0 8 <br> 1 1 <br> 13 19 <br> 5 13 <br> 1 6 <br> 8 16 <br> 8 9|1 2 2 1 0 1 1 2 -1 2 1 2 -1 2 -1 1 0 0 1 1 <br> 2 -1 -1 2 1 2 -1 2 1 2 -1 2 1 2 1 1 0 0 1 -1 <br> 2 -1 4 4 -1 3 1 2 1 2 2 2 2 1 1 0 0 0 1 1 <br> 1 2 3 -1 -1 2 0 1 -1 2 2 -1 2 -1 1 0 0 1 1 1 <br> 1 2 -1 3 2 1 1 2 2 2 -1 3 4 2 2 0 0 2 -1 2 <br> 1 -1 3 2 1 0 1 -1 1 1 2 -1 2 -1 1 0 0 2 -1 2 <br> 1 1 2 -1 1 0 1 1 1 0 1 1 3 2 2 0 0 1 1 1 <br> 1 1 2 1 1 0 0 0 1 1 1 0 1 -1 1 1 1 1 0 0 <br> 1 -1 1 1 1 1 0 0 2 -1 2 0 1 1 2 3 -1 3 1 0 <br> 1 1 1 2 -1 2 0 0 3 -1 4 2 1 1 1 -1 -1 -1 1 0 <br> 0 1 2 4 -1 2 0 0 2 -1 -1 2 -1 1 1 2 3 2 1 0 <br> 0 1 -1 -1 3 3 1 1 1 2 2 2 1 1 0 1 1 1 0 0 <br> 0 1 3 4 -1 3 -1 1 1 2 3 2 1 0 0 1 -1 2 2 2 <br> 0 0 2 -1 4 -1 2 1 1 -1 -1 -1 2 1 2 2 2 2 -1 -1 <br> 0 0 3 -1 4 1 1 0 1 2 3 3 3 -1 2 -1 2 2 2 2 <br> 0 0 2 -1 2 0 0 0 0 0 0 1 -1 2 2 2 -1 1 0 0 <br> 1 1 2 1 2 2 2 1 0 0 0 2 2 2 0 1 1 1 0 0 <br> 2 -1 1 0 1 -1 -1 1 1 1 1 1 -1 2 1 1 0 0 0 0 <br> -1 4 2 0 1 3 3 2 2 -1 2 1 1 2 -1 1 0 1 1 1 <br> -1 -1 1 0 0 1 -1 1 2 -1 2 0 0 1 1 1 0 1 -1 1|
|50 <br> 19 9 <br> 3 19 <br> 17 3 <br> 11 19 <br> 15 15 <br> 3 18 <br> 2 8 <br> 8 13 <br> 12 19 <br> 16 6 <br> 5 18 <br> 17 19 <br> 9 6 <br> 16 0 <br> 19 1 <br> 9 17 <br> 0 14 <br> 11 8 <br> 8 9 <br> 16 11 <br> 12 11 <br> 10 3 <br> 11 19 <br> 14 15 <br> 10 14 <br> 2 16 <br> 10 7 <br> 10 16 <br> 3 5 <br> 1 9 <br> 0 0 <br> 3 19 <br> 11 3 <br> 17 13 <br> 15 14 <br> 10 10 <br> 10 7 <br> 3 9 <br> 2 15 <br> 2 4 <br> 19 4 <br> 10 18 <br> 4 15 <br> 5 2 <br> 7 8 <br> 7 19 <br> 2 9 <br> 3 1 <br> 5 10 <br> 11 13|-1 1 0 0 0 0 0 0 1 1 1 0 0 1 -1 1 0 0 0 0 <br> 1 1 0 1 1 1 0 1 3 -1 2 0 0 1 2 3 2 1 0 0 <br> 1 1 1 1 -1 2 1 1 -1 -1 3 0 0 0 1 -1 -1 2 2 2 <br> 1 -1 1 1 2 -1 1 1 3 -1 2 0 0 0 2 3 3 2 -1 -1 <br> 1 2 2 1 1 1 1 0 1 2 2 1 0 0 1 -1 1 2 3 3 <br> 0 1 -1 1 0 0 0 0 0 1 -1 1 0 0 1 1 1 1 -1 1 <br> 0 1 1 1 0 0 0 1 1 2 1 1 0 0 0 0 0 1 2 2 <br> 0 0 0 0 0 0 0 1 -1 2 1 0 1 1 1 0 0 0 1 -1 <br> 0 0 0 0 0 1 1 2 2 -1 1 0 1 -1 1 0 1 1 2 1 <br> 0 0 1 1 1 1 -1 2 2 2 2 1 1 2 2 2 2 -1 2 1 <br> 0 0 2 -1 2 1 2 -1 2 2 -1 1 1 2 -1 2 -1 3 -1 2 <br> 0 0 2 -1 2 0 1 2 -1 2 2 2 2 -1 2 2 1 2 3 -1 <br> 0 0 1 1 1 0 0 1 1 1 1 -1 2 1 1 0 0 0 2 -1 <br> 0 0 0 0 0 0 0 0 0 0 1 1 1 0 1 1 1 0 1 1 <br> 0 0 0 0 0 0 0 0 0 0 0 0 0 1 3 -1 2 0 0 0 <br> 1 1 0 0 0 1 1 1 0 0 1 1 1 1 -1 -1 2 0 0 0 <br> -1 1 1 1 1 1 -1 1 0 0 1 -1 2 2 3 2 1 0 1 1 <br> 1 1 1 -1 1 1 1 1 0 0 1 1 2 -1 1 0 0 0 1 -1 <br> 1 1 2 2 2 1 0 0 1 1 1 0 1 1 1 0 0 0 1 1 <br> 1 -1 1 1 -1 1 0 0 1 -1 1 0 0 0 0 0 0 0 0 0|

## Question 4
Write a java program to print the steps of 2D array traversal in a spiral form.

For example,

Given the 4 x 4 array, the traversal form is:

1	2	3	4  
12	13	14	5  
11	16	15	6  
10	9	8	7


### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 4 4 |1 2 3 4  <br> 12 13 14 5 <br> 11 16 15 6 <br> 10 9 8 7|
| 5 4 |1 2 3 4 <br> 14 15 16 5 <br> 13 20 17 6 <br> 12 19 18 7 <br> 11 10 9 8|
| 6 4 |1 2 3 4 <br> 16 17 18 5 <br> 15 24 19 6 <br> 14 23 20 7 <br> 13 22 21 8 <br> 12 11 10 9|
| 5 5 |1 2 3 4 5 <br> 16 17 18 19 6 <br> 15 24 25 20 7 <br> 14 23 22 21 8 <br> 13 12 11 10 9|
| 5 8 |1 2 3 4 5 6 7 8 <br> 22 23 24 25 26 27 28 9 <br> 21 36 37 38 39 40 29 10 <br> 20 35 34 33 32 31 30 11 <br> 19 18 17 16 15 14 13 12|

## Question 5
The gardener is cultivating a 3D grass field by planting a block of grass each day. For each day, the grass exhibits continuous growth, expanding into neighboring cells across six dimensions: up, down, left, right, front, and back. The gardener intends to continue planting for several days. On the final day of planting, write a program to determine the total number of cells occupied by the grass.

The input consitst of 3 parts:

1. size of the 3D field (row, column, depth)

2. number of days

3. a position of cell that the gardener plant a block of grass in each day

The output is the total number of cells occupied by the grass.

The first day of planting, the 3D field is visualized as follow:

![Day 1](day1.png)

The second day of planting, the 3D field is visualized as follow:

![Day 2](day2.png)

The third day of planting, the 3D field is visualized as follow:

![Day 3](day3.png)

From the example, after planting for 3 days, the total number of occupied cell is 18.



### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
| 5 5 3 <br> 3 <br> 0 0 0 <br> 2 3 1 <br> 1 3 2 | 18|
| 3 3 3 <br> 2 <br> 0 0 0 <br> 2 2 2| 5 |
| 5 4 3 <br> 3 <br> 3 0 2 <br> 4 1 1 <br> 2 2 2| 17 |
| 4 4 5 <br> 4 <br> 1 2 3 <br> 2 2 2 <br> 3 1 4 <br> 0 0 1| 53 |
