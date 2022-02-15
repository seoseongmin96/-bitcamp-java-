package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb08ServiceImpl
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void timestable(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void book(Scanner scanner) {
        // 1. 배열을 이용하여 간단한 극장 예약시스템 작성
        // 2. 아주 작은 극장이라 좌석이 10개만  됨.
        // 3. 먼저 좌석 배치표를 보여주고 예약이 끝나면 1로
        // 4. 예약이 안된 좌석은 0으로 나타내라.
        
        int seat[] = new int[10]; //좌석 10개를 배열로 만들기 위함
        int resrved; //

        while (true){
            System.out.println("좌석을 예약하시겠습니까? (1또는 0)");
            int q = scanner.nextInt();

            if (q == 0) break;
            System.out.println("현재의 예약상태는 다음과 같습니다.");
            System.out.println("===================");
            for(int i=0; i<10; i++){

                System.out.print(i +1 + " \t");
            }
            System.out.println();

            for (int i : seat) // for(각 요소 값 : 배열이나 컨테이너 값)
                 System.out.print(i + "\t");
            System.out.println();
            System.out.println("몇 번째 좌석을 에약하시겠습니까?");
            resrved = scanner.nextInt();
            seat[resrved-1] = 1; // 좌석은 예약 -1 값
            System.out.println("예약되었습니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
           
    }

