package com.example.nitin.block;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double d1 = Double.parseDouble(e1.getText().toString());
                    d1 = d1 * 0.621371;
                    String s = String.valueOf(d1);
                    t3.setText(s);
                    e1.setText("");
                }catch (InputMismatchException e)
                {
                    t3.setText(e.toString());
                }



            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double d1 = Double.parseDouble(e2.getText().toString());
                    d1 = d1 / 0.621371;
                    String s = String.valueOf(d1);
                    t3.setText(s);
                    e2.setText("");
                }catch (InputMismatchException e)
                {
                    t3.setText(e.toString());
                }

            }
        });
    }
}
