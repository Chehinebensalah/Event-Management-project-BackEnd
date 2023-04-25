package web.demo.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    private static final Logger logger2 = LoggerFactory.getLogger(LoggingAspect.class);
    // appliqué sur n'importe quelle classe du package web.demo.services, sans tenir compte du type de retour ou des paramètres de la méthode.
    @Before("execution(* web.demo.service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        logger.info("début de la méthode " + name + " : ");
    }

    @After("execution(* web.demo.service.*.*(..))")
    public void logMethodSortie(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        logger2.info("Fin de la méthode " + name + " : ");
    }
}