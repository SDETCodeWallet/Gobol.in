package SeleniumGenric;

import org.apache.logging.log4j.*;

public class LoggerGenric {
	private static Logger log = LogManager.getLogger(LoggerGenric.class.getName());

	public static void main(String[] args) {
		startTestCaseName("method name");
		endTestCaseName("method end");
		error("inside error");
		warn("inside warn");
		debug("inside debug message");
		fatal("fatal error ");
		// trace("trace");
	}

	public static void startTestCaseName(String startTestCaseName) {
		log.info("Started Test Case:" + startTestCaseName);
	}

	public static void endTestCaseName(String EndTestCaseName) {
		log.info("Started Test Case:" + EndTestCaseName);
	}

	public static void info(String message) {
		log.info(message);
	}

	public static void error(String message) {
		log.error(message);
	}

	public static void warn(String message) {
		log.warn(message);
	}

	public static void debug(String message) {
		log.debug(message);
	}

	public static void fatal(String message) {
		log.fatal(message);
	}

	public static void trace(String message) {
		log.trace(message);
	}

}
