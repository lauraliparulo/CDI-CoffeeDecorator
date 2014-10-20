package de.demo.coffee.makers;

import javax.inject.Inject;

import de.demo.qualifiers.American;

@American
public class AmericanCoffeeMaker implements CoffeeMaker {

	@Inject
	@American
	private float price;

	@Inject
	@American
	private int code;

	@Override
	public String makeCoffee() {

		return "Code: " + code + " - Drink : Americano - Price: " + price;

	}

}
