package com.hive.gamestatehive;

import android.view.View;

import java.util.ArrayList;

public class GameState implements View.OnClickListener {
    int activePlayer; //1 for White player, 2 for Black Player
    boolean[] isBeePlaced = new boolean[2];//move new to constructor
    int turnNumber;
    ArrayList<Hex> WhitesHand;
    ArrayList<Hex> BlacksHand;
    ArrayList<ArrayList<HexSpace>> Board;

    public GameState(){
        activePlayer = 1;
        isBeePlaced[0]=false;
        isBeePlaced[1]=false;
        turnNumber=1;
        WhitesHand = new ArrayList<>();
        BlacksHand = new ArrayList<>();
        Board = new ArrayList<>();
    }


    @Override
    public void onClick(View v) {

    }
    //deep copy constructor
    public GameState(GameState orig){
        this.activePlayer = orig.activePlayer;
        this.isBeePlaced[0] = orig.isBeePlaced[0];
        this.isBeePlaced[1] = orig.isBeePlaced[1];
        this.turnNumber = orig.turnNumber;
        this.WhitesHand = orig.WhitesHand;
        this.BlacksHand = orig.BlacksHand;
        this.Board = orig.Board;
    }



}
