package com.kwanggyu.java.ex2;
public class ex {
  public static void main(String[] args) {
    int a = 4; //정수
    boolean inTheMiddle = 3 < a && a < 5; //불자료형 (&&)또는 피연산자가 모두 true일경우에만 연산결과는 true이다
    boolean inNaturaNumber = a > 0 || a == 0; //(||) or 피연사자 중 하나면 true 면 true이다
    boolean isPositive= !(a<0); //(!) 논리부정 피연산자의 논리값을 바꿈

    System.out.println("a는 3보다 크고 4보다 작다 ?" + inTheMiddle);
    System.out.println("a는 자연수이다?" + isNaturalNumber);
    System.out.println("a는 양수이다? " + isPositive);
  }
  
}
