import java.util.ArrayList;

public class Tree {
  private String genre;

  private Trunk trunk;
  private ArrayList<Branch> branches;
  private ArrayList<Root> roots;

  Tree(String genre, Trunk trunk, ArrayList<Root> roots){
    this.genre = genre;
    this.trunk = trunk;
    this.roots = roots;
  }

  Tree(String genre, Trunk trunk , ArrayList<Root> roots, ArrayList<Branch> branches){
    this.genre = genre;
    this.trunk = trunk;
    this.roots = roots;
    this.branches = branches;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public ArrayList<Branch> getBranches() {
    return branches;
  }

  public void addBranch(ArrayList<Branch> branches) {
    this.branches.addAll(branches);
  }

  public void addBranch(Branch branch){
    this.branches.add(branch);
  }

  public ArrayList<Root> getRoots() {
    return roots;
  }

  public void addRoot(ArrayList<Root> roots) {
    this.roots.addAll(roots);
  }

  public void addRoot(Root root){
    this.roots.add(root);
  }

  public boolean transferWaterAndMineral(boolean water, boolean mineral){
    double sumWather = 0;
    double sumMineral = 0;

    for(Root root : roots){
      if(root.takeWater(water))
        sumWather+=0.2;
      root.takeMineral(mineral);
        sumMineral+=0.1;
    }
    if(sumMineral > 0.5 && sumWather > 1)
      return true;
    else
      return false;
  }

  public boolean photosynthesis(boolean light, boolean watherAndMineral){
    if(light && watherAndMineral)
      return true;
    else
      return false;
  }

  public boolean grow(boolean photosynthesis, Leaf leaf){
    if(photosynthesis){
      for(Root root : roots){
        root.grow();
      }

      for(Branch branch : branches){
        branch.grow(leaf);
      }

      this.trunk.grow();
      return true;
    }else
      return false;
  }

}
