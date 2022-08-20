package com.leetcode.L1401_1500.L1418;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayTableFoodOrdersRestaurantTest {
    public static void main(String[] args) {
        DisplayTableFoodOrdersRestaurant displayTableFoodOrdersRestaurant = new DisplayTableFoodOrdersRestaurant();
        /*
          示例 1：
          输入：orders = [["David","3","Ceviche"],["Corina","10","Beef Burrito"],["David","3","Fried Chicken"],["Carla","5","Water"],["Carla","5","Ceviche"],["Rous","3","Ceviche"]]
          输出：[["Table","Beef Burrito","Ceviche","Fried Chicken","Water"],["3","0","2","1","0"],["5","0","1","0","1"],["10","1","0","0","0"]]
          解释：
          点菜展示表如下所示：
          Table,Beef Burrito,Ceviche,Fried Chicken,Water
          3    ,0           ,2      ,1            ,0
          5    ,0           ,1      ,0            ,1
          10   ,1           ,0      ,0            ,0
          对于餐桌 3：David 点了 "Ceviche" 和 "Fried Chicken"，而 Rous 点了 "Ceviche"
          而餐桌 5：Carla 点了 "Water" 和 "Ceviche"
          餐桌 10：Corina 点了 "Beef Burrito"
         */
        List<List<String>> orders = new ArrayList<>();
        orders.add(Arrays.asList("David", "3", "Ceviche"));
        orders.add(Arrays.asList("Corina", "10", "Beef Burrito"));
        orders.add(Arrays.asList("David", "3", "Fried Chicken"));
        orders.add(Arrays.asList("Carla", "5", "Water"));
        orders.add(Arrays.asList("Carla", "5", "Ceviche"));
        orders.add(Arrays.asList("Rous", "3", "Ceviche"));

        for (List<String> order : orders) {
            System.out.println(order.toString());
        }

        System.out.println(displayTableFoodOrdersRestaurant.displayTable(orders).toString());

    }

}
