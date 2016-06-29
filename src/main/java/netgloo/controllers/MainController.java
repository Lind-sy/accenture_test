package netgloo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class MainController {

	/**@RequestMapping("/")
	@ResponseBody
	public String index() {
	  
		return "hey";
		
	}**/
	
	
	
	@RequestMapping( "/data/userdata" )
	public Map<String,Object> home( @RequestParam("first") String first ) {
	    Map<String,Object> model = new HashMap<String,Object>();
	    if( first.equals("kjest") ) model.put( "content", "get:if:" + first );
	    else model.put( "content", "get:else:" + first );
	    return model;
	}

}
