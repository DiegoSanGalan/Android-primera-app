package com.example.miprimeraapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	//creamos un atributo a nivel de clase de cada elemento
	private static EditText editText;
	private static TextView textView;
	private static RatingBar ratingBar;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //está en la carpeta res en layout
        Button boton = (Button) findViewById(R.id.button1);
        boton.setOnClickListener(new ProcesarEventos());
        
        editText = (EditText) findViewById(R.id.editText1);
        textView = (TextView) findViewById(R.id.textView2);
        
    }

	
  

	public static RatingBar getRatingBar() {
		return ratingBar;
	}




	public static void setRatingBar(RatingBar ratingBar) {
		MainActivity.ratingBar = ratingBar;
	}




	public static EditText getEditText() {
		return editText;
	}



	public static TextView getTextView() {
		return textView;
	}



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        
        
        switch (id) {
		case R.id.action_google: Intent ig = new Intent ("android.intent.action.VIEW" , 
												Uri.parse("https://www.google.es/"));
								startActivity(ig);
			
			break;
		case R.id.action_github: Intent ib = new Intent ("android.intent.action.VIEW" , 
										Uri.parse("https://github.com/"));
									startActivity(ib);
		
		break;
		
		case R.id.action_linkedin: Intent igit = new Intent ("android.intent.action.VIEW" , 
										Uri.parse("https://es.linkedin.com/"));
						startActivity(igit);

		break;
		
		case R.id.action_activitymain2: Intent activ2 = new Intent (this , SegundaActividad.class);
				
				startActivity(activ2);

		break;
		

		default:
			break;
		}
        
		if (id == R.id.action_settings) {
            return true;
                }
		

		 if (id == R.id.action_close){
        	finish();
        }
			
		
        return super.onOptionsItemSelected(item);
    }
    
    
	
    /**
     * Método para gestionar el click del boton de enviar formulario
     * @param v
     */
	public void mostrar (View v)
	{
		
		EditText nombreEdit = (EditText) findViewById(R.id.editText2);
		EditText fechaEdit = (EditText) findViewById(R.id.editText3);
		EditText claveEdit = (EditText) findViewById(R.id.editText4);
		
		Intent i = new Intent(this, SegundaActividad.class);
		//dentro del objeto Intent hay una especie de saco 
		i.putExtra("nombre", nombreEdit.getText().toString());
		i.putExtra("fecha", fechaEdit.getText().toString());
		i.putExtra("clave", claveEdit.getText().toString());
	
		startActivity(i);
		
	}
    
    
    
}
