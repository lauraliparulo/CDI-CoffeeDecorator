package org.de.log;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import de.demo.qualifiers.LoggerQ;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Interceptor
@LoggerQ
public class LoggingInterceptor {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  private Logger logger;

  // ======================================
  // =          Business methods          =
  // ======================================

  @AroundInvoke
  public Object logMethod(InvocationContext invocationContext) throws Exception {
    logger.entering(invocationContext.getTarget().toString(), invocationContext.getMethod().getName());
    logger.severe(">>>" + invocationContext.getTarget().toString() + " - " + invocationContext.getMethod().getName());
    try {
      return invocationContext.proceed();
    } finally {
      logger.severe("<<<" + invocationContext.getTarget().toString() + " - " + invocationContext.getMethod().getName());
      logger.exiting(invocationContext.getTarget().toString(), invocationContext.getMethod().getName());
    }
  }
}