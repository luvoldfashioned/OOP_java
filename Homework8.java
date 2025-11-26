import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        HashMap<String, String> loginMap = new HashMap<>();
        loginMap.put("myId", "myPass");
        loginMap.put("myId2", "myPass2");
        loginMap.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");
            String inputId = scanner.nextLine().trim();

            if (!loginMap.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String inputPw = scanner.nextLine().trim();

            String correctPw = loginMap.get(inputId);

            if (!correctPw.equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

        scanner.close();
    }
}