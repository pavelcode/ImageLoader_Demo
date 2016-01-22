package com.example.imageloader;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.sample.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * 使用SimpleImageLoadingListener加载图片
 * @author pavel
 *
 */
public class ImageLoaderDemo02 extends Activity {
	
	
	private ImageView iv;
	private String picUrl="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageloader_demo02);
		iv = (ImageView)findViewById(R.id.imageloader_demo02_iv);
		ImageLoader.getInstance().loadImage(picUrl, new SimpleImageLoadingListener(){
			@Override
			public void onLoadingComplete(String imageUri, View view,
					Bitmap loadedImage) {
				// TODO Auto-generated method stub
				super.onLoadingComplete(imageUri, view, loadedImage);
				iv.setImageBitmap(loadedImage);
			}
		});
	}

}
