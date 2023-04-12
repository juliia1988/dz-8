public class Main {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            String str = String.format("%s", "#");
            System.out.println(i + " " + str.repeat(i) + " factorial: "+ factorial);
        }

    }
}