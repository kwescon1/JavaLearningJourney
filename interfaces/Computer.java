package interfaces;

public class Computer implements ElectronicInterface {

    @Override
    public int getElectricityUse() {
        return 1000;
    }
}