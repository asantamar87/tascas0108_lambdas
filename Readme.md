# Java Lambdas and Streams Exercises

This repository contains a series of exercises that use the Java Lambdas and Streams API (Java 8+). The exercises are divided into three levels, each increasing in difficulty.

---

## Level 1

### Exercise 1
Given a list of strings, write a method that returns a list of all strings that contain the letter 'o'. Print the result.

### Exercise 2
Repeat the previous exercise, but this time the method should return a list of strings that not only contain the letter 'o' but also have more than 5 characters. Print the result.

### Exercise 3
Create a list with the names of the months of the year. Print all the elements in the list using a lambda expression.

### Exercise 4
Perform the same task as in Exercise 3, but use a method reference instead of a lambda expression.

### Exercise 5
Create a functional interface with a method called `getPiValue()` that returns a double. From the `main()` method of the main class, instantiate the interface, assign the value `3.1415` to it, invoke the `getPiValue()` method, and print the result.

### Exercise 6
Create a list with numbers and strings and sort the list by the length of the strings, from shortest to longest.

### Exercise 7
Using the list from the previous exercise, now sort it in reverse order, from longest string to shortest.

### Exercise 8
Create a functional interface with a method called `reverse()`. This method should take and return a String. In the `main()` method of the main class, inject the body of the method using a lambda expression, so that it returns the same string but reversed. Invoke the interface instance with a string and verify that the result is correct.

---

## Level 2

### Exercise 1
Create a list of strings with proper names. Write a method that returns a list of all strings that start with the letter 'A' (uppercase) and have exactly 3 letters. Print the result.

### Exercise 2
Write a method that returns a comma-separated string based on a list of integers. Each element should be prefixed by the letter "e" if the number is even, or "o" if the number is odd. For example, if the input list is (3, 55, 44), the output should be "o3, o55, e44". Print the result.

### Exercise 3
Create a functional interface with a method called `operacio()`. This method should return a float. Inject the body of the method using a lambda expression, so that the operation can be a sum, subtraction, multiplication, or division.

### Exercise 4
Create a list containing some strings and numbers.

Sort them by:
- Alphabetically by the first character. (Note: `charAt(0)` returns the numeric code of the first character).
- Strings that contain the letter "e" first, followed by the rest of the strings. (Write the code directly inside the lambda).
- Modify all elements that contain the letter 'a' by replacing the 'a' with a '4'.
- Display only numeric elements (even if stored as strings).

---

## Level 3

### Exercise 1
Create a class `Student` with the attributes: Name, Age, Course, and Grade.

Populate a list with 10 students.

- Display the name and age of each student.
- Filter the list to include all students whose name starts with the letter 'a'. Assign these students to another list and print the new list (using lambdas).
- Filter and print all students who have a grade of 5 or higher.
- Filter and print all students who have a grade of 5 or higher, and are not from the PHP course.
- Display all students who are studying JAVA and are of legal age.

---
