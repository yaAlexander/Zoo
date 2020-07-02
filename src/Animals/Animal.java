package Animals;

import Food.Food;

public abstract class Animal {
    protected String name;
    public abstract String getName();
    public abstract void eat(Food food);
    @Override
    public String toString() {
        return name;
    }
}
