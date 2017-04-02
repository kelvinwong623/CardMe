package lahacks2017.cardme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ReceiveCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_card);
    }

    public void makeVisible(View view){
        //response to button
        Intent intent = new Intent(this, ReceivedConfirmation.class); // FIXME: landing page is "Visible.class"
        //do bluetooth stuff
        startActivity(intent);
        //Log.d("test","hey");
    }
}
