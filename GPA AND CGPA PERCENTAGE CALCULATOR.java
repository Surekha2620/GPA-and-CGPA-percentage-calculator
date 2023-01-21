package vish;
import java.util.Scanner;
public class Part1 {
 public static void main(String args[]) {
 double CGPAper;
 String grade = "";
 String[] letters = {"O", "A+", "A-", "B+", "B-", "C+", "C-", "D", "F"};

 double[] grades = {10.00, 9.5, 9.0, 8.5, 8.0, 7.5, 7.0 , 6.5,6.0};
 double credit1;
 double credit2;
 double credit3;
 double credit4;


 double gradeValue = 0;

 double totPtsClass1 = 0;
 double totPtsClass2 = 0;
 double totPtsClass3 = 0;
 double totPtsClass4 = 0;

 double totPts = 0;

 double totalCredits = 0;
 double gpa;

 System.out.println("Welcome to the GPA and CGPA percentage Calculator!");
 String message;
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter your first name: ");
 message = scan.nextLine();
 System.out.println("Enter your last name: ");
 message = scan.nextLine();

 Scanner console = new Scanner(System.in);
 System.out.println("Please enter the number of credits of the class 1 (A
number)");
 credit1 = console.nextDouble();
 System.out.println("Please enter your grades for the class 1(Capital letters such
as O,A+,A-,B+,B-,C+,C-,D,F)");
 grade = console.next();
 if (grade.equals("O")) gradeValue = 10.00;
 else if (grade.equals("A+")) gradeValue = 9.5;
 else if (grade.equals("A-")) gradeValue = 9.0;
 else if (grade.equals("B+")) gradeValue = 8.5;
 else if (grade.equals("B-")) gradeValue = 8.0;
 else if (grade.equals("C+")) gradeValue = 7.5;
 else if (grade.equals("C-")) gradeValue = 7.0;

 else if (grade.equals("D")) gradeValue = 6.5;
 else if (grade.equals("F")) gradeValue = 6.0;
 else if (grade.equals("FX")) gradeValue = 0;
 else System.out.println("Invalid Grade");
 totPtsClass1 = gradeValue * credit1;

 System.out.println("Please enter the number of credits of the class 2 (A
number)");
 credit2 = console.nextDouble();
 System.out.println("Please enter your grades for the class 2 (Capital letters such
as O,A+,A-,B+,B-,C+,C-,D,F)");
 grade = console.next();
 if (grade.equals("O")) gradeValue = 10.00;
 else if (grade.equals("A+")) gradeValue = 9.5;
 else if (grade.equals("A-")) gradeValue = 9.0;
 else if (grade.equals("B+")) gradeValue = 8.5;
 else if (grade.equals("B-")) gradeValue = 8.0;
 else if (grade.equals("C+")) gradeValue = 7.5;
 else if (grade.equals("C-")) gradeValue = 7.0;

 else if (grade.equals("D")) gradeValue = 6.5;
 else if (grade.equals("F")) gradeValue = 6.0;
 else if (grade.equals("FX")) gradeValue = 0;
 else System.out.println("Invalid Grade");

 totPtsClass2 = gradeValue * credit2;
 System.out.println("Please enter the number of credits of the class 3 (A
number)");
 credit3 = console.nextDouble();
 System.out.println("Please enter your grades for the class 3 (Capital letters such
as O,A+,A-,B+,B-,C+,C-,D,F)");
 grade = console.next();
 if (grade.equals("O")) gradeValue = 10.00;
 else if (grade.equals("A+")) gradeValue = 9.5;
 else if (grade.equals("A-")) gradeValue = 9.0;
 else if (grade.equals("B+")) gradeValue = 8.5;
 else if (grade.equals("B-")) gradeValue = 8.0;
 else if (grade.equals("C+")) gradeValue = 7.5;
 else if (grade.equals("C-")) gradeValue = 7.0;

 else if (grade.equals("D")) gradeValue = 6.5;
 else if (grade.equals("F")) gradeValue = 6.0;
 else if (grade.equals("FX")) gradeValue = 0;
 else System.out.println("Invalid Grade");
 totPtsClass3 = gradeValue * credit3;
 System.out.println("Please enter the number of credits of the class 4 (A
number)");
 credit4 = console.nextDouble();
 System.out.println("Please enter your grades for the class 4 (Capital letters such
as O,A+,A-,B+,B-,C+,C-,D,F)");
 grade = console.next();
 if (grade.equals("O")) gradeValue = 10.00;
 else if (grade.equals("A+")) gradeValue = 9.5;
 else if (grade.equals("A-")) gradeValue = 9.0;
 else if (grade.equals("B+")) gradeValue = 8.5;
 else if (grade.equals("B-")) gradeValue = 8.0;
 else if (grade.equals("C+")) gradeValue = 7.5;
 else if (grade.equals("C-")) gradeValue = 7.0;

 else if (grade.equals("D")) gradeValue = 6.5;
 else if (grade.equals("F")) gradeValue = 6.0;
 else if (grade.equals("FX")) gradeValue = 0;
 else System.out.println("Invalid Grade");
 totPtsClass4 = gradeValue * credit4;


 totPts = totPtsClass1 + totPtsClass2 + totPtsClass3 + totPtsClass4 ;
 totalCredits = credit1 + credit2 + credit3 + credit4 ;
 gpa = totPts / totalCredits;
 System.out.println("GPA is:" +gpa);
 CGPAper=9.5* (gpa);
 System.out.println("CGPA percentage is:" +CGPAper);
 }
}
