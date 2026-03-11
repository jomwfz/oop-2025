public class MyInteger {
    public static void main(String[] args) {
        int i;
        System.out.println(Integer.MAX_VALUE);       //
        System.out.println(Integer.MIN_VALUE);       //

        System.out.println(Integer.MAX_VALUE + 1);   //
        System.out.println(Integer.MIN_VALUE - 1);   //

        i = 1;
        i = i + 1;
        System.out.println(i);                       //

        i = 100;
        System.out.println(i);                       //
        i = 0B1100100;
        System.out.println(i);                       //
        i = 0X64;
        System.out.println(i);                       //
        i = 0144;
        System.out.println(i);                       //

        // i = 2147483648;                           //
        // i = -2147483649;                          //

        try {
                i = 1 / 0;                           //
        } catch (Exception e) {
                e.printStackTrace();
        }

        long l;
        System.out.println(Long.MAX_VALUE);          //
        System.out.println(Long.MIN_VALUE);          //

        System.out.println(Long.MAX_VALUE + 1);      //
        System.out.println(Long.MIN_VALUE - 1);      //

        // l = 2147483648;                           //
        // l = -2147483649;                          //
        l = 2147483648L;
        l = -2147483649L;

        try {
                l = 1 / 0;                           //
        } catch (Exception e) {
                e.printStackTrace();
        }

        l = 2147483648L;
        l = -2147483649L;
    }
}
