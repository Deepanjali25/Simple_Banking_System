import java.util.Scanner;
class Problem {
    public static void main(String[] args) {
        var num1 = Integer.parseInt(args[1]);
        var num2 = Integer.parseInt(args[2]);

        switch (args[0]) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}