package com.example.demo.auth.controller;

import com.example.demo.auth.doamin.UserDTO;
import com.example.demo.auth.doamin.BmiDTO;
import com.example.demo.auth.doamin.GoogleDTO;
import com.example.demo.auth.doamin.CalcDTO;
import com.example.demo.auth.doamin.GradeDTO;
import com.example.demo.auth.service.MemberService;
import com.example.demo.auth.service.MemberServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : seoseongmin
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seoseongmin        최초 생성
 */
public class AuthController {
    public static void execute(Scanner scanner) {

        CalcDTO calc = new CalcDTO();


        GoogleDTO google = new GoogleDTO();


        MemberService service = new MemberServiceImpl();


        while(true){
            System.out.println("메뉴 선택");
            String menu = "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
           switch (select){
               case "0" :
                   System.out.println("Exit"); return;
               case "1" :
               System.out.println(BmiDTO.BMI+"\n 이름, 키, 몸무게 입력");
               BmiDTO b = BmiDTO.getInstance();
               b.setName(scanner.next());
               b.setHeight(scanner.nextDouble());
               b.setWeight(scanner.nextDouble());
               res = service.getBmi(b); break;
               case "2" :
               System.out.println(CalcDTO.CALC_APP+"\n숫자1, 연산자, 숫자2 입력");
               calc.setNum1(scanner.nextInt());
               calc.setOpcode(scanner.next());
               calc.setNum2(scanner.nextInt());
               res = service.calc(calc);break;
               case "3" :
               System.out.println(GoogleDTO.GOOGLE_APP +"\n 검색어 입력");
               google.setSearch(scanner.next());
               res = service.search(google);break;
               case "4" :
               System.out.println(GradeDTO.GRADE_TITLE+"\n 이름, 국어 ,영어, 수학");
               GradeDTO g = GradeDTO.getInstance();
               g.setName(scanner.next());
               g.setKor(scanner.nextInt());
               g.setEng(scanner.nextInt());
               g.setMath(scanner.nextInt());
               res = service.getGrade(g);break;
               case "5" :
               System.out.println(UserDTO.LOGIN_TITLE+"\n ID , PW, Name 입력");
               UserDTO u = UserDTO.getInstance();
               u.setName(scanner.next());
               u.setId(scanner.next());
               u.setName(scanner.next());
               res = service.login(u);break;
               default: res = "WRONG"; break;
           }
            System.out.println(res);
        }
    }
}
