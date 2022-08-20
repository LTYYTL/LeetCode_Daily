package com.leetcode.L1601_1700.L1603;

public class ParkingSystemTest {

    public static void main(String[] args) {
        /*
          示例 1：
          输入：
          ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
          [[1, 1, 0], [1], [2], [3], [1]]
          输出：
          [null, true, true, false, false]
          解释：
          ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
          parkingSystem.addCar(1); // 返回 true ，因为有 1 个空的大车位
          parkingSystem.addCar(2); // 返回 true ，因为有 1 个空的中车位
          parkingSystem.addCar(3); // 返回 false ，因为没有空的小车位
          parkingSystem.addCar(1); // 返回 false ，因为没有空的大车位，唯一一个大车位已经被占据了
         */
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        System.out.println(parkingSystem.addCar(1));
        System.out.println(parkingSystem.addCar(2));
        System.out.println(parkingSystem.addCar(3));
        System.out.println(parkingSystem.addCar(1));
    }
}
