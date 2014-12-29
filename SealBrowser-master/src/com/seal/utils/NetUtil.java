package com.seal.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.seal.ui.activities.SLAppication;

/**
 * Created by Ho on 2014/7/10.
 */
public class NetUtil {

	public enum NetType {
		WIFI, GPRS, NET,
	}

	/**
	 * 检测网络是否可用
	 * 
	 * @return
	 */
	public static boolean isNetworkConnected() {
		ConnectivityManager cm = (ConnectivityManager) SLAppication.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo ni = cm.getActiveNetworkInfo();
		if (ni != null) {
			return ni.isAvailable();
		}
		return false;
	}

	/**
	 * 获取当前网络类型
	 * 
	 * @return
	 */
	public NetType getNetType() {
		return NetType.WIFI;
	}
}
