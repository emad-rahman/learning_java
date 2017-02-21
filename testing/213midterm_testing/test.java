import java.util.*;

class test{
  public static void main(String[] args){
    System.out.println("Hello World!");

    Scanner scan = new Scanner(System.in);

    System.out.print("What's your name?: ");
    String name = scan.nextLine();
    System.out.println("\nYour name is: " + name + "\n\n");
  }
}
