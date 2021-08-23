THE PROJECT

The purpose for this java application is to verify if a string is a palindrome.

The algorithm implemented only goes through the input string once, so it has a estimated time complexity of O(n).
As it does not require any additional storage, the estimated space complexity should be O(1).


INSTALLATION AND DEPENDENCIES

This is a maven project created with eclipse, and can be imported in any other eclipse environment or built in a machine properly configured with Java and Maven.
Internet access is required to build it (or access to a maven repository containing all the dependencies).
The main dependencies are:
- Java 16
- jUnit 4.11
- Maven 3.8.1


USAGE

Considering the paths properly configured and the application built, it can be executed in a terminal as:
    java -jar palindrome-1.0.0.jar

It works as an endless loop requesting the input of string to be checked.

An example of output:

    Starting Palindrome checker...
    Please, introduce the string to check:
    test
      The word test is not a palindrome
    Please, introduce the string to check:
    tenet
      The word tenet is a palindrome
    Please, introduce the string to check:
    radar
      The word radar is a palindrome
    Please, introduce the string to check:


