package lahacks2017.cardme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class FillCardActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE_NAME = "extra_msg_name";
    public static final String EXTRA_MESSAGE_EMAIL = "extra_msg_email";
    public static final String EXTRA_MESSAGE_PHONE = "extra_msg_phone";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_card);
    }
    public void saveCard(View view) {
        // When the user presses done


        Intent intent = new Intent(this, EditCards.class);
        EditText nameField = (EditText) findViewById(R.id.editName);
        EditText emailField = (EditText) findViewById(R.id.editEmail);
        EditText phoneField = (EditText) findViewById(R.id.editPhone);
        String message_name = nameField.getText().toString();
        String message_email = emailField.getText().toString();
        String message_phone = phoneField.getText().toString();
        Contact c = new Contact(message_name, message_phone, message_email);
        CardMeInfo.myContacts.add(c);
        CardMeInfo.myDb.addContact(c);
        intent.putExtra(EXTRA_MESSAGE_NAME, message_name);
        intent.putExtra(EXTRA_MESSAGE_EMAIL, message_email);
        intent.putExtra(EXTRA_MESSAGE_PHONE, message_phone);
        startActivity(intent);
        Log.d("done: ", "name: " + message_name + ", email: " + message_email + ", phone: " + message_phone );
        // This will prepare the user input for the backend
        // The information will be handled in the next activity
    }
}
