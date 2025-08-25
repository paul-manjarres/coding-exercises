package com.jpmanjarres.leetcode.from61to80;

public class Sqrt69 {
    public int mySqrt(int x) {
        if (x==0) return 0;
        if (x==1 || x==2 || x==3) return 1;
        return _sqrt(x, 0 ,x);
    }

    private int _sqrt(int x, int a, int b){
        if(b-a == 1) return a;
        long med = (long) a + ((b-a)/ 2);
        if(med*med == x) return (int) med;
        if(med*med > x) return _sqrt(x, a, (int)med);
        else return _sqrt(x, (int) med, b);
    }
}
