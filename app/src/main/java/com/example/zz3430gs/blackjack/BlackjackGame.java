package com.example.zz3430gs.blackjack;


public class BlackjackGame {
    Player[] Players;
    int currentTurnIndex =0;
    int maxTurns =
    BlackjackGame(Player[] Players){
        this.Players = Players;


    }

public int newTurn(){
        try {
            this.currentTurnIndex = this.currentTurnIndex + 1;
            return this.currentTurnIndex;
        } catch (NullPointerException)

}
public void Turn(Player currentPlayer){

}
}
