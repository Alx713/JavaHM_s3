import java.util.ArrayList;
import java.util.Collections;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = createArray(10, 100);
        System.out.println(array);
        int max = Collections.max(array);
        int min = Collections.min(array);
        double average = average(array);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }

    static ArrayList<Integer> createArray(int size, int max) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add((int) (Math.random() * max));
        }
        return array;
    }

    static double average(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return  (double)sum / array.size();
    }
}