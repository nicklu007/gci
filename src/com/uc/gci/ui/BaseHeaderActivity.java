package com.uc.gci.ui;

import android.graphics.Color;
import android.view.View;

import com.lqk.framework.inject.InjectInit;
import com.lqk.framework.inject.InjectPLayer;
import com.lqk.framework.inject.InjectResume;
import com.lqk.lib.R;
import com.lqk.lib.ui.header.HeaderActivity;
import com.lqk.lib.ui.header.HeaderConfig;
import com.lqk.lib.ui.header.HeaderConfig.BtnClick;


/**
 * @ClassName: BaseHeaderActivity
 * @Description: TODO
 * @author longqiankun
 * @date 2014-8-6 上午9:38:26
 * 
 */
@InjectPLayer(R.layout.header)
public abstract class BaseHeaderActivity extends HeaderActivity {
	boolean isFisrt=true;
	protected MainTabActivity mParent;
	@InjectInit
	public void init(){
		if(getParent() instanceof MainTabActivity){
			mParent=(MainTabActivity) getParent();
		}
	}
	@InjectResume
	public void resume(){
		if(isFisrt){
			isFisrt=false;
		initHeader(this.getWindow().getDecorView());
		}
	}
	@Override
	protected HeaderConfig getHeaderConfig(){
		HeaderConfig config=new HeaderConfig();
		config.top_bg=Color.WHITE;
		return getHeaderConfig(config);
	}
	protected abstract HeaderConfig getHeaderConfig(HeaderConfig config);
}
