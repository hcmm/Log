import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Application {
	
	
	/**
	 * Usando sl4j que eh a ponte entre log4j e a aplicacao
	 */
	
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("startando app");
		System.out.println("Hello World");
		logger.info("Finalizando app");
	}
	/**
	 * 
	 ****** Windows template *******
	 * 
	 * Window - preferences - java - editor template - new
	 * 
	 * type name - Logger
	 * 
	 * Contexto - Java type members
	 * 
	 * descript - Create a new logger
	 * 
	 * pattnern - ${:import(org.slf4j.Logger,
					org.slf4j.LoggerFactory)}
					private static final Logger logger =
					LoggerFactory.getLogger(${enclosing_type}.class);
	 * 
	 */
	

}
