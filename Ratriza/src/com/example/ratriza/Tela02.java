package com.example.ratriza;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class Tela02 extends Activity {
	ImageSwitcher sw;
	Button b1, b2, b3;
	int i = 1;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_tela02);

		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		
		b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent it = new Intent(Tela02.this,Tela03.class);
				startActivity(it);
			}
		});
		sw = (ImageSwitcher) findViewById(R.id.imageSwitcher1);

		sw.setFactory(new ViewSwitcher.ViewFactory() {

			@Override
			public View makeView() {
				ImageView myView = new ImageView(getApplicationContext());
				myView.setScaleType(ImageView.ScaleType.FIT_CENTER);
				return myView;
			}
		});

		sw.setImageResource(R.drawable.beijinho);

		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// sw.setImageResource(R.drawable.beijinho);
				switch (i) {
				case 1:
					i++;
					sw.setImageResource(R.drawable.cacto);
					// i = 2
					break;
				case 2:
					i++;
					sw.setImageResource(R.drawable.nuvem);
					break;
				case 3:
					i++;
					sw.setImageResource(R.drawable.sol);
					break;
				case 4:
					i = 1;
					sw.setImageResource(R.drawable.beijinho);
					break;
				default:
					sw.setImageResource(R.drawable.beijinho);
					break;
				}

			}
		});
		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				switch (i) {
				case 1:
					i = 4;
					sw.setImageResource(R.drawable.sol);
					break;
				case 2:
					i--;
					sw.setImageResource(R.drawable.beijinho);
					break;
				case 3:
					i--;
					sw.setImageResource(R.drawable.cacto);
					break;
				case 4:
					i--;
					sw.setImageResource(R.drawable.nuvem);
					break;
				default:
					sw.setImageResource(R.drawable.nuvem);
					break;
				}

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela02, menu);
		return true;
	}

}

