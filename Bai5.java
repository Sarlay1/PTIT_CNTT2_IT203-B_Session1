public class Bai5 {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String msg) {
            super(msg);
        }
    }

    static class User {
        private int age;

        public void setAge(int age) throws InvalidAgeException {
            if (age < 0) {
                throw new InvalidAgeException("Tuổi không hợp lệ!");
            }
            this.age = age;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {

        User user = new User();

        try {
            user.setAge(-5);
            System.out.println("Tuổi: " + user.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

    }
}