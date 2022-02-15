package com.company;

public class Sup {
    void Who(){
        System.out.println("who() in the Sup");
    }
}
class Sub1 extends  Sup{
    void Who(){
        System.out.println("Who in the Sub1");
    }
}

class Sub2 extends Sub1{
    void Who(){
        System.out.println("Who in the Sub2");
    }
}