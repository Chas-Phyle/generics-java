
public class Comparing implements Comparison{

    private double value;

    public Comparing(double value) {
        this.setValue(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int returnValue() {
       value = Math.random()*value*100;                //creats a random number based on starting amount and add in more variations with the *100
        return (int) value;
    }
    

 
    
}
