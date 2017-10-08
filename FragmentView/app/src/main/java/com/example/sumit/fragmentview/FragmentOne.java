package com.example.sumit.fragmentview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sumit on 8/10/17.
 */

public class FragmentOne extends Fragment {

    private EditText etxMsg;
    private Button send;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_one,container,false);
        etxMsg=(EditText)rootView.findViewById(R.id.editText);
        send=(Button)rootView.findViewById(R.id.button);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg=etxMsg.getText().toString();

                Bundle bundle=new Bundle();
                bundle.putString("msg",msg);

                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                FragmentSec fragmentSec=new FragmentSec();
                fragmentSec.setArguments(bundle);
                fragmentTransaction.replace(R.id.container,fragmentSec);
                fragmentTransaction.commit();



            }
        });

        return rootView;
    }

}
