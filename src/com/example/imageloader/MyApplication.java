package com.example.imageloader;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
	
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Log.i("aaa", "初始化ImageLoader");
		//ImageLoaderConfiguration config = ImageLoaderConfiguration.createDefault(this);
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
		.writeDebugLogs()  //打印log日志
		.build();
		ImageLoader.getInstance().init(config);
	}

}
