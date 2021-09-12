package com.fruit.lab2;

import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	public Fruit(int no, String name, int price) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.no=no;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

}



