package com.example.popey.cityquiz;

import android.support.v4.content.ContextCompat;
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
    /**
     * All global variables and elements.
     */
    RadioGroup g1group,g4group,g6group;
    RadioButton q1Button,q1f1Button,q1f2Button,q4Button, q4f1Button,q4f2Button, q4f3Button,q6button, q6f1Button, q6f2Button, q6f3Button;
    EditText q3, q5;
    CheckBox q2a,q2b,q2c, q2d,q7a,q7b,q7c,q7d;

    TextView solution = null;
    TextView solution1 = null;
    TextView solution2 = null;
    TextView solution3 = null;
    TextView solution4 = null;
    TextView solution5 = null;
    TextView solution6 = null;
    TextView score = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * first question's variables
         */
        g1group = findViewById(R.id.answer_1);
        q1Button = findViewById(R.id.answer_1_b);
        q1f1Button = findViewById(R.id.answer_1_a);
        q1f2Button = findViewById(R.id.answer_1_c);
        solution2 = findViewById(R.id.solution2);

        /**
         * second question's variables
         */
        q2a = findViewById(R.id.answer_2_a);
        q2b = findViewById(R.id.answer_2_b);
        q2c = findViewById(R.id.answer_2_c);
        q2d = findViewById(R.id.answer_2_d);
        solution3 = findViewById(R.id.solution3);

        /**
         * third question's variables
         */
        q3 = findViewById(R.id.answer_3);
        solution = findViewById(R.id.solution);

        /**
         * fourth question's variables
         */
        g4group = findViewById(R.id.answer_4);
        q4Button = findViewById(R.id.answer_4_b);
        q4f1Button = findViewById(R.id.answer_4_a);
        q4f2Button = findViewById(R.id.answer_4_c);
        q4f3Button = findViewById(R.id.answer_4_d);
        solution4 = findViewById(R.id.solution4);

        /**
         * fifth question's variables
         */
        q5 = findViewById(R.id.answer_5);
        solution1 = findViewById(R.id.solution1);

        /**
         * sixth question's variables
         */
        g6group = findViewById(R.id.answer_6);
        q6button = findViewById(R.id.answer_6_b);
        q6f1Button = findViewById(R.id.answer_6_a);
        q6f2Button = findViewById(R.id.answer_6_c);
        q6f3Button = findViewById(R.id.answer_6_d);
        solution5 = findViewById(R.id.solution5);

        /**
         * seventh question's variables
         */
        q7a = findViewById(R.id.answer_7_a);
        q7b = findViewById(R.id.answer_7_b);
        q7c = findViewById(R.id.answer_7_c);
        q7d = findViewById(R.id.answer_7_d);
        solution6 = findViewById(R.id.solution6);

        /**
         * score's variable
         */
        score = findViewById(R.id.score);
    }

    /**
     * pressing the button will reset all answers to defaults
     */
    public void restartButton(View view) {
        /**
         * first question reset
         */
        g1group.clearCheck();
        q1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q1f1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q1f2Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        solution2.setText(null);

        /**
         * second question reset
         */
        q2a.setChecked(false);
        q2b.setChecked(false);
        q2c.setChecked(false);
        q2d.setChecked(false);

        q2a.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q2b.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q2c.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q2d.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        solution3.setText(null);

        /**
         * third  question reset
         */
        q3.getText().clear();
        solution.setText(null);

        /**
         * fourth  question reset
         */
        g4group.clearCheck();
        q4Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q4f1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q4f2Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q4f3Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        solution4.setText(null);

        /**
         * fifth  question reset
         */
        q5.getText().clear();
        solution1.setText(null);

        /**
         * sixth  question reset
         */
        g6group.clearCheck();
        q6button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q6f1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q6f2Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q6f3Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        solution5.setText(null);

        /**
         * seventh  question reset
         */
        q7a.setChecked(false);
        q7b.setChecked(false);
        q7c.setChecked(false);
        q7d.setChecked(false);

        q7a.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q7b.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q7c.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        q7d.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.textcolor));
        solution6.setText(null);

        /**
         * reset score
         */
        score.setText(null);
    }

    /**
     * pressing the button calculate and display the overall score in a toast message
     */
    public void submitButton(View view) {

        String resultText = getResources().getString(R.string.you_got) + " " + getScore() + " " + getString(R.string.out_of);
        Toast.makeText(this, resultText, Toast.LENGTH_LONG).show();
        score.setText(getString(R.string.you_got) + " " + getScore() + getString(R.string.out_of2) );
    }

    /**
     * checks all answers and
     *
     * @return overall score
     */
    private int getScore() {
        int total = 0;
        /**
         * check first question
         */
        if (q1Button.isChecked()) {
            q1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
            solution2.setText(getString(R.string.correct));
            total += 1;

        } else {
            q1f1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            q1f2Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            solution2.setText(getString(R.string.wrong_solution) + " " + (getString(R.string.q_1_b)));
        }
        /**
         * check second question
         */
        if (q2a.isChecked() && q2b.isChecked() && !q2c.isChecked() && !q2d.isChecked()) {
            total += 1;
            q2a.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
            q2b.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
            solution3.setText(getString(R.string.correct));

        } else{
            q2c.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            q2d.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            solution3.setText(getString(R.string.wrong_solutions) +" " + (getString(R.string.q_2_a))+ ", " + (getString(R.string.q_2_b)));
        }

        /**
         * check third question
         */
          String answer = q3.getText().toString().toLowerCase().trim();
        if (answer.equals("london")) {
            total += 1;
            solution.setText(getString(R.string.correct));

        }else {
            solution.setText(getString(R.string.wrong_solution) +" " + (getString(R.string.good_answer1)) );
        }

        /**
         * check fourth question
         */
        if (q4Button.isChecked()) {
            total += 1;
            q4Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
            solution4.setText(getString(R.string.correct));
                   } else {
            q4f1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            q4f2Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            q4f3Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            solution4.setText(getString(R.string.wrong_solution) + " " + (getString(R.string.q_4_b)));
        }

        /**
         * check fifth question
         */
        String answer1 = q5.getText().toString().toLowerCase().trim();
        if (answer1.equals("copenhagen")) {
            total += 1;
            solution1.setText(getString(R.string.correct));
        }else {
            solution1.setText(getString(R.string.wrong_solution) +" " +(getString(R.string.good_answer2)) );
        }

        /**
         * check sixth question
         */
        if (q6button.isChecked()) {
            total += 1;
            q6button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
            solution5.setText(getString(R.string.correct));
        }else {
            q6f1Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            q6f2Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            q6f3Button.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            solution5.setText(getString(R.string.wrong_solution) + " " + (getString(R.string.q_6_b)));
        }

        /**
         * check seventh question
         */
        if (q7a.isChecked() && !q7b.isChecked() && q7c.isChecked() && !q7d.isChecked()) {
            total += 1;
            q7a.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
            q7c.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorGreen));
            solution6.setText(getString(R.string.correct));
        }
        else {
            q7b.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            q7d.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorRed));
            solution6.setText(getString(R.string.wrong_solutions) +" " + (getString(R.string.q_7_a))+ ", " + (getString(R.string.q_7_c)));
        }
        return total;
    }

}
