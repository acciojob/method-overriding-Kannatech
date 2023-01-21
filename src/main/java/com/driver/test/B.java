package com.driver;

import java.io.IOException;

public class B  extends A {
    public String meth() {
        return "Method is overridden in Extendend class B";
    }

    public static void main(String[] args) throws IOException
    {
        B b=new B();
        System.out.println(b.meth());
    }
}
