package task5;

import java.util.ArrayList;
import java.util.List;

public class GameCharacter {
    private double height;
    private String build;
    private String hairColor;
    private String eyeColor;
    private String clothing;
    private List<String> inventory;
    private List<String> deeds;
    
    private GameCharacter() {
        inventory = new ArrayList<>();
        deeds = new ArrayList<>();
    }
    
    public static class CharacterBuilder {
        private GameCharacter character;
        
        public CharacterBuilder() {
            character = new GameCharacter();
        }
        
        public CharacterBuilder setHeight(double height) {
            character.height = height;
            return this;
        }
        
        public CharacterBuilder setBuild(String build) {
            character.build = build;
            return this;
        }
        
        public CharacterBuilder setHairColor(String hairColor) {
            character.hairColor = hairColor;
            return this;
        }
        
        public CharacterBuilder setEyeColor(String eyeColor) {
            character.eyeColor = eyeColor;
            return this;
        }
        
        public CharacterBuilder setClothing(String clothing) {
            character.clothing = clothing;
            return this;
        }
        
        public CharacterBuilder addToInventory(String item) {
            character.inventory.add(item);
            return this;
        }
        
        public CharacterBuilder addDeed(String deed) {
            character.deeds.add(deed);
            return this;
        }
        
        public GameCharacter build() {
            return character;
        }
    }
    
    public void display() {
        System.out.println("Зріст: " + height);
        System.out.println("Статура: " + build);
        System.out.println("Колір волосся: " + hairColor);
        System.out.println("Колір очей: " + eyeColor);
        System.out.println("Одяг: " + clothing);
        System.out.println("Інвентар: " + inventory);
        System.out.println("Справи: " + deeds);
    }
    
    public int getDeedsCount() { 
        return deeds.size(); 
    }
}