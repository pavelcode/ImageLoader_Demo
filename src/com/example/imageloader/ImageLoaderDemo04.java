package com.example.imageloader;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.DisplayImageOptions.Builder;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.sample.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * 设置显示图片的选项
 * @author pavel
 *
 */
public class ImageLoaderDemo04 extends Activity {
	
	private ImageView iv;
	//private String picUrl="";
	private String picUrl="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageloader_demo03);
		iv = (ImageView)findViewById(R.id.imageloader_demo03_iv);
		ImageSize imageSize = new ImageSize(100, 100);
		
		DisplayImageOptions options = new DisplayImageOptions.Builder()
		.showImageOnLoading(R.drawable.ic_stub)  //加载图片的时候显示 看不出效果
		.showImageForEmptyUri(R.drawable.ic_empty) //没有图片的时候，默认显示
		.showImageOnFail(R.drawable.ic_error)//图片加载/编码过程中错误的时候显示  没有显示出来
		.cacheOnDisk(true)
		.cacheInMemory(true) //不要使用 
		//.displayer(new RoundedBitmapDisplayer(20))//圆角显示 这行不能用 会出现异常
		.delayBeforeLoading(1000)
		.build();
		
		
		ImageLoader.getInstance().loadImage(picUrl,imageSize,options,new SimpleImageLoadingListener(){
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
