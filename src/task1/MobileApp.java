package task1;

public class MobileApp extends SubscriptionCreator {
    @Override
    public Subscription createSubscription(String type) {
        System.out.println("Мобільний додаток: Оплата через Google Play/App Store...");
        switch(type) {
            case "domestic": return new DomesticSubscription();
            case "educational": return new EducationalSubscription();
            case "premium": return new PremiumSubscription();
            default: return null;
        }
    }
}