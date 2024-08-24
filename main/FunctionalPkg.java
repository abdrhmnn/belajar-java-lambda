package main;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * FunctionalPkg
 */
public class FunctionalPkg {
  // java juga sudah menyediakan interface yg siap kita pakai sebagai lambda
  // ada di pkg java.util.function

  public static void main(String[] args) {
    // lambda interface untuk ngelola data (void method)
    Consumer<String> consumer = value -> System.out.println(value);
    consumer.accept("abdu");

    // lambda interface untuk ada return value dan parameter
    Function<String, Integer> function = value -> value.length();
    function.apply("abdu");

    // lambda interface untuk prediksi sebuah value
    Predicate<Integer> predicate = value -> value.toString().isEmpty();
    predicate.test(200);

    // lambda interface untuk return value saja
    Supplier<String> supplier = () -> "Abdu";
    supplier.get();
  }
}