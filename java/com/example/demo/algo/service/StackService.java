package com.example.demo.algo.service;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : StackService
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public interface StackService {
    int[] functiondevelop(int[] progresses, int[] speeds);
    int printer(int[] priorities, int location);
    int roadtruch(int bridge_length, int weight, int[] truck_weights);
    int[] stockprice(int[] prices);
}
