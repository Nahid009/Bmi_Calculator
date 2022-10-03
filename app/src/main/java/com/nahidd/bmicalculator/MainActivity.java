package com.nahidd.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weightEditText, feetEditTExt, inchEditText;
    Button bmiButton;
    TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = findViewById(R.id.weightEditText);
        feetEditTExt = findViewById(R.id.feetEditTExt);
        inchEditText = findViewById(R.id.inchEditText);
        bmiButton = findViewById(R.id.bmiButton);
        resultTextView = findViewById(R.id.resultTextView);

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sWeight = weightEditText.getText().toString();
                String sFeet = feetEditTExt.getText().toString();
                String sInch = inchEditText.getText().toString();

                float weight = Float.parseFloat(sWeight);
                float feet = Float.parseFloat(sFeet);
                float inch = Float.parseFloat(sInch);

                float height = (float) (feet * 0.3048 + inch * 0.0254);
                float bmiIndex = weight / (height * height);


                resultTextView.setText("Your BMI Index Is: " + bmiIndex);


            }
        });
    }
}