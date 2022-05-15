public class Cat extends Animal {
    private double tailLength;
    public Cat(double weight, String name, double tailLength) {
        super(weight, name);
        this.tailLength = tailLength;
        //TODO Auto-generated constructor stub
    }
    public double getTailLength() {
        return tailLength;
    }
    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
    
}
