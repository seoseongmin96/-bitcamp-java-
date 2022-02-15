package com.example.demo.auth.doamin;

/**
 * packageName: com.example.demo
 * fileName   : GoogleApp.java
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * 클래스변수  : GoogleApp
 * 인스턴수변수 :search
 * 파라미터변수 : search
 * 로컬변수 : res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */
public class GoogleDTO {
    public static String GOOGLE_APP = "GOOGLE";
    private String search;

    public String getSearch(){

        return search;
    }
    public void setSearch(String search){

        this.search = search;
    }
}


