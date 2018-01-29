package pl.edu.agh.iet.iosrmanipulation.manipulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.OPTIONS })
@RestController
public class ManipulatorController {
    @Autowired
    private Manipulator manipulator;

    @RequestMapping("/transform")
    public double greeting(@RequestParam(value = "value", defaultValue = "0") double value) {
        return manipulator.transform(value);
    }

}
