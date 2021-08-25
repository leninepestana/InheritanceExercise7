package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class ShapeProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<>();
		
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
				Circle circle = new Circle(color, radius);
				shape.add(circle);
			}
			else {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Rectangle rectangle = new Rectangle(color, width, height);
				shape.add(rectangle);
			}
			
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS: ");
		
		for(Shape s : shape) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc.close();
	}

}
