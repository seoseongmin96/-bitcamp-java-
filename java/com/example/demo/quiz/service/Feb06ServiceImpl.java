package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.service
 * fileName   : QuizService
 * author     : seoseongmin
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seoseongmin        최초 생성
 */

public class Feb06ServiceImpl implements Feb06Service {
    @Override
    public void quiz1(String[] arr) {
        System.out.println(" Q1. 팀별 과제를 출력하세요");
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) { //5의 배수
                s += "\n"; // 변수 s 오버로딩 줄바꿈
            }
            s += i + ":" + arr[i] + "\t"; // 변수 s 오버로딩 하고 인데스 i는 arr[i](엘리먼트)

        }
        System.out.println(s); //s값 출력
    }

    @Override
    public void quiz2(String[] arr) {
        String s = "";
        System.out.println(" Q2. 팀장이 맡은 과제만 출력하세요.");

        String l = "김진영";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("김진영")) {
                for (int j = 0; j < 3; j++) { // 이중 for loop 걸기 i 는 못쓰기 때문에 인덱스 j값 범위설정
                    s += arr[i + j * 5] + ","; // s는 오버로딩 , 인덱스 j 곱하기 5 하고 인덱스 i 값 더하기
                }
                if (i == 17) { // i equal 17일때
                    break;
                }
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] arr) {
        String s;
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        s = arr[15] + "를 담당한 사람: " + arr[0]; // 인덱스( 15번째 (큐) + 를 담당한 사람 + "권혜민 (인덱스 값)

        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("힙")){ // 엘리먼트값에 힙을 넣었을 때
                System.out.println( arr[i]+ " 의 담당자는 " + arr[i%5]); // 힙 ( arr[i] ) + 의 담당자는 5의 배수
            }
        }
    }

    @Override
    public void quiz4(String[] arr) {
        String s = "";
        System.out.println("Q4. 팀원별 과제 수를 출력하세요 예) 권혜민(3개), 조현국(3개), 김진영(2개), 김한슬(2개), 서성민(2개)");
        //팀원별 과제 수 출력
        int[] intArr = new int[5]; // 인트 배열 intArr 생성
        int[] resArr = new int[5];


        for (int i = 0; i< arr.length; i++) {
            int a = i % 5;

          for(int j = 0; j< 5; j++){
              if (a==j) {
                  intArr[j]++;
              }
              resArr = intArr;

          }

            }
        for (int i = 0; i< 5; i++){
        System.out.println(arr[i] + "("+resArr[i]+"),");
    }
}
}
