import java.util.Arrays;
import java.util.Scanner;

/*
 * 1) Create a static array of ints called list1 using an initializer list
 * 2) Create a static array of ints called list2 using interactive input
 * 3) Sort the array
 * 4) Create methods for the following:
 *      i) Print the arrays
 *      ii) Insert element to array
 *      iii) delete element from array
 *      ix) average the elements in the array
 * 5) Call each of the methods
 * 6) Print the array
 */     

public class MFEstaticArrays {

    static int[] list1 = new int[100];
    static int listLogicalLength1 = 0;

    static int[] list2 = {4,6,9,27,1,5};
    static int listLogicalLength2 = list2.length;

    public static void main(String[] args) {

        for (int i = 0; i<list1.length; i++) {
            // Set all values to this large number so that entered values will be less and will be sorted to earlier positions, leaving all unused slots at the end of the array. (Alternatively they would have been set to 0 and would be sorted to the beginning of the array which would cause unused slots to be sorted to be between negative and positive slots.)
            list1[i] = 2147483647;
        }

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the next number or enter 'EXIT' to stop inputting values:");

        for (int i = 0; i<list1.length; i++) {
            if (sc.hasNextInt()) {
                listLogicalLength1++;
                list1[i] = sc.nextInt(); 
            } else {
                break;
            }

            
        }

        Arrays.sort(list1);
        Arrays.sort(list2);

        insertValue(1, 8);
        insertValue(1, 93);
        deleteValue(1, 2);
        System.out.println(getArrayString(list1, listLogicalLength1));
        System.out.println(getArrayString(list2, listLogicalLength2));

        System.out.println("List 1 averaged: "+averageValues(1));
        System.out.println("List 2 averaged: "+averageValues(2));
        

        sc.close();
    }

    public static String getArrayString(int[] array, int listLogicalLength) {
        String arrayString = "";
        int dataEndPosition = listLogicalLength;

        for (int i = 0; i<dataEndPosition; i++) {
            arrayString += array[i] + ", ";
        }

        return arrayString;
    }

    public static void insertValue(int listNum, int value) {

        int[] list;
        int listLogicalLength;
        
        if (listNum == 1) {
            list = list1;
            listLogicalLength = listLogicalLength1;
        } else {
            list = list2;
            listLogicalLength = listLogicalLength2;
        }

        if (list.length == listLogicalLength) {
            System.out.println("Error: Array is full.");
            return;
        }

        for (int i = 0; i<list.length; i++) {
            if (value < list[i]) {
                int temp1 = list[i];
                int temp2;

                list[i] = value;

                for (int j = i+1; j<list.length; j++) {
                    if (j == list.length-1) {
                        break;
                    }

                    temp2 = list[j];
                    list[j] = temp1;
                    temp1 = temp2;
                }

                break;
            }
        }

        if (listNum == 1) {
            listLogicalLength1++;
        } else {
            listLogicalLength2++;
        }

    }

    public static void deleteValue(int listNum, int index) {
        int[] list;
        int listLogicalLength;
        
        if (listNum == 1) {
            list = list1;
            listLogicalLength = listLogicalLength1;
        } else {
            list = list2;
            listLogicalLength = listLogicalLength2;
        }

        if (index >= listLogicalLength) {
            System.out.println("Index is undefined or exceeds array length.");
            return;
        }

        for (int i = index; i<listLogicalLength; i++) {
            list[i] = list[i+1];
        }

        if (listNum == 1) {
            listLogicalLength1--;
        } else {
            listLogicalLength2--;
        }

        list[listLogicalLength-1] = 2147483647;
    } 

    public static double averageValues(int listNum) {
        double average = 0.0;

        int[] list;
        int listLogicalLength;

        if (listNum == 1) {
            list = list1;
            listLogicalLength = listLogicalLength1;
        } else {
            list = list2;
            listLogicalLength = listLogicalLength2;
        }

        for (int i = 0; i<listLogicalLength; i++) {
            average += list[i];
        }

        average /= listLogicalLength;

        return average;
    }
}
