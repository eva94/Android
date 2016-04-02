package com.eva.zhu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	private static final String[] autoInfo=new String[]
			{"依然范特西","发如雪","夜曲","十一月的肖邦","夜的第七章","超人不会飞"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//创建适配器，设置显示方式为下拉显示
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line,autoInfo);
		//找到布局文件中的AutoCompleteTextView控件
		AutoCompleteTextView actxTextView=(AutoCompleteTextView) findViewById(R.id.actxt);
		//设置数据源
		actxTextView.setAdapter(adapter);
		
		
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
