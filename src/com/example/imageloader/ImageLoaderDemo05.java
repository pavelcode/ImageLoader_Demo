package com.example.imageloader;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme;
import com.nostra13.universalimageloader.sample.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * 使用displayImage显示
 * @author pavel
 *
 */
public class ImageLoaderDemo05 extends Activity {

	private String picUrl="https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png";
	
	private ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageloader_demo05);
		imageView = (ImageView)findViewById(R.id.imageloader_demo05_iv);
		
		//SD卡路径
		String sdcardImageUrl = Scheme.FILE.wrap("mnt/sdcard/a.png");
		//内容提供者路径
		String contentproviderUrl="content://";
		//asset文件夹
		String assetImageUrl = Scheme.ASSETS.wrap("a.png");
		//Drawable
		String drawableImageUrl = Scheme.DRAWABLE.wrap("R.drawble.image");
		
		ImageLoader.getInstance().displayImage(picUrl, imageView);
	}
}
