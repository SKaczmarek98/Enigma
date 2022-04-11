public class Root {
    private double length;

    private final double INCREASE = 1;

    Root(int length){
        setlength(length);
    }

    public void setlength(int length) {
        if(length>0)
            this.length = length;
        else
            System.out.println("Długość korzena musi być większa od 0!");
    }

    public double getlength() {
        return length;
    }

    public void grow(){
        length+=INCREASE;
    }

    public boolean takeWater(boolean water){
        if(water)
            return true;
        else
            return false;
    }

    public boolean takeMineral(boolean mineral){
        if(mineral)
            return true;
        else
            return false;
    }

}
