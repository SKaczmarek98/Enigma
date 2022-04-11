import java.util.ArrayList;

public class Conifer extends Tree{
    private Leaf leaf;

    public Conifer(String genre, Trunk trunk, ArrayList<Root> roots) {
        super(genre, trunk, roots);
    }

    public Conifer(String genre, Trunk trunk, ArrayList<Root> roots, ArrayList<Branch> branches) {
        super(genre, trunk, roots, branches);
        this.leaf = leaf;
        this.leaf.setTypeOfLeaf(Leaf.TypeOfLeaf.NEEDLE);
        this.leaf.setColor(Leaf.ColorOfLeaf.GREEN);
    }

    public boolean alwaysGreen(){
        return true;
    }
}

