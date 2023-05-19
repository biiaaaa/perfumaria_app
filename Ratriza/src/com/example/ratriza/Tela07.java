package com.example.ratriza;

import android.os.Bundle;
import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Tela07 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela07);
		
		NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		nm.cancel(R.drawable.ic_launcher);
		
		final Button b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent(Tela07.this, Tela01.class);
				startActivity(it);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela07, menu);
		return true;
	}

}
