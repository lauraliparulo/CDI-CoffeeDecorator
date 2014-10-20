package de.demo.service;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.transaction.Transactional;

import org.de.log.LoggingInterceptor;

import de.demo.coffee.makers.CoffeeMaker;
import de.demo.qualifiers.American;

@Transactional
@Interceptors(LoggingInterceptor.class)
public class AmericanCoffeeService {

	@Inject
	Logger log;

	@Inject
	@American
	private CoffeeMaker coffeeMaker;

	public String make() {

		log.info("Making American Coffee...");

		return coffeeMaker.makeCoffee();

	}

}
