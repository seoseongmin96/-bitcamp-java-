package com.example.demo.algo.service;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : DfsService
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public interface DfsService {
    int targetnumber(int[] numbers, int target);
    int network(int n, int[][] computers);
    int wordconversion(String begin, String target, String[] words);
    String[] triproad(String[][] tickets);
}
