import java.util.Scanner;
class ScannerExample
{
 public static void main(String[]a)
{
   byte studentId;
   String name;
   char gender;
   byte age;
   long mobileNo;
   Float cgpa;
   
   Scanner sc = new Scanner(System.in);

System.out.println("Enter  Your Student ID");
studentId =sc.nextByte();

System.out.println("Enter Your  Name");
  name = sc.next();

System.out.println("Enter Your Gender");
  gender = sc.next().charAt(0);

System.out.println("Enter Your Age");
  age = sc.nextByte();

System.out.println("Enter Your Mobile No");
  mobileNo = sc.nextLong();

System.out.println("Enter Your CGPA");
  cgpa = sc.nextFloat();

System.out.println("Student ID "+studentId );
  System.out.println("Student Name "+name);
System.out.println("Student Gender "+gender);
System.out.println("Student Age"+age );
System.out.println("Student Mobile No "+mobileNo );
System.out.println("Student CGPA "+cgpa);
    }

}