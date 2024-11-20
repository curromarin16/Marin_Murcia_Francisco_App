package com.example.marin_murcia_francisco_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registro extends AppCompatActivity {
    private TextView txt_nombre, txt_email, txt_edad;
    private EditText et_nombre, et_email, et_edad;
    private Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        txt_nombre = findViewById(R.id.txt_nombre);
        txt_email = findViewById(R.id.txt_email);
        txt_edad = findViewById(R.id.txt_edad);
        et_nombre = findViewById(R.id.et_nombre);
        et_email = findViewById(R.id.et_email);
        et_edad = findViewById(R.id.et_edad);
        btn_registrar = findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = et_nombre.getText().toString().trim();
                String email = et_email.getText().toString().trim();
                String edadstr = et_edad.getText().toString().trim();

                if (nombre.isEmpty() || email.isEmpty() || edadstr.isEmpty()) {
                    Toast.makeText(Registro.this, "Por favor, completa todos los campos", Toast.LENGTH_LONG).show();
                    return;
                }

                int edad;
                try {
                    edad = Integer.parseInt(edadstr);
                } catch (NumberFormatException e) {
                    Toast.makeText(Registro.this, "Edad inválida", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (edad < 18) {
                    Toast.makeText(Registro.this, "Debes ser mayor de 18 años para registrarte.", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(Registro.this, "Registrado", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
