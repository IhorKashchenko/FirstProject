public class Abc {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i < 11) {
            while (j < 11) {
                System.out.print(i * j + " ");
                j++;
            }
            i++;
            j =1;
            System.out.println();

        }
    }
}
