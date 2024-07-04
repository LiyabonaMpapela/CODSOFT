import java.util.*;
import java.math.*;
import java.io.*;

public class StudentGradeCalculator
{
 public static void main(String[] args)
 {
  System.out.println("Enter mark or Done ");
  Scanner input = new Scanner(System.in);
  int totalMarks=0;
  int count =0;
  String mark = input.nextLine();
  while (mark.equals("Done") == false)
  {
   count++;
   int marks = Integer.parseInt(mark);
   totalMarks= totalMarks+marks;
   System.out.println("Enter mark or Done ");
   mark = input.nextLine();
  
  }
  
  int average = totalMarks/count;
  String grade="";
  
  if (average>=90)
   grade = "A+";
  else if ( average<90 & average>=80)
   grade= "A";
  else if ( average<80 & average>=70)
   grade= "B";
  else if ( average<70 & average>=60)
   grade= "C";
  else if ( average<60 & average>=50)
   grade= "D";
  else if ( average<50 & average>=45)
   grade= "E";
  else
  grade="F";




  
  System.out.println("Total marks = "+ totalMarks  );
  System.out.println("Average = "+ average);
  System.out.println("Grade = "+ grade);
  
  
 }
}