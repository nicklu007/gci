package com.uc.gci.model;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * @ClassName: RequestResult
 * @Description: TODO
 * @author longqiankun
 * @date 2014-8-11 下午10:50:46
 * 
 */

public class RequestResult {
	public String AccessToken;
	public String Result;
	public String Messages;
	public String data;
	boolean isSuccess;
	public static RequestResult getResult(String json) throws JSONException{
		RequestResult rr=new RequestResult();
		JSONObject obj=new JSONObject(json);
		rr.AccessToken=obj.optString("AccessToken");
		rr.Result=obj.optString("Result");
		rr.Messages=obj.optString("Messages");
		rr.data=obj.optString("data");
		rr.isSuccess=1==Integer.valueOf(rr.Result)?true:false;
		return rr;
	}
}
