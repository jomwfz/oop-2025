public class MyChar {
    public static void main(String[] args) {
        char c;
        c = '1';
        System.out.println(c);                  //
        System.out.println((int) c);            //

        c = 'A';
        System.out.println(c);                  //
        System.out.println((int) c);            //

        c = 'a';
        System.out.println(c);                  //
        System.out.println((int) c);            //

        c = 'A' + 'a';
        System.out.println(c);                  //
        System.out.println((int) c);            //

        c = 'A' + 32;
        System.out.println(c);                  //
        System.out.println((int) c);            //

        c = 'a' - 32;
        System.out.println(c);                  //
        System.out.println((int) c);            //

        int i;
        c = 'Z';
        i = (int) c;
        System.out.println(i);                  //

        i = 90;
        c = (char) i;
        System.out.println(c);                  //

        c = 90;
        System.out.println(c);                  //

        c = (char) 90;
        System.out.println(c);                  //
    }
}
