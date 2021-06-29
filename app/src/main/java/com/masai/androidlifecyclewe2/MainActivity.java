package com.masai.androidlifecyclewe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtnLaunchFirstButton;
    private Button mBtnLaunchSecondButton;
    private Button mBtnLaunchThirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnLaunchFirstButton = findViewById(R.id.mBtnLaunchFirstButton);
        mBtnLaunchFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button one clicked", Toast.LENGTH_SHORT).show();
            }

        });

        mBtnLaunchSecondButton = findViewById(R.id.mBtnLaunchSecondButton);
        mBtnLaunchSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button two clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnLaunchThirdButton = findViewById(R.id.mBtnLaunchThirdButton);
        mBtnLaunchThirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button third clicked", Toast.LENGTH_SHORT).show();
            }
        });

        Log.d("ajc","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ajc","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ajc","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ajc","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ajc","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ajc","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ajc","onRestart");
    }
}