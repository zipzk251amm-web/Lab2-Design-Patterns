package task4;

import java.util.ArrayList;
import java.util.List;

public class Virus implements Cloneable {
    private double weight;
    private int age;
    private String name;
    private String species;
    private List<Virus> children;
    
    public Virus(double weight, int age, String name, String species) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.species = species;
        this.children = new ArrayList<>();
    }
    
    public void addChild(Virus child) {
        children.add(child);
    }
    
    @Override
    public Virus clone() {
        try {
            Virus cloned = (Virus) super.clone();
            cloned.children = new ArrayList<>();
            for (Virus child : this.children) {
                cloned.children.add(child.clone());
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    
    public void printFamily(int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + name + " (" + species + ", вага:" + weight + ", вік:" + age + ")");
        for (Virus child : children) {
            child.printFamily(level + 1);
        }
    }
}