package com.inc.emrys.rojaya.test;

public class Demo extends SuperClass {

    int value;

    public Demo() {

    }

    public Demo(int value) {
        this.value = value;
    }

    @Override
    public void go() {
        super.go();
        System.out.println("this is the local class method invoked !");
    }
}
