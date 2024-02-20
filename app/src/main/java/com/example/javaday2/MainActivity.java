package com.example.javaday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView myTitle;
    TextView myName;
    EditText myInputName;
    TextView myDisplay;
    Button myClick;
    Button myErase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myTitle = (TextView) findViewById(R.id.txtTitle);
        myName = (TextView) findViewById(R.id.txtInput);
        myDisplay = (TextView) findViewById(R.id.txtHelloWord);
        myClick = (Button) findViewById(R.id.btnMain);
        myErase = (Button) findViewById(R.id.btnErase);
        myInputName = findViewById(R.id.txtIbutang);

        //myDisplay.setText("Hello Mika");

        myClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        String name = myInputName.getText().toString();

                myDisplay.setText("Panigt "+name+"!");
            }
        });

        myErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDisplay.setText("HELLO NA PUD");
            }
        });




    }
}