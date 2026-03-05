public class ShapeApp {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		shapes[0] = new Circle(new Point(1, 2), "Red", 3.0);
		shapes[1] = new Rectangle(new Point(1, 2), "Red", 3.0, 4.0);
		shapes[2] = new Circle(new Point(3, 4), "Green", 5.0);
		shapes[3] = new Rectangle(new Point(3, 4), "Green", 5.0, 6.0);
		shapes[4] = new Circle(new Point(5, 6), "Blue", 7.0);
		shapes[5] = new Rectangle(new Point(5, 6), "Red", 7.0, 8.0);

		System.out.printf("%-7s %-13s %-7s %-3s %-8s %-7s %-7s %-8s\n", "Shape", "Color", "X", "Y", "Radius", "Width",
				"Height", "Area");

		for (Shape s : shapes) {
			String type = "";
			String r = "-", w = "-", h = "-";

			if (s instanceof Circle) {
				type = "Cir";
				Circle c = (Circle) s;
				r = String.format("%.2f", c.getRadius());
			} else if (s instanceof Rectangle) {
				type = "Rec";
				Rectangle rect = (Rectangle) s;
				w = String.format("%.2f", rect.getWidth());
				h = String.format("%.2f", rect.getHeight());
			}

			System.out.printf("%-7s %-13s %-7d %-3d %-8s %-7s %-7s %-8.2f\n", type, s.getColor(), s.getPoint().getX(),
					s.getPoint().getY(), r, w, h, s.area());
		}
	}
}