package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb08Service;
import com.example.demo.quiz.service.Feb08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb08Controller
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public class Feb08Controller {
    public void execute(Scanner scanner){
        Feb08Service feb08Service = new Feb08ServiceImpl();
        while (true){
            String menu = "\"[8일 소메뉴] 0.EXIT 1.구구단 timestable  2.야구 baseball 3.로또 lotto 4.은행입출금 bank " +
                    "5.좌석예약 book";
            System.out.println(menu);
            while (true){
                switch (scanner.next()){
                    case "0" :
                        System.out.println("Exit");return;
                    case "1" :
                        System.out.println("1.구구단");
                        feb08Service.timestable(scanner);
                    case "2" :
                        System.out.println("2.야구");
                        feb08Service.baseball(scanner);
                    case "3" :
                        System.out.println("3.로또");
                        feb08Service.lotto(scanner);
                    case "4" :
                        System.out.println("4.은행입출금");
                        feb08Service.bank(scanner);
                    case "5" :
                        System.out.println("5.좌석예약");
                        feb08Service.book(scanner);
                    default :
                        System.out.println("잘못된 정보입니다.");break;
                }
            }

        }
    }
}
