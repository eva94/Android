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
        
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.mylayout);//��ȡ֡���ֹ�����
        final UserView view=new UserView(MainActivity.this);//������ʵ����RabbitView��
        //��Ӵ����¼�����
        view.setOnTouchListener(new OnTouchListener() {  	
        	@Override
        	public boolean onTouch(View v, MotionEvent event) {
        		view.invalidate();//�ػ�view���
        		return true;
        	}
        });
        frameLayout.addView(view);//��view��ӵ����ֹ�������
    }
}