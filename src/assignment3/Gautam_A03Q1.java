package assignment3;

/**
 * Program to calculate area, volume of a sphere and set the radius and color of the sphere as well. 
 * 
 * Completion time: 1 hr
 * 
 * @author Kiran Gautam
 * @version 1.0
 */

public class Gautam_A03Q1{
	public static class Sphere {

		private double radius;
		private String color;

		public Sphere(double radius, String color) {
			this.radius = radius;
			this.color = color;
		}

		public double getArea() {
			double area = 4 * Math.PI * Math.pow(radius, 2);			//Area = 4*pi*r^2
			return area;
		}

		public double getVolume() {
			double volume = 4.0/3.0*Math.PI*Math.pow(radius, 3);		//Volume = 4/3*pi*r^3
			return volume;
		}

		public double getRadius() {
			return radius;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String c) {
			color = c;
		}

		public void setRadius(double h) {
			radius = h;
		}

		public String toString() {
			return "Sphere: " + "Radius " + radius + " and the color is: " + color;
		}
	}

	public static void main(String[] args) {
		Sphere s1 = new Sphere(3.4, "red");
		Sphere s2 = new Sphere(6.5, "green");
		Sphere s3 = new Sphere(5.5, "orange");
		Sphere s4 = new Sphere(6.0, "black");
		System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);
		s1.setRadius(9.0);
		s2.setRadius(6.0);
		s3.setRadius(8.0);
		s4.setRadius(4.0);
		System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);
	}

}
