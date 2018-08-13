package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	
	private List<Shape> Shapes = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		for (Shape s : Shapes) {
			s.draw(fillColor);
		}
	}
	
	public void add(Shape s) {
		this.Shapes.add(s);
	}
	
	public void remove(Shape s) {
		this.Shapes.remove(s);
	}
	
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.Shapes.clear();
	}

}
