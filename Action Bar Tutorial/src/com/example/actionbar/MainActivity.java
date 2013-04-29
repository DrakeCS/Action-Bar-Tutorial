//Following tutorial at: http://www.youtube.com/watch?v=J5a1gD1p_8w 
//As well as http://www.youtube.com/watch?v=Rv5tRtPiGpc
package com.example.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	private final String TAG = "Main Activity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//The line below initializes the action bar, but doesnt actually add items.
		//This is done in the main.xml file in the menu folder
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	//This is where the magic happens. When a menu item is clicked, the switch statement handles what
	//should be shown in the LogCat.
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
		case R.id.twitter:
			Log.i(TAG, "Twitter Item Clicked");
			return true;
		case R.id.facebook:
			Log.i(TAG, "Facebook Item Clicked");
			return true;
		case R.id.refresh:
			Log.i(TAG, "Refresh Item Clicked");
			return true;
		default:
				return super.onOptionsItemSelected(item);
			
		}
	}

}
