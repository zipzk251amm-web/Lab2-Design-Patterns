package task2;

public class BalaxyFactory implements DeviceFactory {
    @Override
    public Laptop createLaptop() { return new BalaxyLaptop(); }
    @Override
    public Netbook createNetbook() { return new BalaxyNetbook(); }
    @Override
    public EBook createEBook() { return new BalaxyEBook(); }
    @Override
    public Smartphone createSmartphone() { return new BalaxySmartphone(); }
}