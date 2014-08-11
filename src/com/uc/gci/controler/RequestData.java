package com.uc.gci.controler;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.json.JSONObject;

import com.lqk.framework.internet.FastHttpHander;
import com.lqk.framework.internet.InternetConfig;
import com.uc.gci.utils.Contants;


/**
 * @ClassName: RequestData
 * @Description: TODO
 * @author longqiankun
 * @date 2014-8-11 下午10:21:30
 * 
 */

public class RequestData {
/**
 * 
* @Title: getNotification
* @Description: 获取通知列表
* @param @param object 调用者对象
* @param @param isSave 是否缓存
* @param @param key 区分统一线程中多个请求
* @param @param UserId 用户编号
* @param @param BeginTime 开始时间
* @param @param EndTime 结束时间
* @return void
* @throws
 */
	public static void getNotification(Object object,boolean isSave,int key,String UserId,String BeginTime,String EndTime){
		InternetConfig config=new InternetConfig();
		config.setSave(isSave);
		config.setKey(key);
		LinkedHashMap<String, String> params=new LinkedHashMap<String, String>();
		params.put("UserId", UserId);
		params.put("BeginTime", BeginTime);
		params.put("EndTime", EndTime);
		requestGeneral(object, params, config);
	}
	
	private static void requestGeneral(Object object,LinkedHashMap<String, String> params,InternetConfig config){
		FastHttpHander.ajaxForm(Contants.url, params,null,config,object);
	}
}
