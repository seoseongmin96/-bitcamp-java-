package com.example.demo.auth.doamin;

/**
 * packageName: com.example.demo
 * fileName   : BmiApp
 * author     : seoseongmin
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     seoseongmin        최초 생성
 */


public class BmiDTO {

    private final static BmiDTO bmiDTO = new BmiDTO();
    public BmiDTO(){}
    public static BmiDTO getInstance(){return bmiDTO;}

    public static String BMI = "BMI";
    private String name;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


