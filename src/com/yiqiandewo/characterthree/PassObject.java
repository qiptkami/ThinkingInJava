package com.yiqiandewo.characterthree;

public class PassObject {
    static void change(Person p) {
        p.setName("bbb");
    }

    static void change1(Person p) {

        p = new Person();
        p.setName("ccc");

    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("aaa");

        change(p);
        //由于传入的实参和形参指向了同一个对象，所以可以改变
        System.out.println("main：执行change之后" + p);

        change1(p);
        //change1中使形参p执行了一个新的对象 改变的只是形参p
        System.out.println("main：执行change1之后" + p);
    }
}

class Person {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
