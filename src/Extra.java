public class Extra {
    public static void main(String[] args) {
        int a = 180, x = 2222, d = 12, c = 122;
        boolean zz1 = a == d, zz2 = x == d, zz3 = c >= a, zz4 = x >= d, zz5 = (d == c) || (x == d),
                zz6 = (c > x) && (d >= x), zz7 = (a > x) || (a >c), zz8 = (a == c) && (d == c),
                zz9 = (c == c) && (a >= a), zz10 = (c > c) || (a <= a), zz11 = (x > a) && (c == d);
        int largestNumber = 0;
        if (a == x) {
            largestNumber = largestNumber + a;
        }
        if (a < x) {
            largestNumber = largestNumber + x;
        }
        if (a > c || a > x) {
            largestNumber = largestNumber + a;
        } else {
            largestNumber = largestNumber + c;
        }
        System.out.println("Largest number is " + largestNumber);


//        if (a == d) {
//            System.out.println(zz1 + " " + "a == d");
//        }
//        if (x == d) {
//            System.out.println(zz2 + " " + "x == d");
//        }
//        if (c >= a) {
//            System.out.println(zz3 + " " + "c >= a");
//        }
//        if (x >= d) {
//            System.out.println(zz4 + " " + "x >= d");
//        }
//        if ((d == c) || (x == d)) {
//            System.out.println(zz5 + " " + "(d == c) || (x == d)");
//        }
//        if ((c > x) && (d >= x)) {
//            System.out.println(zz6 + " " + "(c > x) && (d >= x)");
//        }
//        if ((a > x) || (a > c)) {
//            System.out.println(zz7 + " " + "(a > x) || (a > c)");
//        }
//        if ((a == c) && (d == c)) {
//            System.out.println(zz8 + "(a == c) && (d == c)");
//        }
//        if ((c == c) && (a >= a)) {
//            System.out.println(zz9 + " " + "(c == c) && (a >= a)");
//        }
//        if ((c > c) || (a <= a)) {
//            System.out.println(zz10 + " " + "(c > c) || (a <= a)");
//        }
//        if ((x > a) && (c == d)) {
//            System.out.println(zz11 + " " + "(x > a) && (c == d)");
//        }
//        else {
//            System.out.println("Done");
//        }




    }
}
