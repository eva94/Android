package com.eva.zhu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	private static final String[] autoInfo=new String[]
			{"��Ȼ������","����ѩ","ҹ��","ʮһ�µ�Ф��","ҹ�ĵ�����","���˲����"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//������������������ʾ��ʽΪ������ʾ
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
				android.R.layout.simple_dropdown_item_1line,autoInfo);
		//�ҵ������ļ��е�AutoCompleteTextView�ؼ�
		AutoCompleteTextView actxTextView=(AutoCompleteTextView) findViewById(R.id.actxt);
		//��������Դ
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
