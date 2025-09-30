package com.hive.gamestatehive;

import java.util.ArrayList;

public class GameState {
    int activePlayer; //1 for White player, 2 for Black Player
    boolean[] isBeePlaced = new boolean[2];//move new to constructor
    int turnNumber;
    ArrayList<Hex> WhitesHand;
    ArrayList<Hex> BlacksHand;
    ArrayList<ArrayList<HexSpace>> Board;
}
