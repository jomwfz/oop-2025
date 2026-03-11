public class FahToCel {
    public static void main(String[] args) {
        // variable
        double fahrenheit = 0.0;
        double celsius = 0.0;

        // input
        fahrenheit = 212.0;

        // process
        celsius = (5f / 9f) * (fahrenheit - 32f);
        
        // output
        System.out.printf("%.2f Fahrenheit = %.2f Celsius", fahrenheit, celsius);
    }
}


