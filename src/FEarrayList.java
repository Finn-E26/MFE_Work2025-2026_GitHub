import java.util.Scanner;
import java.util.ArrayList;

public class FEarrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 3;

        ArrayList<String> wordList = new ArrayList<>();

        System.out.println("Enter your word or enter -1 to stop entering words.");

        for (int i = 0; i<100; i++) {
            String word = sc.nextLine();

            if (!word.equals("-1")) {
                wordList.add(word);
            } else {
                break;
            }
        }

        ArrayList<String> secondList = new ArrayList<>();

        for (String word: wordList) {
            if (word.length() == num) {
                secondList.add(word);
            }
        }

        while(!secondList.isEmpty()) {
            System.out.println(secondList.remove(0));
        }

        // I've modified the code just for testing...

        sc.close();
    }
}
