package com.example.ratriza;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Tela03 extends Activity {
	private ListView listaperfumes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela03);
        
        final Button b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent(Tela03.this, Tela04.class);
				startActivity(it);
			}
		});
        
        String perfumes[] = {"Beijinho R$69.90", "Cacto R$69.90", "Nuvem R$69.90", "Sol e Água Fresca R$69.90", "sem estoque", "sem estoque", "sem estoque"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>
		(this, android.R.layout.simple_list_item_1, perfumes);
		
		listaperfumes = (ListView)findViewById(R.id.listView1);
		listaperfumes.setAdapter(adapter);
		listaperfumes.setOnItemClickListener(new ListView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int p,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(Tela03.this,"Posição"+p, Toast.LENGTH_SHORT).show();
				
			}
			
		});
        
        }
		
		


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela03, menu);
		return true;
	}

}

