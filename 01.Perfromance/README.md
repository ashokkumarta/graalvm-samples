# graalvm-samples / 01.Perfromance
Program to demonstrate the performance benefit in using GraalVM

### About this code
MaxWordCounter - Counts the no. of occurences of each word in the input file passed as parameter and prints out the no. of occurences of the maximum recurring word

### To execute this program
Compile the code on openJDK or Oracle JDK 
Execute the compiled class on openJDK or Oracle JDK and see the time taken
Execute the same class on GraalVM and see the time taken

### Demonstrates
Code compiled in other JDK can be directly executed on GraalVM
Performance gain by simply running your current application on GraalVM 

### Commands to compile and execute the code
Compile: javac MaxWordCounter.java
Execute: java MaxWordCounter book.txt
