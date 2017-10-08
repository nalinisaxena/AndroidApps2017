package com.example.sumit.fragmentview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sumit on 8/10/17.
 */

public class FragmentSec extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View rootView=inflater.inflate(R.layout.fragment_sec,container,false);

        Bundle bundle=getArguments();

        String strMsg=bundle.getString("msg");

        TextView txtMSg=(TextView)rootView.findViewById(R.id.textView);

        txtMSg.setText(strMsg);



        return rootView;
    }
}
