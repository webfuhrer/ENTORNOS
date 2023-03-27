package com.example.sumenumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText et_numero1,et_numero2;
Button boton;
TextView texto_resultado;
View.OnClickListener oyente_clics=new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int numero1=Integer.parseInt(et_numero1.getText().toString());
        int numero2=Integer.parseInt(et_numero2.getText().toString());
        String texto="La suma vale "+(numero1+numero2);
        texto_resultado.setText(texto);
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_numero1=findViewById(R.id.et_numero1);
        et_numero2=findViewById(R.id.et_numero2);
        boton=findViewById(R.id.btn_sumar);
        texto_resultado=findViewById(R.id.tv_resultado);
        boton.setOnClickListener(oyente_clics);
    }
}