import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        int[] array2 = {7, 4, 2, 6, 1, 5, 3};

        DynamicArray dynamicArray = new DynamicArray(array2);
         dynamicArray.InsertFirst(30);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println();

        dynamicArray.InsertLast(15);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        dynamicArray.readIndex(8);
        /*array2= dynamicArray.InsertFirst(array2);
        array2= dynamicArray.InsertLast(array2);
        dynamicArray.readIndex(array2,0);*/

    }

}