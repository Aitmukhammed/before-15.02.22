package com.company;

public class S {
    int i, j;

    S(int a, int b) {
        i = a;
        j = b;
    }


    //Отображение переменных i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class N extends S {
    int k;
    N(int a, int b, int c) {
        super(a, b);
        k = c;
    }
//    На этот раз в версии метода show () из класса в предусмотрен строковый параметр.
//    Из-за этого сигнатура данного метода отличается от сигнатуры метода
//    show() из класса А, для которого параметры не предусмотрены. Соответственно, никакого
//    переопределения метода не происходит.
    void show(String msg) {
        System.out.println(msg + k);
    }
}




