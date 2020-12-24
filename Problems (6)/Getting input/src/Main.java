class InputClass {
    public static String getString() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.hasNextLine();
        return scanner.nextLine();
    }
}