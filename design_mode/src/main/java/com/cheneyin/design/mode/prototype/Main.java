package com.cheneyin.design.mode.prototype;

import com.cheneyin.design.mode.prototype.registration.Prototype;
import com.cheneyin.design.mode.prototype.registration.ConcretePrototype;
import com.cheneyin.design.mode.prototype.registration.PrototypeManager;

/**
 * @ClassName: Main
 * @Description: ToDo
 * @Author: CheneyIn
 * @Date: 2019-12-29
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        ConcretePrototype concretePrototype1=new ConcretePrototype();
//        ConcretePrototype concretePrototype2=(ConcretePrototype) concretePrototype1.clone();
//        System.out.println(concretePrototype1.hashCode());
//        System.out.println(concretePrototype2.hashCode());

        Prototype prototype=new ConcretePrototype();
        System.out.println(prototype.hashCode());

        PrototypeManager.setPrototype("one",prototype);
        Prototype prototype1=(Prototype) PrototypeManager.getPrototype("one").clone();
        System.out.println(prototype1.hashCode());

        Prototype prototype2=new ConcretePrototype();
        System.out.println(prototype2.hashCode());
        PrototypeManager.setPrototype("one",prototype2);

        Prototype prototype3=(Prototype) PrototypeManager.getPrototype("one").clone();
        System.out.println(prototype3.hashCode());
        prototype3.setName("registration type");
        System.out.println(prototype3.hashCode());

        PrototypeManager.removePrototype("one");
        Prototype prototype4=(Prototype) PrototypeManager.getPrototype("one").clone();
        System.out.println(prototype4.hashCode());

    }
}
