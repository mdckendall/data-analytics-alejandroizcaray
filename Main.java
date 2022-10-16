import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args){
    int input = 0;
    ArrayList<String> arrayList = new ArrayList<>();

    while (input != 5) {
      System.out.println("Press 1 to learn about salary.");
      System.out.println("Press 2 to learn about the job.");
      System.out.println("Press 3 to learn about demand.");
      System.out.println("Press 4 to learn view current students.");
      System.out.println("Press 5 to quit.");
      Scanner scanner = new Scanner(System.in);
      input = scanner.nextInt();
      if (input == 1) {
        System.out.println("$98,345 average salary in South Florida!");
      } else if (input == 2) {
        System.out.println("US News - 100 Best Jobs!");
      } else if (input == 3) {
        System.out.println("Top 10 Forbes In-Demand Jobs!");
      } else if (input == 4) {
        try {
          FileReader fr = new FileReader("names.txt");
          Scanner fileScanner = new Scanner(fr);
          while (fileScanner.hasNextLine()) {
            arrayList.add(fileScanner.nextLine());
          }
        } catch (FileNotFoundException e) {
          System.out.println(e);
        }
        System.out.println("Current Students:");
        for (String Is : arrayList) {
          System.out.println(Is);
        }
        if (input == 5) {
          break;
        }
      }
    }
  }
}
