class Swapping
{
 public static void main (String[] args)
{
 int  num1 =5;
 int num2 =4;
int num3;
System.out.println("Swapping of two number using third variable");
 num3=num1;
 num1 =num2;
 num2=num3;

System.out.println("num1 :" +num1);
System.out.println("num2:" +num2);

System.out.println("Swapping of two number without using third variable");
num1=num1+num2; 
num2=num1-num2;
num1=num1-num2;

System.out.println("num1 :" +num1);
System.out.println("num2:" +num2);

}
}
 


 





