package com.example.sampl2;

import android.app.Activity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;

public class SampleActivity extends Activity {
	Spinner spinner ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample);
		spinner = new Spinner(SampleActivity.this);
		
	}
}
