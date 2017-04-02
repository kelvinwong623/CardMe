package lahacks2017.cardme;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Saboodi on 4/1/2017.
 */

public class CardMeInfo {

    public static ArrayList<Contact> myContacts;
    public static ArrayList<Contact> recContacts;
    public static DatabaseHandler myDb;
    public static DatabaseHandler recDb;

    public CardMeInfo(Context c){

        myDb = new DatabaseHandler(c, "myContacts");
        recDb = new DatabaseHandler(c, "recContacts");


        if(!myDb.getAllContacts().isEmpty())
            myContacts = (ArrayList<Contact>) myDb.getAllContacts();
        else
            myContacts = new ArrayList<Contact>();

        if(!recDb.getAllContacts().isEmpty())
            recContacts = (ArrayList<Contact>) recDb.getAllContacts();
        else
            recContacts = new ArrayList<Contact>();

        Log.d("dbSize", myDb.getAllContacts().size() + "");
        Log.d("mySize", myContacts.size() + "");
        //Log.d("dbSize", myDb.getAllContacts().size() + "");
    }
}
