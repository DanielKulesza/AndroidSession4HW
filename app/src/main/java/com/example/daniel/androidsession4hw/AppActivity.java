package com.example.daniel.androidsession4hw;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.daniel.androidsession4hw.ui.FragmentA;
import com.example.daniel.androidsession4hw.ui.FragmentB;


public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);

        if(savedInstanceState == null){
            findViewById(R.id.addfragmentAbutton).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.appactivity, new FragmentA(), FragmentA.NAME)
                            .commit();
                }
            });

            findViewById(R.id.removefragmentAbutton).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment fragment = getSupportFragmentManager().findFragmentByTag(FragmentA.NAME);
                    if(fragment !=  null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(fragment)
                                .commit();
                    }
                }
            });

            findViewById(R.id.addfragmentBbutton).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.appactivity, new FragmentB(), FragmentB.NAME)
                            .commit();
                }
            });

            findViewById(R.id.removefragmentBbutton).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment fragment = getSupportFragmentManager().findFragmentByTag(FragmentB.NAME);
                    if(fragment != null) {
                        getSupportFragmentManager().beginTransaction()
                                .remove(fragment)
                                .commit();
                    }

                }
            });
        }

    }
}
