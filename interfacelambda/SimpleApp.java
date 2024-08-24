package interfacelambda;

@FunctionalInterface
public interface SimpleApp {
  // String sayHello();
  String sayHello(String name);

  // tidak bisa menambahkan lebih dari satu method abstract
  // String sayHello2();
}