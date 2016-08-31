package co.davo.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    /**
     * Answer Key: 1 & 3, 2, 1, String
     */

    boolean isQuestionOneAnswered = false;
    boolean isQuestionTwoAnswered = false;
    boolean isQuestionThreeAnswered = false;
    boolean isQuestionFourAnswered = false;

    boolean isAnswerOneCorrect = false;
    boolean isAnswerTwoCorrect = false;
    boolean isAnswerThreeCorrect = false;
    boolean isAnswerFourCorrect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswerOne() {
        CheckBox q1O1CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o1);
        CheckBox q1O2CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o2);
        CheckBox q1O3CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o3);
        CheckBox q1O4CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o4);

        if (q1O1CheckBox.isChecked() ||
                q1O2CheckBox.isChecked() ||
                q1O3CheckBox.isChecked() ||
                q1O4CheckBox.isChecked()) {
            isQuestionOneAnswered = true;
        }

        if (q1O1CheckBox.isChecked() &&
                !q1O2CheckBox.isChecked() &&
                q1O3CheckBox.isChecked() &&
                !q1O4CheckBox.isChecked()) {
            isAnswerOneCorrect = true;
        }

    }

    public void checkAnswerFour() {

    }

    public void onQ2RadioButtonClicked(View view) {
        RadioButton q2O1RadioButton = (RadioButton) findViewById(R.id.radio_q2o1);
        RadioButton q2O2RadioButton = (RadioButton) findViewById(R.id.radio_q2o2);
        RadioButton q2O3RadioButton = (RadioButton) findViewById(R.id.radio_q2o3);
        RadioButton q2O4RadioButton = (RadioButton) findViewById(R.id.radio_q2o4);

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        if (checked) {
            isQuestionTwoAnswered = true;
        }

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_q2o1:
                if (checked)
                    q2O2RadioButton.setChecked(false);
                    q2O3RadioButton.setChecked(false);
                    q2O4RadioButton.setChecked(false);

                    isAnswerTwoCorrect = false;
                    break;
            case R.id.radio_q2o2:
                if (checked)
                    q2O1RadioButton.setChecked(false);
                    q2O3RadioButton.setChecked(false);
                    q2O4RadioButton.setChecked(false);

                    isAnswerTwoCorrect = true;
                    break;
            case R.id.radio_q2o3:
                if (checked)
                    q2O1RadioButton.setChecked(false);
                    q2O2RadioButton.setChecked(false);
                    q2O4RadioButton.setChecked(false);

                    isAnswerTwoCorrect = false;
                    break;
            case R.id.radio_q2o4:
                if (checked)
                    q2O1RadioButton.setChecked(false);
                    q2O2RadioButton.setChecked(false);
                    q2O3RadioButton.setChecked(false);

                    isAnswerTwoCorrect = false;
                    break;
        }
    }

    public void onQ3RadioButtonClicked(View view) {
        RadioButton q3O1RadioButton = (RadioButton) findViewById(R.id.radio_q3o1);
        RadioButton q3O2RadioButton = (RadioButton) findViewById(R.id.radio_q3o2);
        RadioButton q3O3RadioButton = (RadioButton) findViewById(R.id.radio_q3o3);
        RadioButton q3O4RadioButton = (RadioButton) findViewById(R.id.radio_q3o4);

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        if (checked) {
            isQuestionThreeAnswered = true;
        }

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_q3o1:
                if (checked)
                    q3O2RadioButton.setChecked(false);
                    q3O3RadioButton.setChecked(false);
                    q3O4RadioButton.setChecked(false);

                    isAnswerThreeCorrect = true;
                    break;
            case R.id.radio_q3o2:
                if (checked)
                    q3O1RadioButton.setChecked(false);
                    q3O3RadioButton.setChecked(false);
                    q3O4RadioButton.setChecked(false);

                    isAnswerThreeCorrect = false;
                    break;
            case R.id.radio_q3o3:
                if (checked)
                    q3O1RadioButton.setChecked(false);
                    q3O2RadioButton.setChecked(false);
                    q3O4RadioButton.setChecked(false);

                    isAnswerThreeCorrect = false;
                    break;
            case R.id.radio_q3o4:
                if (checked)
                    q3O1RadioButton.setChecked(false);
                    q3O2RadioButton.setChecked(false);
                    q3O3RadioButton.setChecked(false);

                    isAnswerThreeCorrect = false;
                    break;
        }
    }

    public void submitAnswers(View view) {
        checkAnswerOne();
        checkAnswerFour();
    }
}
