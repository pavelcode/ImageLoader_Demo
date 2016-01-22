package com.example.imageloader;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.sample.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * 修改显示图片的大小ImageSize
 * @author pavel
 *
 */
public class ImageLoaderDemo03 extends Activity {
	
	private ImageView iv;
	private String picUrl="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageloader_demo03);
		iv = (ImageView)findViewById(R.id.imageloader_demo03_iv);
		ImageSize imageSize = new ImageSize(100, 100);
		ImageLoader.getInstance().loadImage(picUrl,imageSize,new SimpleImageLoadingListener(){
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
