import java.util.Scanner;

class Student {
    String studentId;
    String name;
    String major;
    long phoneNumber;

    String getStudentId() {
        return studentId;
    }

    void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getMajor() {
        return major;
    }

    void setMajor(String major) {
        this.major = major;
    }

    long getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            String inputLine = scanner.nextLine();
            String[] info = inputLine.split(" ");

            String studentId = info[0];
            String name = info[1];
            String major = info[2];
            long phoneNumber = Long.parseLong(info[3]);

            Student student = new Student();
            student.setStudentId(studentId);
            student.setName(name);
            student.setMajor(major);
            student.setPhoneNumber(phoneNumber);

            students[i] = student;
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        String[] ordinals = { "첫번째", "두번째", "세번째" };

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];

            String phoneStr = "0" + s.getPhoneNumber();
            String formattedPhone = phoneStr.substring(0, 3) + "-" + phoneStr.substring(3, 7) + "-"
                    + phoneStr.substring(7);

            System.out.println(ordinals[i] + " 학생: " + s.getStudentId() + " " + s.getName() + " " + s.getMajor() + " "
                    + formattedPhone);
        }

        scanner.close();
    }
}
