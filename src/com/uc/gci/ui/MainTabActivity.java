package com.uc.gci.ui;

import android.content.Intent;
import android.media.audiofx.NoiseSuppressor;
import android.os.Bundle;

import com.lqk.lib.ui.tabbar.TabBarActivity;
import com.lqk.lib.ui.tabbar.TabConfig;
import com.uc.gci.R;
import com.uc.gci.utils.Contants;



/**
 * @ClassName: MainTabActivity
 * @Description: TODO
 * @author longqiankun
 * @date 2014-7-31 下午6:06:02
 */
public class MainTabActivity extends TabBarActivity {
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setBottomBg(R.color.white);
			
			TabConfig c1=	new TabConfig(Contants.NOTICE,"通知公告", R.drawable.menu_plan_icon_s,
					R.drawable.menu_plan_icon_n, new Intent(this,NoticeAct.class), NoticeAct.class);
			c1.isSelected=true;
			c1.isPrompt=true;
			c1.promptRes=R.drawable.starting;
			addTabButton(c1);
			
			TabConfig newTabConfig=new TabConfig(Contants.TAXISERVICE,"司机服务", R.drawable.menu_setting_icon_s,
					R.drawable.menu_setting_icon_n, new Intent(this,TaxiServiceAct.class), TaxiServiceAct.class);
			addTabButton(newTabConfig);
			
			TabConfig spTabConfig=new TabConfig(Contants.MYINFO,"我的", R.drawable.photo_s,
					R.drawable.photo_n, new Intent(this,MyInfoAct.class), MyInfoAct.class);
			addTabButton(spTabConfig);
			
			addTabButton(new TabConfig(Contants.MOER,"更多", R.drawable.zonghe_s,
			R.drawable.zonghe_icon_n, new Intent(this,MoreAct.class), MoreAct.class));
			
			commit();
			
			updateBodyView(NoticeAct.class, new Intent(this,NoticeAct.class));
		}

}
