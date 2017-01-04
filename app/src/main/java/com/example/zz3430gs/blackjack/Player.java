package com.example.zz3430gs.blackjack;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Joe on 1/3/2017.
 */

public class Player implements Parcelable{
    public boolean available;
    public ArrayList<String>hand; //the cards that are in the hands
//
//    @Exclude
    String state;

    Player() {}

    public Player(boolean avail, ArrayList<String> hand){
        this.available = avail;
        this.hand = hand;
    }

    @Override
    public String toString(){
        return "Player{" +
                "available=" + available +
                ", has " + hand + '\'' +
                '}';
    }

    Player(Parcel in){
        available = in.readByte() != 0;
        hand = new ArrayList<>();
        in.readList(hand, String.class.getClassLoader());
        state = in.readString();
    }


    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (available ? 1 : 0));
        parcel.writeList(hand);
        parcel.writeString(state);
    }
}
