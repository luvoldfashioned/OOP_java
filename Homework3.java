import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�� ���� ���� �Է��� �����ΰ���? ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.print("���� �Է��ϼ���: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("�ִ밪: " + max);
        System.out.println("�ּҰ�: " + min);

        scanner.close();
    }
}