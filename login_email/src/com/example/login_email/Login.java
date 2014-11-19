package com.example.login_email;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
	
	private Button boton;
	private EditText destinatario,asunto,texto;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);	
		/*
		WebView myWebView = (WebView) this.findViewById(R.id.webView);
		myWebView.loadUrl("http://www.gmail.com/");*/
		
		boton =(Button)findViewById(R.id.button1);
		destinatario=(EditText)findViewById(R.id.editText1);
		asunto=(EditText)findViewById(R.id.editText2);
		texto=(EditText)findViewById(R.id.editText3);
		
		boton.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
			 if(destinatario.getText().toString().equals("")){
				 enviarMail();
			 }
			}
			
		});
	}
    public void enviarMail(){
    	Intent intent = new Intent(android.content.Intent.ACTION_SEND);
    	
    	intent.setType("text/plain");
    	intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{destinatario.getText().toString()});
    	intent.putExtra(android.content.Intent.EXTRA_SUBJECT, asunto.getText().toString());
    	intent.putExtra(android.content.Intent.EXTRA_TEXT, texto.getText().toString());
    	
    	try{
    		startActivity(Intent.createChooser(intent, "Correo Enviado"));
    	}catch (Exception e){
    		e.printStackTrace();
    	}
    }

}
