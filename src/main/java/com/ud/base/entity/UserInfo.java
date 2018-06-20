package com.ud.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.ud.base.util.BitStatesUtils;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "userInfo")
@Getter
@Setter
public class UserInfo extends BaseEntity  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2053281758443765157L;
	
	@Column(name="userId",nullable=false,unique=true)
	private Long userId;//和登录账号相关联

	
	@Version
	private int version;// 版本号,用于乐观锁

	@Column(name = "bitState")
	private Long bitState = BitStatesUtils.USER_PRIMARY_STATE;// 用户是否存在各种状态,用二进制中的0和1表示

	@Column(name = "realName")
	private String realName;// 用户真实姓名

	@Column(name = "idNumber")
	private String idNumber;// 用户的身份证号

	@Column(name = "phoneNumber")
	private String phoneNumber;// 手机号码

	@OneToOne
	@JoinColumn(name = "kidDetailId")
	private SystemDictionaryItem kidDetail;// 子女情况

	@OneToOne
	@JoinColumn(name = "marriageId")
	private SystemDictionaryItem marriage;// 婚姻状况

	@OneToOne
	@JoinColumn(name = "incomeGradeId")
	private SystemDictionaryItem incomeGrade;// 收入水平

	@OneToOne
	@JoinColumn(name = "educationBackgroundId")
	private SystemDictionaryItem educationBackground;// 学历

	@OneToOne
	@JoinColumn(name = "houseConditionId")
	private SystemDictionaryItem houseCondition;// 住房信息
	
	public boolean isRealNameAuth(){
		return BitStatesUtils.hasState(this.bitState, BitStatesUtils.USER_REALNAME_AUTH);
	}
	public boolean isBindPhone(){
		return BitStatesUtils.hasState(this.bitState, BitStatesUtils.USER_BIND_PHONE);
	}
	public boolean isBindEmail(){
		return BitStatesUtils.hasState(this.bitState, BitStatesUtils.USER_BIND_EMAIL);
	}

}
