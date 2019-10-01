//program demonstrating that assignment
// operator only creates a new reference to same
// object.
class A
{
    double x, y;
    A()
    {
        x = 5.0;
        y = 10.5;
    }
    int va(int ... h)
    {
      return h.length;
    }
}

// Main Class
class cao
{
    public static void main(String[] args)
    {
         A ob1 = new A();

         System.out.println(ob1.x + " " + ob1.y);

         // Creating a new reference variable ob2
         // pointing to same address as ob1
         A ob2 = ob1;

         // Any change made in ob2 will be reflected
         // in ob1
         ob2.x = 56.5;
          System.out.println(ob2.va(78,90,78,0));

         System.out.println(ob1.x+" "+ob1.y);
         System.out.println(ob2.x+" "+ob2.y);
    }
}
