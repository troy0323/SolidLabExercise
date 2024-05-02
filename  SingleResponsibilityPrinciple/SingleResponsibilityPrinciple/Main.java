package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Winter", "Troy");
        PetFood petEat = new PetFood();
        PetSound petSound=  new PetSound();

        petEat.eat(cat, "beef");
        petSound.makeSound(cat, "Woorf-Arff");
    }
}
