Cupid aims to match people based on their shared interests. Given a list of N individuals and their interests, write a program that finds the most compatible match for each person using the following criteria, in order of priority:

Two people with the highest number of common interests form the strongest bond. However, if a person has no common interests with anyone, they remain unmatched and should be assigned "Forever Alone."
If multiple potential matches have the same compatibility score, select the one whose name comes first in alphabetical order.
Some individuals may refuse to be paired with certain people due to past relationships. In such cases, the next best match should be considered.
Each person is paired with exactly one other person. If no valid match is found, return "Forever Alone" for that individual.
Hint: retainAll() method keeps only the common elements between two collections and removes the rest.

List<String> set1 = new ArrayList<> ("apple", "banana", "cherry");
List<String> set2 = new ArrayList<>("banana", "cherry", "date");

set1.retainAll(set2); // Keeps only common elements: "banana" and "cherry"

System.out.println(set1); // Output: [banana, cherry]

Input:

N for number of people  
A list of N people, each with  
A name  
A list of people they refuse to be paired with. Enter -1 to proceed to the next section.  
A list of interests. Enter -1 to indicate the end of the list and proceed to the next person.  

Output:  

A list of names representing the most compatible match for each person.

For example:

|Input|Result|
|:--|:--|
|4<br/>Alice<br/>Charlie -1<br/>music movies reading -1<br/>Bob<br/>-1<br/>sports music movies -1<br/>Charlie<br/>Alice -1<br/>reading travel sports -1<br/>David<br/>-1<br/>music movies reading -1|Alice David<br/>Bob Alice<br/>Charlie Bob<br/>David Alice|
