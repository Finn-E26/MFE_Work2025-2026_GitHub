import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FEarrayList2 {
    public static void main(String[] args) {
        Random rnd = new Random();

        ArrayList list = new ArrayList<>();

        for (int i = 0; i<20; i++) {
            Integer x = rnd.nextInt(100)+100;

            list.add(x);
        }

        Collections.sort(list);





    }

    public static double averageArrayList(ArrayList list) {
        double avg = 0;
            for (Object x : list) {
                
            }
        return avg;
    }
}
