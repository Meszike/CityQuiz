package com.example.popey.cityquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    // all global variables

    RadioGroup g1group;
    RadioButton q1Button;

    CheckBox q2a;
    CheckBox q2b;
    CheckBox q2c;
    CheckBox q2d;

    EditText q3;

    RadioGroup g4group;
    RadioButton q4Button;

    EditText q5;

    RadioGroup g6group;
    RadioButton q6button;

    CheckBox q7a;
    CheckBox q7b;
    CheckBox q7c;
    CheckBox q7d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //first question global variables

        g1group = findViewById(R.id.answer_1);
        q1Button = findViewById(R.id.answer_1_b);

        //second question global variables
        q2a = findViewById(R.id.answer_2_a);
        q2b = findViewById(R.id.answer_2_b);
        q2c = findViewById(R.id.answer_2_c);
        q2d = findViewById(R.id.answer_2_d);

        //third question global variables
        q3 = findViewById(R.id.answer_3);

        //fourth question global variables
        g4group = findViewById(R.id.answer_4);
        q4Button =  findViewById(R.id.answer_4_b);

        //fifth question global variables
        q5 = findViewById(R.id.answer_5);

        //sixth question reset global variables
        g6group = findViewById(R.id.answer_6);
        q6button = findViewById(R.id.answer_6_b);

        //seventh  question reset global variables
        q7a = findViewById(R.id.answer_7_a);
        q7b = findViewById(R.id.answer_7_b);
        q7c = findViewById(R.id.answer_7_c);
        q7d = findViewById(R.id.answer_7_d);
    }

    /**
     * pressing the button will reset all answers to defaults
     */
    public void restartButton(View view) {

        //first question reset
        g1group.clearCheck();

        //second question reset
        q2a.setChecked(false);
        q2b.setChecked(false);
        q2c.setChecked(false);
        q2d.setChecked(false);

        //third question reset
        q3.getText().clear();

        //fourth question reset
        g4group.clearCheck();

        //fifth question reset
        q5.getText().clear();

        //sixth question reset
        g6group.clearCheck();

        //seventh question reset
        q7a.setChecked(false);
        q7b.setChecked(false);
        q7c.setChecked(false);
        q7d.setChecked(false);
    }

    /**
     * pressing the button calculate and display the overall score in a toast message
     */
    public void submitButton(View view) {

        String resultText = getResources().getString(R.string.you_got) + " " + getScore() + " " + getString(R.string.out_of);
        Toast.makeText(this, resultText, Toast.LENGTH_LONG).show();
    }

    /**
     * checks all answers and
     *
     * @return overall score
     */
    private int getScore() {
        int total = 0;
        //check first question

        if (q1Button.isChecked()) {
            total += 1;
        }

        //check second question

        if (q2a.isChecked() && q2b.isChecked() && !q2c.isChecked() && !q2d.isChecked()) {
            total += 1;
        }

        //check third question

        String answer = q3.getText().toString().toLowerCase().trim();
        if (answer.equals("london")) {
            total += 1;
        }

        //check fourth question

        if (q4Button.isChecked()) {
            total += 1;
        }

        //check fifth question

        String answer1 = q5.getText().toString().toLowerCase().trim();
        if (answer1.equals("copenhagen")) {
            total += 1;
        }

        //check sixth question

        if (q6button.isChecked()) {
            total += 1;
        }

        //check seventh question

        if (q7a.isChecked() && !q7b.isChecked() && q7c.isChecked() && !q7d.isChecked()) {
            total += 1;
        }

        return total;
    }

}
