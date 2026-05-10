import task1.*;
import task2.*;
import task3.*;
import task4.*;
import task5.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАВДАННЯ 1: Фабричний метод ===\n");
        
        SubscriptionCreator web = new WebSite();
        web.orderSubscription("domestic");
        
        SubscriptionCreator app = new MobileApp();
        app.orderSubscription("premium");
        
        SubscriptionCreator manager = new ManagerCall();
        manager.orderSubscription("educational");
        
        System.out.println("\n=== ЗАВДАННЯ 2: Абстрактна фабрика ===\n");
        
        DeviceFactory iproneFactory = new IProneFactory();
        Laptop iproneLaptop = iproneFactory.createLaptop();
        iproneLaptop.getInfo();
        
        DeviceFactory balaxyFactory = new BalaxyFactory();
        Smartphone balaxyPhone = balaxyFactory.createSmartphone();
        balaxyPhone.getInfo();
        
        DeviceFactory kiaomiFactory = new KiaomiFactory();
        Netbook kiaomiNetbook = kiaomiFactory.createNetbook();
        kiaomiNetbook.getInfo();
        
        System.out.println("\n=== ЗАВДАННЯ 3: Одинак ===\n");
        
        Authenticator auth1 = Authenticator.getInstance();
        auth1.login("JohnDoe");
        
        Authenticator auth2 = Authenticator.getInstance();
        System.out.println("Той самий об'єкт? " + (auth1 == auth2));
        auth2.logout();
        
        System.out.println("\n=== ЗАВДАННЯ 4: Прототип ===\n");
        
        Virus parent = new Virus(10.5, 30, "AlphaVirus", "Coronaviridae");
        Virus child = new Virus(5.2, 10, "BetaVirus", "Coronaviridae");
        Virus grandChild = new Virus(2.1, 2, "GammaVirus", "Coronaviridae");
        
        parent.addChild(child);
        child.addChild(grandChild);
        
        System.out.println("Оригінальна сім'я:");
        parent.printFamily(0);
        
        Virus clonedParent = parent.clone();
        System.out.println("\nКлонована сім'я:");
        clonedParent.printFamily(0);
        
        System.out.println("\n=== ЗАВДАННЯ 5: Будівельник ===\n");
        
        GameCharacter hero = new GameCharacter.CharacterBuilder()
            .setHeight(185)
            .setBuild("Атлетична")
            .setHairColor("Чорний")
            .setEyeColor("Зелений")
            .setClothing("Срібна броня")
            .addToInventory("Меч світла")
            .addToInventory("Щит вічності")
            .addDeed("Врятував королівство")
            .addDeed("Переміг дракона")
            .build();
        
        System.out.println("ГЕРОЙ:");
        hero.display();
        
        GameCharacter enemy = new GameCharacter.CharacterBuilder()
            .setHeight(200)
            .setBuild("Могутня")
            .setHairColor("Лисий")
            .setEyeColor("Червоний")
            .setClothing("Чорна мантія")
            .addToInventory("Кинджал змії")
            .addToInventory("Темний амулет")
            .addDeed("Спалив село")
            .addDeed("Викрав принцесу")
            .build();
        
        System.out.println("\nВОРОГ:");
        enemy.display();
    }
}