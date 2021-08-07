package monopoly;

import java.util.Scanner;

/**
 *
 * @author bashar
 */
public class Monopoly {

    static Board board;

    public static void main(String[] args) {
        int TotalPlayers = 0;

        Scanner in = new Scanner(System.in);

        try {
            System.out.println("How many players are playing : ");
            System.out.print("choose between (2-8) :");
            TotalPlayers = in.nextInt();

        } catch (Exception a) {
            System.out.println("make Sure to enter a number between 2 and 8 ");
        }
        if (TotalPlayers > 8) {
            System.out.println("too many players ");
        } else if (TotalPlayers < 2) {
            System.out.println("Not enogh to play ");
        }

        board = new Board(TotalPlayers);
        Startgame();
        System.out.println("the winner is player number  " + board.getWinner().getNumber() + " his pice  is " + board.getWinner().pice.getName());

    }

    private static void Startgame() {
        int doubles = 0;
        int roll = 0 ;
        System.out.println("Start Game ");
        while (!isGameEnd() || !board.Winner()) {

            if (!board.getCurrentPlayer().money.bankrupt()) {
                roll =board.getCurrentPlayer().getNewRoll();
                if(!board.getCurrentPlayer().isJailed()){
                System.out.println("Player Number (" + board.getCurrentPlayer().getNumber()  + ") you rolled " + roll);
                board.moveCurrentPlayer(roll);
                if(board.passedGo())
                    board.getCurrentPlayer().money.addMoney(200);
                board.doSquareAction(board.getCurrnetPlayerPossition());
                board.build();
                if (!board.getCurrentPlayer().isDoubleRoll()) {
                    board.nextPlayer();
                } else {
                    if (doubles > 3) {
                        doubles++;
                    } 
                    if (doubles == 3) {
                        System.out.println("4");
                        board.getCurrentPlayer().pice.goTO(10, true);
                        doubles = 0;
                        board.nextPlayer();
                    }
                     board.nextPlayer();
                }
                }
                else{
                    int rounds = board.getCurrentPlayer().getRoundsInjail();
                    System.out.println("player number ("+ board.getCurrentPlayer().getNumber()+") you are in jail and choosed to stay for 3 rounds /n ("+rounds+") remaining");
                    rounds--;
                    board.getCurrentPlayer().setRoundsInjail(rounds);
                    if(rounds==0){
                        board.getCurrentPlayer().SetJailed(false);
                        board.getCurrentPlayer().setRoundsInjail(3);
                    }
                    board.nextPlayer();
                }

            }
        }

    }

    private static boolean isGameEnd() {
        return board.getHighestNoOFturnArrondBoard() == 25;

    }

}
