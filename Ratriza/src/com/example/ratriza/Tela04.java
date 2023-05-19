package com.example.ratriza;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela04 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela04);
		final EditText c1=(EditText)findViewById(R.id.editText1);
		final EditText c2=(EditText)findViewById(R.id.editText2);
		final EditText c3=(EditText)findViewById(R.id.editText3);
		final EditText c4=(EditText)findViewById(R.id.editText4);
		final Button b1=(Button)findViewById(R.id.button1);
		
		b1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String nome, tel, end, pedido;
				nome=c1.getText().toString();
				tel=c2.getText().toString();
				end=c3.getText().toString();
				pedido=c4.getText().toString();
				
				Intent it = new Intent(Tela04.this, Tela05.class);
				it.putExtra(
						"msg",
						" \n Nome: "+nome
						+"\n Telefone: "+tel
						+"\n Endereço: "+end
						+"\n Pedido: "+pedido
						);
				startActivity(it);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela04, menu);
		return true;
	}

}
