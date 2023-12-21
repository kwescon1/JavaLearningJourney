package inheritance;

public class ArmoredCar extends Car implements Floatable, Flyable {
    int bulletProofWindows;

    void remoteStartCar() {
        // this vehicle can be started by using a remote control
    }

    // To access inherited properties or methods, we can simply use them directly:

    public String registerModel() {
        return model;
    }

    public void floatOnWater() {
        System.out.println("I can float!");
    }

    public void fly() {
        System.out.println("I can fly!");
    }

}

// The class ArmoredCar can inherit the members of Car class by using the
// keyword extends in its

// We can now say that the ArmoredCar class is a subclass of Car, and the latter
// is a superclass of ArmoredCar.

// Classes in Java support single inheritance; the ArmoredCar class can’t extend
// multiple classes.

// Also, note that in the absence of an extends keyword, a class implicitly
// inherits class java.lang.Object.

// A subclass class inherits the non-static protected and public members from
// the superclass class. In addition, the members with default (package-private)
// access are inherited if the two classes are in the same package.

// On the other hand, the private and static members of a class are not
// inherited.