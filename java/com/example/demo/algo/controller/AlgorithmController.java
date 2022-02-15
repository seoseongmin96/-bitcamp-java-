package com.example.demo.algo.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algo.controller
 * fileName   : AlgorithmController
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public class AlgorithmController {
    public static void execute(Scanner scanner){
        while (true){
            System.out.println("[담당] 0.종료 1.권혜민");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("0.Exit 1.Sort 2.Stack 3.Queue");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("Exit");return;
                        case "1" :
                    }
            }
        }
    }
}
