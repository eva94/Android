package com.eva.zhu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout ll=(LinearLayout)findViewById(R.id.ll);
		ScrollView scroll=new ScrollView(MainActivity.this);
		TextView textView=new TextView(MainActivity.this);
		textView.setPadding(10, 10, 10, 10);
		textView.setTextSize(25);
		scroll.addView(textView);
		textView.setText("������޲�������Ҫ�����Լ���˶���ɹ��ޡ�������³�ʱ��Ķ���"
				+ "��Ԩ����ô����ԨҲ��ͬ�������Ÿ��¡���"
				+ "������������ã��������Ϊ������������Ԩ���ã���Ԩ���������ӡ�"
				+ "����Щ�˶��ԣ��������Ǹ�𡣾������� ������ʣ�����ҫ�۹�â��ͬʱ��Ҳȼ�� ������"
				+ "����Ψһ�����ģ��������ǵ����� �����ܵ�ǳ��"
				+ "ڤڤ�У������һ˫���Ƹ����֣��Ĳ����ɵİ�Ū��ܿܿ������"
				+ "�����Ǻ���Ե�ɵİ���Ī������ĺޡ����������ֻص������б˴�����");
		ll.addView(scroll);
		
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
