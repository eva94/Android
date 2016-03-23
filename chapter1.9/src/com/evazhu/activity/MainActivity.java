package com.evazhu.activity;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private class TabContentFragment extends Fragment
	{
		private String message;
		public TabContentFragment(String message)
		{
			this.message=message;
		}
		@Override
		
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View fragView=inflater.inflate(R.layout.tab_content, container, false);
			TextView text=(TextView)fragView.findViewById(R.id.tab_content);
			text.setText(message);
			return fragView;
		}
		
	}
	
	private class MyTabListener implements TabListener
	{
		private TabContentFragment fragment;
		public  MyTabListener(TabContentFragment fragment) {
			
			this.fragment=fragment;// TODO Auto-generated constructor stub
		}
		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			ft.add(R.id.frameLayout, fragment);
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			ft.remove(fragment);
			
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ActionBar bar=getActionBar();
		bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		Button addTabs=(Button) findViewById(R.id.addButton);
		addTabs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String title="Ñ¡Ïî¿¨£º"+bar.getTabCount();
				Tab tab=bar.newTab();
				tab.setText(title);
				tab.setTabListener(new MyTabListener(new TabContentFragment(title)));
				bar.addTab(tab);
				
				
			}
		});
		Button removeTabs=(Button)findViewById(R.id.removeButton);
		removeTabs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bar.removeTabAt(bar.getTabCount()-1);
			}
		});
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
