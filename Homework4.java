import java.util.Scanner;

public class Homework4 {

    public int gcdRecursive(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcdRecursive(n, m % n);
        }
    }

    public int gcdIterative(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Homework4 homework = new Homework4();

        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int result = homework.gcdRecursive(num1, num2);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        scanner.close();
    }
}