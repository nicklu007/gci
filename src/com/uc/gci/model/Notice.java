package com.uc.gci.model;

import com.lqk.framework.db.annotation.Column;
import com.lqk.framework.db.annotation.Table;
import com.lqk.framework.db.annotation.Unique;


/**
 * @ClassName: Notice
 * @Description: TODO
 * @author longqiankun
 * @date 2014-8-11 下午10:11:25
 * 
 */
@Table(name="Notice")
public class Notice {
	/**公告编号*/
	@Unique public String NoticeId;
	/**消息等级*/
	@Column public int Level;
	/**发布单位*/
	@Column	public String NoticeUnit;
	/**标题*/
	@Column	public String Title;
	/**内容*/
	@Column public String Content;
	/**发布时间*/
	@Column	public String NoticeTIme;
	/**公告是否已读*/
	@Column public boolean  IsRead;
}
