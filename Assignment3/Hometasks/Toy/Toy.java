package Toy;


public class Toy {
    int cost ;
    String name ;
        public Toy(String name, int cost){
        this.name = name ;
        this.cost = cost ;
        System.out.println("A new toy has been created ");

    }

    public void updatePrice(int newCost){
        this.cost = newCost ;
    }

    public void updateName(String newName){
        this.name = newName ;
    }

    public void showPrice(){
        System.out.println(this.name + " costs " + this.cost);


    }
}
