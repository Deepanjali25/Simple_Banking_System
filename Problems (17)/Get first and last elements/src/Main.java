import java.util.*;
public class Main {
    public static int[] getFirstAndLast(int[] arr) {
        int arrSize = arr.length;
        int[] arr1 = {arr[0],arr[arrSize-1]};
        if(arrSize ==1 && arrSize == 0) {
            arr1 = arr;
        }
        return arr1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}