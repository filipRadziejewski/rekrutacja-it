package com.mybenefit.p1;

import com.mybenefit.p1.model.Car;
import com.mybenefit.p1.model.ElectricCar;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RT3 {

    @Test
    public void rt3_1(){
        Vehicle insignia = new Car("Opel", "Insignia", 150, 2000);
        int expected = 0;
        assertThat(insignia.getPower(), is(equalTo(expected)));
    }

    @Test
    public void rt3_2(){
        Vehicle kadett = new Car("Opel", "Kadett");
        int expected = 0;
        assertThat(kadett.getPower(), is(equalTo(expected)));
    }

    @Test
    public void rt3_3(){
        Vehicle astra = new Car("Opel", "Astra");

        String expected = "";
        assertThat(astra.drive()
            .concat(astra.stop())
            .concat(astra.fuel()), is(equalTo(expected)));
    }

    @Test
    public void rt3_4(){
        Vehicle tesla = new ElectricCar(
            "Tesla", "Roadster");

        String expected = "";
        assertThat(tesla.drive()
            .concat(tesla.stop())
            .concat(tesla.fuel()), is(equalTo(expected)));
    }

    @Test
    public void rt3_5(){
        String expected = "";
        Vehicle astra = new Car("Opel", "Astra");
        Vehicle adam = new Car("Opel", "Adam");

        Map<Vehicle, String> map = new HashMap<>();
        map.put(astra, "astra");
        map.put(adam, "adam");
        assertThat(map.get(new Car("Opel", "Adam")), is(equalTo(expected)));
    }

    // Dopisać implementacje samolotu
    @Test
    public void rt3_6(){
        String expected = "flyflyfuel";
        Vehicle plane = null;

        assertThat(plane.drive()
            .concat(plane.stop())
            .concat(plane.fuel()), is(equalTo(expected)));
    }
}
