package monopoly;

import buildings.build;
import buildings.Group;
import java.util.Scanner;
import players.Pice;
import players.Player;
import squares.ChanceSquare;
import squares.CommunitySquare;
import squares.FreeParking;
import squares.GoToJail;
import squares.JailSquare;
import squares.LandSquare;
import squares.StationSquare;
import squares.UtilitieSquare;
import squares.goSquare;
import squares.square;
import squares.taxSquare;

/**
 *
 * @author bashar
 */
public class Board {

    Group g;
    build b;
    private int currnetPlayer = 0;
    private final int TotalPlayers;
    public final square[] square = new square[40];
    public final Player[] player;
    Scanner in = new Scanner(System.in);

    public Board(int TotalPlayers) {
        this.g = new Group(square);
        String name;

        square[0] = new goSquare("Start / Go Square");
        square[1] = new LandSquare("Mediterranean Ave.", "Purple", 60);
        square[2] = new CommunitySquare("community Chest");
        square[3] = new LandSquare("Baltic Ave.", "Purple", 80);
        square[4] = new taxSquare("Incom Tax (pay 200 )");
        square[5] = new StationSquare("Kings Cross Station");
        square[6] = new LandSquare("Oriental Ave", "blue", 100);
        square[7] = new ChanceSquare("Chance");
        square[8] = new LandSquare("Vermont Ave", "blue", 100);
        square[9] = new LandSquare("Connectcut Ave", "blue", 120);
        square[10] = new JailSquare("Just Visiting / Jail");
        square[11] = new LandSquare("Charles Place", "Violet", 140);
        square[12] = new UtilitieSquare("Electric Company");
        square[13] = new LandSquare("States Ave", "Violet", 140);
        square[14] = new LandSquare("Virginia Ave", "Violet", 160);
        square[15] = new StationSquare("Pennsylvania Stations");
        square[16] = new LandSquare("St.james Place", "orange", 180);
        square[17] = new CommunitySquare("Coomunity Chest");
        square[18] = new LandSquare("Tennessee Ave.", "orange", 180);
        square[19] = new LandSquare("New york Ave.", "orange", 200);
        square[20] = new FreeParking("Free Parking");
        square[21] = new LandSquare("Kentucky Ave.", "Red", 220);
        square[22] = new CommunitySquare("Chance");
        square[23] = new LandSquare("Indiana Ave.", "Red", 220);
        square[24] = new LandSquare("Illinois Ave.", "Red", 240);
        square[25] = new StationSquare("B.&O. Station");
        square[26] = new LandSquare("Atlantic Ave", "Yellow", 260);
        square[27] = new LandSquare("Ventnot Ave", "Yellow", 260);
        square[28] = new UtilitieSquare("Water Works");
        square[29] = new LandSquare("Marvin Gardens", "Yello", 280);
        square[30] = new GoToJail("Go To Jail");
        square[31] = new LandSquare("Pacific Ave.", "Green", 300);
        square[32] = new LandSquare("North Carolina Ave.", "Green", 300);
        square[33] = new CommunitySquare("Community Chest");
        square[34] = new LandSquare("pennsylvania Ave.", "Green", 320);
        square[35] = new StationSquare("Short Line Station");
        square[36] = new ChanceSquare("Chance");
        square[37] = new LandSquare("Park Place", "Dark-Blue", 350);
        square[38] = new taxSquare("luxury Tax (pay 200)");
        square[39] = new LandSquare("Boardwalk", "Dark-Blue", 400);
        this.TotalPlayers = TotalPlayers;
        player = new Player[TotalPlayers];
        for (int i = 0; i < TotalPlayers; i++) {
            System.out.print("player number " + (i + 1) + " What is your pice name ");
            name = in.next();
            player[i] = new Player(name, i + 1);
            System.out.println(" ");
        }

    }

    /**
     *
     * @return
     */
    public int getHighestNoOFturnArrondBoard() {
        int MostTurns = 0;
        for (int i = 0; i < TotalPlayers; i++) {
            if (i == 0 || MostTurns < player[i].pice.getNoOFturnArrondBoard()) {
                MostTurns = player[i].pice.getNoOFturnArrondBoard();
            }
        }
        return MostTurns;
    }

    public boolean Winner() {
        int i = 0;
        while (!player[i].money.bankrupt() || i < TotalPlayers) {
            i++;
            return false;
        }
        return true;

    }

    public Player getWinner() {
        int mostmoney = 0;
        int winner = 0;
        for (int i = 0; i < TotalPlayers; i++) {
            if (i == 0 || mostmoney < player[i].money.getMoney()) {
                mostmoney = player[i].money.getMoney();
                winner = i;
            }
        }
        return player[winner];
    }

    public Player getCurrentPlayer() {
        return player[currnetPlayer];
    }

    public void nextPlayer() {
        if (++currnetPlayer == TotalPlayers) {
            currnetPlayer = 0;
        }
    }

    public int getCurrnetPlayerPossition() {
        return getCurrentPlayer().pice.getCurrentPossition();
    }

    public void moveCurrentPlayer(int move) {
        getCurrentPlayer().pice.move(move);
    }

    public void doSquareAction(int locatin) {
        square[locatin].doAction(getCurrentPlayer(), this);

    }

   public square[] getSquare() {
        square[] s = square;
        return s;
    }

    public void build() {
        b = new build(getSquare());
    }
    
     public boolean passedGo(){
        return getCurrentPlayer().pice.passedGo();
     }

    

}
