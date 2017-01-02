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
    changeScore();
  }

  public static void changeScore(){
    myScore = myScore + 100;
    System.out.println("Player score: " + myScore);
  }
}
