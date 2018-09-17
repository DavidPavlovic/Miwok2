package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView family = (TextView)findViewById(R.id.family);
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView phrases = (TextView)findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                Toast.makeText(view.getContext(), "Opening Numbers List...", Toast.LENGTH_SHORT).show();
                startActivity(numbersIntent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyList = new Intent(MainActivity.this, FamilyActivity.class);
                Toast.makeText(view.getContext(), "Opening Family List...", Toast.LENGTH_SHORT).show();
                startActivity(familyList);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsList = new Intent(MainActivity.this, ColorsActivity.class);
                Toast.makeText(view.getContext(), "Opening Colors List...", Toast.LENGTH_SHORT).show();
                startActivity(colorsList);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesList = new Intent(MainActivity.this, PhrasesActivity.class);
                Toast.makeText(view.getContext(), "Opening Phrases List...", Toast.LENGTH_SHORT).show();
                startActivity(phrasesList);
            }
        });
    }
}
