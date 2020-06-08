package com.example.lifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);


        button.setOnClickListener(myListener);
        button2.setOnClickListener(myListener);
        button3.setOnClickListener(myListener);

        Toast.makeText(getApplicationContext(), "oncreat(1)", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "oncreat(1)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "oncreat(1)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "oncreat(1)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "oncreat(1)", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "oncreat(1)", Toast.LENGTH_LONG).show();
    }

    protected void onDestory() {
        super.onDestroy();
        Toast.makeText(this, "oncreat(1)", Toast.LENGTH_LONG).show();
    }

    private Button.OnClickListener myListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.button:
                    Uri uri = Uri.parse("tel:09881234566");
                    Intent intent = new Intent(Intent.ACTION_DIAL, uri);
                    startActivity(intent);
                    break;
                case R.id.button2:
                    Intent intent1 = new Intent(MainActivity.this, secondactivity.class);
                    startActivity(intent1);
                    break;
                case R.id.button3:
                    finish();
                    break;


            }
        }
    }
}



