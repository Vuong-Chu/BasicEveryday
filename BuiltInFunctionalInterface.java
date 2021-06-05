import java.util.function.*;

class BuiltInFunctionalInterface {
    public static void main(String[] args){
        //Built-in Functional Interface

        //Lamda function
        Supplier<String> s1 = ()->{return "1. Hello, World!";};
        System.out.println(s1.get());

        Consumer<String> s2 = x->System.out.println(x);
        s2.accept("2. Hello, World!");

        BiConsumer<String, String> s3 = (x, y) -> System.out.println(x+" "+y);
        s3.accept("3. Hello,", "World!");

        Predicate<String> s4 = (x) -> {return x.equals("Hello, World!");};
        System.out.println(s4.test("Hello, World!"));

        BiPredicate<String, String> s5 = (x, y) -> x.equals(y);
        System.out.println(s5.test("Hello, World!","Hello, World!"));

        Function<String, Integer> s6 = (x) -> {return x.equals("Hello, World!")?1:0;};
        System.out.println(s6.apply("Hello, World!"));

        BiFunction<String, String, Integer> s7 = (x, y) -> {return x.equals(y)?1:0;};
        System.out.println(s7.apply("Hello, World!","Hello, World!"));

        UnaryOperator<String> s8 = (x) -> {return x+" ,World!";};
        System.out.println(s8.apply("Hello"));

        BinaryOperator<String> s9 = (x, y) -> {return x+" "+y;};
        System.out.println(s9.apply("Hello,","World!"));
        System.out.println();
        //Reference method
        Supplier<String> r1 = String::new;
        System.out.println(r1.get()+"1. Hello, World!");

        Consumer<String> r2 = System.out::println;
        r2.accept("2. Hello, World!");

        BiConsumer<String, String> r3 = String::contains;
        r3.accept("3. Hello,", "World!");

        Predicate<String> r4 = String::isBlank;
        System.out.println(r4.test("Hello, World!"));

        BiPredicate<String, String> r5 = String::equals;
        System.out.println(r5.test("Hello, World!","Hello, World!"));

        Function<String, Integer> r6 = String::length;
        System.out.println(r6.apply("Hello, World!"));

        BiFunction<String, String, Integer> r7 = String::compareTo;
        System.out.println(s7.apply("Hello",", World!"));

        UnaryOperator<String> r8 = String::trim;
        System.out.println(r8.apply("Hello, World! "));

        BinaryOperator<String> r9 = String::concat;
        System.out.println(r9.apply("Hello,","World!"));

    }
}



