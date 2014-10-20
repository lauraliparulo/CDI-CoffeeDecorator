package de.demo.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import de.demo.coffee.makers.CoffeeMaker;

@Decorator
public class CoffeeCreamDecorator implements CoffeeMaker {

	@Inject
	@Delegate
	@Any
	private CoffeeMaker coffeeMaker;

	@Override
	public String makeCoffee() {

		return coffeeMaker.makeCoffee() + " - Cream added!";

	}

}
