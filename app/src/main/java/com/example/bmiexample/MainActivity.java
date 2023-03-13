package com.example.bmiexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editFT,editIN,editKG;
TextView textResult;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      textResult = findViewById(R.id.textResult);

      editFT = findViewById(R.id.editFT);
      editIN = findViewById(R.id.editIN);

      editKG = findViewById(R.id.editKG);

      btnSubmit = findViewById(R.id.btnSubmit);

      btnSubmit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              int ft =  Integer.parseInt(editFT.getText().toString());
              int in = Integer.parseInt(editIN.getText().toString());
              int weight = Integer.parseInt(editKG.getText().toString());

              int totalIN = ft * 12 + in;

              double totalCM = totalIN*2.53;
              double totalM = totalCM/100;

              double BMI = weight/(totalM * totalM);

              if(BMI > 25) {
                  textResult.setText("You're Over Weight");
              } else if(BMI < 18.5) {
                  textResult.setText("You're Under Weight");
              } else {
                  textResult.setText("you're Healthy");
              }
          }
      });
    }
}