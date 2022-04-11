public class Leaf {
    private ColorOfLeaf color;
    private String shape;
    private TypeOfLeaf typeOfLeaf;

    public enum TypeOfLeaf {
        NEEDLE, LEAF;
    }

    public enum ColorOfLeaf {
        RED, GREEN, YELLOW;
    }

    Leaf(ColorOfLeaf color, String shape){
        this.color = color;
        this.shape = shape;
    }

    public ColorOfLeaf getColor() {
        return color;
    }

    public void setColor(ColorOfLeaf color) {
        if(typeOfLeaf == TypeOfLeaf.LEAF)
            this.color = color;
        else
            this.color = ColorOfLeaf.GREEN;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public TypeOfLeaf getTypeOfLeaf(TypeOfLeaf leaf) {
        return typeOfLeaf;
    }

    public void setTypeOfLeaf(TypeOfLeaf typeOfLeaf) {
        this.typeOfLeaf = typeOfLeaf;
    }
}