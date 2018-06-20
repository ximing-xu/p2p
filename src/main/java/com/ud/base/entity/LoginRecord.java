package com.ud.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
/**
 * 登录日志对象
 * 
 * @author Simon_Xu
 *
 */
@Entity
@Table(name="loginRecord")
@Getter
@Setter
public class LoginRecord extends BaseEntity{

	public static final int LOGIN_SUCCESS=0;//登录成功
	public static final int LOGIN_FAILURE=1;//登录失败
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2816311490085583601L;
	
	@Column(name="ip")
	private String ip;//登录的ip地址
	
	@Column(name="state")
	private int state;//登录状态
	
	@Column(name="loginDate")
	@Temporal(TemporalType.DATE)
	private Date loginDate;//登录时间
	
	@Column(name="username")
	private String username;//登录的用户名
	
	
}
