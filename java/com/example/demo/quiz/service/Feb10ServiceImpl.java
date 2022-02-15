package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName   : Feb10ServiceImpl
 * author     : seoseongmin
 * date       : 2022-02-10
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-10     seoseongmin        최초 생성
 */
public class Feb10ServiceImpl implements Feb10Service{


    @Override
    public void bubbleSort(Scanner scanner) {

    }

    @Override
    public void insertionSort(Scanner scanner) {

    }

    @Override
    public void selectionSort(Scanner scanner) {

    }

    @Override
    public void quickSort(Scanner scanner) {

        {
            int[] arr= {8,34,72,28,43,95,11,56,77,39}; // 임의의 인덱스 값 생성함
            quickSort(arr,0,arr.length-1); // 처음에 생성한 quickSort의 배열, 출발점 ( 0 ) , 도착점 ( 배열의 길이에서 -1 )
            for(int i=0;i<arr.length;i++) { // for 문 활용해서 인덱스값 1씩 증가하게
                System.out.print(arr[i]+","); //i값 출력
            }
        }

        int[] arr = new int[0];
        int start = 0;
        int end = 0;
        int part = partition(arr, start, end);
            if (start < part - 1) quickSort(arr, start, part - 1); // 파트에서 1을 뺀 값보다 시작점이 작은 경우, (배열, 출발점,
//도착점(파티션 - 1) 을 파라미터로 가진다.
            if (end > part) quickSort(arr, part, end); // 도착점이 파트보다 클 경우, (배열, 파트, 도착점을 파라미터로 가진다.
        }


        private static int partition(int[] arr,int start,int end) { // 파티션이라는 메서드에 인트 배열, 출발점, 도착점을 파라미터로 가지는
//위에서 생성한 파티션이라는 변수
            int pivot=arr[(start+end)/2]; // 피벗 생성 ( 출발점+ 도착점 ) 을 2로 나눈 배열
            while(start<=end) { // 도착점이 출발점보다 크거나 같음을 반복할때
                while(arr[start]<pivot) start++; // 피벗이 출발점보다 낮을 때 출발점은에 +1씩 증가
                while(arr[end]>pivot) end--; // 도착점이 피벗보다 클 때 도착점은 -1씩 감소
                if(start<=end) { // 도착점이 출발점보다 크거나 같을 때
                    swap(arr,start,end); // 배열 값, 출발점, 도착점을 서로 바꿔준다 ( swap이란 두 변수의 값을 서로 바꾼다)
                    start++; // 출발점은 +1씩 증가
                    end--; // 도착점은 -1 씩 감소
                }
            }
            return start; // 출발점을 메소드의 결과로 반환
        }

        private static void swap(int[] arr,int start,int end) { // 스왑이라는 메서드에 인트 배열, 출발점, 도착점 이라는 파라미터를 가진다.
            int tmp=arr[start]; // 출발점을 tmp라는 변수의 임시 저장? ( 이 부분은 tmp가 임시 저장 이라는 뜻을 가지고 있는데 정확하게는
//잘 모르겠음
            arr[start]=arr[end]; // 출발점과 도착점의 배열 값을 지정
            arr[end]=tmp; // 도착점은 임시로 지정
            return; //반환
        }
        private static void quickSort(int[] arr, int i, int i1) {
    }


    @Override
    public void mergeSort(Scanner scanner) {

    }

    @Override
    public void magicSquare(Scanner scanner) {

    }

    @Override
    public void zigzag(Scanner scanner) {

    }

    @Override
    public void rectangleStarPrint(Scanner scanner) {

    }

    @Override
    public void triangleStarPrint(Scanner scanner) {

    }
}

