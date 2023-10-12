import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        int[] array2 = {7, 4, 2, 6, 1, 5, 3,8};

        LocalTime k = LocalTime.now();

        DynamicArray dynamicArray = new DynamicArray(array2);
        /*The purpose of this section is to calculate the processing time using the LocalTime class.*/
        System.out.println();
        LocalTime m = LocalTime.now();
        Duration duration1 = Duration.between(k,m);
        long seconds = duration1.getSeconds();
        long nanos = duration1.getNano();
        double durationSeconds = seconds + nanos / 1_000_000_000.0;
        System.out.println(durationSeconds);

    }

}