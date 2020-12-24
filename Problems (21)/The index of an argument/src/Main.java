import java.util.Arrays;
class Problem {
    public static void main(String[] args) {
        if (Arrays.asList(args).indexOf("test") >= 0) {
            System.out.println(Arrays.asList(args).indexOf("test"));
        }
        else
            System.out.println("-1");
    }
}