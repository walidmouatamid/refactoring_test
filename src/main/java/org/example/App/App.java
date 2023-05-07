package org.example.App;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Object> list = new LinkedList<> ();
        list.add (new Car());
        list.add(new Train());
        Mover mover = new Mover ();
        mover. move(list);
    }
}
