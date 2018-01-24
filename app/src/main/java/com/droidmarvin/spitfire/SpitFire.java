package com.droidmarvin.spitfire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class SpitFire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Arkhip_font.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

        setContentView(R.layout.activity_spit_fire);
    }
}
