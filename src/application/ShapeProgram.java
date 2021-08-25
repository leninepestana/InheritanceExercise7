package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import enums.Color;

public class ShapeProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		Circle circle = new Circle(null, null);
		Rectangle rectangle = new Rectangle(null, null, null);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		

		for(int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			
			if(Character.toLowerCase(ch) == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				circle = new Circle(color, radius);
			}
			else {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				rectangle = new Rectangle(color, width, height);
			}
			
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS: ");
		if(circle.getRadius() !=null) {
			System.out.print("Circle: " + circle);			
		}
		if(rectangle.getHeight() != null && rectangle.getWidth() != null) {
			System.out.print("Rectangle: " + rectangle);			
		}
		
		sc.close();
	}

}
