package com.example.zz3430gs.blackjack;

public class Rules{



    public boolean overTwentyOne(Card cardA, Card cardB){

        if (cardA.value + cardB.value > 21){
            return true;
        }
        else return false;
    }
    public boolean equalsTwentyOne(Card cardA, Card cardB){
        if (cardA.value + cardB.value == 21){
            return true;
        }
        else return false;
    }


}
