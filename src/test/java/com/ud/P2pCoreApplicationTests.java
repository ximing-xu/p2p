package com.ud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ud.base.dao.SystemDictionaryDAO;
import com.ud.base.dao.SystemDictionaryItemDAO;
import com.ud.base.dao.UserAccountDAO;
import com.ud.base.dao.UserInfoDAO;
import com.ud.base.entity.SystemDictionary;
import com.ud.base.entity.SystemDictionaryItem;
import com.ud.base.entity.UserAccount;
import com.ud.base.entity.UserInfo;
import com.ud.base.util.BitStatesUtils;
import com.ud.base.util.SystemConstant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class P2pCoreApplicationTests {
	
	@Autowired
	private UserAccountDAO userAccountDAO;
	@Test
	public void testUserAccount() throws Exception {
		UserAccount account = new UserAccount();
		account.setTradePassword("123");
		account.setUserId(11L);
		account.setRemainBorrowAmount(SystemConstant.ZERO);
		userAccountDAO.save(account);
	}
	
	@Autowired
	private SystemDictionaryDAO systemDictionaryDAO;
	@Test
	public void testSystemDictionary() throws Exception {
		SystemDictionary dictionary = new SystemDictionary();
		dictionary.setTitle("婚姻状况");
		dictionary.setSn("marriage condition");
		dictionary.setProfile("用来描述用户的婚姻状况的");
		systemDictionaryDAO.save(dictionary);
		
	}
	@Autowired
	private SystemDictionaryItemDAO systemDictionaryItemDAO;
	@Test
	public void testSystemDictionaryItem() throws Exception {
		SystemDictionaryItem item = new SystemDictionaryItem();
		item.setContent("已婚多年");
		item.setParentId(19L);
		item.setProfile("已婚选项就是这个");
		item.setSequence(1);//已婚在列表中在第一个位置显示
		item.setTitle("已婚");
		systemDictionaryItemDAO.save(item);
	}
	
	@Autowired
	private UserInfoDAO userInfoDAO;
	@Test
	public void testUserInfo() throws Exception {
		UserInfo userInfo = new UserInfo();
		//userInfo.setId(1L);//数据库自动生成
		userInfo.setUserId(11L);
		userInfo.setBitState(BitStatesUtils.USER_PRIMARY_STATE);
		userInfo.setIdNumber("4408811");
		userInfo.setPhoneNumber("13267..");
		userInfo.setRealName("Simon");
		
		SystemDictionaryItem item = new SystemDictionaryItem();
		item.setContent("已婚多年");
		item.setParentId(19L);
		item.setProfile("已婚选项就是这个");
		item.setSequence(1);//已婚在列表中在第一个位置显示
		item.setTitle("已婚");
		item.setId(21L);
		
		userInfo.setEducationBackground(item);
		userInfo.setHouseCondition(item);
		userInfo.setIncomeGrade(item);
		userInfo.setKidDetail(item);
		userInfo.setMarriage(item);
		userInfoDAO.save(userInfo);
	}
	
	
}
