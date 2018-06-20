package com.ud.base.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
abstract public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8710554968436518563L;
	@Id
	@GeneratedValue
	@Column(name="id",nullable=false,unique=true)
	protected Long id;

}
