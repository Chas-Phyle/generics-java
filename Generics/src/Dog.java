public class Dog extends Animal {
    private String color;
    private final int height;
    public Dog(double weight, String name, String color) {
        super(weight, name);
        this.setColor(color);

        setHeight(5);
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setHeight(int height){    
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

}
