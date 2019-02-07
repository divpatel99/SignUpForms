package edu.temple.signupforms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    Button clickingButton;
    EditText nameText, emailText, passText, copypassText;

    boolean run = false;
    public String name1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.User_Name);
        passText = findViewById(R.id.Pass);
        emailText = findViewById(R.id.Email_Address);
        copypassText = findViewById(R.id.Pass_Copy);
        clickingButton = findViewById(R.id.Confirm);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, pass, copyPass;
                name = nameText.getText().toString();
                name1 = name;
                pass = passText.getText().toString();
                copyPass = copypassText.getText().toString();
                email = emailText.getText().toString();
                boolean confirmed = pass.equals(copyPass);

                if (name.isEmpty() || pass.isEmpty() || copyPass.isEmpty() || email.isEmpty()) {
                    Toast print = Toast.makeText(MainActivity.this, "Complete all the entries", Toast.LENGTH_SHORT);
                    print.show();
                } else if (!(confirmed)) {
                    Toast print = Toast.makeText(MainActivity.this, "The cofirmation password doesn't match", Toast.LENGTH_SHORT);
                    print.show();
                } else {
                    Toast t = Toast.makeText(MainActivity.this, "Welcome " + name1 + " to the SignUpForm", Toast.LENGTH_SHORT);
                    run = true;
                    t.show();

                }


            }


        };

        clickingButton.setOnClickListener(listener);
    }
}

