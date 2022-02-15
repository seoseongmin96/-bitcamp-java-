package com.example.demo.quiz.service;

import java.util.Random;
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
    private Random rand;

    @Override
    public void timestable(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {
        int com1 = (int)(Math.random()*9)+1;
        int com2 = (int)(Math.random()*9)+1;
        while(com1==com2) {
            com2 = (int)(Math.random()*9)+1;
        }
        int com3 = (int)(Math.random()*9)+1;
        while(com1==com3||com2==com3) {
            com3 = (int)(Math.random()*9)+1;
        }
        System.out.println(com1 + " " + com2 + " " + com3);

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        int strike = 0;
        int ball = 0;
        int out = 0;

        while(strike != 3) {
            System.out.println("user> 숫자 세 개를 입력하세요.");

            strike = 0;      //돌려줄 때마다 매번 초기화 필요
            ball = 0;
            out = 0;

            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
            if(com1 == num1) {
                strike += 1;
            }else if(com1 == num2 || com1 == num3){
                ball += 1;
            }
            else {
                out+=1;
            }
            if(com2 == num2) {
                strike += 1;
            }else if(com2 == num1 || com2 == num3) {
                ball += 1;
            }
            else {
                out+=1;
            }
            if(com3 == num3) {
                strike += 1;
            }else if(com3 == num1 || com3 == num2) {
                ball += 1;
            }
            else {
                out+=1;
            }

            System.out.println("Strike : " + strike + ", Ball : " + ball + ", Out : " + out);

        }


    }

    @Override
    public String lotto(Scanner scanner) {
        String res = "";
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = rand.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j])
                    i--;
                break;
            }
        }
        for (int i = 0; i < 6; i++) {
            res += String.format(lotto[i] + " ");
        }
        return res;
        

    }

    @Override
    public void bank(Scanner scanner) {
        int select = 0;
        int total = 200000;//잔액
        int output = 0;//출금
        int input = 0;//입금
        int pw = 0;//비밀번호
        int m = 10000;
        int m5 = 50000;
        int m10 = 100000;
        int m20 = 200000;
        int m50 = 500000;

        System.out.print("사용하실 비밀번호를 입력하세요 : ");
        int password = scanner.nextInt();
        while (true) {
            System.out.println("사용하실 메뉴를 선택해주세요.\n" +
                    "0.잔액조회 1.현금인출 2.입금 3.종료\n메뉴 선택: ");
            select = scanner.nextInt();
            if (select == 3) break;
            else if (select >= 0 && select < 3) {
                while (true) {
                    System.out.print("비밀번호를 입력하세요 : ");
                    pw = scanner.nextInt();
                    if (password == pw) {
                        switch (select) {
                            case 0:
                                System.out.println(String.format("고객님의 잔액은 %d입니다.", total));
                                break;
                            case 1:
                                System.out.println("인출하실 금액을 선택하세요." +
                                        "0. 만원 1. 5만원 2. 10만원 3.20만원 4.50만원 5.직접입력");
                                switch (scanner.nextInt()) {
                                    case 0:
                                        if (total >= m) {
                                            total = total - m;
                                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m, total));
                                        } else if (total < m) {
                                            System.out.println("잔액이 부족합니다.");
                                        }
                                        break;
                                    case 1:
                                        if (total >= m5) {
                                            total = total - m5;
                                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m5, total));
                                        } else if (total < m5) {
                                            System.out.println("잔액이 부족합니다.");
                                        }
                                        break;
                                    case 2:
                                        if (total >= m10) {
                                            total = total - m10;
                                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m10, total));
                                        } else if (total < m10) {
                                            System.out.println("잔액이 부족합니다.");
                                        }
                                        break;
                                    case 3:
                                        if (total >= m20) {
                                            total = total - m20;
                                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m20, total));
                                        } else if (total < m20) {
                                            System.out.println("잔액이 부족합니다. 다시입력해주세요.");
                                        }
                                        break;
                                    case 4:
                                        if (total >= m50) {
                                            total = total - m50;
                                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", m50, total));
                                        } else if (total < m50) {
                                            System.out.println("잔액이 부족합니다. 다시입력해주세요.");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("인출금액을 입력해주세요.");
                                        output = scanner.nextInt();
                                        if (total < output) {
                                            System.out.println("잔액이 부족합니다.");
                                        } else if (total >= output) {
                                            total = total - output;
                                            System.out.println(String.format("%d가 출금되었고 잔액은 %d입니다.", output, total));
                                        }
                                        break;
                                    default:
                                        System.out.println("올바른 번호를 입력해주세요.");
                                        break;
                                }
                            case 2:
                                System.out.println("입금하실 금액을 입력하세요.");
                                input = scanner.nextInt();
                                total=total+input;
                                System.out.println(String.format("입금하신금액은 %d이며 잔액은 %d입니다.", input, total));
                                break;

                            case 3:
                                System.out.println("EXIT");
                                return;

                        }
                        break;
                    }
                    else{
                        System.out.println("비밀번호를 잘못입력하였습니다.");
                    }
                }
            }
        }

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

