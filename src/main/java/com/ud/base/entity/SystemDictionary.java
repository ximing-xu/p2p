package com.ud.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="systemDictionary")
@Setter@Getter
public class SystemDictionary extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2372676401445638484L;
	
	@Column(name="sn")
	private String sn;//数据字典编号
	
	@Column(name="title")
	private String title;//数据字典名字(婚姻情况/子女情况/收入情况/住房情况)
	
	@Column(name="profile")
	private String profile;//数据字典简介
	
	
	
	
}
