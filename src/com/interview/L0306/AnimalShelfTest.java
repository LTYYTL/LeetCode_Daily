package com.interview.L0306;

import java.util.Arrays;

public class AnimalShelfTest {
    public static void main(String[] args) {
        /*
          示例1:
           输入：
          ["AnimalShelf", "enqueue", "enqueue", "dequeueCat", "dequeueDog", "dequeueAny"]
          [[], [[0, 0]], [[1, 0]], [], [], []]
           输出：
          [null,null,null,[0,0],[-1,-1],[1,0]]
         */
        AnimalShelf animalShelf = new AnimalShelf();
        animalShelf.enqueue(new int[]{0, 0});
        animalShelf.enqueue(new int[]{1, 0});
        System.out.println(Arrays.toString(animalShelf.dequeueCat()));
        System.out.println(Arrays.toString(animalShelf.dequeueDog()));
        System.out.println(Arrays.toString(animalShelf.dequeueAny()));
        /*
          示例2:
           输入：
          ["AnimalShelf", "enqueue", "enqueue", "enqueue", "dequeueDog", "dequeueCat", "dequeueAny"]
          [[], [[0, 0]], [[1, 0]], [[2, 1]], [], [], []]
           输出：
          [null,null,null,null,[2,1],[0,0],[1,0]]
         */
        animalShelf = new AnimalShelf();
        animalShelf.enqueue(new int[]{0, 0});
        animalShelf.enqueue(new int[]{1, 0});
        animalShelf.enqueue(new int[]{2, 1});
        System.out.println(Arrays.toString(animalShelf.dequeueDog()));
        System.out.println(Arrays.toString(animalShelf.dequeueCat()));
        System.out.println(Arrays.toString(animalShelf.dequeueAny()));
    }
}
