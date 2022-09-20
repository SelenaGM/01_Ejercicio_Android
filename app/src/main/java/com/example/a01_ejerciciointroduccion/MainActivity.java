package com.example.a01_ejerciciointroduccion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables tipo Vista
    private TextView lblRespuesta;
    private Button btnReset;
    private Button btnSaludar;
    private EditText txtNombre;

    //Variables tipo lógica
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar variables (logicas y vista)
        nombre= "";
        inicializaVistas();

        //las cositas
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre= txtNombre.getText().toString();
                nombre= nombre.trim();
                if(nombre.isEmpty()){
                    Toast.makeText(MainActivity.this,"No se ha ingresado nombre",Toast.LENGTH_SHORT).show();
                }else{
                    txtNombre.getText().clear();
                    lblRespuesta.setText("Hola, "+nombre+", buenos días");
                }

                /***************************
                 *****OTRA FORMA

                if (txtNombre.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this,"No se ha ingresado nombre",Toast.LENGTH_SHORT).show();
                }else{
                    lblRespuesta.setText("Hola "+txtNombre.getText().toString()+" , buenos días");
                    txtNombre.getText().clear();
                }
                 */
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblRespuesta.setText("");
            }
        });

    }

    private void inicializaVistas() {
        lblRespuesta= findViewById(R.id.lblRespuestaMain);
        btnReset= findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        txtNombre= findViewById(R.id.txtNombreMain);
    }
}