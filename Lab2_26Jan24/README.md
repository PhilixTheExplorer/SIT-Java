## Question 1  
Your task is to write a program to normalize the given text by using the conditions given below.

1. Remove all spaces.
2. Convert all text to lower case.
3. Sort characters according to an ascending order. (Hint: you can use Arrays.sort())
### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|Abstraction is often one floor above you.| .aaabbceeeffiilnnnooooooorrsstttuvy|

## Question 2  
Return true if the string "cat" and "dog" appear the same number of times in the given string.

### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|catdog| true|
|catcat| false|
|1cat1cadodog|true|

## Question 3  
Write a program to combine two Strings. The combination of the Strings must alternatively combine the first String with the reversed of the second String.  

The input consists of two Strings.  

The output is the combined String.
### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|ABCD<br><br>1234| A4B3C2D1|
|Programming<br>Java|ParvoagJramming|
|A<br>IsTheFirstAlphabetInEnglish|AhsilgnEnItebahplAtsriFehTsI|
|YouGood???<br>`$#%&&@#@#%&#@$&`|Y&o$u@G#o&o%d#?@?#?@&&%#$|
|CS@SIT<br>KMUTT|CTST@USMIKT|
|1234<br>abcdefghijk|1k2j3i4hgfedcba|

## Question 4  
Neil, a member of Tenet, is assigned a mission to travel back in time using an inverted entropy to prevent some incidents. He is given a list of incidents together with a time. However, he has a 24-hour watch but the provided list indicates 12-hour time format. He need to convert the time from 12-hour format to 24-hour format in order to work with his watch. Your task is to support Neil by writing a program to convert 12-hour time format to 24-hour time format.

An input comprises of 2 integers represent hour and minute and 1 String represents am or pm.

Note that 12:00 AM of 12-hour time format is 00:00 in 24-hour time format.
### For example:
| **Input**     | **Result** |
|:--------------|:-----------|
|12 00 am|00:00|
|12 00 pm|12:00|
|09 09 pm|21:09|
|03 45 am|03:45|
|09 09 am|09:09|
|01 45 pm|13:45|
|11 25 am|11:25|
|07 19 pm|19:19|
