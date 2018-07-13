package com.MeiTuan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MeiTuan.pojo.TBusiness;
import com.MeiTuan.service.BussinessService;


@Controller
@RequestMapping("/business")
public class BusinessController {
	@Autowired
	private BussinessService businessService;
	
	/*
	 * 跳转登录界面
	 */
	      @RequestMapping("login")
	      public String login(){
	    	  return "login";
	      }
	      
	  /*
	   * 跳转店铺界面
	   */
	      @RequestMapping("/businessManager")
	      public String businessManage(){
	    	  return "Business";
	      }
	   /*
	    * 登录验证
	    */
	      @RequestMapping("/loginValidate")
	      public String loginValidate(Model model,TBusiness tBusiness,HttpServletRequest request){
	    	  TBusiness result = businessService.findBusiness(tBusiness);
	    	  if(result==null){
	    		  model.addAttribute("errorMsg", "用户名或密码错误");
	    		  return "login";
	    	  }else{
	    		  HttpSession session = request.getSession();
	    		  session.setAttribute("business", result);
	    		  return "Business";
	    	  }   	  
	      }
	      /*
	       * 查看商家信息
	       */
	      
	      @RequestMapping("/showInfo")
	      @ResponseBody
	      public TBusiness showInfo(HttpServletRequest request){
	    	  HttpSession session = request.getSession();
	    	  TBusiness tBusiness = (TBusiness) session.getAttribute("bussiness");
	    	  return tBusiness;
	      }
	     /*
	      * 跳转注册页面
	      */
	      @RequestMapping("/register")
	      public String register(){
	    	  return "register";
	      }
	      
	      /*
	       * 注册功能
	       */
	      @RequestMapping("/insert")
	      public String insert(TBusiness tBusiness,Model model){
		    businessService.createBuss(tBusiness); 
		    model.addAttribute("msg", "注册成功");
		    return "login";
	      }
}
