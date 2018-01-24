package com.droidmarvin.spitfire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class SpitFire extends AppCompatActivity {

    private Button mSpit, mFire;

    private FirebaseAuth mAuth;
    private DatabaseReference mSpace;

    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Arkhip_font.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());

        setContentView(R.layout.activity_spit_fire);

        mSpit = (Button) findViewById(R.id.btnSpit);
        mFire = (Button) findViewById(R.id.btnFire);

        mAuth = FirebaseAuth.getInstance();

        userId = mAuth.getCurrentUser().getUid();

    }
}
