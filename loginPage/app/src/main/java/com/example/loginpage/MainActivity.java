package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        // Menambahkan listener untuk tombol login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Mengambil input username dan password
                String enteredUsername = username.getText().toString();
                String enteredPassword = password.getText().toString();

                // Cek apakah username dan password sesuai
                if (enteredUsername.equals("user") && enteredPassword.equals("1234")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();

                    // Log sebelum berpindah ke Profile
                    Log.d("MainActivity", "Navigating to Profile with username: " + enteredUsername);


                    // Membuat Intent untuk pindah ke Profile Activity
                    Intent intent = new Intent(MainActivity.this, biodata.class);

                    // Mengirimkan data username ke Profile Activity
                    intent.putExtra("username", enteredUsername);
                    intent.putExtra("email", "user@example.com"); // Email statis, ubah sesuai kebutuhan

                    // Memulai Profile Activity
                    startActivity(intent);
                } else {
                    // Menampilkan pesan jika login gagal
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
