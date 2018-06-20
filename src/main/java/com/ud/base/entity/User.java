package com.ud.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * 平台用户
 * 
 * @author Simon_Xu
 *
 */

@Entity
@Table(name="user")
@Getter
@Setter
@ToString
public class User extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8564654311671754544L;
	
	public static final int STATE_NORMAL=0;//用户为普通正常状态
	public static final int STATE_LOCK=1;//用户为锁定状态
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="state")
	private Integer state=STATE_NORMAL;//用户状态

}
