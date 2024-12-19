package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> carList;

    //    создаю список машин
    { carList = new ArrayList<> ();
        carList.add(new Car("GAZ 2101","rad",1900));
        carList.add(new Car("GAZ 2318","green",1970));
        carList.add(new Car("GAZ 3110","blue",1980));
        carList.add(new Car("GAZ 3131","white",1990));
        carList.add(new Car("GAZ 3330","black",1999));
    }
    // метод передачи списка машин
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCars(int count) {
        return List.of ( );
    }
}
