package com.example.login_email;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void validarlogin(View v){
		final EditText txtLogin = (EditText)findViewById(R.id.etuser);
		final EditText txtClave = (EditText)findViewById(R.id.etpass);
		Button limpiar = (Button) findViewById(R.id.limpiar);
		
		if (txtLogin.getText().toString().equals("adm")&& txtClave.getText().toString().equals("1234")){
		   Intent intent = new Intent(this, Login.class);
		  // intent.putExtra("resultado",txtLogin.getText().toString());
		   startActivity(intent);
	}  else {
		Toast.makeText(getBaseContext(), "Usuario incorrecto", Toast.LENGTH_SHORT).show();
		}

	limpiar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		 txtLogin.setText("");
		 txtClave.setText("");
		}
	});
	
}
}
    