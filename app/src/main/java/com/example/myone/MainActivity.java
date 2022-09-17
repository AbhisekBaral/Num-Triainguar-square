package com.example.myone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public
class MainActivity extends AppCompatActivity {

    class Number{

        int Number;
        public boolean isSqure(){

            double squareRoot = Math.sqrt(Number);

            if(squareRoot == Math.floor(squareRoot)){
                return true;
            }else{
                return false;
            }

        }


        public boolean isTraingular(){
            int x =1 ;
            int TraingularNumber = 1;
            while(TraingularNumber < Number){
                x++;
                TraingularNumber = TraingularNumber+x;
            }

            if(TraingularNumber == Number){
                return true;
            }else{
                return false;
            }
        }
    }

    public void TestNumber(View view){
        Log.i("info","Button pressed");

        EditText editText = (EditText) findViewById(R.id.editTextNumber);

        String massage;
        if(editText.getText().toString().isEmpty()){
            massage = "please enter a number";

        }else {

            Number MyNumber = new Number();
            MyNumber.Number = Integer.parseInt(editText.getText().toString());

            massage = editText.getText().toString();

            if (MyNumber.isSqure() && MyNumber.isTraingular()) {

                massage = "is square and Traingular";

            } else if (MyNumber.isSqure()) {

                massage = "is Square but not traingular";
            } else if (MyNumber.isTraingular()) {

                massage = "is Traingular but not square";

            } else {
                massage = "is neighter traingular nor square";

            }
        }
        Toast.makeText(this, massage, Toast.LENGTH_LONG).show();
    }

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}