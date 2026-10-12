public class AbstractAnimalMain { public static void main(String[] args) { Animal a=new Lion(); Animal b=new Tiger(); a.sound(); b.sound(); } }
abstract class Animal { abstract void sound(); }
class Lion extends Animal { @Override void sound(){System.out.println("Lion roars.");} }
class Tiger extends Animal { @Override void sound(){System.out.println("Tiger growls.");} }
