public class Circle {
    public static void main(String[] args) {
        // variable
        double area = 0.0;
        double circum = 0.0;
        double radius = 0.0;
        double Pi = 22.0/7.0;

        // input
        radius = 10.5;

        // process
        area = Pi * radius * radius;
        circum = 2 * Pi * radius;

        // output 
        /*
        Area          : 346.5
		Circumference : 66.0
         */
        System.out.printf("Area          : %.1f\n", area);
        System.out.printf("Circumference : %.1f", circum);
    }
}


