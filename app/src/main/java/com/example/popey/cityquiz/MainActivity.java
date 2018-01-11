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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * pressing the button will reset all answers to defaults
     */
    public void restartButton(View view) {
        //first question reset

        RadioGroup g1group = (RadioGroup) findViewById(R.id.answer_1);
        g1group.clearCheck();

        //second question reset

        CheckBox q2a = (CheckBox) findViewById(R.id.answer_2_a);
        q2a.setChecked(false);

        CheckBox q2b = (CheckBox) findViewById(R.id.answer_2_b);
        q2b.setChecked(false);

        CheckBox q2c = (CheckBox) findViewById(R.id.answer_2_c);
        q2c.setChecked(false);

        CheckBox q2d = (CheckBox) findViewById(R.id.answer_2_d);
        q2d.setChecked(false);

        //third question reset

        EditText q3 = (EditText) findViewById(R.id.answer_3);
        q3.getText().clear();

        //fourth question reset
        RadioGroup g4group = (RadioGroup) findViewById(R.id.answer_4);
        g4group.clearCheck();

        //fifth question reset

        EditText q5 = (EditText) findViewById(R.id.answer_5);
        q5.getText().clear();

        //sixth question reset

        RadioGroup g6group = (RadioGroup) findViewById(R.id.answer_6);
        g6group.clearCheck();

        //seventh question reset

        CheckBox q7a = (CheckBox) findViewById(R.id.answer_7_a);
        q7a.setChecked(false);
        CheckBox q7b = (CheckBox) findViewById(R.id.answer_7_b);
        q7b.setChecked(false);
        CheckBox q7c = (CheckBox) findViewById(R.id.answer_7_c);
        q7c.setChecked(false);
        CheckBox q7d = (CheckBox) findViewById(R.id.answer_7_d);
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

        RadioButton q1Button = (RadioButton) findViewById(R.id.answer_1_b);
        if (q1Button.isChecked()) {
            total += 1;
        }

        //check second question

        CheckBox q2a = (CheckBox) findViewById(R.id.answer_2_a);
        CheckBox q2b = (CheckBox) findViewById(R.id.answer_2_b);
        CheckBox q2c = (CheckBox) findViewById(R.id.answer_2_c);
        CheckBox q2d = (CheckBox) findViewById(R.id.answer_2_d);
        if (q2a.isChecked() && q2b.isChecked() && !q2c.isChecked() && !q2d.isChecked()) {
            total += 1;
        }

        //check third question

        TextView q3Text = (TextView) findViewById(R.id.answer_3);
        String answer = q3Text.getText().toString().toLowerCase().trim();
        if (answer.equals("london")) {
            total += 1;
        }

        //check fourth question

        RadioButton q4Button = (RadioButton) findViewById(R.id.answer_4_b);
        if (q4Button.isChecked()) {
            total += 1;
        }


        //check fifth question

        TextView q5Text = (TextView) findViewById(R.id.answer_5);
        String answer1 = q5Text.getText().toString().toLowerCase().trim();
        if (answer1.equals("copenhagen")) {
            total += 1;
        }

        //check sixth question

        RadioButton q6button = (RadioButton) findViewById(R.id.answer_6_b);
        if (q6button.isChecked()) {
            total += 1;
        }

        //check seventh question

        CheckBox q7a = (CheckBox) findViewById(R.id.answer_7_a);
        CheckBox q7b = (CheckBox) findViewById(R.id.answer_7_b);
        CheckBox q7c = (CheckBox) findViewById(R.id.answer_7_c);
        CheckBox q7d = (CheckBox) findViewById(R.id.answer_7_d);
        if (q7a.isChecked() && !q7b.isChecked() && q7c.isChecked() && !q7d.isChecked()) {
            total += 1;
        }

        return total;
    }

}
