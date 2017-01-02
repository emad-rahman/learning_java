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
