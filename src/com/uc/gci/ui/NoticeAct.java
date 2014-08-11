package com.uc.gci.ui;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.lqk.framework.inject.InjectHttp;
import com.lqk.framework.inject.InjectHttpErr;
import com.lqk.framework.inject.InjectHttpOk;
import com.lqk.framework.inject.InjectInit;
import com.lqk.framework.inject.InjectLayer;
import com.lqk.framework.internet.ResponseEntity;
import com.lqk.lib.ui.header.HeaderConfig;
import com.lqk.lib.ui.header.HeaderConfig.BtnClick;
import com.uc.gci.R;
import com.uc.gci.controler.RequestData;
import com.uc.gci.model.Notice;
import com.uc.gci.model.RequestResult;


/**
 * @ClassName: NoticeAct
 * @Description: 显示通知公告列表,注解value值是自己定义的布局，
 * 如果继承了BaseHeaderActivity，就必须添加parent=com.lqk.lib.R.id.page_content.
 * 避免写错，请直接复制
 * @author longqiankun
 * @date 2014-8-11 下午9:40:22
 * 
 */
@InjectLayer(value=R.layout.notice,parent=com.lqk.lib.R.id.page_content)
public class NoticeAct extends BaseHeaderActivity {
	List<Notice> mNotices;
	/**
	 * 注解未injectInit的方法，相当于oncreate，生命周期和他一样
	 */
	@InjectInit
	public void init(){
		//请求网络数据
		RequestData.getNotification(this, true, 333, "UserId", "BeginTime", "EndTime");
	}
	@Override
	protected HeaderConfig getHeaderConfig(HeaderConfig config) {
		config.middleTile="通知公告";
		config.isShowbtnLeft=true;
		return config;
	}
	@InjectHttpOk
	public void success(ResponseEntity entity){
		switch (entity.getKey()) {
		case 333:
			//获取服务器返回数据
			String json=entity.getContentAsString();
			//解析json
			try {
				RequestResult result = RequestResult.getResult(json);
				Gson g=new Gson();
				 Type lt=new TypeToken<List<Notice>>(){}.getType();
				 mNotices=g.fromJson(result.data,lt);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//展示列表
			
			
			break;
	
		default:
			break;
		}
		
	}
	@InjectHttpErr
	private void fail(ResponseEntity entity){
		
	}
	@InjectHttp
	private void result(ResponseEntity entity){
		
	}
	@Override
	protected void btnAction(BtnClick btnClick) {
	}

	@Override
	public void setListener() {

	}

	@Override
	public void initData() {
		mNotices=new ArrayList<Notice>();
	}

}
