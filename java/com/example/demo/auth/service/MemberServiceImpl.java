package com.example.demo.auth.service;

import com.example.demo.auth.doamin.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentServiceImpl
 * author     : seoseongmin
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seoseongmin        최초 생성
 */
public class MemberServiceImpl implements MemberService {


    /**
     * BMI = w / t * t
     * 고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     * */
    @Override
    public String getBmi(BmiDTO param) {

        double bmi = param.getWeight() / (param.getHeight() * param.getHeight()) * 10000;
        String s = "";
            if(bmi >= 35){
                s = "고도비만";
            }else if(bmi >=30){
                s = "중(重)도 비만 (2단계 비만)";
            }else  if(bmi >=25){
                s = "경도 비만 (1단계 비만)";
            } else  if(bmi >=23){
                s = "과체중";
            } else  if(bmi >=18.5){
                s = "정상";
            }else {
                s = "저체중";
            }
            return param.getName()+s;

    }

    @Override
    public String calc(CalcDTO calc) {
        int result = 0;
        switch (calc.getOpcode()){
            case "+": result = calc.getNum1() + calc.getNum2(); break;
            case "-": result = calc.getNum1() - calc.getNum2(); break;
            case "*": result = calc.getNum1() * calc.getNum2(); break;
            case "/": result = calc.getNum1() / calc.getNum2(); break;
        }
        String res = String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(),
              result);


        return res;

    }

    @Override
    public String search(GoogleDTO googleDTO) {
        return String.format("%s을 (를) 검색한 결과입니다.",googleDTO.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total /3;
        String pass = (avg >=60) ? "합격" : "불합격";

        return String.format("* ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d\n" +
                        " * > 영어: %d\n" +
                        " * > 수학: %d\n" +
                        " * 총점: %d\n" +
                        " * 평균(정수): %d\n" +
                        " * 합격여부: %s\n" +
                        " * #######################",
                GradeDTO.GRADE_TITLE,
                grade.getName(),
                grade.getKor(),
                grade.getEng(),
                grade.getMath(),
                total,
                avg,
                pass);


    }

    @Override
    public String login(UserDTO login) {
        return String.format("%s 님 로그인 성공", login.getName());
    }
}
