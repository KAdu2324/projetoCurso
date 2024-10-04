
package br.com.qwasolucoes.mentoria.curso.Generics.TreeSet.entities.coringaDelimitados;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

import br.com.qwasolucoes.mentoria.curso.Generics.TreeSet.entities.coringaDelimitados.entities.Circle;
import br.com.qwasolucoes.mentoria.curso.Generics.TreeSet.entities.coringaDelimitados.entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += ((Circle) s).area();
		}
		return sum;
	}
}
