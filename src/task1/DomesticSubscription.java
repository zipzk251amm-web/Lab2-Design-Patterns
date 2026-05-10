package task1;

public class DomesticSubscription implements Subscription {
    @Override
    public double getMonthlyPrice() { return 99.99; }
    @Override
    public int getMinPeriod() { return 1; }
    @Override
    public String getChannels() { return "Сімейні, новини, розваги"; }
    @Override
    public String getFeatures() { return "До 3 пристроїв"; }
}