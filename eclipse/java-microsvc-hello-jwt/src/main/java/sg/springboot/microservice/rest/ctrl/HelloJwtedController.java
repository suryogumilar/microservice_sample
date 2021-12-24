package sg.springboot.microservice.rest.ctrl;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/hellojwt")
public class HelloJwtedController {
	private static Logger logger = LogManager.getLogger(HelloJwtedController.class);
	@RequestMapping(name="zaWarudo",path="/world",method=RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String zaWarudo(@RequestParam("msg") String message) {
		logger.info("message is "+message);
		return "you expected a message of ("
				+message +") but it is me, Dio!";
	}
}
