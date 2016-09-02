package co.davo.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Answer Key:
     * Question One: Options 1 & 3
     * Question Two: Option 2
     * Question Three: Option 1
     * Question Four: Answer must contain the string "alias"
     *
     * NOTE: To keep variable names short, the naming scheme qxox is used where:
     * q = "question"
     * x = any integer value
     * o = "option"
     *
     * Example: q1o1 = question 1, option 1
     */

    // Set all questions to not answered by default
    boolean isQuestionOneAnswered = false;
    boolean isQuestionTwoAnswered = false;
    boolean isQuestionThreeAnswered = false;
    boolean isQuestionFourAnswered = false;

    // Set all answers to incorrect by default
    boolean isAnswerOneCorrect = false;
    boolean isAnswerTwoCorrect = false;
    boolean isAnswerThreeCorrect = false;
    boolean isAnswerFourCorrect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Check to see if question one is answered and if answer is correct
     */
    public void checkAnswerOne() {
        isQuestionOneAnswered = false;
        isAnswerOneCorrect = false;

        CheckBox q1O1CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o1);
        CheckBox q1O2CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o2);
        CheckBox q1O3CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o3);
        CheckBox q1O4CheckBox = (CheckBox) findViewById(R.id.checkbox_q1o4);

        // Check if question one is answered
        if (q1O1CheckBox.isChecked() ||
                q1O2CheckBox.isChecked() ||
                q1O3CheckBox.isChecked() ||
                q1O4CheckBox.isChecked()) {
            // If question one is answered, execute the following code
            isQuestionOneAnswered = true;
        }

        // Check if answer one is correct
        if (q1O1CheckBox.isChecked() &&
                !q1O2CheckBox.isChecked() &&
                q1O3CheckBox.isChecked() &&
                !q1O4CheckBox.isChecked()) {
            // If answer one is correct, execute the following code
            isAnswerOneCorrect = true;
        }

    }

    /**
     * Check to see if question four is answered and if answer is correct
     */
    public void checkAnswerFour() {
        EditText q4EditText = (EditText) findViewById(R.id.q4_editText);
        String q4EditTextString = q4EditText.getText().toString().toLowerCase();
        String q4KeyWord = getString(R.string.question4_keyWord).toLowerCase();

        // Check if question four is answered
        if (!q4EditTextString.isEmpty()) {
            // If question four is answered, execute the following code
            isQuestionFourAnswered = true;
        }

        // Check if answer four is correct
        if (q4EditTextString.contains(q4KeyWord)) {
            // If answer four is correct, execute the following code
            isAnswerFourCorrect = true;
        } else {
            // If answer four is not correct, execute the following code
            isAnswerFourCorrect = false;
        }

    }

    public void onQ2RadioButtonClicked(View view) {
        RadioButton q2O1RadioButton = (RadioButton) findViewById(R.id.radio_q2o1);
        RadioButton q2O2RadioButton = (RadioButton) findViewById(R.id.radio_q2o2);
        RadioButton q2O3RadioButton = (RadioButton) findViewById(R.id.radio_q2o3);
        RadioButton q2O4RadioButton = (RadioButton) findViewById(R.id.radio_q2o4);

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        if (checked) {
            // If question two is answered, execute the following code
            isQuestionTwoAnswered = true;
        }

        // Check which radio button was clicked
        switch (view.getId()) {
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
            // If question three is answered, execute the following code
            isQuestionThreeAnswered = true;
        }

        // Check which radio button was clicked
        switch (view.getId()) {
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
        int correctAnswerCount = 0;
        int score;
        String wasWere = "s were";

        checkAnswerOne();
        checkAnswerFour();

        // Check to make sure all questions were answered
        if (!isQuestionOneAnswered ||
                !isQuestionTwoAnswered ||
                !isQuestionThreeAnswered ||
                !isQuestionFourAnswered) {
            // Display Toast message requesting that all questions be answered
            Toast toast = Toast.makeText(this, "Please answer all questions", Toast.LENGTH_SHORT);
            toast.show();

        } else {

            // Add one to the total correctAnswerCount for each correct answer
            if (isAnswerOneCorrect) {
                correctAnswerCount++;
            }

            if (isAnswerTwoCorrect) {
                correctAnswerCount++;
            }

            if (isAnswerThreeCorrect) {
                correctAnswerCount++;
            }

            if (isAnswerFourCorrect) {
                correctAnswerCount++;
            }

            // Display Toast message with correctAnswerCount and score
            score = correctAnswerCount * 25;
            if (correctAnswerCount == 1) {
                wasWere = " was";
            }
            Toast toast = Toast.makeText(this, correctAnswerCount + " answer" + wasWere + " correct. Score: " + score + "%", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
