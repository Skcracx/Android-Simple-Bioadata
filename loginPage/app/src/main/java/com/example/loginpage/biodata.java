package com.example.loginpage;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity_main);

        // Ambil data dari Intent
        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");

        // Temukan elemen di layout


        // Tampilkan data di TextView

        // Temukan tombol Back
        Button btnBack = findViewById(R.id.btnBack);

        // Tambahkan logika untuk tombol Back
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman login
                Intent intent = new Intent(biodata.this, MainActivity.class);
                startActivity(intent);

                // Menutup activity ini untuk mencegah kembali ke sini
                finish();
            } // <-- Added closing curly brace here
        }); // <-- Closing parenthesis for setOnClickListener
    } // <-- Closing curly brace for onCreate method
}