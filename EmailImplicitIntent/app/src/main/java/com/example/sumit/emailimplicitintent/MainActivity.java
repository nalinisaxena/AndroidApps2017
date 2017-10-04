package com.example.sumit.emailimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
    }

    public void btnOnclick(View v)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("email"));
        String[] s={"nalini@gmail.com","nalini13@gmail.com"};
        intent.putExtra(Intent.EXTRA_EMAIL,s);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Subject");
        intent.putExtra(Intent.EXTRA_TEXT,"Compose email");
        intent.setType("message/rfc822");
        Intent chooser=Intent.createChooser(intent,"Launch Email");
        startActivity(chooser);
    }
}
