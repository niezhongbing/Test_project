package com.itmayiedu.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "/error";
	@ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ModelAndView jsonErrorHandler(HttpServletRequest req, Exception e)throws Exception{
		ErrorInfo<String> errorInfo = new ErrorInfo<String>();
		errorInfo.setMessage(e.toString());
		errorInfo.setCode(errorInfo.ERROR);
		errorInfo.setData(e.getMessage());
		errorInfo.setUrl(req.getRequestURL().toString());
		 ModelAndView mav = new ModelAndView();
	        mav.addObject("exception", e);
	        mav.addObject("errorinfo", errorInfo);
	        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
	/*@ExceptionHandler(value = RuntimeException.class)
	@ResponseBody
	public Map<String, Object> exceptionHandler(){
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("code", "500");
		result.put("msg", "亲，系统错误,请稍后重试");
		return result;
	}*/
}
