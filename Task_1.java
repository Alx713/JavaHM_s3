import java.util.ArrayList;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = createArray(10,100);
        System.out.println(array);
        deleteEven(array);
        System.out.println(array);
        
    }

    static ArrayList<Integer> createArray(int size, int max){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            array.add((int)(Math.random()*max));
        }
        return array;        
    }

    static void deleteEven(ArrayList<Integer> array){
        
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i--;
            }
        }
    }
}