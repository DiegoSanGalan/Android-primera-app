package com.example.miprimeraapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActividad extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
        setContentView(R.layout.activity_main2); //está en la carpeta res en layout
        
        TextView nombreEdit = (TextView) findViewById(R.id.textView1);
        TextView fechaEdit = (TextView) findViewById(R.id.textView2);
        TextView claveEdit = (TextView) findViewById(R.id.textView3);
        
        
        
        nombreEdit.setText(getIntent().getExtras().getString("nombre"));
        fechaEdit.setText(getIntent().getExtras().getString("fecha"));
        claveEdit.setText(getIntent().getExtras().getString("clave"));
        
        
	}
	
	

}

