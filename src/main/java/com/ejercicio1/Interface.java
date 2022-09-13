package com.ejercicio1;

import java.io.FileNotFoundException;
import java.util.List;

public interface Interface {
    List<Person> OpenFile() throws FileNotFoundException;

    Boolean PrintList(List<Person> people);
}
