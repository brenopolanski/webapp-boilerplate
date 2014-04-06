package com.example.webapp_boilerplate.activities;

import com.example.webapp_biolerplate.utils.ConnectionInternet;
import com.example.webapp_boilerplate.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebAppActivity extends Activity {

	/* Constant that represents the web address that will be loaded in WebView */
	private final String URL = "http://www.your-page.com";
	
	/* Declaring components created in the layout (activity_webapp) */
	private WebView webview;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webapp);
		webview = (WebView)findViewById(R.id.webView_web_app); /* Instantiating object WebView */
		if(ConnectionInternet.verificaStatusInternet(this)){
			set_web_View(webview, URL);
		}else{
			/* Opening Erro404Activity */
			Intent intent = new Intent();
			intent.setClass(this, Erro404Activity.class);
			startActivity(intent);
			finish();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * Method to set the component properties WebView
	 * @param webview - WebView declared in the layout corresponding to activity 
	 * @param url     - Address of the web page that will be loaded in WebView
	 */
	public void set_web_View(WebView webview,String url) {
		webview.setWebViewClient(new WebViewClient());
		webview.getSettings().setJavaScriptEnabled(true); /* Enabling JavaScript */
		webview.getSettings().setDomStorageEnabled(true); /* Disabling the address bar */
		webview.loadUrl(url); /* Loading web page in WebView */
	}

	/**
	 * Method that is executed when the user clicks the back button android
	 */
	@Override
	public void onBackPressed() {
		/* Viewing alertDialogWebAppActivity */
		alertDialogWebAppActivity("WEB APP", "Are you sure you want to Logout?");
	}

	/**
	 * Method to display alert
	 * @param title   - Title of the message that is displayed
	 * @param message - Description with the message that will be displayed
	 */
	public void alertDialogWebAppActivity(String title
			, String message) {
		/* Creating alert to the current context (WebAppActivity) */
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

		/* By setting title */
		alertDialog.setTitle(title);

		/* By setting the alert message */
		alertDialog.setMessage(message);

		/* Setting the icon that appears in the message */
		alertDialog.setIcon(R.drawable.icon);

		/* By setting "YES" button */
		alertDialog.setPositiveButton("YES",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						finish(); /*
								   * If the user clicks on the "YES" the activity
								   * will be finalized
								   */
					}
				});

		/* By setting button "No" */
		alertDialog.setNegativeButton("NO",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel(); /*
										  * If the user clicks on the "NO" the
										  * alert will be canceled without ending the
										  * activity
										  */
					}
				});

		/* Viewing the Alert */
		alertDialog.show();
	}
}