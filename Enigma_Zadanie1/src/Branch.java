import java.util.ArrayList;
import java.util.List;

public class Branch {
    private double length;

    private final double INCREASE_LENGTH = 0.1;

    Branch(int length){
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length > 0)
            this.length = length;
        else
            System.out.println("Długość gałęzi musi być większa od 0!");
    }

    public void grow(Leaf leaf){
        this.length += INCREASE_LENGTH;
    }

}
