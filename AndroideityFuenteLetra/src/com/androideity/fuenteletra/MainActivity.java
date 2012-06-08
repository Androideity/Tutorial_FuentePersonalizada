package com.androideity.fuenteletra;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	protected TextView customFont;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fuente personalizada
        setContentView(R.layout.custom);
//        Por si quieres ver el tipo de fuente
//        setContentView(R.layout.main);
//        Por si quieres ver el layout con los estilos de letra
//        setContentView(R.layout.textstyle);
//      Por si quieres ver el layout con los tamaños de letra
//        setContentView(R.layout.textsize);
//      Por si quieres ver el layout con los colores de letra
//        setContentView(R.layout.colors);
//      Por si quieres ver el layout con sombra en la letra
//      setContentView(R.layout.shadow);
        
        customFont = (TextView)findViewById(R.id.fuente);
        Typeface font = Typeface.createFromAsset(getAssets(), "gloriahallelujah.ttf");
        customFont.setTypeface(font);
    }
}