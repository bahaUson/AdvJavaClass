public class A {
}

class B extends A {

}

class C extends A {

}

class Z<T> {

}

class Test {

    void test() {
        Z<A> az = new Z<A>();
        Z<B> bz = new Z<B>();
        Z<C> cz = new Z<C>();

        Z<?> z1 = az;
        Z<?> z2 = bz;
        Z<?> z3 = cz;

        Z<? extends A> z4 = cz;

//        Z<? extends C> z5 = az;  error

//        Z<? super A> z6 = bz; error

        Z<? super A> z6 = az;


    }
}