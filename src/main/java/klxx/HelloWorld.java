package klxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorld {
	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	@RequestMapping(value="/helloworld")
	public String hello(){
		logger.info("hello world");
		return "success";
	}
	
}
