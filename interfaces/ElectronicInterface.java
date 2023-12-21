package interfaces;

public interface ElectronicInterface {

    // constant variable
    public static final String LED = "LED";

    // Abstract method
    int getElectricityUse();

    // static method
    static boolean isEnergyEfficient(String electronicType) {
        // if (electronicType == LED) {
        // return true;
        // }

        if (electronicType.equals(LED)) {
            return true;
        }

        return false;
    }

    // Default method
    default void printDescription() {
        System.out.println("Electronic Description");
    }
}
