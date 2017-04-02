package lahacks2017.cardme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class EditCards extends AppCompatActivity {

    ListView cl;

    ArrayAdapter<String> adapter;

    ArrayList<String> myCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_cards);

        myCards = new ArrayList<String>();
        for(int i = 0; i < CardMeInfo.myContacts.size(); i++){
            myCards.add( "\n" + CardMeInfo.myContacts.get(i).getName()+
            "\n" + CardMeInfo.myContacts.get(i).getPhoneNumber() +
            "\n" + CardMeInfo.myContacts.get(i).getEmail() + "\n");
            Log.d("Name", myCards.get(i));
        }



        cl = (ListView) findViewById(R.id.cardList);
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, myCards );


        adapter.notifyDataSetChanged();
        cl.setAdapter(adapter);

        Log.d("Size", CardMeInfo.myContacts.size() + "");
    }



    public void fillOutCard(View view){
        //response to button
        Intent intent = new Intent(this, FillCardActivity.class);
        startActivity(intent);
    }
}
