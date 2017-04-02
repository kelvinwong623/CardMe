package lahacks2017.cardme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

    public void sendCard(View view){
        //response to button
        Intent intent = new Intent(this, SentConfirmation.class); // FIXME: Should land on SendCard.class
        startActivity(intent);
    }

    public void connections(View view){
        //response to button
        Intent intent = new Intent(this, Connections.class);
        startActivity(intent);
    }

    public void editCards(View view){
        //response to button
        Intent intent = new Intent(this, EditCards.class);
        startActivity(intent);
    }

    public void receiveCard(View view){
        //response to button
        Intent intent = new Intent(this, ReceiveCard.class);
        startActivity(intent);
    }
}
