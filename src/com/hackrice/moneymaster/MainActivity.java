package com.hackrice.moneymaster;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		Button b = (Button) findViewById(R.id.button1);
		b.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				Class newClass;
				try{
					newClass = Class.forName("com.hackrice.moneymaster.HomeScreen");
					Intent i = new Intent(MainActivity.this, newClass);
					startActivity(i);
				} catch(ClassNotFoundException e){
					e.printStackTrace();
				}
				
				
			}
			
		});
		
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return false;
	}

	

}
