// Finn Eger 

import java.util.Scanner;

public class MFEstringSearch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input:");
        String originalInput = sc.nextLine();

        System.out.println("Please enter what you want to search for:");
        String searchTerm = sc.nextLine();

        originalInput = originalInput.toLowerCase();
        searchTerm = searchTerm.toLowerCase();

        String input = "";
        for (int i = 0; i<originalInput.length(); i++){
            char currentChar = originalInput.charAt(i);
            if ((currentChar >= 97 && currentChar <= 122) || (currentChar >= 48 && currentChar <= 57)) {
                input = input + currentChar;
            }
        }

        int quantity = 0;

        for (int i = 0; i<input.length(); i++) {
            for (int j = 0; j<searchTerm.length(); j++) {
                if ((i+j <= input.length() - 1) && !(input.charAt(i+j) == searchTerm.charAt(j))) {
                    break;
                } else if (i+j > input.length() - 1) {
                    break;
                }
                
                if (j == (searchTerm.length()-1)) {
                    System.out.println("Match found at position: "+i);
                    quantity++;
                    
                }
            } // aaaaaa
        }

        System.out.println("There are a total of: "+quantity+" instances (including overlapping) of search term within the original input.");

        sc.close();
    }
}
