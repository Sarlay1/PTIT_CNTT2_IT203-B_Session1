import java.io.IOException;

public class Bai4 {

    static void saveToFile() throws IOException {
        throw new IOException("Lỗi ghi file");
    }

    static void processUserData() throws IOException {
        saveToFile();
    }

    public static void main(String[] args) {

        try {
            processUserData();
        } catch (IOException e) {
            System.out.println("Đã bắt lỗi: " + e.getMessage());
        }

        System.out.println("Chương trình vẫn chạy bình thường");
    }
}