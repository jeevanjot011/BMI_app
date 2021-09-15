package com.example.bmi_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText height;
    EditText weight;
    ImageButton Btn;
    TextView resulttext;
    String calculation,BMIresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight=findViewById(R.id.fill1);
        height=findViewById(R.id.fill2);
        Btn=findViewById(R.id.calculate_button);
        resulttext=findViewById(R.id.results);
    }



    public void calculateBMI(View view) {
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();



        float weightValue = Float.parseFloat(S1);
        float heightValue = Float.parseFloat(S2) / 100;



        float bmi = weightValue / (heightValue * heightValue);



        if(bmi < 16){
            BMIresult = "Severely Under Weight";
        }else if(bmi < 18.5){
            BMIresult = "Under Weight";
        }else if(bmi >= 18.5 && bmi <= 24.9){
            BMIresult = "Normal Weight";
        }else if (bmi >= 25 && bmi <= 29.9){
            BMIresult = "Overweight";
        }else{
            BMIresult = "Obese";
        }



        calculation = "Result : " + bmi + " : " + BMIresult;



        resulttext.setText(calculation);
    }

}