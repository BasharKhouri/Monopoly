/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

import java.util.Scanner;
import squares.LandSquare;
import squares.square;

/**
 *
 * @author basha
 */
public class build {

  private  square[] square;
    Scanner in = new Scanner(System.in);

    public build(square[] s) {
        this.square = s;
    }

    public void canBuildON() {
        System.out.println("would you like end your turn or would you like to build ? [Y / N] ");
        String answer = in.next();
        int count = 0;
        while (answer.toLowerCase().equals('y')) {
            for (int i = 0; i < square.length; i++) {
                if (square[i] instanceof LandSquare) {
                    if (((LandSquare) square[i]).isCanBuild()) {
                        System.out.println("you can build in " + square[i].getname() + " to chose enter it's possition  (" + (i + 1) + "). ");
                    }
                    count++;

                }
            }

            if (count > 0) {
                System.out.println("You can build (" + count + ") wich one would you choose ");
                System.out.println("building cost 50 for each buildng including the hotle as the last one ");
            }

        }
    }

  
}
