package com.xworkz.spring;

import com.xworkz.spring.basic.*;
import com.xworkz.spring.configure.Configration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerSpring {
    public static void main(String[] args) {

        System.out.println("main Started");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configration.class);

        Basic basic = applicationContext.getBean(Basic.class);

        basic.id=1;
        basic.name="hii";

        System.out.println(basic);

        Fan fan = applicationContext.getBean(Fan.class);
        fan.setId(101);
        fan.setCompanyName("USHA");
        System.out.println(fan);

        Chair chair = applicationContext.getBean(Chair.class);
        chair.setId(12);
        chair.setCompanyName("Veerrr");
        System.out.println(chair);

        Tv tv = applicationContext.getBean(Tv.class);
        tv.setId(102);
        tv.setCompanyName("KODAK");
        System.out.println(tv);

        Light light = applicationContext.getBean(Light.class);
        light.setId(50);
        light.setCompanyName("CFL");
        System.out.println(light);

        Cable cable = applicationContext.getBean(Cable.class);
        cable.setId(501);
        cable.setCompanyName("VIVO");
        System.out.println(cable);

        Shoe shoe = applicationContext.getBean(Shoe.class);
        shoe.setId(1001);
        shoe.setCompanyName("NIKE");
        System.out.println(shoe);

        Bag bag = applicationContext.getBean(Bag.class);
        bag.setId(120);
        bag.setCompanyName("WROGN");
        System.out.println(bag);

        Watch watch = applicationContext.getBean(Watch.class);
        watch.setId(650);
        watch.setCompanyName("FastTrack");
        System.out.println(watch);

        Shirt shirt = applicationContext.getBean(Shirt.class);
        shirt.setId(99);
        shirt.setCompanyName("PUMA");
        System.out.println(shirt);

        Switches switches = applicationContext.getBean(Switches.class);
        switches.setId(652);
        switches.setCompanyName("HIFI");
        System.out.println(switches);

        Laptop laptop = applicationContext.getBean(Laptop.class);
        laptop.setId(321);
        laptop.setCompanyName("Hp");
        System.out.println(laptop);

        MasalaPuri masalaPuri = applicationContext.getBean(MasalaPuri.class);
        masalaPuri.setId(1);
        masalaPuri.setPrice(40.0);
        System.out.println(masalaPuri);

        BhelPuri bhelPuri = applicationContext.getBean(BhelPuri.class);
        bhelPuri.setId(2);
        bhelPuri.setPrice(45.0);
        System.out.println(bhelPuri);

        SevPuri sevPuri = applicationContext.getBean(SevPuri.class);
        sevPuri.setId(3);
        sevPuri.setPrice(45.0);
        System.out.println(sevPuri);

        DahiPuri dahiPuri = applicationContext.getBean(DahiPuri.class);
        dahiPuri.setId(4);
        dahiPuri.setPrice(50.0);
        System.out.println(dahiPuri);

        WashingMachine washingMachine = applicationContext.getBean(WashingMachine.class);
        washingMachine.setId(123);
        washingMachine.setCompanyName("LG");
        System.out.println(washingMachine);

        Fridge fridge =applicationContext.getBean(Fridge.class);
        fridge.setId(23);
        fridge.setCompanyName("LG");
        System.out.println(fridge);





        System.out.println("main ended");
    }
}
