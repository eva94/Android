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
		textView.setText("“与怪兽搏斗的人要谨防自己因此而变成怪兽。如果阁下长时间的盯着"
				+ "深渊，那么，深渊也会同样回望着阁下。”"
				+ "与恶龙纠缠过久，自身亦成为恶龙；凝视深渊过久，深渊将回以凝视。"
				+ "对有些人而言，相遇即是告别。就像流星 划过天际，发出耀眼光芒的同时，也燃烧 殆尽。"
				+ "他们唯一能做的，就是让那道划痕 尽可能地浅。"
				+ "冥冥中，真的有一双翻云覆雨手，心不在焉的摆弄着芸芸众生，"
				+ "让我们毫无缘由的爱，莫名其妙的恨。让我们在轮回的漩涡中彼此依赖");
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
