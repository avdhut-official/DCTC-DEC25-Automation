package tests;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import utils.LoggerUtil;


public class LoggingTest {
	
	private static final Logger logger = LoggerUtil.getLogger(LoggingTest.class);
	
	@Test
	public void verifyLogging()
	{
		logger.trace("Trace Message");
		logger.debug("Debug Message");
		logger.info("Logging Configuration loaded");
		logger.warn("Warning Example");
		logger.error("Error Example");
	}

}
