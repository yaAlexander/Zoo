package Enclosure;

import Animals.*;
import Food.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnclosureHerbivore firstEnclosureHerbivore = new EnclosureHerbivore(2);
        EnclosureHerbivore secondEnclosureHerbivore = new EnclosureHerbivore(3);
        EnclosureCarnivorous firstEnclosureCarnivorous = new EnclosureCarnivorous(2);
        EnclosureCarnivorous secondEnclosureCarnivorous = new EnclosureCarnivorous(3);
        Food[] foods = {new Fish(), new Fowl(), new Fowl(), new Fruit(), new Grass()};
        //Animal[] animals = {new Lion(), new Leopard(), new Tiger(), new Deer(), new Antelope(), new Elephant()};
        //Вольеры заполняются животными
        for (int i = 0; i < 2; i++) {
            int j = (int) (Math.random() * 3 + 1);
            if (j == 1) firstEnclosureHerbivore.addAnimal(new Deer());
            if (j == 2) firstEnclosureHerbivore.addAnimal(new Antelope());
            if (j == 3) firstEnclosureHerbivore.addAnimal(new Elephant());
        }

        for (int i = 0; i < 3; i++) {
            int j = (int) (Math.random() * 3 + 1);
            if (j == 1) secondEnclosureHerbivore.addAnimal(new Deer());
            if (j == 2) secondEnclosureHerbivore.addAnimal(new Antelope());
            if (j == 3) secondEnclosureHerbivore.addAnimal(new Elephant());
        }

        for (int i = 0; i < 2; i++) {
            int j = (int) (Math.random() * 3 + 1);
            if (j == 1) firstEnclosureCarnivorous.addAnimal(new Tiger());
            if (j == 2) firstEnclosureCarnivorous.addAnimal(new Lion());
            if (j == 3) firstEnclosureCarnivorous.addAnimal(new Leopard());
        }
        for (int i = 0; i < 3; i++) {
            int j = (int) (Math.random() * 3 + 1);
            if (j == 1) secondEnclosureCarnivorous.addAnimal(new Tiger());
            if (j == 2) secondEnclosureCarnivorous.addAnimal(new Lion());
            if (j == 3) secondEnclosureCarnivorous.addAnimal(new Leopard());
        }

        List<Enclosure> enclosures = new ArrayList<Enclosure>();
        enclosures.add(firstEnclosureHerbivore);
        enclosures.add(secondEnclosureHerbivore);
        enclosures.add(firstEnclosureCarnivorous);
        enclosures.add(secondEnclosureCarnivorous);
        //кормим зверей
        for (Enclosure enclosure : enclosures) {
            for (int i = 0; i < enclosure.getCounter(); i++) {
                int ac = (int) (Math.random() * foods.length);
                Food food = foods[ac];
                Animal animal = enclosure.getIndex(i);
                animal.eat(food);
            }
        }

    }
}


