package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Oktavia", "Skoda", 110));
        list.add(new Car("DBX I", "Aston Martin", 550));
        list.add(new Car("Sonata VII", "Hyundai", 150));
        list.add(new Car("Cerato", "KIA", 150));
        list.add(new Car("Granta", "Lada", 106));
        return list;
    }
}
