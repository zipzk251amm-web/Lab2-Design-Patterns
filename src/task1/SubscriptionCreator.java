package task1;

public abstract class SubscriptionCreator {
    public abstract Subscription createSubscription(String type);
    
    public void orderSubscription(String type) {
        Subscription sub = createSubscription(type);
        System.out.println("Замовлено: " + sub.getClass().getSimpleName());
        System.out.println("Ціна: " + sub.getMonthlyPrice() + " грн/міс");
        System.out.println("Мін. період: " + sub.getMinPeriod() + " міс");
        System.out.println("Канали: " + sub.getChannels());
        System.out.println("Можливості: " + sub.getFeatures());
        System.out.println("---");
    }
}