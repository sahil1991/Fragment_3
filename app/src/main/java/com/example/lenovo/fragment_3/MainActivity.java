package com.example.lenovo.fragment_3;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
String s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void frag(View view)
    {
        switch (view.getId()) {
            case R.id.first:
                Fragment2 fr;


                fr = new Fragment2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                s1="Layout 1";
                Bundle bundle=new Bundle();
                bundle.putString("key2",s1);
                fr.setArguments(bundle);
                ft.replace(R.id.frag_container,fr);

                ft.commit();
                break;
            case R.id.second:
                Fragment3 fr2;


                fr2 = new Fragment3();
                FragmentManager fm2 = getFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();
                s2="Layout 2";
                Bundle bundle2=new Bundle();
                bundle2.putString("key3",s2);
                fr2.setArguments(bundle2);
                ft2.replace(R.id.frag_container,fr2);

                ft2.commit();
                break;
            case R.id.third:
                Fragment4 fr3;


                fr3 = new Fragment4();
                FragmentManager fm3 = getFragmentManager();
                FragmentTransaction ft3 = fm3.beginTransaction();
                s3="Layout 3";
                Bundle bundle3=new Bundle();
                bundle3.putString("key4",s3);
                fr3.setArguments(bundle3);
                ft3.replace(R.id.frag_container,fr3);

                ft3.commit();
                break;
            case R.id.fourth:
                Fragment5 fr4;


                fr4 = new Fragment5();
                FragmentManager fm4 = getFragmentManager();
                FragmentTransaction ft4 = fm4.beginTransaction();
                s4="Layout 4";
                Bundle bundle4=new Bundle();
                bundle4.putString("key5",s4);
                fr4.setArguments(bundle4);
                ft4.replace(R.id.frag_container,fr4);

                ft4.commit();
                break;
        }


    }

}
