import java.util.*;
class student
{
     public int n;
     public int marks[]=new int[3];
     public int credits[]=new int[3];
     public void student_details()
     {
      int i;
      String usn;
      String name;
      Scanner s=new Scanner(System.in);
      System.out.print("enter student name:");
      name=s.nextLine();
      System.out.print("enter student usn");
      usn=s.nextLine();
      System.out.print("enter number of subjects:")
      n=s.nextInt();
      for(i=o;i<n;i++)
      {
           System.out.println("enter subject marks");
                marks[i]=s.nextInt();
           System.out.println("credit");
             credits[i]=s.nextInt();
      }
      System.out.println("NAME="+name);
      System.out.println("USN="+usn);
}
 Float calculation()
 int i;
 int t_g=0;
 int t_cr=0;
 float cgpa;
 int grade_points;
 for(i=0;i<n;i++)
{
    if(marks[i]>=90)
       grade_points=10;
    else if(marks[i]>75 && marks[i]<90)
       grade_points=9;
    else if(marks[i]>=60 && marks[i]<75)
      grade_points=8;
    else if(marks[i]>=50 && marks[i]<60)
      grade_points=7;
    else if(marks[i]>=45) && marks[i]<50)
      grade_points=6;
    else if(marks[i]>=40 && marks[i]<45)
      grade_points=5;
    else
        grade_points=0;
   t_g+=credits[i]*grade_points;
   t_cr+=credits[i];
}
  cgpa=(float)t_g/t_cr;
  return cgpa;
}
}

class CGPA
{
   public static void main(String args[])
   {  
      student o=new student();
      o.student_details();
      float cgpa=o.calculation();
      System.out.println("CGPA="+cgpa);
}
}