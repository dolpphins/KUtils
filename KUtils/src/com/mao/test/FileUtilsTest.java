package com.mao.test;

import com.mao.kutils.FileUtils;

import android.test.AndroidTestCase;
import android.util.Log;

public class FileUtilsTest extends AndroidTestCase{
	
	private final static String TAG = "FileUtilsTest";
	
	public void test() {
		
		String path = "dews";
		boolean b = FileUtils.exist(path);
		Log.i(TAG, b + "");
	}

	
	
	
}
