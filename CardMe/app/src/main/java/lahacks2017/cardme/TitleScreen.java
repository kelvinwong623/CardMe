package lahacks2017.cardme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ravi", "9100000000", "ravi@gmail"));
        db.addContact(new Contact("Srinivas", "9199999999", "sri@ucla"));
        db.addContact(new Contact("Tommy", "9522222222", "tommy@trojan"));
        db.addContact(new Contact("Karthik", "9533333333", "karth@gmail"));
        db.addContact(new Contact("ayyylmaooo", "911", "ayyy@lmao"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: " + cn.getID() + " ,Name: " + cn.getName()
                    + " ,Phone: " + cn.getPhoneNumber() + " ,email: " + cn.getEmail();
            // Writing Contacts to log
            Log.d("Name: ", log);
            //db.deleteContact(cn);
        }
    }
}
