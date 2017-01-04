package com.example.zz3430gs.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private Card[] cards;
    int i;

    Deck(){
        i = 51;
        cards = new Card[52];
        int x =0;
        for (int a=0; a<=3; a++){
            for (int b =0; b<=12; b++){
                cards[x] = new Card(a,b);
                x++;
            }
        }
    }
    public Card drawFromDeck(){
        Random generator = new Random();
        int index = 0;
        do {
            index = generator.nextInt(52);
        }
        while (cards[index] == null);

        i--;
        Card temp = cards[index];
        cards[index]= null;
        return temp;
    }

}
