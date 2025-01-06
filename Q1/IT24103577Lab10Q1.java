import java.util.Scanner;
public class IT24103577Lab10Q1{
public static void main(String args[]){
Scanner input = new Scanner(System.in);

System.out.println();
System.out.print("Enter the mark (0 - 100):");
int mark = input.nextInt();

//fisrt Assertion - To check if the mark is in the valid range
assert(mark>=0 && mark <=100) : "Invalid Mark";

System.out.println();
System.out.println("Mark is validated");

char grade;

if (mark >= 75){
  grade = 'A';
}

else if (mark >=60){
grade = 'B';
}

else if (mark >=50){
grade = 'C';
}

else if (mark >=40){
grade = 'D';
}

else {
grade = 'F';
}

assert (grade == 'A' && mark >= 75) ||
(grade == 'A' && mark >= 75) ||
(grade == 'B' && mark >= 60 && mark < 75) ||
(grade == 'C' && mark >= 50 && mark <60) ||
(grade == 'D' && mark >= 40 && mark <50) ||
(grade == 'F' && mark < 40 ) : "Incorrect Grade Assigned";


System.out.println("The Grade for the Entered Mark is : "+ grade);
} 
}