import java.util.Scanner;

public class SomaDosDigitos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Gigite um número inteiro: ");
        int digits = in.nextInt();
        in.close();
        System.out.println("A soma de seus dígitos é: " + sumDigits(digits));
    }

    public static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
}
