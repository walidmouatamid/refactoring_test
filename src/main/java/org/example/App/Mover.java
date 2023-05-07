package org.example.App;

import java.util.List;

public class Mover {
    public void move(List<Object> list){
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) instanceof Train){
                Train  tarin = (Train) list.get(i);
                tarin.moveTrain();

            }else if(list.get(i) instanceof Car){
                Car car = (Car) list.get(i);
                car.moveCar();
            }

        }
    }
}
