package com.example.demo.auth.service;

import com.example.demo.auth.doamin.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentService
 * author     : seoseongmin
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     seoseongmin        최초 생성
 */
public interface MemberService {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO googleDTO);
    String getGrade(GradeDTO grade);
    String login(UserDTO login);
}
