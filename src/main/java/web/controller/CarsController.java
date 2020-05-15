package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {
    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printWelcome(@RequestParam(value="locale", required=false, defaultValue="ru") String locale, ModelMap model) {
        String caption = "МАШИНЫ";
        if (locale.equals("en")) {
            caption = "CARS";
        }
        model.addAttribute("caption", caption);
        List<Car> cars = CarService.getCars();
        model.addAttribute("cars", cars);
        return "cars";
    }
}
