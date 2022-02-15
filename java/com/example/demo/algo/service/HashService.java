package com.example.demo.algo.service;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : HashService
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public interface HashService {
    String failedPlayer(String[] participant, String[] completion);
    boolean phonebook(String[] phone_book);
    int spy(String[][] clothes);
    int[] bestalbum(String[] genres, int[] plays);
}
