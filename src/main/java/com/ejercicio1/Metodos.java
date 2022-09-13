package com.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Metodos implements Interface {

    @Override
    public List<Person> OpenFile() throws FileNotFoundException {
        List<Person> peopleList = new ArrayList<>();

        File f = new File("people.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] person = s.split(":");
            Person p = new Person();
            p.setNombre(person[0]);
            p.setCiudad(person[1]);
            if (person.length>2)
                p.setEdadInt(Integer.parseInt(person[2]));
            else
                p.setEdadInt(0);
            p.setEdadInt(person.length> 2
                    ? Integer.parseInt(person[2]) : null);
            p.setEdad(person.length> 2
                    ? Optional.of(Integer.parseInt(person[2])) : Optional.empty());
            peopleList.add(p);
        }

        return peopleList;
    }

    @Override
    public Boolean PrintList(List<Person> people) {
        for (Person p : people){
            System.out.println(p.getNombre()+" "+p.getCiudad()+" "+p.getEdadInt());

        }
        for (int n =0; n < people.size(); n++);


        return null;
    }
    }


