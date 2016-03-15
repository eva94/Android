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
		Paint paint =new Paint();//创建Paint的对象
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
				R.drawable.viewback);//根据图片生成位图对象
		canvas.drawBitmap(bitmap, 0, 0, paint);//绘制图片
		if (bitmap.isRecycled()) {//判断图片是否回收
			bitmap.recycle();//强制回收图片
		}
	}
}

