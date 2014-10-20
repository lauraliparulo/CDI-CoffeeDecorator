package de.demo.producers;

import javax.enterprise.inject.Produces;

import de.demo.qualifiers.American;
import de.demo.qualifiers.Espresso;

public class CoffeeProducer {

	@Produces
	@Espresso
	private int codeEspresso = 6;

	@Produces
	@American
	private int codeEspressoMacchiato = 5;

	@Produces
	@Espresso
	private float priceEspresso = 0.8f;

	@Produces
	@American
	private float priceEspressoMacchiato = 1.50f;

}
