package com.tutorials180.mathfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numberOneET,numberTwoET;
    TextView resultTV;

    int numberOne,numberTwo,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectJavaVariablesToXML();
    }

    private void connectJavaVariablesToXML()
    {
        numberOneET=findViewById(R.id.numberOneET);
        numberTwoET=findViewById(R.id.numberTwoET);

        resultTV=findViewById(R.id.resultTV);

    }

    public void addNumber(View objView)
    {
        if(!numberOneET.getText().toString().isEmpty() && !numberTwoET.getText().toString().isEmpty() )
        {
            numberOne=Integer.parseInt(numberOneET.getText().toString());

            numberTwo=Integer.parseInt(numberTwoET.getText().toString());
            result=numberOne+numberTwo;

            resultTV.setText(getResources().getString(R.string.result_is)+result);
            numberTwoET.setText("");

            numberOneET.setText("");
        }
        else if(numberOneET.getText().toString().isEmpty())
        {
            Toast.makeText(this, getResources().getString(R.string.enter_the_first_number), Toast.LENGTH_SHORT).show();
        }
        else if(numberTwoET.getText().toString().isEmpty())
        {
            Toast.makeText(this, getResources().getString(R.string.enter_the_second_number), Toast.LENGTH_SHORT).show();
        }

    }
}
