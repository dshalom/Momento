package com.patterns.davidshalom.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		doStuff();
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	private void doStuff() {

		NumberProgram numberProgram = new NumberProgram();

		numberProgram.setNumber(4);
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.setNumber(5);
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.setNumber(6);
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.setNumber(7);
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.undo();
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.undo();
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.undo();
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.undo();
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());

		numberProgram.undo();
		android.util.Log.e("DSDS", "Current number is : " + numberProgram.getNumber());


	}
}
