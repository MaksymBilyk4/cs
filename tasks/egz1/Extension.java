package egz1;

public class Extension {

    public static void main(String[] args) {
        C c = new C(1,2,3);
        c.print();
    }

}

class A {

    int a;

    public A (int a) {
        this.a = a;
        System.out.println("A constructor");
    }

    public void print() {
        System.out.println("Print method -> A");
    }

}

class B extends A{

    int b;

    public B (int b, int a) {
        super(a);
        this.b = b;
        System.out.println("B constructor");
    }

    public void print() {
        super.print();
        System.out.println("Print method -> B");
    }

}

class C extends B{

    int c;

    public C (int c, int b, int a) {
        super(b, a);
        this.c = c;
        System.out.println("C constructor");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Print method -> C");
    }

}