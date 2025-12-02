import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> loginMap = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new File("db.txt"));
            while (fileScanner.hasNext()) {
                String id = fileScanner.next();
                String pw = fileScanner.next();
                loginMap.put(id, pw);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");
            String inputId = scanner.nextLine().trim();

            if (!loginMap.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            String inputPw = scanner.nextLine().trim();

            String correctPw = loginMap.get(inputId);

            if (!correctPw.equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

        scanner.close();
    }
}