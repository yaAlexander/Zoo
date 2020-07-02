package Animals;

import Food.*;

//класс травоядных животных
public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println(name + " съест " + food);
        } else {
            System.out.println(name + " не съест " + food);
        }
    }
}

