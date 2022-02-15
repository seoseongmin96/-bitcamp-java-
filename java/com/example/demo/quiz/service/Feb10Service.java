package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb10Service
 * author     : seoseongmin
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10     seoseongmin        최초 생성
 */
public interface Feb10Service {
    // 아래 문제들은 모두 스케너 없이, Math 랜덤으로 처리합니다.
    // 1인
    void bubbleSort(Scanner scanner);
    void insertionSort(Scanner scanner);
    //
    void selectionSort(Scanner scanner);
    void quickSort(Scanner scanner);
    void mergeSort(Scanner scanner);
    // 1인
    void magicSquare(Scanner scanner);
    //
    void zigzag(Scanner scanner);
    // 1인
    // 좌측90도 직각삼각형 별찍기
    void rectangleStarPrint(Scanner scanner);
    // 정삼각형 별찍기
    void triangleStarPrint(Scanner scanner);
}
