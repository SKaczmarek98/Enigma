import java.util.ArrayList;

public class DeciduousTree extends Tree{
   private boolean haveFruit;
   private String typeFruit;
   private Leaf leaf;

    DeciduousTree(String genre, Trunk trunk, ArrayList<Root> roots) {
        super(genre, trunk, roots);
        this.haveFruit = false;
    }

    public DeciduousTree(String genre, Trunk trunk, ArrayList<Root> roots, ArrayList<Branch> branches, String typeFruit, Leaf leaf) {
        super(genre, trunk, roots, branches);
        this.haveFruit = true;
        this.typeFruit = typeFruit;
        this.leaf = leaf;
        this.leaf.setTypeOfLeaf(Leaf.TypeOfLeaf.LEAF);
    }

    public boolean haveFruit() {
        return haveFruit;
    }

    public void setFruit(boolean fruit) {
        this.haveFruit = fruit;
    }

    public String getTypeFruit() {
        if(haveFruit())
            return typeFruit;
        else return null;
    }

    public void setTypeFruit(String typeFruit) {
        if(haveFruit() && !typeFruit.isEmpty())
            this.typeFruit = typeFruit;

    }

    public boolean createFruit(){
        if(haveFruit())
            return true;
        else
            return false;
    }

}
