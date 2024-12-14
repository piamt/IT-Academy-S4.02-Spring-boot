package cat.itacademy.s04.t02.n03.service;

import cat.itacademy.s04.t02.n03.exception.FruitAlreadyExistsException;
import cat.itacademy.s04.t02.n03.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.model.Fruit;

import java.util.List;

public interface FruitService {

    List<Fruit> findAllFruits(); // TODO: Throws FruitAlreadyExistsException
    Fruit saveFruit(Fruit fruit) throws FruitAlreadyExistsException;
    Fruit updateFruit(Integer id, Fruit fruit) throws FruitNotFoundException;
    void deleteFruit(Integer id);
    Fruit getFruitById(Integer id) throws FruitNotFoundException;
}
