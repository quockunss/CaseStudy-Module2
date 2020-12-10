package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: con cac!";
    }

    @Override
    public String howToEat(){
        return "adasd";
    }
}