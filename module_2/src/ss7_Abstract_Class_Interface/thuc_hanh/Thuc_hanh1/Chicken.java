package ss7_Abstract_Class_Interface.thuc_hanh.Thuc_hanh1;


import ss7_Abstract_Class_Interface.thuc_hanh.Thuc_hanh1.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}