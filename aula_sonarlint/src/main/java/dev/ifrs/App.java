package dev.ifrs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


public int foo(int a) {
  int b = 12;
  if (a == 1) {
    return b;
  }
  return b;  // Noncompliant
}
}