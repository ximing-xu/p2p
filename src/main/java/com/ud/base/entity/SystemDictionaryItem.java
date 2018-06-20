package com.ud.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="systemDictionaryItem")
@Getter
@Setter
public class SystemDictionaryItem extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -450513829546819868L;
	
	@Column(name="parentId")
	private Long parentId;//数据字典明细对应的数据字典分类大纲
	
	@Column(name="title")
	private String title;//数据字典名称
	
	@Column(name="content")
	private String content;//数据字典明细的内容
	
	@Column(name="sequence")
	private Integer sequence;//在下拉列表中明细的排序
	
	@Column(name="profile")
	private String profile;//该明细的描述

}
