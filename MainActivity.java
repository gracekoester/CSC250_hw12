package com.example.gmk19.classexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        TextView inputET = (TextView)this.findViewById(R.id.inputET);



        //MVC - linking interface widget to local variable

    }


    public static String reverse(String s)
    {
        String answer = "";
        for(int i = s.length()-1; i >= 0; i--)
        {
            answer = answer + s.charAt(i);
        }
        return answer;
    }


    public void onChangeButtonPressed(View v)
    {
        //v will be the widget that calls this function upon being clicked

        EditText inputET = (EditText)this.findViewById(R.id.inputET);
        EditText inputET2 = (EditText)this.findViewById(R.id.inputET2);
        TextView myLabel = (TextView)this.findViewById(R.id.myLabel);
        myLabel.setText(reverse(inputET.getText().toString())+ reverse(inputET2.getText().toString()));
    }


}
