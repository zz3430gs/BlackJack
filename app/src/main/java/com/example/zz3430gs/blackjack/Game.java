package com.example.zz3430gs.blackjack;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Joe on 12/26/2016.
 */

public class Game implements Parcelable {

    public String player1key;
    public String player2key;
    public ArrayList player1hand;
    public ArrayList player2hand;
    public int player1score;
    public int player2score;

    Game() {}


    public Game(String player1key, String player2key, ArrayList player1hand, ArrayList player2hand, int player1score, int player2score){
        this.player1key = player1key;
        this.player2key = player2key;
        this.player1hand = player1hand;
        this.player2hand =  player2hand;
        this.player1score = player1score;
        this.player2score = player2score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "player1key='" + player1key + '\'' +
                ", player2key='" + player2key + '\'' +
                ", player1score=" + player1score +
                ", player2score=" + player2score +
                '}';
    }

    //Parcelable
    protected Game(Parcel in) {
        player1key = in.readString();
        player2key = in.readString();
        player1score = in.readInt();
        player2score = in.readInt();
    }

    public static final Creator<Game> CREATOR = new Creator<Game>(){
        @Override
        public Game createFromParcel(Parcel in){
            return new Game(in);
        }
        @Override
        public Game[] newArray(int size){
            return new Game[size];
        }
    };

    @Override
    public int describeContents(){
        return 0;
    }
    @Override
    public void writeToParcel(Parcel parcel, int i){
        parcel.writeString(player1key);
        parcel.writeString(player2key);
        parcel.writeList(player1hand);
        parcel.writeList(player2hand);
        parcel.writeInt(player1score);
        parcel.writeInt(player2score);
    }






}
