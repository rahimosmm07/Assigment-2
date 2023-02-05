package com.pro;

import java.util.*;

public class C {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.input();
		rect.area();
	}
}

interface Shape {
	void input();

	void area();
}

class Circle implements Shape {
	short radius;
	double pie = 3.14, area;

	public void input() {
		radius = 4;
	}

	public void area() {
		area = pie * radius * radius;
		System.out.println("AREA OF CIRCLE : " + area);
	}
}

class Rectangle extends Circle {
	short length, breadth;
	double area;

	public void input() {
		super.input();
		length = 6;
		breadth = 3;
	}

	public void area() {
		super.area();
		area = length * breadth;
		System.out.println("AREA OF RECTANGLE : " + area);
	}
}