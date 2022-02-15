package com.company;

import java.util.Scanner;

public class Integer {
    Scanner in = new Scanner(System.in);
    void intE1(){

        System.out.print("Введите l: ");
        float l = in.nextFloat();

        float result = l/100;
        System.out.println("Результат: "+result);
    }

    void intE2() {
        System.out.print("Введите массу:");
        float massa = in.nextFloat();

        float result = massa/1000;
        System.out.format("Результат: "+"%.2f",result);
        System.out.println();
    }
    void intE3() {
        System.out.print("Размер в байтах: ");
        double bayt = in.nextFloat();

        double result = bayt/1024;
        System.out.format("Результат: "+"%.2f",result);
        System.out.println();
    }
    void intE4() {
        System.out.print("A: ");
        int a = in.nextInt();

        System.out.print("B: ");
        int b = in.nextInt();

        int result = a/b;
        System.out.println("В отрезке A содержится " + result + " полных отрезков B.");
        System.out.println();
    }
    void intE5(){
        System.out.print("Vvedite a: ");
        double a = in.nextDouble();

        System.out.print("Vvedite b: ");
        double b = in.nextDouble();

        double result = a%b;
        System.out.println("Взятия остатка от деления: "+result);
    }
    void intE6(){
        System.out.println("Введите двузначное число: ");
        int a = in.nextInt();

        int b= a/10;
        System.out.println("Десятки: "+b);

        int c = a%10;
        System.out.println("Единицы: "+c);
    }
    void intE7(){
        int a, b,c;
        int sum, proiz;

        System.out.println("A: ");
        a = in.nextInt();

        c = a/10;
        System.out.println("C: "+c);
        b=a%10;
        System.out.println("B: "+b);

        sum=c+b;
        System.out.println("Сумма: "+sum);

        proiz = c*b;
        System.out.println("Proizvrdenie: "+proiz);
    }

    void intE8(){
        int a1;
        int a2;
        System.out.println("Введите двузначное число: ");
        a1 = in.nextInt();
        a2 = a1/10 + a1%10*10;
        System.out.println("Result: "+a2);
    }
    void intE9(){
        int a,b;
        System.out.println("Трехзначное число: ");
        a = in.nextInt();
        b = a/100;
        System.out.println(b);
    }

    void intE10(){
        int a,b,c;
        System.out.println("Трехзначное число: ");
        a = in.nextInt();
        b = a%10;
        System.out.println(b);
        c=a%100/10;
        System.out.println(c);
    }
    void intE11(){
        int a,b,c;
        int sum, proiz;
        System.out.println("A: ");
        a=in.nextInt();

        c = a/100;
        System.out.println("C: "+c);
        b=a%1;
        System.out.println("B: "+b);

        sum=c+b;
        System.out.println("Сумма: "+sum);

        proiz = c*b;
        System.out.println("Proizvrdenie: "+proiz);

    }
    void intE12(){
        int a,b,c,d;
        System.out.println("Трехзначное число: ");
        a = in.nextInt();
        b = a%10;
        c=a%100/10;
        System.out.println(c+""+b);
    }
    void intE13(){
        int a,a1,a2,a3;
        System.out.println("Трехзначное число: ");
        a = in.nextInt();
        a1=a%10;
        a2=a%100/10;
        a3=a%1000/100;
        System.out.println(a2+""+a1+""+a3);
    }
    void intE14(){
        int a,a1,a2,a3;
        System.out.print("Введите трехзначное число: ");
        a=in.nextInt();
        a1=a%10;
        a2=a%100/10;
        a3=a%1000/100;
        System.out.println(a1+""+a3+""+a2);
    }

    void intE15(){
        int a,a1,a2,a3;
        System.out.print("Введите трехзначное число: ");
        a=in.nextInt();
        a1=a%10;
        System.out.println("A1: "+a1);
        a2=a%100/10;
        System.out.println("A2: "+a2);
        a3=a%1000/100;
        System.out.println(a2+""+a3+""+a1);
    }
    void intE16(){
        int a,a1,a2,a3;
        System.out.println("A: ");
        a=in.nextInt();
        a1=a%10;
        a2=a%100/10;
        a3=a%1000/100;
        System.out.println(a3+""+a1+""+a2);
    }

    void intE17(){
        int a,a3;
        System.out.println("Введите пятизначное число: ");
        a=in.nextInt();
        a3=a%1000/100;
        System.out.println("Result: "+a3);
    }
    void intE18(){
        int a,a4;
        System.out.println("Введите пятизначное число: ");
        a=in.nextInt();
        a4=a%10000/1000;
        System.out.println("Result: "+a4);
    }
    void intE19(){
        int N, OneMinute=60;
        System.out.println("N: ");
        N=in.nextInt();
        System.out.println("Result: "+N/OneMinute);
    }
    void intE20(){
        int N, OneMinute=60;
        System.out.println("N: ");
        N=in.nextInt();
        System.out.println("Result: "+N/(OneMinute*OneMinute));
    }
    void  intE21(){
        int N, s;
        System.out.println("N: ");
        N=in.nextInt();
        s=N%(60*60);
        System.out.println(s);
    }
    void  intE22(){
        int N, s;
        System.out.println("N: ");
        N=in.nextInt();
        s=N%60;
        System.out.println(s);
    }
    void  intE23(){
        int N, s;
        System.out.println("N: ");
        N=in.nextInt();
        s=N%3600/60;
        System.out.println(s);
    }
    void  intE24(){
        int K, s;
        System.out.println("K: ");
        K=in.nextInt();
        K=(K+3)%7;
        System.out.println(K);
    }
    void  intE25(){
        int K, s;
        System.out.println("K: ");
        K=in.nextInt();
        K=(K+1)%7;
        System.out.println(K);
    }
    //26 - Потерял
    
}


