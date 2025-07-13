
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
    
    public void playSound(Animal animal) {
        animal.makeSound();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}



// Main java file
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, world");
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Using polymorphism to call makeSound
        System.out.println("Calling animal list:");
        Animal arrAnimal[] = {new Dog(), new Cat(), new Cat(), new Cat(), new Dog()};
        for (Animal animal : arrAnimal) {
            animal.playSound(animal);
        }    

        // Directly calling makeSound on specific animal instances
        System.out.println("Directly calling makeSound:");
        myDog.makeSound(); // Outputs: Bark
        myCat.makeSound(); // Outputs: Meow
    }
}