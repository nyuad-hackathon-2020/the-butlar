package com.example.vmac.WatBot.views;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.vmac.WatBot.R;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.usernameEdit);
        password = findViewById(R.id.passwordEdit);
    }

    public void goToSignUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    public void goToHome(View view) {
        String usernameText = username.getText().toString();
        String passwordText = password.getText().toString();

        if (!usernameText.isEmpty() && !passwordText.isEmpty()) {
            Intent intent = new Intent(this, Initial.class);
            startActivity(intent);
        } else {
            new AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Please Fill All Fields.")
                    .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }
}
