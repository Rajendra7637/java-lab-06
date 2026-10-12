public class VehicleMain { public static void main(String[] args) { new Vehicle().drive(); new Car().drive(); } }
class Vehicle { void drive() { System.out.println("Vehicle is being driven."); } }
class Car extends Vehicle { @Override void drive() { System.out.println("Repairing a car"); } }
