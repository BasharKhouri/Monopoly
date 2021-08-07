package players;

/**
 *
 * @author bashar
 */
public class Pice {

  private  String name;
 private  int currentPossition = 0;
   private int noOFturnArrondBoard = 0;

    public Pice(String name) {
        this.name = name;
    }

    public void move(int move) {
        currentPossition += move;
        if (currentPossition >= 40) {
            currentPossition = currentPossition - 40;
            noOFturnArrondBoard++;
        }
    }

    public String getName() {
        return name;
    }

    public void goTO(int distination) {
        currentPossition = distination;
    }

    public void goTO(int distination, boolean jailed) {
        currentPossition = distination;
    }

  public int getCurrentPossition() {
        return currentPossition;
    }

    public int getNoOFturnArrondBoard() {
        return noOFturnArrondBoard;
    }
    
    public boolean passedGo(){
        int no =  0 ;
        if (noOFturnArrondBoard >no)
        {
            no=noOFturnArrondBoard;
            return true;
        }
       else return false;
    }

}
