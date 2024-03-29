# Hotel Problem
Muaymi is an entrepreneur and she wants to start her first startup company with a hotel reservation application. An application works by reserving a hotel\'s room based on the capacity (1<= capacity <=100) available in each room.

Your task is to write a program to output the reserved room for each reservation. The the conditions are:

1. First come first serve.
2. Find the most fit room (the least differences between number of guests and capacity).
3. The search direction is from left to right and bottom to top floor. The example layout of the room number is shown below.

![RoomPlan](RoomPlan.jpg)

The input consists of 4 parts.
1. Number of row, column and floor of hotel
2. Numbers of room capacity
3. Number of reservations
4. Number of guests for each reservation

The output is the list of matching between each reservation and room number. If there is no matching found, the program prints "ROOM NOT FOUND".

### For example:
Input:

4 5 3

5 14 12 13  
5 17 6 9  
2 10 6 4  
11 8 5 18  
14 15 10 9  

10 5 16 3  
6 13 4 15  
19 15 9 9  
14 19 4 20  
17 13 1 15  

5 17 1 6  
14 6 6 18  
13 4 11 10  
12 20 8 12  
13 10 19 6  

3  
2 3 50

Output:

2 -> #9  
3 -> #24  
50 -> ROOM NOT FOUND