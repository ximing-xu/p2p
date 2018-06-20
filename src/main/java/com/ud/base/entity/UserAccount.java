package com.ud.base.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

import com.ud.base.util.SystemConstant;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户账户实体类
 * 
 * @author Simon_Xu
 *
 */
@Entity
@Table(name = "userAccount")
@Setter
@Getter
public class UserAccount extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5252410528287985541L;

	@Column(name="userId",nullable=false,unique=true)
	private Long userId;//和登录账号相关联

	@Version
	private int version;// 乐观锁版本号

	@Column(name = "tradePassword")
	private String tradePassword;// 交易密码

	@Column(name = "usableAmount")
	private BigDecimal usableAmount=SystemConstant.ZERO;// 可用余额

	@Column(name = "freezedAmount")
	private BigDecimal freezedAmount=SystemConstant.ZERO;// 冻结金额
	
	@Column(name = "unReceivedInterest")
	private BigDecimal unReceivedInterest=SystemConstant.ZERO;// 待收利息
	
	@Column(name = "unReceivedPrincipal")
	private BigDecimal unReceivedPrincipal=SystemConstant.ZERO;// 待收本金
	
	@Column(name = "unReturnAmount")
	private BigDecimal unReturnAmount=SystemConstant.ZERO;// 未还本金利息总额
	
	@Column(name = "remainBorrowAmount")
	private BigDecimal remainBorrowAmount;// 剩余可借款额度

}
