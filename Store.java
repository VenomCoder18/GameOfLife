public class Store {
  
  String name;
  int cost;

  public Store(String Name, int cost){

    this.name = Name;
    this.cost = cost;
  }

  public String getName(){
    return name;
  }
  public int getCost(){
    return cost;
  }
  public String display(){
    return (this.name + " is worth $" + this.cost);
  }

}
