package snru.boekban.tanakorn.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, userEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choice1RadioButton,choice2RadioButton,
            choice3RadioButton,choice4RadioButton, choice5RadioButton;
    private  String namString, userString, passwordString, avaString;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();
    }//Main Method

    private void bindWidget() {

        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);

    }

    public void clickSignUpSign(View view) {


        //Get Value From EditText
        namString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (namString.equals("") || userString.equals("") || passwordString.equals("")) {

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this, "มีช่องว่าง" , "กรุณากรอกทุกช่อง");
        } else {

        }

    }

}// Main Class
