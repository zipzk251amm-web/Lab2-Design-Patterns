package task1;

public class EducationalSubscription implements Subscription {
    @Override
    public double getMonthlyPrice() { return 49.99; }
    @Override
    public int getMinPeriod() { return 12; }
    @Override
    public String getChannels() { return "Наукові, документальні, TED"; }
    @Override
    public String getFeatures() { return "Навчальні матеріали, тести"; }
}