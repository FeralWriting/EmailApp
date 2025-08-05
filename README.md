# Email Application

## Overview

Practice creating an administrative email application and managing the information inside of it. It allows users to create an admin email account after inputting their information. This project includes an Email class that handles the data and a main EmailApp class to run. The Scanner framework is used to input and store data. This project gave me experience with Java, OOP, Scanner, and the Math class.

## Features

### Email Data

The Email class received user data for name, staff department, and personal email. Users can also change generated background information like password and mailbox storage size.

### Email Methods

There are getters and setters to allow users to display or amend account information, as well as a constructor to initialize the email account. The email is concatenated using the data received. There is a method to set the department, which takes direct user input using Scanner. There is also a method to generate a random password which uses Java's Math framework.

### EmailApp

The main method initializes the constructor and tests the getters and setters. The password is changed, and the showInfo method is used to display account information all at once.
