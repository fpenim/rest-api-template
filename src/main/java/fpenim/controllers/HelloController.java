package fpenim.controllers;

import fpenim.model.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by flaviapenim on 28/Oct/2017.
 */
@RestController
public class HelloController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public Hello sayHello() {
        return new Hello("Hi", LocalDate.now());
    }
}
