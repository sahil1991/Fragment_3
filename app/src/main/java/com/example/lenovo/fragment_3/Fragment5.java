package com.example.lenovo.fragment_3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.Fragment;


public class Fragment5 extends Fragment {
   TextView t1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment5, container, false);
        t1=(TextView)view.findViewById(R.id.text5);
        String s1=getArguments().getString("key5");
        t1.setText(s1);
        // Inflate the layout for this fragment
        return view;
        // Inflate the layout for this fragment

    }


}
