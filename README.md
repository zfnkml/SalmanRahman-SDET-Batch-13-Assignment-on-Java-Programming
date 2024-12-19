# Java Programming Challenges

This repository contains Java solutions to a variety of practical programming challenges. Each task demonstrates specific programming concepts such as searching, sorting, string manipulation, random number generation, and more.

---

## Table of Contents
1. [Documentation](#documentation)
2. [Challenges and Solutions](#challenges-and-solutions)
3. [How to Run](#how-to-run)

---

## Documentation

For a detailed explanation of the challenges, solutions, and additional insights, check out the [documentation here](https://docs.google.com/document/d/e/2PACX-1vSbIo6EJRKUfECXRqu-hc6tEo2rB3DSyOf85IKt8I1Pepd3bWnfo6ln9IY7wQ4ShqAY8-yqQuHvL-G8/pub).

---

## Challenges and Solutions

### 01 - Find the Second Highest CGPA

- **Description**: Identify the second highest CGPA from a given list of student CGPAs using a linear search algorithm.
- **Example Output**:
    
    ```java
    01 - Here is the 10 students CGPA
    [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]
    Find out who achieved the 2nd highest score.
    (without sorting, use linear searching algorithm)
    The second highest CGPA is: 3.75
    ```
    

### 02 - Sort CGPAs in Descending Order

- **Description**: Sort the given CGPAs programmatically without using `Arrays.sort()`.
- **Example Output**:
    
    ```java
    02 - Sort the above scores from according to the order of highest CGPA
    (don’t use Arrays.sort() method, do it programmatically)
    Unsorted : [3.5, 3.52, 3.43, 3.63, 3.48, 3.32, 3.3, 3.6, 3.86, 3.75]
    Sorted   : [3.86, 3.75, 3.63, 3.6, 3.52, 3.5, 3.48, 3.43, 3.32, 3.3]
    ```
    

### 03 - Binary Search for CGPA

- **Description**: Check if a user-input CGPA exists in the sorted CGPA list using a binary search algorithm.
- **Example Output**:
    
    ```java
    03 - Take a CGPA as user input.
    Now from the given array find if your input CGPA is present
    using binary search algorithm
    Given Array Sorted : [3.86, 3.75, 3.63, 3.6, 3.52, 3.5, 3.48, 3.43, 3.32, 3.3]
    Enter CGPA to find : 3.5
    Found : 3.5
    ```
    

### 04 - Random Number Array

- **Description**: Generate 10 random integers, then find and print the maximum and minimum values.
- **Example Output**:
    
    ```java
    04- Generate random 10 integer numbers in an array and
    print out all the numbers from the array and also
    print the max and min number from the array.
    Array    : [184, 399, 607, 95, 528, 133, 646, 277, 410, 263]
    ArrayMin : 95
    ArrayMax : 646
    ```
    

### 05 - Currency Breakdown

- **Description**: Break down a given amount into currency denominations.
- **Example Output**:
    
    ```java
    05 - Write a program that will break down the amount and
    count notes for any given amount.
    Here is the notes in the given array:
    notes=[1000,500,200,100,50,20,10,5,2,1]
    Enter Amount to break down : 1888
    1000 1
     500 1
     200 1
     100 1
      50 1
      20 1
      10 1
       5 1
       2 1
       1 1
    ```
    

### 06 - Pyramid Pattern

- **Description**: Print a pyramid-like pattern using numbers.
- **Example Output**:
    
    ```java
    06 - Write a program that will give following output:
    12345
    1234
    123
    12
    1
    12
    123
    1234
    12345
    ```
    

### 07 - Find Two Lowest Heights

- **Description**: Identify the two shortest heights in a list of baby heights without using `Arrays.sort()`.
- **Example Output**:
    
    ```java
    07 - Take input as height of 10 babies in cm.
    Now find out the 2 lowest height of babies.
    (Don’t use Arrays.sort() method)
    Height of 10 babies         : [85, 25, 74, 66, 37, 44, 78, 78, 4, 82]
    1st lowest height of babies : 4
    2nd lowest height of babies : 25
    ```
    

### 08 - Analyze a String

- **Description**: Count the number of words, characters (excluding spaces), vowels, and consonants in a given string.
- **Example Output**:
    
    ```java
    08 - Count  number of words,
                number of characters without spaces,
                number of vowels and consonant from the given string
    Input : I am a SQA Engineer
    Output: Words     : 5
            Chars     : 15
            Vowel     : 8
            Consonant : 7
    ```
    

### 09 - Binary String Check

- **Description**: Check if a user-input string is binary.
- **Example Output**:
    
    ```java
    09 - Write a program that evaluates a string entered by the user
    to determine whether it is binary or not.
    Input : 2001
    Output: false
    ```
    

### 10 - Generate Random Password

- **Description**: Create an 8-character password following strict rules: at least one uppercase letter, one lowercase letter, one digit, and one special character.
- **Example Output**:
    
    ```java
    10 - Generate random password which length is 8.
    Should follow this password strategy:
        Min 1 capital letter,
        min 1 small letter,
        min 1 digit and
        min 1 special character.
    Output : NEj.7NFL
    ```
    

### 11 - Remove Vowels

- **Description**: Remove all vowels from a given string.
- **Example Output**:
    
    ```java
    11 - Remove Vowels from a String
    Input : I am a SQA Engineer
    Output: m sq ngnr
    ```
    

### 12 - Calculate Discounted Price

- **Description**: Extract prices from a paragraph and calculate the total cost after applying a discount.
- **Example Output**:
    
    ```java
    12 -
        A core i 7 laptop price is 85000 tk and
        a gaming mouse price is 2500 tk.
        If I buy the laptop and 1 piece mouse,
        what will be my total cost after giving 15% discount?
        [Extract the digits from the paragraph and calculate the price]
    Total Price after Discount: 74375.00 tk
    ```
    

### 13 - Extract Transaction ID

- **Description**: Parse an HTML document to extract a transaction ID.
- **Example Output**:
    
    ```html
    13 - Extract Transaction Id from the given html:
    <!DOCTYPE html>
    <html lang="en">
       <head>
          <meta charset="UTF-8">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <title>Transactions</title>
       </head>
       <body>
          <div>
             <div class="button">
                <p>Transaction Id: TXN1234</p>
             </div>
          </div>
       </body>
    </html>
    Transaction Id: TXN1234
    ```
    

### 14 - Validate IP Address

- **Description**: Check if an input string is a valid IP address based on given rules.
- **Example Output**:
    
    ```java
    14 - Check if an IP address is valid or invalid.
    Conditions:
        IP address must be in this pattern: [digit]:[digit]:[digit]:[digit].
        First digit should not be 0 or not be single digit;
    Example 1 (Enter 'q' to quit)
    Input : 192.168.0.1
    Output: Valid IP
    ```
    

### 15 - Question Count for Marks

- **Description**: Determine the required number of 5-mark and 10-mark questions to total 100 marks.
- **Example Output**:
    
    ```java
    15 - In a question paper, there are total 15 questions.
    Some question mark is 10 and some question mark is 5.
    How much question needed if I totaling 100 mark for 5 marks and 10 marks ?
     5 marks question is 10
    10 marks question is 5
    ```
    

---

## How to Run

1. Clone the repository:
    
    ```bash
    git clone <repository-url>
    cd <repository-folder>
    
    ```
    
2. Compile the Java file:
    
    ```bash
    javac Challenge.java
    
    ```
    
3. Run the program:
    
    ```bash
    java Challenge
    
    ```
