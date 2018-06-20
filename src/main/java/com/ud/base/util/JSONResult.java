package com.ud.base.util;

import lombok.Getter;
import lombok.Setter;

/**
 * JSON对象
 * @author Simon_Xu
 *
 */
@Getter
@Setter
public class JSONResult {

	private String msg;
	private boolean success = true;

	public JSONResult(String msg, boolean success) {
		super();
		this.msg = msg;
		this.success = success;
	}

	public JSONResult(String msg) {
		super();
		this.msg = msg;
	}

	public JSONResult() {
		super();
	}

}
