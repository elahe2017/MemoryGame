package com.example.elihsm.memorytest;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.elihsm.memorytest.R;

public class FragmentPlay extends Fragment {



    public View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_play,container,false);
        this.rootView=rootView;
        return rootView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView animalTheme=view.findViewById(R.id.theme_animals);
        animalTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragB();
            }
        });
    }

    public void addFragB(){
        FragmentAnimal fragmentAnimal=new FragmentAnimal();
        FragmentTransaction childFragTrans = getFragmentManager().beginTransaction();
        childFragTrans.replace(R.id.fragmentContainer_main, fragmentAnimal);
        childFragTrans.addToBackStack(null);
        childFragTrans.commit();

    }

}
