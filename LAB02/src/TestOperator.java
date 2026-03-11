public class TestOperator {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int i = 0;
        int x = 0;
        double c = 0.0;
        double d = 0.0;

        a = 11;
        b = 3;
        System.out.println(a + b);                          //
        System.out.println(a - b);                          //
        System.out.println(a * b);                          //
        System.out.println(a / b);                          //
        System.out.println(a % b);                          //
        System.out.println("--------------------");

        a = 11;
        b = -3;
        System.out.println(a + b);                          //
        System.out.println(a - b);                          //
        System.out.println(a * b);                          //
        System.out.println(a / b);                          //
        System.out.println(a % b);                          //
        System.out.println("--------------------");

        a = -11;
        b = -3;
        System.out.println(a + b);                          //
        System.out.println(a - b);                          //
        System.out.println(a * b);                          //
        System.out.println(a / b);                          //
        System.out.println(a % b);                          //
        System.out.println("--------------------");

        a = -11;
        b = 3;
        System.out.println(a + b);                          //
        System.out.println(a - b);                          //
        System.out.println(a * b);                          //
        System.out.println(a / b);                          //
        System.out.println(a % b);                          //
        System.out.println("--------------------");

        c = 12.5;
        d = 2.0;
        System.out.println(c + d);                          //
        System.out.println(c - d);                          //
        System.out.println(c * d);                          //
        System.out.println(c / d);                          //
        System.out.println(c % d);                          //
        System.out.println("--------------------");

        c = 12.5;
        d = -2.0;
        System.out.println(c + d);                          //
        System.out.println(c - d);                          //
        System.out.println(c * d);                          //
        System.out.println(c / d);                          //
        System.out.println(c % d);                          //
        System.out.println("--------------------");

        c = -12.5;
        d = -2.0;
        System.out.println(c + d);                          //
        System.out.println(c - d);                          //
        System.out.println(c * d);                          //
        System.out.println(c / d);                          //
        System.out.println(c % d);                          //
        System.out.println("--------------------");

        c = -12.5;
        d = 2.0;
        System.out.println(c + d);                          //
        System.out.println(c - d);                          //
        System.out.println(c * d);                          //
        System.out.println(c / d);                          //
        System.out.println(c % d);                          //
        System.out.println("--------------------");

        i = 1;
        System.out.println(i);                              //
        System.out.println(++i);                            //
        System.out.println(i);                              //
        System.out.println("--------------------");

        i = 1;
        System.out.println(i);                              //
        System.out.println(i++);                            //
        System.out.println(i);                              //
        System.out.println("--------------------");

        i = 1;
        System.out.println(i);                              //
        System.out.println(--i);                            //
        System.out.println(i);                              //
        System.out.println("--------------------");

        i = 1;
        System.out.println(i);                              //
        System.out.println(i--);                            //
        System.out.println(i);                              //
        System.out.println("--------------------");

        System.out.println(46 / 9);                         //
        System.out.println(46 % 9 + 4 * 4 - 2);             //
        System.out.println(45 + 43 % 5 * (23 * 3 % 2));     //
        System.out.println(3 + 5 / 7);                      //
        System.out.println(3 * 3 + 3 % 2);                  //
        System.out.println(3 + 2 / 5 + -2 * 4);             //
        System.out.println(2 * (1 + -(3 / 4) / 2) * (2 - 6 % 3));   //
        System.out.println(a - b / c * d);                  //
        System.out.println((a - b) / (c * d));              //
        System.out.println("--------------------");

        x = 1;
        System.out.println(1 < 2);                          //
        System.out.println(1 <= 2);                         //
        System.out.println(1 > 2);                          //
        System.out.println(1 >= 2);                         //
        System.out.println(1 == 2);                         //
        System.out.println(1 != 2);                         //
        System.out.println(!(1 > 2));                       //
        System.out.println(!(1 > 0));                       //
        System.out.println((2 > 3) && (5 > 5));             //
        System.out.println((3 > 2) && (5 > 5));             //
        System.out.println((3 > 2) && (5 >= 5));            //
        System.out.println((2 > 3) || (5 > 5));             //
        System.out.println((3 > 2) || (5 > 5));             //
        System.out.println((2 > 3) ^ (5 > 5));              //
        System.out.println((3 > 2) ^ (5 > 1));              //
        System.out.println("--------------------");

        System.out.println(x = 1);                          //
        System.out.println(x == 1);                         //
        System.out.println((true) && (3 > 4));              //
        System.out.println(!(x > 0) && (x > 0));            //
        System.out.println((x > 0) || (x < 0));             //
        System.out.println((x != 0) || (x == 0));           //
        System.out.println((x >= 0) || (x < 0));            //
        System.out.println((x != 1) == !(x == 1));          //
        x = 1;
        System.out.println((x > 1) & (x++ > 1));            //
        System.out.println(x);                              //
        x = 1;
        System.out.println((x > 1) && (x++ > 1));           //
        System.out.println(x);                              //
        System.out.println("--------------------");
    }
}
