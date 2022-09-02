package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.service.CarService;
import web.model.Car;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Controller
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(name = "count", defaultValue = "5") int count) {
        List<Car> carList = service.getCars(count);
        System.out.println(carList);
        model.addAttribute("carList", carList);

        return "cars";
    }
}
