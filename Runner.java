// import java.util.Scanner;

// public class Runner {
//    public static void main(String[] args) {

//      // Tell the user to enter a question
//      Scanner scan = new Scanner(System.in);
//      System.out.println("Welcome to the Magic 8 Ball!");
//      System.out.print("Enter a yes-no question and I will answer it: ");
//      String question = scan.nextLine();

//      // Write a little program here to randomly choose
//      // one of six responses to the user's yes-no question!
//      int random = (int) (Math.random() * 7);
//      if(random == 0) {
//       System.out.println("Without a doubt");

//      }
//      else if(random == 1) {
//       System.out.println("As I see it, yes");

//      }
//      else if(random == 2) {
//       System.out.println("Reply hazy, try again");
      
//      }
//      else if(random == 3) {
//       System.out.println("As I see it, yes");
      
//      }
//      else if(random == 4) {
//       System.out.println("As I see it, yes");
      
//      }
//      else if(random == 5) {
//       System.out.println("Very doubtful");
      
//      }

//    }
// }


import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {

  //    // Tell the user to enter a question
  //    Scanner scan = new Scanner(System.in);
  //    System.out.println("Welcome to the Magic 8 Ball!");
  //    System.out.print("Enter a yes-no question and I will answer it: ");
  //    String question = scan.nextLine();

  //    // Write a little program here to randomly choose
  //    // one of six responses to the user's yes-no question!
  //    int random = (int) (Math.random() * 7);
  //    if(random == 0) {
  //     System.out.println("Without a doubt");

  //    }
  //    if(random == 1) {
  //     System.out.println("As I see it, yes");

  //    }
  //    if(random == 2) {
  //     System.out.println("Reply hazy, try again");
      
  //    }
  //    if(random == 3) {
  //     System.out.println("As I see it, yes");
      
  //    }
  //    if(random == 4) {
  //     System.out.println("As I see it, yes");
      
  //    }
  //    if(random == 5) {
  //     System.out.println("Very doubtful");
      
  //    }
  //    scan.close();
  int score = 83;
  String grade = "";  // initialize to empty string

  if (score >= 90) {
    grade = "A";
  }
  else if (score >= 80) {
    grade = "B";
  }
  else if (score >= 70) {
    grade = "C";
  }
  else if (score >= 60) {
    grade = "D";
  }
  else if (score < 60) {
    grade = "F";
  }
  System.out.println("Your grade is: " + grade);

   }
}


