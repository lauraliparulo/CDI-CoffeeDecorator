package de.demo.coffee.makers;

import javax.inject.Inject;

import de.demo.qualifiers.Espresso;

@Espresso
public class EspressoMaker implements CoffeeMaker {

	@Inject
	@Espresso
	private float price;

	@Inject
	@Espresso
	private int code;

	@Override
	public String makeCoffee() {

		return "Code: " + code + " - Drink : Espresso - Price: " + price;

	}

}
