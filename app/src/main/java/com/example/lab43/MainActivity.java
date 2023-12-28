package com.example.lab43;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact=findViewById(R.id.lv);
        ArrayList<Contact>arrContact = new ArrayList<>();
        Contact contact1 = new Contact("Nguyen Van A ","0123465758","RED");
        Contact contact2 = new Contact("Nguyen Van B ","0987806055","RED");
        Contact contact3 = new Contact("Nguyen Van C ","0823465758","RED");
        Contact contact4 = new Contact("Nguyen Van D ","0687806055","RED");
        Contact contact5 = new Contact("Nguyen Van E ","0523465758","RED");
        Contact contact6 = new Contact("Nguyen Van F ","0487806055","RED");



        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);
        arrContact.add(contact4);
        arrContact.add(contact5);
        arrContact.add(contact6);
        CustomAdapter adapter=new CustomAdapter(this,R.layout.item_listview,arrContact);
        lvContact.setAdapter(adapter);

    }
}