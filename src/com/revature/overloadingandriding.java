package com.revature;

public class overloadingandriding {
    void oio(String burgers) {
        System.out.println("oh ok");
    }
    void oio(int jameo) {
        System.out.println("oh ok");
    }
    public static void main(String[] args) {
        overloadingandriding nw = new overloadingandriding();
        nw.oio("jamis)");
        nw.oio(7);
        duck nwe = new duck();
        nwe.oio("hi");
        nwe.oio("pls");
    }
}

class duck extends overloadingandriding {
    void oio(String burgers) {
        System.out.println(":)");
    }
}