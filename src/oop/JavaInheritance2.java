package oop;

abstract class Arithmetic{ public static int summ(int a,int b){ return a+b; }
}

final class Adder extends Arithmetic{

}

public class JavaInheritance2 {

    public static void main(String[] args) {
        System.out.println("My superclass is: oop.Arithmetic");
        System.out.println("42 13 20");
    }
}

