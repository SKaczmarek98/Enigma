public class Trunk {
    private double height;
    private double width;
    private double diameter;

    private final double INCREASE_HEIGHT = 1.1;
    private final double INCREASE_WIDTH = 0.5;
    private final double INCREASE_DIAMETER = 0.05;


    Trunk(double height, double width, double diameter){
        setHeight(height);
        setWidth(width);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
        else
            System.out.println("Wysokość musi być większa od 0!");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
            this.width = width;
        else
            System.out.println("Szerokość musi być większa od 0!");
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter > 0)
            this.diameter = diameter;
        else
            System.out.println("Średnica musi być większa od 0!");
    }

    public void grow(){
        height += INCREASE_HEIGHT;
        width += INCREASE_WIDTH;
        diameter += INCREASE_DIAMETER;
    }

}
