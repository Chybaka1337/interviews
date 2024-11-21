package com.zommer.core.first_part;


public class ProcedureJava {

    /**
     * Примитивные типы (value types)
     *      Знаковые числовые типы
     *          Целочисленные типы:
     *              литерал по умолчанию int
     *              byte 1 byte, short 2 bytes, int 4 bytes, long 8 bytes
     *          Числа с плавающей точкой:
     *              литерал по умолчанию - double
     *              float 4 bytes, double 8 bytes
     *
     *      Символьный тип:
     *          char 2 bytes предствавляет собой символ из кодировки UNICODE UTF-16
     *
     *      Булевский тип
     *          boolean - спецификация jvm не определяет однозначно размер переменной
     * }
     *
     */
    public static void valueType() {

        byte b = 127;
        short sh = 32000;
        int i = 2_000_000_000;
        long l = 123L;

        float f = 12.3F;
        double d = 12.3;
    }
}
