package com.interview.L0306;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 面试题 03.06. 动物收容所
 * 动物收容所。有家动物收容所只收容狗与猫，且严格遵守“先进先出”的原则。
 * 在收养该收容所的动物时，收养人只能收养所有动物中“最老”（由其进入收容所的时间长短而定）的动物，或者可以挑选猫或狗（同时必须收养此类动物中“最老”的）。
 * 换言之，收养人不能自由挑选想收养的对象。请创建适用于这个系统的数据结构，实现各种操作方法，比如enqueue、dequeueAny、dequeueDog和dequeueCat。
 * 允许使用Java内置的LinkedList数据结构。
 *
 * (1)enqueue方法有一个animal参数，animal[0]代表动物编号，animal[1]代表动物种类，其中 0 代表猫，1 代表狗。
 * (2)dequeue*方法返回一个列表[动物编号, 动物种类]，若没有可以收养的动物，则返回[-1,-1]。
 *
 * 示例1:
 *  输入：
 * ["AnimalShelf", "enqueue", "enqueue", "dequeueCat", "dequeueDog", "dequeueAny"]
 * [[], [[0, 0]], [[1, 0]], [], [], []]
 *  输出：
 * [null,null,null,[0,0],[-1,-1],[1,0]]
 *
 * 示例2:
 *  输入：
 * ["AnimalShelf", "enqueue", "enqueue", "enqueue", "dequeueDog", "dequeueCat", "dequeueAny"]
 * [[], [[0, 0]], [[1, 0]], [[2, 1]], [], [], []]
 *  输出：
 * [null,null,null,null,[2,1],[0,0],[1,0]]
 *
 * 说明:
 * 收纳所的最大容量为20000
 */
public class AnimalShelf {
    /**
     * 方法：队列
     */
    //存储所有动物
    private final Queue<Integer> queue;
    //存储狗
    private final Queue<Integer> dog;
    //存储猫
    private final Queue<Integer> cat;

    //初始化
    public AnimalShelf() {
        queue = new LinkedList<>();
        dog = new LinkedList<>();
        cat = new LinkedList<>();
    }

    //存入动物
    public void enqueue(int[] animal) {
        //动物编号
        int id = animal[0];
        //动物种类
        int type = animal[1];
        //放入队列
        queue.offer(id);
        //放入对应种类的队列
        if (type == 0)
            cat.offer(id);
        if (type == 1)
            dog.offer(id);
    }

    //弹出队首动物
    public int[] dequeueAny() {
        //队列为空直接返回
        if (queue.isEmpty())
            return new int[]{-1,-1};
        //队首动物编号
        int id = queue.poll();
        //动物种类
        int type = -1;
        //狗队列不为空，并且当前编号等于队首编号，将其弹出，动物种类变成狗
        if (!dog.isEmpty() && dog.peek() == id){
            type = 1;
            dog.poll();
        }
        //猫队列不为空，并且当前编号等于队首编号，将其弹出，动物种类变成猫
        if (!cat.isEmpty() && cat.peek() == id){
            type = 0;
            cat.poll();
        }

        return new int[]{id,type};
    }

    public int[] dequeueDog() {
        //狗的队列为空
        if (dog.isEmpty())
            return new int[]{-1,-1};
        //狗队列队首的动物编号
        int id = dog.poll();
        //将其在动物队列中移除
        queue.remove(id);
        return new int[]{id,1};
    }

    public int[] dequeueCat() {
        //猫队列为空
        if (cat.isEmpty())
            return new int[]{-1,-1};
        //猫队列队首的动物编号
        int id = cat.poll();
        //将其在动物队列中移除
        queue.remove(id);
        return new int[]{id,0};
    }
}
