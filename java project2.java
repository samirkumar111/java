import java.util.*;
	import java.io.*;
	class student1
	{
	    public String s_usn;
	    public String s_name;
	    public int[] arr_credits={4,4,4,4,4};
	    public int[] arr_marks=new int[5];
	    public void input()
	    {
	         Scanner s=new Scanner(System.in);
	         System.out.println("Enter student name");
	         s_name=s.nextLine();
	         System.out.println("Enter usn");
	         s_usn=s.nextLine();
	         System.out.println("Enter the marks in 1.java 2.DS 3.MP 4.DM 5.LD");
	          for(int i=0;i<5;i++)
	           {
	               arr_marks[i]=s.nextInt();
	           }
	    }
	   public void display()
	   {
	    int n[] = new int[5];
	    for(int k=0;k<5;k++)
	     {
	       n[k]=(arr_marks[k]/10);
	       if(n[k]!=10 || n[k]!=9 ||n[k]!=10 ||n[k]!=8 ||n[k]!=7 ||n[k]!=6 ||n[k]!=5 ||n[k]!=4 )
	       {
	       n[k]=n[k]+1;
	       }
	     }
	   int sum;
	   sum=0;
	    for(int x=0;x<5;x++)
	   {
	     sum=sum+n[x]*arr_credits[x];
	   }
	   float sgpa=(float)sum/20;
	    System.out.println();
	    System.out.println("Name   :"+s_name);
	    System.out.println("Usn    :"+s_usn);
	    System.out.println("Sgpa   :"+sgpa);
	}
	}

	public class Main
	{
	 public static void main(String[] args)
	 {

	  Student s1=new Student();
	  s1.input();
	  s1.display();
	}
	}
