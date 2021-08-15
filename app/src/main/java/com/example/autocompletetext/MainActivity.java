package com.example.autocompletetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView a;
String[] country={"India","us","uk","china","australia","japan","saudi arab","pakistan","canada","france","russia","sri lanka",
"bangladesh","africa","nepal","italy","spain","ireland","vietnaam","hungry","greece",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> aa=new ArrayAdapter<>(this,android.R.layout.select_dialog_item,country);
        a.setThreshold(1);
        a.setAdapter(aa);
    }
}