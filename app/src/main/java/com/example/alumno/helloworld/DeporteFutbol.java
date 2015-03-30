package com.example.alumno.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.alumno.helloworld.R.*;

/**
 * Created by Alumno on 25/02/2015.
 */
public class DeporteFutbol extends ActionBarActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.deportefutbol);
    }
    public void pulsarBoton(View view) {
        Intent intent=null;
        Bundle mBundle=null;
        switch(view.getId()) {
            case R.id.btnEntrenamientoLibre:

                break;
            case R.id.btnMisEntrenamientos:
                intent = new Intent(this, Categorias.class);
                intent.putExtra("deporte","1");
                mBundle = new Bundle();
                startActivity(intent);
                break;
            case R.id.btnAlineacion:

                break;
            case R.id.btnMisAlineaciones:

                break;
        }
    }
}
