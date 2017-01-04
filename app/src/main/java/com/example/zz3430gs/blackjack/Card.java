package com.example.zz3430gs.blackjack;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * Created by xf0484rc on 11/15/16.
 */
public class Card {
    private int rank, suit;

    private static String[] suits = {"hearts", "spades", "diamonds", "clubs"};
    private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }
    @Override
    public String toString(){
        return ranks[rank] + " of " + suits[suit];
    }

    public int getRank(){
        return rank;
    }
    public int getSuit(){
        return suit;
    }
}
