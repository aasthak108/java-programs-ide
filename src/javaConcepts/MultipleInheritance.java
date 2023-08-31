package javaConcepts;

interface A {
    default void show() {
        System.out.println("showA");
    }
}

interface B {
    default void show() {
        System.out.println("showB");
    }
}

public class MultipleInheritance implements A, B {
    public void show() {
        A.super.show(); // Calling show method from interface A
    }

    public static void main(String args[]) {
        MultipleInheritance m = new MultipleInheritance();
        m.show(); // Calling the default method using the instance of MultipleInheritance
    }
}

