package com.example.salman.calculatordemoapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String oper = "";
    @BindView(R.id.input1) EditText num1;
    @BindView(R.id.input2) EditText num2;
    @BindView(R.id.add) Button btnAdd;
    @BindView(R.id.sub) Button btnSub;
    @BindView(R.id.mult) Button btnMult;
    @BindView(R.id.div) Button btnDiv;
    @BindView(R.id.result) TextView result;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // TODO Explain SetOnClickListener
        // set a listener
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        float inp1 = 0;
        float inp2 = 0;
        float value = 0;

        // check if the fields are empty
        if (TextUtils.isEmpty(num1.getText().toString())
                || TextUtils.isEmpty(num2.getText().toString())) {
            return;
        }

        // read EditText and fill variables with numbers
        inp1 = Float.parseFloat(num1.getText().toString());
        inp2 = Float.parseFloat(num2.getText().toString());

        // defines the button that has been clicked and performs the corresponding operation
        // write operation into oper, we will use it later for output
        switch (v.getId()) {
            case R.id.add:
                oper = "+";
                value = inp1 + inp2;
                break;
            case R.id.sub:
                oper = "-";
                value = inp1 - inp2;
                break;
            case R.id.mult:
                oper = "*";
                value = inp1 * inp2;
                break;
            case R.id.div:
                oper = "/";
                value = inp1 / inp2;
                break;
            default:
                break;
        }

        // form the output line
        result.setText("" + value);
    }
}