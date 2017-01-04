package com.example.zz3430gs.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Referenced some code from Clara's RockPaperScissors example

    private static final String TAG = "MAIN ACTIVITY";

    //Firebase key constants
    private static final String PLAYERS = "players";
    private static final String GAMES = "games";

    //saved instance state bungdle keys
    private static final String PLAYER_INSTANCE_STATE_KEY = "player_bundle_key";
    private static final String OPPONENT_INSTANCE_STATE_KEY = "opponent_bundle_key";
    private static final String GAME_INSTANCE_STATE_KEY = "game_bundle_key";

    private Player player;
    private Player opponent;
    private Game game;
    private Deck deck;
    private Card card;

    ImageView cardImage1;
    ImageView cardImage2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Deck deck = new Deck();
//        Card C;
//
//        C = deck.drawFromDeck();
//        C.toString();
        if (savedInstanceState != null) {

            Log.d(TAG, "restoring from instance state");

            player = savedInstanceState.getParcelable(PLAYER_INSTANCE_STATE_KEY);
            opponent = savedInstanceState.getParcelable(OPPONENT_INSTANCE_STATE_KEY);
            game = savedInstanceState.getParcelable(GAME_INSTANCE_STATE_KEY);

        } else {
            //No instance state, first time game is launched. Make new player.
            player = new Player(true, null);  //available, no cards
        }

        cardImage1 = (ImageView)findViewById(R.id.card1);
        cardImage2 = (ImageView)findViewById(R.id.card2);




    }
}
