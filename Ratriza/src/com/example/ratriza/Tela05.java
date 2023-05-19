package com.example.ratriza;


import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela05 extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela05);
		
		final Button botao = (Button)findViewById(R.id.button1);
		final Vibrator vibra=(Vibrator)
				Tela05.this.getSystemService(Context.VIBRATOR_SERVICE);
		
		botao.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				vibra.vibrate(500);
				
				NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
				PendingIntent p=PendingIntent.getActivity(Tela05.this, 0, 
						new Intent(Tela05.this, Tela06.class), 0);
				NotificationCompat.Builder builder = new NotificationCompat.Builder(Tela05.this);
				builder.setTicker("Boticario");
				builder.setContentTitle("Compra realizada com sucesso!");
				builder.setContentText("Seu pedido está a caminho");
				builder.setSmallIcon(R.drawable.ic_launcher);
				builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher));
				builder.setContentIntent(p);
				Notification n=builder.build();
				nm.notify(R.drawable.ic_launcher,n);
				
				Intent it = new Intent(Tela05.this, Tela06.class);
				startActivity(it);
			}
		});
		

		final TextView texto = (TextView)findViewById(R.id.textView1);
		Intent it = getIntent();
		String inf = it.getStringExtra("msg");
		texto.setText(inf);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela05, menu);
		return true;
	}

}
