package ru.evant.learntestgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnBegin;
    TextView tvBegin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        btnBegin = (Button) findViewById(R.id.btnBegin);
        tvBegin = (TextView) findViewById(R.id.tvBegin);
    }

    public void onClick(View view) {
        tvBegin.setText(" It`s Begin!");
    }
}