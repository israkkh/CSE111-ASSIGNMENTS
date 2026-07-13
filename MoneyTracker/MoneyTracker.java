package MoneyTracker;

public class MoneyTracker {
    String name ; 
    double balance ;
    double lastadded ; 
    double lastspent ;  
    public void createTracker(String name){
        this.balance = 1.0 ;
        lastadded = this.balance ; 
        this.name = name ; 

    }
    public String info(){
        if(this.name == null){
            return "A new money tracker has been launched. \nName: " + this.name + "\nCurrent Balance: " + balance ;
        }
        return "Name: " + this.name + "\nCurrent Balance: " + balance ;

    }
    public void expense(int expense ){
        if(expense > this.balance){
            System.out.println("Not enough balance.") ;
            return ;
        }
        this.balance = this.balance - expense ;
        this.lastspent = expense ;
        if(balance == 0){
            System.out.println("You're broke!") ;
        } else {
            System.out.println("Balance Updated.") ;
        }

    }
    public void income(int income ){
        this.balance = this.balance + income ;
        lastadded = income ;
        System.out.println("Balance Updated!") ;

    }


    public void showHistory(){
        System.out.println("Last added: " + lastadded);
        System.out.println("Last spent: " + lastspent);
    }

}
