package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07Service
 * author     : seoseongmin
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seoseongmin        최초 생성
 */
public interface Feb07Service {
    void dice(Scanner scanner); //스케너로 데이터값을 입력하라는 뜻이다
    void rps(Scanner scanner);
    void getPrime(Scanner scanner);
    void leapYear(Scanner scanner);
    void numberGolf(Scanner scanner);
}
