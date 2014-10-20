package demo.test.coffee;


import static org.junit.Assert.assertTrue;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.demo.service.AmericanCoffeeService;
import de.demo.service.EspressoService;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class CoffeeMakerUnitTest {

  // ======================================
  // =             Attributes             =
  // ======================================


  protected static Weld weld;
  protected static WeldContainer container;

  // ======================================
  // =          Lifecycle Methods         =
  // ======================================

  @BeforeClass
  public static void init() {
    weld = new Weld();
    container = weld.initialize();
  }

  @AfterClass
  public static void close() {
    weld.shutdown();
  }

  // ======================================
  // =              Methods               =
  // ======================================



	@Test
	public void espressoServiceTest() {

		EspressoService espressoService = container.instance().select(EspressoService.class).get();

		System.out.println(espressoService.make());
		assertTrue(espressoService.make().contains("Cream"));

	}

	@Test
	public void americanCoffeeServiceTest() {

		AmericanCoffeeService americanCoffeeService = container.instance().select(AmericanCoffeeService.class).get();

		System.out.println(americanCoffeeService.make());
		assertTrue(americanCoffeeService.make().contains("Cream"));

	}
}