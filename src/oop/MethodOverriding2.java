package oop;

import java.io.*;
import java.util.*;

class Cycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends Cycle {
    @Override
    String define_me() {
        return "a cycle with an engine.";
    }

    String callSuper() {
        return "My ancestor is a cycle who is " + super.define_me();
    }
}

public class MethodOverriding2 {

    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle();
        System.out.println("Hello I am a motorcycle, I am " + motorCycle.define_me());
        System.out.println(motorCycle.callSuper());
    }
}
