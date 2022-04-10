package com.util;

import java.util.*;

public class Math {

    /**
     * 最大公约数
     * @param a
     * @param b
     * @return
     */
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }

    /**
     * 最小公倍数
     * @param a
     * @param b
     * @return
     */
    public static int lcm(int a, int b){
        int gcd = gcd(a,b);
        return a/ gcd * b;
    }

    /**
     * 判断是否是质数
     * @param a
     * @return
     */
    public static boolean isPrime(int a){
        if (a < 2)
            return false;
        for (int i = 2; i * i <= a; i++){
            if (a % i == 0)
                return false;
        }
        return true;
    }

    /**
     * 范围内质数
     * @param n
     * @return
     */
    public static boolean[] rangPrime(int n){
        boolean[] rangPrime = new boolean[n+1];

        Arrays.fill(rangPrime,true);

        for (int i = 2; i * i <= n; i++) {
            if (rangPrime[i]){
                for (int j = i*i; j <= n ; j+=i) {
                    rangPrime[j] = false;
                }
            }
        }
        return rangPrime;
    }

    /**
     * 快速幂
     * @param base
     * @param n
     * @return
     */
    public static int quickPow(int base, int n){
        int res = 1;
        while (n > 0){
            if ((n & 1) == 1)
                res *= base;
            n >>= 1;
            base *= base;
        }
        return res;
    }

    /**
     * 获取数字的所有分解式
     * @param n
     * @return
     */
    public static List<List<Integer>> factor(int n){
        List<List<Integer>> factor = new ArrayList<>();
        getFactor(n,factor,new LinkedList<>());
        return factor;
    }

    private static void getFactor(int n, List<List<Integer>> factor, Deque<Integer> path) {
        if (n == 1)
            factor.add(new ArrayList<>(path));

        for (int i = 2; i <= n; i++) {
            if (n%i == 0){
                path.push(i);
                getFactor(n/i,factor,path);
                path.pop();
            }
        }
    }


    public static int[] exgcd(int a, int b){
        int[] res = new int[3];
        int[] x = new int[1];
        int[] y = new int[1];
        exgcd(a,b,res,x,y);
        res[1] = x[0];
        res[2] = y[0];
        return res;
    }

    private static void exgcd(int a, int b, int[] res, int[] x, int[] y) {
        if (b == 0){
            res[0] = a;
            x[0] = 1;
            y[0] = 0;
        }else {
            exgcd(b,a%b,res,y,x);
            y[0] -= x[0] *(a/b);
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(exgcd(30, 42)));
        //System.out.println(factor(12));
    }

}
