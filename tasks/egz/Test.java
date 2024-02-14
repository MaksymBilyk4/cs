package egz;

public class Test {

    public static void main(String[] args) {

        A a = new A(10);
        B b = new B(1, 2);
        C c = new C(100, 200, 300);

        b.print();
        c.print();

        System.out.println(c.getN());


        B test = new C(1,2,3);
        System.out.println(test);

    }

}


class A {

    static int var = 0;

    int n;

    public A (int n) {
        this.n = n;
        var++;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static int getVar() {
        return var;
    }

    public static void setVar(int var) {
        A.var = var;
    }
}

class B extends A {

    int b;

    public B(int n, int b) {
        super(n);
        this.b = b;
        System.out.println("B constructor");
    }

    public void print() {
        System.out.println("B Constructor");
    }

    @Override
    public String toString() {
        return "B{" +
                "b=" + b +
                ", n=" + n +
                '}';
    }
}

class C extends B {

    int c;

    public C (int c, int b, int n) {
        super(n, b);
        this.c = c;
    }


    @Override
    public void print() {
        System.out.println("C. My method");
    }

    @Override
    public String toString() {
        return "C{" +
                "c=" + c +
                ", b=" + b +
                ", n=" + n +
                '}';
    }

    public void cMethod() {
        System.out.println("Works in C only");
    }
}
