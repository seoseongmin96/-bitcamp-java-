package com.example.demo.algo.service;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : SortService
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public interface SortService {
    int[] Knumbers(int[] array, int[][] commands);
    String Biggestcount(int[] numbers);
    int Hindex(int[] citations);
}
