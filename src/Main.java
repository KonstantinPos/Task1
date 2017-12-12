import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        float fraction = (float) 1 / 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        float x = scanner.nextFloat();
        float result = (float) pow(20, (float) pow(x, fraction)) + (float) pow(158, 2);
        System.out.println("Результат = " + result);
    }
}