/*Purpose of this program is to create a political survey program that asks the user 10 questions, and based off of the total response amounts, will then tell the user which political party they mostly align with.
*/

//Program will start off with no text files created.
//Program was coded using Replit.

//Import Math
import java.lang.Math;

//Import scanner.
import java.util.*;

//Import file class, FileWriter class, and IOException class to handle errors.
import java.io.*;

//Main class containing program.
class PoliticalPartySurvey {
  public static void main(String[] args) {

    // Create 2d array containing questions and responses for respective questions;
    String[][] politicalQuestions = {
        { "1: Should the federal government increase taxes for the rich in order to reduce\n   interest rates for student loans?",
            "2: Should the federal government pay for tuition at four-year colleges and\n   universities?",
            "3: Should the government increase spending on public transportation?",
            "4: Should funding for local police departments be redirected to social and\n   community based programs?",
            "5: Should the government increase environmental regulations to prevent climate\n   change?",
            "6: Should the U.S. tear down the wall along the southern border?",
            "7: Should the government allow abortion?",
            "8: Should there be more restrictions on the current process of purchasing a gun?",
            "9: Should convicted criminals have the right to vote?",
            "10: Should U.S. citizens NOT be allowed to save or invest their money in offshore\n  bank accounts?"
        },
        {
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n ",
            "\n A: Yes.\n B: No.\n C: Other.\n D: Indifferent.\n "
        }
    };
    // Create text files using FileCreate class

    // File generator for the democrat text file.
    FileCreate file1 = new FileCreate("democratFile.txt");
    file1.createFile();

    // File generator for the republican text file.
    FileCreate file2 = new FileCreate("republican.txt");
    file2.createFile();

    // File generator for the independent text file.
    FileCreate file3 = new FileCreate("independent.txt");
    file3.createFile();

    // File generator for the indifferent text file.
    FileCreate file4 = new FileCreate("indifferent.txt");
    file4.createFile();

    // Create variables for each of the political parties: \nDemocrat, Republican,
    // Indepedent, Indifferent.

    // Democrat variable.
    int democratValue = 0;

    // Republican variable.
    int republicanValue = 0;

    // Independent variable.
    int independentValue = 0;

    // Indifferent variable.
    int indifferentValue = 0;

    // Initialize scanner.
    Scanner scanner = new Scanner(System.in);

    // Introduce user to the program.
    System.out.println(
        "\nWelcome to the political party survey! This survey will ask you 10 questions, to which you will respond with either 'A', 'B', 'C', or 'D'.");
    System.out
        .println("\nAt the end of the survey, the political party you most align with will be shown on the screen!");
    System.out.println("\nTime to begin!");

    // Create for-Loop to iterate through the questions.
    for (int i = 0; i < 10; i++) {
      // Print the question.
      System.out.println("\n" + politicalQuestions[0][i]);
      // Create for-loop to iterate through the responses.
      for (int j = 0; j < 4; j++) {
        // Print the response.
        System.out.println("\n" + politicalQuestions[1][i]);
        // Ask the user to respond.
        String response = scanner.nextLine();
        // Determine the response.
        if (response.equalsIgnoreCase("A")) {
          // Democrat variable incrementation and write to correct file.
          democratValue++;
          // File writer for the democrat file.
          FileWrite demFile = new FileWrite("democratFile.txt",
              politicalQuestions[0][i] + "\n " + response + ": Yes" + "\n");
          demFile.writeFile();
          break;
        } else if (response.equalsIgnoreCase("B")) {
          // Republican variable incrementation and write to correct file.
          republicanValue++;
          // File writer for the republican file.
          FileWrite repFile = new FileWrite("republicanFile.txt",
              politicalQuestions[0][i] + "\n " + response + ": Yes" + "\n");
          repFile.writeFile();
          break;
        } else if (response.equalsIgnoreCase("C")) {
          // Independent variable incrementation and write to correct file.
          independentValue++;
          // File writer for the independent file.
          FileWrite indFile = new FileWrite("rindependent.txt",
              politicalQuestions[0][i] + "\n " + response + ": Yes" + "\n");
          indFile.writeFile();
          break;
        } else if (response.equalsIgnoreCase("D")) {
          // Indifferent variable incrementation and write to correct file.
          indifferentValue++;
          // File writer for the indifferent file.
          FileWrite idiffFile = new FileWrite("indifferent.txt",
              politicalQuestions[0][i] + "\n " + response + ": Yes" + "\n");
          idiffFile.writeFile();
          break;
        }
      }
    }
    // Last question to ask the user which party they most align with.
    System.out.println("\nTime for the Final question!");
    System.out.println("\nWhich political party do you personally identify with?");
    System.out.println("\nA: Democrat \nB: Republican \nC: Independent \nD: Indifferent\n");
    // Ask the user to respond.
    String response2 = scanner.nextLine();
    // Determine the response.
    if (response2.equalsIgnoreCase("A")) {
      // Democrat variable incrementation and write to correct file.
      democratValue += 2;
    } else if (response2.equalsIgnoreCase("B")) {
      // Republican variable incrementation and write to correct file.
      republicanValue += 2;
    } else if (response2.equalsIgnoreCase("C")) {
      // Independent variable incrementation and write to correct file.
      independentValue += 2;
    } else if (response2.equalsIgnoreCase("D")) {
      // Indifferent variable incrementation and write to correct file.
      indifferentValue += 2;
    }
    System.out.println("\nNow tallying the results of the survey:");
    System.out.println("\n.");
    System.out.println("\n.");
    System.out.println("\n.");

    // Variable to decide the highest party value.
    int maxCount = Math.max(Math.max(democratValue, republicanValue), Math.max(independentValue, indifferentValue));

    // Conditional statements with their respective print statements.
    if (maxCount == democratValue) {
      System.out.println("\nYou most agree with the Democratic Party with a score of: " + maxCount + "!");
    } else if (maxCount == republicanValue) {
      System.out.println("\nYou most agree with the Republican Party with a score of: " + maxCount + "!");
    } else if (maxCount == independentValue) {
      System.out.println("\nYou most agree with the Independent Party with a score of: " + maxCount + "!");
    } else if (maxCount == indifferentValue) {
      System.out.println("\n A score of: " + maxCount
          + "shows that you don't seem too\n   interested in politics. Go learn about politics!");
    }
    System.out.println(
        "\nShould you wish to see your responses to certain questions, please refer to the\ntext files that were created.");
    System.out.println("\nThank you for taking the survey. Have a good day!");
  }
}