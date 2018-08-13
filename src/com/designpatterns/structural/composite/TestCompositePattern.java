package com.designpatterns.structural.composite;

public class TestCompositePattern {

	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing d = new Drawing();
		d.add(tri1);
		d.add(tri1);
		d.add(cir);
		
		d.draw("red");
		
		d.clear();
		
		d.add(tri);
		d.add(cir);
		d.draw("Green");
	}

}
