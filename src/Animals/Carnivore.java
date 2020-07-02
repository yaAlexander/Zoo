package Animals;

import Food.*;
//класс плотоядных животных
public abstract class Carnivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " ест " + food);
        } else {
            System.out.println(name + " не ест " + food);
        }
    }
}
