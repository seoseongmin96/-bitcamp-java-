package com.example.demo.auth.doamin;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp
 * author     : seoseongmin
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     seoseongmin        최초 생성
 */
public class CalcDTO {
    public static String CALC_APP = "계산기";
    private int num1;
    private String opcode;
    private int num2;


    public int getNum1(){
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public String getOpcode(){
        return opcode;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }
    public int getNum2(){
        return num2;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }




        /* if(opcode.equals("+")) {
            res = num1 + num2;
        }else if(opcode.equals("-")){
            res = num1 - num2;
        }else if(opcode.equals("*")){
            res = num1 * num2;
        }else if(opcode.equals("/")){
            res = num1 / num2;
        }

*/
        /* switch (opcode) {
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }

*/



}
