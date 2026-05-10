package task2;

public class KiaomiFactory implements DeviceFactory {
    @Override
    public Laptop createLaptop() { return new KiaomiLaptop(); }
    @Override
    public Netbook createNetbook() { return new KiaomiNetbook(); }
    @Override
    public EBook createEBook() { return new KiaomiEBook(); }
    @Override
    public Smartphone createSmartphone() { return new KiaomiSmartphone(); }
}