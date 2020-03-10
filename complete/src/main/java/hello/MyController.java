package hello;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ICityService cityService;
    
    public MyController() {System.out.println("sf");}

    @RequestMapping(value = "/showCities", method = RequestMethod.GET)
    public String findCities(Model model) throws UnknownHostException {
    	System.out.println("Show Cities");
        List<City> cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);
        String ret ="" ;
        for (City  c:cities) {
        	ret = ret  + c.getName() + " " + c.getPopulation() + System.lineSeparator();
        	
        }
        InetAddress inetAddress = InetAddress.getLocalHost();
        return ret + System.lineSeparator()  +  " IP Address of server is " + inetAddress.getHostAddress();
    }
}
