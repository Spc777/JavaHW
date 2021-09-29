//Pavel Kondratev hw2

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumSign(1,10);
        checkIntNumberPrint(7);
        checkIntNumberBool(-7);
        printString("I'm going to Strawberry Fields", 5);
        bisSextus(2300);
    }
    public static boolean checkSumSign(int a, int b){
        int sum = a + b;
        return sum > 10 && sum <= 20;
    }
    public static void checkIntNumberPrint(int x){
        if (x >= 0) {
            System.out.println("The num is positive");
        } else {
            System.out.println("The num is negative");
        }
    }
    public static boolean checkIntNumberBool(int y){
        return y < 0;
    }
    public static void printString(String text, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(text);
        }
    }
    public static boolean bisSextus(int z){
        if (z % 400 == 0) {
            return true;
        } else return z % 4 == 0 && z % 100 != 0;
    }
}