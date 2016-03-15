package com.eva.activity;

import android.support.v7.app.ActionBarActivity;

import com.eva.activity.MainActivity;
import com.eva.activity.R;
import com.eva.activity.UserView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.mylayout);//获取帧布局管理器
        final UserView view=new UserView(MainActivity.this);//创建并实例化RabbitView类
        //添加触摸事件监听
        view.setOnTouchListener(new OnTouchListener() {  	
        	@Override
        	public boolean onTouch(View v, MotionEvent event) {
        		view.invalidate();//重绘view组件
        		return true;
        	}
        });
        frameLayout.addView(view);//将view添加到布局管理器中
    }
}