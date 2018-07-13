package com.MeiTuan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.MeiTuan.pojo.TFood;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meituan.service.FoodService;

@Controller
@RequestMapping("/food")
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	/*
	 * 跳转管理菜色页面
	 */
     @RequestMapping("/show")
     public String Adminfood(){
    	return "food/adminAllFoods";
     }
     
     @RequestMapping(value="/showData",method = {RequestMethod.POST,RequestMethod.GET })
     public String showAllFood(HttpServletRequest request,Model model){
    	 String pageNum = request.getParameter("pageNum");
         String pageSize =request.getParameter("pageSize");
         int num = 1;
         int size = 10;
         if (pageNum != null && !"".equals(pageNum)) {
             num = Integer.parseInt(pageNum);
         }   
         if (pageSize != null && !"".equals(pageSize)) {
             size = Integer.parseInt(pageSize);
         }
         PageHelper.startPage(num, size);
     	List<TFood> food = foodService.showAllfood();
     	PageInfo<TFood> pages = new PageInfo<TFood>(food);
     	request.setAttribute("pages", pages);
     	return "food/adminAllFoods";
     }
      /*
       * 根据Id删除食品
       */
     @RequestMapping("/delete")
     public String delete(Integer foodId){
    	 foodService.delFood(foodId);
    	 return "redirect:showData";
     }
     
}
