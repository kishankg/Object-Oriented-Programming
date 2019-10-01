
class ThreadName {
  public static void main(String args[])
  {
    Thread t = new Thread();
    t = Thread.currentThread();
    System.out.println(t);
    t.setName("MyThread");

    System.out.println(t);
    System.out.println(t.getName());
  }
}
