package web.config.service;

import org.springframework.stereotype.Service;
import web.config.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}
