public class MyString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1);                             //
        System.out.println(s2);                             //
        System.out.println(s3);                             //
        System.out.println(System.identityHashCode(s1));    //
        System.out.println(System.identityHashCode(s2));    //
        System.out.println(System.identityHashCode(s3));    //
        System.out.println(s1 == s2);                       //
        System.out.println(s1 == s3);                       //
        System.out.println(s2 == s3);                       //
        System.out.println(s1.equals(s2));                  //
        System.out.println(s1.equals(s3));                  //
        System.out.println(s2.equals(s3));                  //

        System.out.println("1" + 1);                        //
        System.out.println('1' + 1);                        //
        System.out.println("1" + 1 + 1);                    //
        System.out.println("1" + (1 + 1));                  //
        System.out.println('1' + 1 + 1);                    //
        System.out.println(1 + "string" + 1 + 1);           //
        System.out.println(1 + "string" + (1 + 1));         //
        System.out.println(1 + "string" + 'a' + 1);         //
    }
}
