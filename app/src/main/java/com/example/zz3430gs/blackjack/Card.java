package com.example.zz3430gs.blackjack;

/**
 * Created by xf0484rc on 11/15/16.
 */
public class Card {
    String[] suits = {"Diamonds","Clubs","Spade", "Hearts"};
    String[] faces = {"King", "Queen", "Ace", "Jack"};
    Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    String suit;
    String face;
    Integer value;
    String cat ="Cat";
    String anotherCat ="A";
    public Card(String suit, String face, Integer value){
        this.suit = suit;
        this.face = face;
        this.value =value;

}}
