package players;

/**
 *
 * @author bashar
 */
public class Player {

    
    

    
    

 private   int number;
  public   Pice pice;
   public  Money money = new Money(1500);
  private  int utilitie = 0;
  private  int stations = 0;
  private  boolean freeJailCard = false;
  private  boolean Jailed = false;
private    int roundsInjail = 3;
   public cup c = new cup();
    
    

    public void setRoundsInjail(int roundsInjail) {
        this.roundsInjail = roundsInjail;
    }

    public int getRoundsInjail() {
        return roundsInjail;
    }
    public Player(String name, int number) {
        pice = new Pice(name);
        this.number = number;
    }

    public boolean isJailed() {
        return Jailed;
    }

    public void addUtilitie() {
        utilitie++;
    }

    public void addStations() {
        stations++;
    }

    public int getUtilitie() {
        return utilitie;
    }

    public int getStations() {
        return stations;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFreeJailCard() {
        return freeJailCard;
    }

    public void setFreeJailCard(boolean freeJailCard) {
        this.freeJailCard = freeJailCard;
    }
    
    public void SetJailed (boolean Jailed){
        
        this.Jailed=Jailed;
    }

    public int  getCurrentRoll(){
     return c.getCurrentRoll();
    }
      public int  getNewRoll(){
     return c.getNewRoll();
    }
    
      public boolean isDoubleRoll(){
          return c.isDoubleRoll();
      }
    
    
    
    
    
    
}
