package com.example.webapp_boilerplate.activities;



import com.example.webapp_boilerplate.R;
import android.app.Activity;
import android.os.Bundle;

/**
 * 
 * Activity that appears if the device does not have internet connection
 *
 */
public class Erro404Activity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_erro_404);
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}
}