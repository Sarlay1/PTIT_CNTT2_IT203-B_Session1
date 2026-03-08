import java.time.LocalDate;
import java.io.IOException;

public class Bai6 {

    // Custom Exception
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String msg) {
            super(msg);
        }
    }

    static void logError(String msg) {
        System.out.println("[ERROR] " + LocalDate.now() + " - " + msg);
    }

    static class User {

        String name;
        int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) throws InvalidAgeException {
            if (age < 0) {
                throw new InvalidAgeException("Tuổi không hợp lệ");
            }
            this.age = age;
        }

        public void printUser() {

            // Defensive Programming
            if (name != null) {
                System.out.println("Tên: " + name);
            } else {
                System.out.println("Tên chưa được thiết lập");
            }

            System.out.println("Tuổi: " + age);
        }
    }

    static void saveToFile() throws IOException {
        throw new IOException("Không thể ghi file");
    }

    public static void main(String[] args) {

        User user = new User();

        try {

            user.setName("Nam");
            user.setAge(-5); 

            user.printUser();

            saveToFile();

        }

        catch (InvalidAgeException e) {
            logError("InvalidAgeException: " + e.getMessage());
        }

        catch (IOException e) {
            logError("IOException: " + e.getMessage());
        }

        System.out.println("Chương trình kết thúc an toàn");

    }
}