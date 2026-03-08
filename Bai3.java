import java.util.Scanner;

class User {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Tuổi không dc âm");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Bai3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();

        try {

            System.out.print("Nhập năm sinh: ");
            String input = sc.nextLine();

            int birthYear = Integer.parseInt(input);

            int age = 2025 - birthYear;

            user.setAge(age);

            System.out.println("Tuổi của bạn là: " + user.getAge());

            System.out.print("Nhập tổng số người: ");
            int total = Integer.parseInt(sc.nextLine());

            System.out.print("Nhập số nhóm: ");
            int group = Integer.parseInt(sc.nextLine());

            int result = total / group;

            System.out.println("Mỗi nhóm có: " + result + " người");

        }

        catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhập số hợp lệ!");
        }

        catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0!");
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }

        System.out.println("Chương trình kết thúc.");
    }
}