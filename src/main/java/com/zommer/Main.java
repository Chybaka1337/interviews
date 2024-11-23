package com.zommer;

import com.zommer.core.first_part.ProcedureJava;

public class Main {
    public static void main(String[] args) {
        try {
            ProcedureJava.test(new StringBuffer("")); // StringBuffer: 35117ms.
            ProcedureJava.test(new StringBuilder("")); // StringBuilder: 3358ms.
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
    }
}