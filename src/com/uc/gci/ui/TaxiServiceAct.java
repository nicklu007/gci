package com.uc.gci.ui;

import com.lqk.framework.inject.InjectInit;
import com.lqk.framework.inject.InjectLayer;
import com.lqk.lib.ui.header.HeaderConfig;
import com.lqk.lib.ui.header.HeaderConfig.BtnClick;
import com.uc.gci.R;


/**
 * @ClassName: NoticeAct
 * @Description: TODO
 * @author longqiankun
 * @date 2014-8-11 下午9:40:22
 * 
 */
@InjectLayer(value=R.layout.taxi_service,parent=com.lqk.lib.R.id.page_content)
public class TaxiServiceAct extends BaseHeaderActivity {
	/**
	 * 注解未injectInit的方法，相当于oncreate，生命周期和他一样
	 */
	@InjectInit
	public void init(){
		
	}
	@Override
	protected HeaderConfig getHeaderConfig(HeaderConfig config) {
		config.middleTile="司机服务";//顶部中间标题
		//config.isShowIbLeft=true;//是否显示顶部左边图片按钮
		config.isShowbtnLeft=true;//是否显示顶部左边普通按钮
		//config.btn_top_leftbg //顶部左边背景
		//顶部所有配置看headerConfig类
		return config;
	}

	@Override
	protected void btnAction(BtnClick btnClick) {
		
	}

	@Override
	public void setListener() {

	}

	@Override
	public void initData() {
	}

}
