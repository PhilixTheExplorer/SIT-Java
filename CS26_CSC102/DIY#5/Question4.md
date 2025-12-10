# Question 4

Write a program that reads two 3 x 3 matrices and display their product. To multiply matrix a by matrix b, the number of columns in a must be the same as the number of rows in b, and the two matrices must have elements of the same or compatible types. Let c be the result of the multiplication.

For example, for two 3 x 3 matrices a and b, c is

![fig](../../img/fig)

where cij = ai1 x b1j + ai2 x b2j + a13 x b3j.

If matrix 1 is 1 2 3 4 5 6 7 8 9 and matrix 2 is 0 2 4 1 4.5 2.2 1.1 4.3 5.2, then the multiplication of the matrices is:

![fig](../../img/fig)

Each element of the product matrix ab can be calculated as follows:

ab11 = (1.0 x 0.0) + (2.0 x 1.0) + (3.0 x 1.1) = 5.3
ab12 = (1.0 x 2.0) + (2.0 x 4.5) + (3.0 x 4.3) = 11.6
ab13 = (1.0 x 4.0) + (2.0 x 2.2) + (3.0 x 5.2) = 17.9
...
ab33 = (7.0 x 4.0) + (8.0 x 2.2) + (9.0 x 5.2) = 92.4

## For example

| **Input**     | **Result** |
|:--------------|:-----------|
| 1 2 3 4 5 6 7 8 9 <br> 0 2 4 1 4.5 2.2 1.1 4.3 5.2 | 5.300000000000001 23.9 24.0 <br> 11.600000000000001 56.3 58.2 <br> 17.9 88.69999999999999 92.4 |
| ex | ex |
| ex | ex |
| ex | ex |
| ex | ex |
| ex | ex |
