package com.ejercicio1;

import java.io.FileNotFoundException;

public class Main {
    public static void  main(String[] args){
        Metodos miInterface= new Metodos();

        try {
            miInterface.PrintList(miInterface.OpenFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
