import static java.lang.String.*;
/* Please, do not rename it */
class Problem {
    public static int max(String[] args) {
        int max = Integer.parseInt(String.valueOf(args[1]));
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(String.valueOf(args[i])) > max) {
                max = Integer.parseInt(String.valueOf(args[i]));
            }
        }
        return max;
    }
    public static int min(String[] args) {
        int min = Integer.parseInt(String.valueOf(args[1]));
        for (int i = 1; i < args.length; i++) {
            if (Integer.parseInt(String.valueOf(args[i])) < min) {
                min = Integer.parseInt(String.valueOf(args[i]));
            }
        }
        return min;
    }
    public static int sum(String[] args) {
        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            sum += Integer.parseInt(String.valueOf(args[i]));
        }
        return sum;
    }
    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        if (operator.equals("MAX")) {
            if (args.length == 2) {
                System.out.println(args[1]);
            }
            else {
                System.out.println(max(args));
            }
        }
        else if(operator.equals("MIN")) {
            if (args.length == 2) {
                System.out.println(args[1]);
            }
            else {
                System.out.println(min(args));
            }
        }
        else if(operator.equals("SUM")) {
            if (args.length == 2) {
                System.out.println(args[1]);
            }
            else {
                System.out.println(sum(args));
            }
        }
    }
}