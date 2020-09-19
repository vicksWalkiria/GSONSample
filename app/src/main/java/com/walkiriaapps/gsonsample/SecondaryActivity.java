package com.walkiriaapps.gsonsample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    ArrayList<Cat> cats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setVisibility(View.GONE);
        textView = findViewById(R.id.textView);

        String cat = getIntent().getExtras().getString("cat");
        String catsArray = getIntent().getExtras().getString("cats");
        Gson gson = new Gson();
        Cat misteryCat = gson.fromJson(cat, Cat.class);

        textView.setText(misteryCat.toString());

        cats = gson.fromJson(catsArray, new TypeToken<List<Cat>>() {
        }.getType());

        for (int i = 0; i < cats.size(); i++) {
            Log.d("WALKIRIASAMPLE", cats.get(i).toString());
        }


    }
}