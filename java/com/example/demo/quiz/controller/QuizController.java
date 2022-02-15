package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : TempController
 * author     : seoseongmin
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03     seoseongmin        최초 생성
 */
public class QuizController {
   public static void execute(Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();
       while (true) {
           System.out.println("[서브메뉴]\n 0)Exit 1)2월 6일 2)2월 7일 3)2월 8일 4)2월 9일 5)2월 10일");
           switch (scanner.next()) {
               case "0":
                   System.out.println("### Exit ###");
                   return;
               case "1":
                   System.out.println("2월 6일");
                   String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                           "정렬", "해시", "힙", "완전탐색", "DP",
                           "스택", "깊이우선탐색", "그래프", "탐욕법", "이분탐색",
                           "큐", "너비우선탐색"};




                   System.out.println("[6일소메뉴] 0.EXIT\n" + "1. 팀별 과제 출력 \n" + "2. 팀장이 맡은 과제만 출력 \n" +
                           "3. 큐를 담당한 사람을 출력 \n" + "4. 팀원별 과제 수를 출력 \n");
                   while (true){
                       switch (scanner.next()){
                           case "0" :
                               System.out.println("시스템종료"); return;
                           case "1" :
                               feb06Service.quiz1(arr); break;
                           case "2" :
                               feb06Service.quiz2(arr); break;
                           case "3" :
                               feb06Service.quiz3(arr); break;
                           case "4" :
                               feb06Service.quiz4(arr); break;
                           default:
                               System.out.println("잘못된 정보입니다."); break;
                       }
                   }

                   case "2":
                   System.out.println("2월 7일");


                       while (true){
                           String menu = "\"[7일 소메뉴] 0.EXIT 1.주사위 dice 2.가위바위보 Rps " +
                                   "3.입력받은 두 수 사이의 있는 소수 구하기 getPrime \" +\n" +
                                   "  \"4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기 leapYear " +
                                   "5. 임의로 입력받은 숫자 맞추기 numberGolf\"";
                           System.out.println(menu); // 메뉴를 보여준다
                           String select = scanner.next(); //메뉴를 선택할 수 있는 select라는 변수를 쓰기 위해
                           String res = "";
                           switch (select){ // 조건문 switch  사용 select라는 입력변수
                               case  "0" : // 0인경우
                                   System.out.println("Exit"); return;
                               case  "1" :
                                   System.out.println("1.주사위");
                                   feb07Service.dice(scanner);break;
                               case  "2" :
                                   System.out.println("2.가위바위보");
                                   feb07Service.rps(scanner); // 서비스의 가위바위보를 스캐너로 받기 위해
                                   break;
                               case  "3" :
                                   System.out.println("3.입력받은 두 수 사이의 있는 소수 구하기");
                                   feb07Service.getPrime(scanner);break;
                               case  "4" :
                                   System.out.println("4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기");
                                   feb07Service.leapYear(scanner);break;
                               case  "5" :
                                   System.out.println("5. 임의로 입력받은 숫자 맞추기");
                                   feb07Service.numberGolf(scanner);break;
                               default :
                                   System.out.println("잘못된 정보입니다.");break;
                           }
                       }
                    case  "3":
                   System.out.println("2월 8일");
                    while (true){
                        String menu = "\"[8일 소메뉴] 0. EXIT 1. 구구단 2. 야구 3. 로또 4. 은행입출금 5. 죄석예약";
                        System.out.println(menu);
                        String select = scanner.next();
                        String res = "";
                        switch (select){
                            case "0" :
                                System.out.println("Exit");return;
                            case "1" :
                                System.out.println("1. 구구단");
                                feb08Service.timestable(scanner);break;
                            case "2" :
                                System.out.println("2. 야구");
                                feb08Service.baseball(scanner);
                            case "3" :
                                System.out.println("3. 로또");
                                feb08Service.lotto(scanner);
                            case "4" :
                                System.out.println("4. 은행 입출금");
                                feb08Service.bank(scanner);
                            case "5" :
                                System.out.println("5. 좌석 예약");
                                feb08Service.book(scanner);
                            default :
                                System.out.println("잘못된 정보입니다");break;

                        }
                    }
                    case "4":
                   System.out.println("2월 9일");
               case "5" :
                   System.out.println("2월 10일");
                   while(true){
                       String menu ="\"[10일 소메뉴] 0.EXIT 1. bubbleSort 2. insertionSort 3. selectionSort , " +
                               "4. quickSort 5. mergeSort 6. magicSquare 7. zigzag 8. reactangleStarPrint" +
                               "9.triangleStarPrint";
                       System.out.println(menu);
                       String select = scanner.next();
                       String res = "";
                       switch (select){
                           case "0" :
                               System.out.println("Exit");return;
                           case "1" :
                               System.out.println("1. bubbleSort");
                               feb10Service.bubbleSort(scanner);break;
                           case "2" :
                               System.out.println("1. insertionSort");
                               feb10Service.insertionSort(scanner);break;
                           case "3" :
                               System.out.println("3. selectionSort");
                               feb10Service.selectionSort(scanner);break;
                           case "4" :
                               System.out.println("4. quickSot");
                               feb10Service.quickSort(scanner);break;
                           case "5" :
                               System.out.println("5. mergeSort");
                               feb10Service.mergeSort(scanner);break;
                           case "6" :
                               System.out.println("6. magicSquare");
                               feb10Service.magicSquare(scanner);break;
                           case "7" :
                               System.out.println("7. zigzag");
                               feb10Service.zigzag(scanner);break;
                           case "8" :
                               System.out.println("8. rectangleStarPrint");
                               feb10Service.rectangleStarPrint(scanner);break;
                           case  "9" :
                               System.out.println("9. triangleStarPrint");
                               feb10Service.triangleStarPrint(scanner);break;
                           default :
                               System.out.println("잘못된 정보입니다");break;
                       }
                   }



           }
       }
   }
}



















