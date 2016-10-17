package com.desolate.utils;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

public class ReturnModel {


	public static ModelMap createModelMap(String statusCode,Object data){
		ModelMap status = new ModelMap();
		status.put("status",statusCode);
		status.put("data", data);
		return status;
	}


	public static ModelAndView createModelAndView(String url, Object data){
		ModelAndView status = new ModelAndView();
		status.setViewName(url);
		status.addObject("data",data);
		return status;
	}

}

/**
 * 生成返回对象异常类
 * @author lys
 * @since 2015-10-23
 * @version 1.0
 *
 */
class ReturnMessageException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2650162610806260630L;

	public ReturnMessageException(String message){
		super(message);
	}
}
