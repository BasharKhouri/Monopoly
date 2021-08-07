package players;

/**
 *
 * @author bashar
 */
public class Money {
   private int money ;

    public Money(int money) {
        this.money=money;
    }

    public void substractMoney(int money) {
        this.money -= money;
    }
    
    public void addMoney(int money) {
        this.money += money;
    }

    public int getMoney() {
        return money;
    }
    
    public boolean bankrupt (){
        return money <=0 ;
    }
 
}
