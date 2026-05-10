package task1;

public class WebSite extends SubscriptionCreator {
    @Override
    public Subscription createSubscription(String type) {
        System.out.println("Вебсайт: Оформлення підписки онлайн...");
        switch(type) {
            case "domestic": return new DomesticSubscription();
            case "educational": return new EducationalSubscription();
            case "premium": return new PremiumSubscription();
            default: return null;
        }
    }
}