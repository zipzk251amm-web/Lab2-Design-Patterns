package task1;

public class ManagerCall extends SubscriptionCreator {
    @Override
    public Subscription createSubscription(String type) {
        System.out.println("Менеджер: Консультація та оформлення по телефону...");
        switch(type) {
            case "domestic": return new DomesticSubscription();
            case "educational": return new EducationalSubscription();
            case "premium": return new PremiumSubscription();
            default: return null;
        }
    }
}