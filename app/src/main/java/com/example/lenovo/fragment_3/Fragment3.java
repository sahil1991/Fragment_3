package com.example.lenovo.fragment_3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment3 extends Fragment {

TextView t1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment3, container, false);
        t1=(TextView)view.findViewById(R.id.text3);
        String s1=getArguments().getString("key3");
        t1.setText(s1);
        // Inflate the layout for this fragment
        return view;
        // Inflate the layout for this fragment

    }

    }
