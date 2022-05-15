
public abstract class Animal {                  //abstract to not make a weird animal by accident
    private double weight;
    private String name;
    public Animal(double weight, String name) {
        this.setWeight(weight);
        this.setName(name);
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", weight=" + weight + "]";
    }

    
}
