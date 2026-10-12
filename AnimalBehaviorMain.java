public class AnimalBehaviorMain { public static void main(String[] args) { Animal[] a={new Lion(),new Tiger(),new Deer()}; for(Animal x:a){x.eat();x.sleep();System.out.println();} } }
abstract class Animal { abstract void eat(); abstract void sleep(); }
class Lion extends Animal { void eat(){System.out.println("Lion eats meat.");} void sleep(){System.out.println("Lion rests in its territory.");} }
class Tiger extends Animal { void eat(){System.out.println("Tiger hunts and eats meat.");} void sleep(){System.out.println("Tiger sleeps in a sheltered spot.");} }
class Deer extends Animal { void eat(){System.out.println("Deer grazes on grass and leaves.");} void sleep(){System.out.println("Deer rests in a sheltered area.");} }
