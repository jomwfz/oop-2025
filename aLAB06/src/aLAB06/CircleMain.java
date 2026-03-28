package aLAB06;

public class CircleMain { 
	 
	 public static void main(String[] args) { 
	  // Constructor 
	  Circle c1 = new Circle(); 
	  Circle c2 = new Circle(4.0); 
	  Circle c3 = new Circle(5.0); 
	 
	  // Inspect 
	  System.out.println(c1); 
	  System.out.println(c2); 
	  System.out.println(c3); 
	 
	  // c1 Set 
	  c1.setRadius(4.0); 
	  System.out.println(c1); 
	 
	  // c1 Get 
	  System.out.printf("Radius:        %.2f\n", c1.getRadius()); 
	 
	  // c1 Method 
	  System.out.printf("Area:          %.2f\n", c1.computeArea()); 
	  System.out.printf("Circumference: %.2f\n", c1.computeCircumference()); 
	  System.out.printf("Diameter:      %.2f\n", c1.computeDiameter()); 
	 
	  // Equals 
	  System.out.printf("c1 equals c2:  %b\n", c1.equals(c2)); 
	  System.out.printf("c1 equals c3:  %b\n", c1.equals(c3)); 
	 } 
	 
	}