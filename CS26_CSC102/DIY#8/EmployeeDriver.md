# EmployeeDriver

![emp](../../img/emp-oop.png)

Create a class called Employee to represent an employee’s yearly salary calculation. The class should include the following:

* Attributes (or Data Fields)
  * A private string attribute named "firstName" for the employee first name.
  * A private string attribute named "lastName" for the employee last name.
  * A private double attribute named "monthlySalary" that stores the employee’s monthly salary.
* Constructor
  * Provide a constructor that initializes the three instance variables: firstName, lastName, and monthlySalary.
* Methods
  * Provide a set and get methods for each instance variable.
  * Constraint: If the monthlySalary is not positive, do not set its value.

Furthermore, write a driver class named EmployeeDriver that demonstrates class Employee’s capabilities:

* Display each employee’s yearly salary.
* Give each employee a 10% raise.
* Display each Employee’s yearly salary again after the raise.

## For example

| **Input**     | **Result** |
|:--------------|:-----------|
| Thanatat <br> Wongabut <br> 20000 | Employee: Thanatat Wongabut <br> Yearly salary: 240000.00 <br> Yearly salary after raise: 264000.00 |
| Kristina <br> Obrien <br> 120000 | Employee: Kristina Obrien <br> Yearly salary: 1440000.00 <br> Yearly salary after raise: 1584000.00 |
| Lincoln <br> Yang <br> 45000 | Employee: Lincoln Yang <br> Yearly salary: 540000.00 <br> Yearly salary after raise: 594000.00 |
| Raihan <br> Gill <br> -35000 | Employee: Raihan Gill <br> Yearly salary: 0.00 <br> Yearly salary after raise: 0.00 |
| Sarun <br> Wilkinson <br> 27845.75 | Employee: Sarun Wilkinson <br> Yearly salary: 334149.00 <br> Yearly salary after raise: 367563.90 |
