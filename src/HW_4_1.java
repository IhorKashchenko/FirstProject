public class HW_4_1 {
    public static void main(String[] args) {
        String str = "Sergey";
        String result = str.replace('e' , '_');

        //Number 1
        for (int b = 0; b < 16; b = b + 1) {
           System.out.println(b);
        } {
            System.out.println("End Task 1");
        }
        // Number 2
        for (int a = 5; a < 10000; a = a * 5) {

            System.out.println(a);
        } {
            System.out.println("End Task 2");
        }

        // Number 3.1
        for (int a = 40; a <= 60; a = a + 1)
            if (a % 4 == 0) {
                System.out.println(a);
            } {
            System.out.println("End Task 3.1");
        }

        // Number 3.2
        for (int a = 40; a <= 60; a = a + 4) {
                System.out.println(a);
        } {
            System.out.println("End Task 3.2");
        }

    }
}
