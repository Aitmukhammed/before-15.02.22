package com.company;

public class ErrorMsg {
    final int outerr = 0;
    final int inerr = 1;
    final int diskerr = 2;
    final int indexer = 3;

    String msgs[]={
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутсвует место на диске",
            "Выход индекса за границы диапазона"
    };

    //Возврат сообщения об ошибке
    String getErrorMsg(int i){
        if(i>=0 & i< msgs.length)
            return msgs[i];
        else
            return "Несущечтвующий код ошибки";
    }
}
