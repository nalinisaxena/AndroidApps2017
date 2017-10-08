package com.example.sumit.fragmentdemo2;

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

public class FirstFragment extends Fragment {

    private EditText ename,eemail,ephone;
    private Button btnSubmit;
    private String name,email,phone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.first,container,false);


        ename=(EditText)rootView.findViewById(R.id.editText);
        eemail=(EditText)rootView.findViewById(R.id.editText2);
        ephone=(EditText)rootView.findViewById(R.id.editText3);

        btnSubmit=(Button)rootView.findViewById(R.id.button);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle=new Bundle();

                name=ename.getText().toString();
                email=eemail.getText().toString();
                phone=ephone.getText().toString();


                bundle.putString("name",name);
                bundle.putString("email",email);
                bundle.putString("phone",phone);

                SecondFragment secondFragment=new SecondFragment();

                secondFragment.setArguments(bundle);

                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,secondFragment);
                fragmentTransaction.commit();
            }
        });



        return rootView;
    }
}
