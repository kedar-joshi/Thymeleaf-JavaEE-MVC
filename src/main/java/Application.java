import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api")
public class Application extends javax.ws.rs.core.Application
{
	private static final Logger logger = LogManager.getLogger(Application.class);
}
