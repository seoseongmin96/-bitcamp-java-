package com.example.demo;

import com.example.demo.quiz.service.Feb10Service;
import com.example.demo.quiz.service.Feb10ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : Rps
 * author     : seoseongmin
 * date       : 2022-02-15
 * desc       :
 * 클래스변수   :
 * 인스턴수변수 :
 * 파라미터변수 :
 * 로컬변수    :
 * ================================
 * DATE       AUTHOR        NOTE
 * ================================
 * 2022-02-15    seoseongmin        최초 생성
 */
public class TempTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Feb10Service feb10Service = new Feb10ServiceImpl();
        feb10Service.quickSort(scanner);
    }
}

