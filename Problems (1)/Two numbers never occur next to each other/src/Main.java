import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int totalNumberOfElementsInTheArray = scanner.nextInt();
        int[] theArray = new int[totalNumberOfElementsInTheArray];
        int i = 0;
        while(totalNumberOfElementsInTheArray-->0) {
            theArray[i] = scanner.nextInt();
            i++;
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        isPresent(theArray,n,m);
    }
    public static boolean isPresent(int[] theArray, int n, int m) {
        boolean result = true;
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] == n) {
                if ((i != theArray.length - 1 && theArray[i + 1] == m) || (i != 0 && theArray[i - 1] == m)) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
        return result;
    }
//        public static boolean notPresent ( int[] theArray, int n, int m){
//            for (int i = 1; i < theArray.length - 1; i++) {
//                if (theArray[i] == m) {
//                    if (theArray[i + 1] != n && theArray[i - 1] != n) {
//                        result = true;
//                    }
//                    if (!result) {
//                        result = false;
//                        break;
//                    }
//                }
//                break;
//            }
//            return true;
//    }
}