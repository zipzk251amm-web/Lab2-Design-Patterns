package task1;

public class PremiumSubscription implements Subscription {
    @Override
    public double getMonthlyPrice() { return 199.99; }
    @Override
    public int getMinPeriod() { return 3; }
    @Override
    public String getChannels() { return "Всі канали + ексклюзиви"; }
    @Override
    public String getFeatures() { return "4K, без реклами, доступ до спорту"; }
}