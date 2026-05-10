package task2;

public class IProneFactory implements DeviceFactory {
    @Override
    public Laptop createLaptop() { return new IProneLaptop(); }
    @Override
    public Netbook createNetbook() { return new IProneNetbook(); }
    @Override
    public EBook createEBook() { return new IProneEBook(); }
    @Override
    public Smartphone createSmartphone() { return new IProneSmartphone(); }
}