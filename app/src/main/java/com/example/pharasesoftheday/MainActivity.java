package com.example.pharasesoftheday;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateNewSentence(View view) {
        String[] sentences = {
                "Sentnce 1",
                "Sentnce 2",
                "Sentnce 3",
                "Sentnce 4"
        };
        TextView textView = findViewById(R.id.textResult);

        int number = new Random().nextInt(4);
        textView.setText(sentences[number]);

    }
}