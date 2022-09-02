package web.config.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {

    private static List<Car> cars = Arrays.asList(
            new Car(1, "BMW", "Black"),
            new Car(2, "Lada", "White"),
            new Car(3, "Datsun", "Green"),
            new Car(4, "HYUNDA", "Red"),
            new Car(5, "Volvo", "Pink"));

    @Override
    public List<Car> getCars(int count) {
        List<Car> carList;
        if (count < 0) {
            carList = cars.stream().limit(0).collect(Collectors.toList());
        } else {
            carList = cars.stream().limit(count).collect(Collectors.toList());
        }
        return carList;
    }
}
