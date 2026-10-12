public class AnimalMain { public static void main(String[] args) { new Animal().makeSound(); new Cat().makeSound(); } }
class Animal { void makeSound() { System.out.println("Animal makes a sound."); } }
class Cat extends Animal { @Override void makeSound() { System.out.println("Cat barks."); } }
