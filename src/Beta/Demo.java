package Beta;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args)
	{
//		if (2>0)
			log.debug("object is Present");
			log.error("ERROR");
			log.debug("I am debugging");
			log.info("Success");
			log.fatal("zayn");
	}
	}
		