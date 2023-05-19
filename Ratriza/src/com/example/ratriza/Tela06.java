package com.example.ratriza;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela06 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela06);
		
		final Button b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent(Tela06.this, Tela07.class);
				startActivity(it);
			}
		});
		
	}
    public void selecionarlogo (View v)
    { 
    	  Toast.makeText(this, "Boticario",Toast.LENGTH_SHORT).show();
    	  Uri uri=Uri.parse("https://www.boticario.com.br/");
    	  Intent it= new Intent(Intent.ACTION_VIEW, uri);
    	  startActivity(it);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela06, menu);
		return true;
	}

}
