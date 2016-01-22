package com.example.imageloader;


import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.sample.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * 使用ImageLoadingListener加载图片
 * @author pavel
 *
 */
public class ImageLoaderDemo01 extends Activity {

	
	
	private ImageView imageView;
	private String picUrl="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageloader_demo01);
		imageView = (ImageView)findViewById(R.id.imageloader_demo01_iv);
		
		ImageLoader.getInstance().loadImage(picUrl, new ImageLoadingListener() {
			
			@Override
			public void onLoadingStarted(String arg0, View arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onLoadingFailed(String arg0, View arg1, FailReason arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
				// TODO Auto-generated method stub
				imageView.setImageBitmap(loadedImage);
				
			}
			
			@Override
			public void onLoadingCancelled(String arg0, View arg1) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}

	
}
