package de.demo.service;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

import org.de.log.LoggingInterceptor;

import de.demo.coffee.makers.CoffeeMaker;
import de.demo.qualifiers.Espresso;

@Interceptors(LoggingInterceptor.class)
public class EspressoService {

	@Inject
	Logger log;

	@Inject @Espresso
	private CoffeeMaker coffeeMaker;

	public String make() {

		log.info("Making espresso...");

		return coffeeMaker.makeCoffee();

	}

}
