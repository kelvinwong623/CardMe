package lahacks2017.cardme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditCards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_cards);
    }

    public void fillOutCard(View view){
        //response to button
        Intent intent = new Intent(this, FillCardActivity.class);
        startActivity(intent);
    }
}
