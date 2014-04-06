package com.example.webapp_boilerplate.utils;

import android.content.Context;
import android.net.ConnectivityManager;

public class ConnectionInternet {

	/**
	 * Method to check whether the device is connected to internet
	 * @param context - context in which the check will
	 * @return TRUE   - if the device is connected
	 */
	public static boolean checkStatusInternet(Context context){
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    	if (cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).isConnected()) { /* 3G */
    		return true;
    	} else if (cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI).isConnected()) { /* WIFI */
    		return true;
    	} else {
    		return false;
    	}		
	}
}