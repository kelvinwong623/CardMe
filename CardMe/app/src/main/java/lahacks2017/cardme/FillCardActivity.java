package lahacks2017.cardme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        Intent intent = new Intent(this, FillCardActivity.class);
        EditText nameField = (EditText) findViewById(R.id.editName);
        EditText emailField = (EditText) findViewById(R.id.editEmail);
        EditText phoneField = (EditText) findViewById(R.id.editPhone);
        String message_name = nameField.getText().toString();
        String message_email = emailField.getText().toString();
        String message_phone = phoneField.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_NAME, message_name);
        intent.putExtra(EXTRA_MESSAGE_EMAIL, message_email);
        intent.putExtra(EXTRA_MESSAGE_PHONE, message_phone);
        startActivity(intent);
        // This will prepare the user input for the backend
        // The information will be handled in the next activity
    }
}
