import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Long> partsSums(List<Long> ls) {
        List<Long> result = new ArrayList<>();
        long sum = 0;

        // Calculate the total sum of the array
        for (long num : ls) {
            sum += num;
        }

        // Iterate through the array, updating the sum and adding it to the result list
        for (long num : ls) {
            result.add(sum);
            sum -= num;
        }

        // Add the final sum, which is 0, to the result list
        result.add(0L);

        return result;
    }

    public static void main(String[] args) {
        List<Long> ls1 = List.of(1L, 2L, 3L, 4L, 5L, 6L);
        List<Long> ls2 = List.of(744125L, 935L, 407L, 454L, 430L, 90L, 144L, 6710213L, 889L, 810L, 2579358L);

        System.out.println("partsSums(ls1) -> " + partsSums(ls1));
        System.out.println("partsSums(ls2) -> " + partsSums(ls2));
    }
}