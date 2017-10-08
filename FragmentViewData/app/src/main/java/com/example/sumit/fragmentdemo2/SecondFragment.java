package com.example.sumit.fragmentdemo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sumit on 6/10/17.
 */

public class SecondFragment extends Fragment {

    private TextView name,email,phone;
    String sname,semail,sphone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.second,container,false);

        name=(TextView)rootView.findViewById(R.id.textView);
        email=(TextView)rootView.findViewById(R.id.textView2);
        phone=(TextView)rootView.findViewById(R.id.textView3);

        Bundle bundle=getArguments();

        sname=bundle.getString("name");
        semail=bundle.getString("email");
        sphone=bundle.getString("phone");


        name.setText(sname);
        email.setText(semail);
        phone.setText(sphone);
        return rootView;
    }
}
