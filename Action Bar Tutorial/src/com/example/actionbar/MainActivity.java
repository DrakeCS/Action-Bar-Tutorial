//Following tutorial at: http://www.youtube.com/watch?v=J5a1gD1p_8w 
//As well as http://www.youtube.com/watch?v=Rv5tRtPiGpc
package com.example.actionbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends BaseActivity {
	//private final String TAG = "Main Activity";

	Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (Button) findViewById(R.id.PressMe);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), SecondScreen.class);
				startActivity(intent);
			}
		});
	}

	
	
}
