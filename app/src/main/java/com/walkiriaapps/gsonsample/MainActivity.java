package com.walkiriaapps.gsonsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private ArrayList<Cat> cats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        ArrayList<String> vaccinations = new ArrayList<String>();
        vaccinations.add("Rabies");
        vaccinations.add("Feline calicivirus");
        vaccinations.add("Panleukopenia");

        final Cat bartok = new Cat("Bartók", "white", "Snowshoe", vaccinations, 38);
        final Cat calcetines = new Cat("Calcetines", "black", "European", vaccinations, 78);
        cats = new ArrayList<Cat>();
        cats.add(bartok);
        cats.add(calcetines);
        textView.setText(bartok.toString());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                Gson gson = new Gson();
                b.putString("cat", gson.toJson(bartok));
                b.putString("cats", gson.toJson(cats));
                Intent i = new Intent(MainActivity.this, SecondaryActivity.class);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}