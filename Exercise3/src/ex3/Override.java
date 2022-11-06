package ex3;

public class Override {
	
	class Circle {
		final double pi = 3.14; 
		double radius = 1.0, height = 1.0;
		String colour = "red";
		
		public Circle() {
			radius = 1.0;
		}
		
		public Circle(double r) {
			radius = r;
		}
		
		public Circle(double r, String col) {
			radius = r;
			colour = col;
		}
		
		double getRadius() {
			return radius;
		}
		void setRadius(double r) {
			this.radius=r;
		}
		
		String getColor() {
			return colour;
		}
		void setColor(String col) {
			this.colour=col;
		}
		double getArea() {
			return pi*radius*radius;
		}
	}
/*	String toString() {
		} */


	class Cylinder extends Circle{
		
		public Cylinder() {
			height = 1.0;
		}
		
		public Cylinder(double r) {
			this.radius = r;
		}
		public Cylinder(double r, double h) {
			this.radius = r;
			this.height = h;
		}
		public Cylinder(double r, double h, String col) {
			this.radius = r;
			this.height = h;
			this.colour = col;
		}
		
		double getHeight() {
			return height;
		}
		void setHeight(double h) {
			this.height = h;
		}
		double getVolume() {
			return pi*radius*radius*height;
		}
		
		double getArea() {
			return pi*radius*radius;


		}
		
	}
}
