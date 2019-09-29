package com.example.nipun.opdemy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread th = new Thread()
        {
            @Override
            public void run() {
                try{

                    sleep(3000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();

                }
                finally
                {
                    Intent var = new Intent(MainActivity.this, Login.class);
                    startActivity(var);
                }
            }
        };
        th.start();

    }
}
