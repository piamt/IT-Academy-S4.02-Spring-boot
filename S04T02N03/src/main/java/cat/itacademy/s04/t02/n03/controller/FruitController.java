package cat.itacademy.s04.t02.n03.controller;

import cat.itacademy.s04.t02.n03.exception.FruitAlreadyExistsException;
import cat.itacademy.s04.t02.n03.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n03.model.Fruit;
import cat.itacademy.s04.t02.n03.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    FruitService fruitService;

    @GetMapping(value = "/getOne/{id}")
    public ResponseEntity<Fruit> getFruit(@PathVariable(value = "id") Integer fruitId) throws FruitNotFoundException {
        return ResponseEntity.ok(fruitService.getFruitById(fruitId));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        return ResponseEntity.ok(fruitService.findAllFruits());
    }

    @PostMapping("/add")
    public ResponseEntity<Fruit> saveFruit(@RequestBody Fruit fruit) throws FruitAlreadyExistsException {
        return ResponseEntity.ok(fruitService.saveFruit(fruit));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruit> updateFruit(@PathVariable Integer id, @RequestBody Fruit fruit)  throws FruitNotFoundException {
        return ResponseEntity.ok(fruitService.updateFruit(id, fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruit(@PathVariable Integer id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.ok("Fruit successfully deleted");
    }
}

