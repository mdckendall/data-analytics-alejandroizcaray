import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        try {
            int input = 0;
            ArrayList<String> arrayList = new ArrayList<>();
            try {
                FileReader fr = new FileReader("names.txt");
                Scanner fileScanner = new Scanner(fr);
                fileScanner.nextLine();
                for (int i = 0; i < 50; i++) {
                    arrayList.add(fileScanner.nextLine());
                }
            } catch (FileNotFoundException exception) {
                System.out.println(exception.getMessage());
            }
            while (input != 5) {
                System.out.println("Press 1 to learn about salary.");
                System.out.println("Press 2 to learn about the job.");
                System.out.println("Press 3 to learn about demand.");
                System.out.println("Press 4 to learn view current students.");
                System.out.println("Press 5 to quit.");
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                if (input == 1) {
                    System.out.println("$98,345 average salary.");
                } else if (input == 2) {
                    System.out.println("US News - 100 Best Jobs!");
                } else if (input == 3) {
                    System.out.println("Top 10 Forbes In-Demand Jobs!");
                } else if (input == 4) {
                    System.out.println("Current Students:");
                    for (String Is : arrayList) {
                        System.out.println(Is);
                    }
                    if (input == 5) {
                        break;
                    }
                }
            }
        } catch (NoSuchElementException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
