package com.zoe.niftynotification;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gitonway.lee.niftynotification.lib.Effects;
import com.gitonway.lee.niftynotification.lib.NiftyNotificationView;

public class MainActivity extends ActionBarActivity {
	private Effects effect;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void showNotify(View v) {

		String msg = "Today we’d like to share a couple of simple styles and effects for android notifications.";

		switch (v.getId()) {
		case R.id.scale:
			effect = Effects.scale;
			break;
		case R.id.thumbSlider:
			effect = Effects.thumbSlider;
			break;
		case R.id.jelly:
			effect = Effects.jelly;
			break;
		case R.id.slidein:
			effect = Effects.slideIn;
			break;
		case R.id.flip:
			effect = Effects.flip;
			break;
		case R.id.slideOnTop:
			effect = Effects.slideOnTop;
			break;
		case R.id.standard:
			effect = Effects.standard;
			break;
		}
		NiftyNotificationView.build(this, msg, effect, R.id.mLyout)
				.setIcon(R.drawable.lion) // You must call this method if you
				.show();
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
}
