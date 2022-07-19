interface boy
{
   final int b=6;
   public void display();

}
interface girl
{
   final int c=9;
   public void display1();
}
class Example implements boy,girl
{
  public void display()
{
  System.out.println("Boy's Value is "+b);
}
 public void display1()
{
  System.out.println("Girl's Value is "+c);
  }
}
class MainInterface
{
public static void main(String[] a)
{
  Example e = new Example();
  e.display();
 
Example e2 = new Example();
  e.display1();
}
}