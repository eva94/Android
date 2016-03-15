package com.eva.activity;

import com.eva.activity.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class UserView extends View {
	
	

	public UserView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint paint =new Paint();//����Paint�Ķ���
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.viewback);//����ͼƬ����λͼ����
		canvas.drawBitmap(bitmap, 0, 0, paint);//����ͼƬ
		if (bitmap.isRecycled()) {//�ж�ͼƬ�Ƿ����
			bitmap.recycle();//ǿ�ƻ���ͼƬ
		}
	}
}

