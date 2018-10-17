package com.example.elihsm.memorytest;

import android.app.FragmentTransaction;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewA=findViewById(R.id.play_title);
        imageViewA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.support.v4.app.FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                FragmentPlay fragA = new FragmentPlay();
                transaction.add(R.id.fragmentContainer_main,fragA );
                transaction.addToBackStack(null);
                transaction.commit();




            }

        });


//        // add Fragment A to the main linear layout
//        android.support.v4.app.FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
//        FragmentPlay fragA = new FragmentPlay();
//        transaction.add(R.id.fragmentContainer_main,fragA );
//        transaction.addToBackStack(null);
//        transaction.commit();

    }

}

