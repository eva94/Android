package com.eva.zhu;

import com.eva.zhu.R;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView)findViewById(R.id.show);
		registerForContextMenu(tv);
	}


	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		MenuInflater inflator=new MenuInflater(this);
		inflator.inflate(R.menu.contextmenu, menu);
		menu.setHeaderIcon(R.drawable.ic_launcher);
		menu.setHeaderTitle("请选择");
		
	}
	
	public boolean onContextItemSelected(MenuItem item) {
		switch(item.getItemId()){
			case R.id.color1:		//当选择红颜色时
				tv.setTextColor(Color.rgb(255, 0, 0));
				break;
			case R.id.color2:		//当选择绿颜色时
				tv.setTextColor(Color.rgb(0, 255, 0));
				break;
			case R.id.color3:		//当选择蓝颜色时
				tv.setTextColor(Color.rgb(0, 0, 255));
				break;
			case R.id.color4:		//当选择橙色时
				tv.setTextColor(Color.rgb(255, 180, 0));
				break;
			default:
				tv.setTextColor(Color.rgb(0, 0, 0));
		}
		return true;
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
