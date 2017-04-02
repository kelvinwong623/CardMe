package lahacks2017.cardme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
=======

>>>>>>> refs/remotes/origin/localFiles

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);
    }

<<<<<<< HEAD
    public void sendCard(View view){
        //response to button
        Intent intent = new Intent(this, SendCard.class);
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
=======

>>>>>>> refs/remotes/origin/localFiles
    }
}
