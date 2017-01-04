import java.util.Scanner;

class Apples{
  public static void main(String args[]){
    System.out.println("Hello World!");

    int num = 20;

    String result = (num < 12) ? "Less" : "More";
    System.out.println(result);

    double myNum = 25.5d;
    System.out.println(myNum);
  }
}

class Test{
  public static void main(String args[]){
    System.out.println("Hello World! --test");
  }
}

class Variables{
  public static int myScore;

  public static void main(String args[]){
    myScore = 1000;
    System.out.println("Setting the score to: " + myScore);
    displayScore();
    changeScore(100);
    changeScore(-6);
    changeScore(75);
    changeScore(900);
    changeScore(-650);
  }

  // change the score of the game and output to the console
  public static void changeScore(int scoreDelta){
    System.out.println("Changing the score by: " + scoreDelta);
    myScore = myScore + scoreDelta;
    displayScore();
  }

  public static void displayScore(){
    System.out.println("Player score: " + myScore);
  }
}

class returnValues{
  public static double subtotal;

  public static void main(String args[]){
    subtotal = 15.00;

    System.out.println("Subtotal: " + subtotal);
    double total = subtotal + calculateTax(0.08, subtotal);
    System.out.println("Total: " + total);
  }

  public static double calculateTax(double taxRate, double amountToTax){
    double tax = amountToTax * taxRate;
    System.out.println("Tax: " + tax);
    return tax;
  }
}

class input{
  public static void main(String args[]){
    System.out.print("Enter your name: ");
    Scanner in = new Scanner(System.in);
    String name = in.next();
    String greeting = "Hello " + name + "!";
    System.out.println(greeting);
  }
}

class manageDifferentVariableTypes{
  public static void main(String args[]){
    int myVariable = 5;
    System.out.println("My variable is equal to " + myVariable + " and is an int.");
    String myString = Integer.toString(myVariable);
    System.out.println("myString is equal to " + myString + " and is a string");

    myString += 1;
    System.out.println("myString is equal to " + myString + " and is a string");

    myVariable = Integer.parseInt(myString) + 1;
    System.out.println("My variable is equal to " + myVariable + " and is an int.");
  }
}

class conditions{
  public static void main(String args[]){
    boolean knowJava = true;
    System.out.println("The value of knowJava is "+knowJava);

    if(knowJava){
      System.out.println("I know Java!");
    }

    //using if one a single line on code
    if(knowJava) System.out.println("I still know Java!");

    int myValue = 5;
    System.out.println("myValue is: "+myValue);

    if(myValue == 5){
      System.out.println("myValue == 5 is true");
    }

    if(myValue < 5){
      System.out.println("myValue < 5 is true");
    }else{
      System.out.println("myValue < 5 is false");
    }


    if(myValue != 5){
      System.out.println("myValue != 5 is true");
    }else if(myValue > 5){
      System.out.println("myValue > 5 is true");
    }else{
      System.out.println("All conditions are false");
    }


    //nested if - else
    if (myValue >= 1){
      System.out.println("myValue >= 1 is true");
      if(myValue <= 5){
        System.out.println("myValue <= 5 is true");
      }
    }
  }
}

class whileLoop{
  public static void main(String arge[]){
    int myValue = 0;

    while(myValue < 100){
      myValue++;
      System.out.println(myValue);
    }

    int myBadValue = 0;
    do{
      System.out.println("This will run atleast once");
    } while (myBadValue != 0);

  }
}

class menu{
  public static void main(String args[]){
    boolean run = true;

    System.out.println("Press 'quit' to quit");
    menu(run);
  }

  public static void menu(boolean run){
    while(run){
      System.out.print("> ");
      Scanner in = new Scanner(System.in);
      String input = in.next();

      if(input.equals("quit")){
        break;
      }
    }
  }
}
