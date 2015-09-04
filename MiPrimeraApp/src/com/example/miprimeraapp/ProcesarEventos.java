package com.example.miprimeraapp;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Clase para procesar los eventos
 * @author Diego Santamaría
 *
 */
public class ProcesarEventos implements OnClickListener {

	public static Log miLog;
	/**
	 * Metodo para gestionar el onClick de los botones de mi aplicación
	 * @param View v, La vista (Botón tipo view) que pulsamos
	 * 
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String palabra = "";
		String palabraAlreves="";
		palabra = MainActivity.getEditText().getText().toString();
		
		for (int i=palabra.length()-1; i>=0;i--)
		{
			palabraAlreves = palabraAlreves+palabra.charAt(i);
			//miLog.notify()
		}
		
		MainActivity.getTextView().setText(palabraAlreves); 
		MainActivity.getRatingBar().setNumStars(3);
		
		//llamaremos a la otra actividad activity_main2
		
		
				
	}


}
