package com.demo.builder;

public class MainApp {

	public static void main(String[] args) {
		
		Pizza.Builder orderPizza = new Pizza.Builder("Vegetable With Cheese");
		Pizza pizza = orderPizza.shop("Dominos").type("VwC").size("Large").weight(480.00).build();
		System.out.println(pizza);
	}
	
}
