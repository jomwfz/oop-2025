public class MyFloat {
    public static void main(String[] args) {
        float  f;
        System.out.println(Float.MAX_VALUE);            //
        System.out.println(Float.MIN_VALUE);            //

        //f = 1.0;                                      //
        f = 1.123456789012345f;
        System.out.println(f);                          //
        f = (float) 1.123456789012345;
        System.out.println(f);                          //

        double d;
        System.out.println(Double.MAX_VALUE);           //
        System.out.println(Double.MIN_VALUE);           //

        d = 3.14;
        System.out.println(d);                          //
        d = 314e-2;
        System.out.println(d);                          //
        d = 1.0 / 0.0;
        System.out.println(d);                          //
        d = -1.0 / 0.0;
        System.out.println(d);                          //
        d = 0.0 / 0.0;
        System.out.println(d);                          //

        System.out.println(Double.POSITIVE_INFINITY);   //
        System.out.println(Double.NEGATIVE_INFINITY);   //
        System.out.println(Double.NaN);                 //

        System.out.println(Math.PI);                    // จุดทศนิยม ? ตำแหน่ง
        System.out.println((float) Math.PI);            // จุดทศนิยม ? ตำแหน่ง
    }
}
