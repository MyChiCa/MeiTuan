package com.meituan.service;

import java.util.List;
import com.MeiTuan.pojo.TFood;
import com.MeiTuan.pojo.TMenu;


public interface FoodService {
       public List<TFood> showAllfood();
       public void delFood(Integer foodId);
       public List<TMenu> selectAllMenu(Integer foodId);
}
