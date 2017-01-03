package com.example.hoaithuong.busesincity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        Thread bamgio = new Thread() {
            public void run() {
                try {
                    sleep(2500);
                } catch (Exception e) {

                } finally {
                    Intent activitymoi = new Intent(FullscreenActivity.this, MainActivity.class);
                    startActivity(activitymoi);
                }
            }
        };
        bamgio.start();
    }
        protected void onPause()
        {
            super.onPause();
            finish();
        }
    }



