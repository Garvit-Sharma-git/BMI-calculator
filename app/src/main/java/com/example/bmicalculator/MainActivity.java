package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView intro,enterWt,enterHt,result;
        EditText edtWt,edtHtFt,edtHtIn;
        Button calculate;
        LinearLayout llcolor;

        intro=findViewById(R.id.intro);
        enterWt=findViewById(R.id.enterWt);
        enterHt=findViewById(R.id.enterHt);
        result=findViewById(R.id.result);
        edtWt=findViewById(R.id.edtWt);
        edtHtFt=findViewById(R.id.edtHtFt);
        edtHtIn=findViewById(R.id.edtHtIn);
        calculate=findViewById(R.id.calculate);
        llcolor=findViewById(R.id.llcolor);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int wt= Integer.parseInt(edtWt.getText().toString());
               int ft=Integer.parseInt(edtHtFt.getText().toString());
               int In=Integer.parseInt(edtHtIn.getText().toString());

               int hin=ft*12+In;
               double hcm=hin*2.35;
               double hm=hcm/100;

               double bmi=wt/(hm*hm);
               if(bmi>25){
                   result.setText("over weight");
                   llcolor.setBackgroundColor(getResources().getColor(R.color.ow));
               }
               else if(bmi<18){
                   result.setText("under weight");
                   llcolor.setBackgroundColor(getResources().getColor(R.color.uw));
               }
               else{
                   result.setText("healthy");
                   llcolor.setBackgroundColor(getResources().getColor(R.color.h));
               }

            }
        });
    }
}