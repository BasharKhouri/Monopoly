/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildings;

import squares.LandSquare;
import squares.square;

/**
 *
 * @author basha
 */
public class Group {

    square[] square;
    private LandSquare purple[] = new LandSquare[2];
   private LandSquare blue[] = new LandSquare[3];
  private  LandSquare violet[] = new LandSquare[3];
   private LandSquare orange[] = new LandSquare[3];
  private  LandSquare red[] = new LandSquare[3];
   private LandSquare yellow[] = new LandSquare[3];
  private  LandSquare green[] = new LandSquare[3];
   private LandSquare darkBlue[] = new LandSquare[2];
    
    
    public void doAction(){
        canBuildPurple();
        canBuildBlue();
        canBuildViolet();
        canBuildOrange();
        canBuildRed();
         canBuildYellow() ;
         canBuildGreen();
         canBuildDarkBlue();
    }
    
    public Group(square[] s) {
        this.square = s;

        int pcount = 0, bcount = 0, vcount = 0, ocount = 0, rcount = 0, ycount = 0, gcount = 0, dcount = 0;

        for (square sqr : square) {
            if (sqr instanceof LandSquare) {
                if (((LandSquare) sqr).getGroup().equals("Purple")) {
                    purple[pcount] = (LandSquare) sqr;
                    pcount++;
                }
                if (((LandSquare) sqr).getGroup().equals("Light-Blue")) {
                    blue[bcount] = (LandSquare) sqr;
                    bcount++;
                }
                if (((LandSquare) sqr).getGroup().equals("Violet")) {
                    violet[vcount] = (LandSquare) sqr;
                    vcount++;
                }
                if (((LandSquare) sqr).getGroup().equals("Orange")) {
                    orange[ocount] = (LandSquare) sqr;
                    ocount++;
                }
                if (((LandSquare) sqr).getGroup().equals("Red")) {
                    red[rcount] = (LandSquare) sqr;
                    rcount++;
                }
                if (((LandSquare) sqr).getGroup().equals("Yellow")) {
                    yellow[ycount] = (LandSquare) sqr;
                }
                if (((LandSquare) sqr).getGroup().equals("Dark-Green")) {
                    green[gcount] = (LandSquare) sqr;
                    gcount++;
                }
                if (((LandSquare) sqr).getGroup().equals("Dark-Blue")) {
                    darkBlue[dcount] = (LandSquare) sqr;
                    dcount++;
                }

            }

        }

    }

    private void canBuildPurple() {
           boolean samOwner = true;
        int min = purple[0].getNoOfHouses();
        for (LandSquare land : purple) {
            if (purple[0].getOwner() != land .getOwner()) {
                samOwner = false;
            }
            if(min>land.getNoOfHouses()&& min < 5){
                min=land.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare land : purple)
        {
            if(land.getNoOfHouses()==min)
                land.setCanBuild(true);
        }
    }

    private void canBuildBlue() {
        boolean samOwner = true;
        int min = blue[0].getNoOfHouses();
        for (LandSquare blue1 : blue) {
            if (blue[0].getOwner() != blue1.getOwner()) {
                samOwner = false;
            }
            if(min>blue1.getNoOfHouses()){
                min=blue1.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare blue1 : blue)
        {
            if(blue1.getNoOfHouses()==min && min <5)
                blue1.setCanBuild(true);
        }
        
    }

    private void canBuildViolet() {
      boolean samOwner = true;
        int min = violet[0].getNoOfHouses();
        for (LandSquare land : violet) {
            if (violet[0].getOwner() != land .getOwner()) {
                samOwner = false;
            }
            if(min>land.getNoOfHouses()){
                min=land.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare land : violet)
        {
            if(land.getNoOfHouses()==min&& min<5)
                land.setCanBuild(true);
        }
    }

    private void canBuildOrange() {
        boolean samOwner = true;
        int min = orange[0].getNoOfHouses();
        for (LandSquare land : orange) {
            if (orange[0].getOwner() != land .getOwner()) {
                samOwner = false;
            }
            if(min>land.getNoOfHouses()){
                min=land.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare land : orange)
        {
            if(land.getNoOfHouses()==min && min<5)
                land.setCanBuild(true);
        }
    }

    private void canBuildRed() {
          boolean samOwner = true;
        int min = red[0].getNoOfHouses();
        for (LandSquare land : red) {
            if (red[0].getOwner() != land .getOwner()) {
                samOwner = false;
            }
            if(min>land.getNoOfHouses()){
                min=land.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare land : red)
        {
            if(land.getNoOfHouses()==min && min<5)
                land.setCanBuild(true);
        }
    }

    private void canBuildYellow() {
            boolean samOwner = true;
        int min = yellow[0].getNoOfHouses();
        for (LandSquare land : yellow) {
            if (yellow[0].getOwner() != land .getOwner()) {
                samOwner = false;
            }
            if(min>land.getNoOfHouses()){
                min=land.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare land : yellow)
        {
            if(land.getNoOfHouses()==min && min<5)
                land.setCanBuild(true);
        }
    }

    private void canBuildGreen() {
           boolean samOwner = true;
        int min = green[0].getNoOfHouses();
        for (LandSquare land : green) {
            if (green[0].getOwner() != land .getOwner()) {
                samOwner = false;
            }
            if(min>land.getNoOfHouses()){
                min=land.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare land : green)
        {
            if(land.getNoOfHouses()==min && min<5)
                land.setCanBuild(true);
        }
    }

    private void canBuildDarkBlue() {
            boolean samOwner = true;
        int min = darkBlue[0].getNoOfHouses();
        for (LandSquare land : darkBlue) {
            if (darkBlue[0].getOwner() != land .getOwner()) {
                samOwner = false;
            }
            if(min>land.getNoOfHouses()){
                min=land.getNoOfHouses();
            }
        }
        if(samOwner)
        for (LandSquare land : darkBlue)
        {
            if(land.getNoOfHouses()==min && min<5)
                land.setCanBuild(true);
        }
    }

}
