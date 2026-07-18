# Wipro Java Milestone Projects

Four core-Java milestone projects covering arrays, packages, inheritance, exception handling, and menu-driven console applications.

## Project 1 — Employee Information (Input & Display)
`Project1_EmployeeInfo/EmployeeDetails.java`

Accepts an employee ID from the command line, looks it up in the stored employee data, calculates salary (Basic + HRA + DA − IT) based on designation code, and prints the details. Prints an error message if the ID isn't found.

**Run:**
```
cd Project1_EmployeeInfo
javac EmployeeDetails.java
java EmployeeDetails 1003
```

## Project 2 — Student Grade Calculation
`Project2_StudentGrade/com/wipro/...`

Uses four packages (`bean`, `exception`, `service`, `main`) to validate `Student` objects with custom exceptions (null object / null name / null marks), compute a grade from total marks, and count each type of invalid record.

**Run:**
```
cd Project2_StudentGrade
javac com/wipro/bean/*.java com/wipro/exception/*.java com/wipro/service/*.java com/wipro/main/*.java
java com.wipro.main.StudentMain
```

## Project 3 — Video Rental Inventory System
`Project3_VideoRental/*.java`

Menu-driven console app to add videos, check them out, return them, rate them, and list the full inventory.

**Run:**
```
cd Project3_VideoRental
javac *.java
java VideoLauncher
```

## Project 4 — Interest Calculator
`Project4_InterestCalculator/*.java`

Calculates interest for Savings Bank, Fixed Deposit, and Recurring Deposit accounts using an abstract `Account` class, inheritance, method overriding, and a custom `InvalidAmountException` for negative input.

**Run:**
```
cd Project4_InterestCalculator
javac *.java
java InterestCalculator
```

## Tech
Core Java (JDK 8+), OOP (abstraction, inheritance, method overriding), custom exceptions, packages, arrays, switch-case, Scanner-based console I/O.
