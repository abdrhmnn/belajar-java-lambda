package main;

import interfacelambda.SimpleApp;

public class SimpleAppMain {
  public static void main(String[] args) {

    // ini kalau menggunakan anonymous class
    SimpleApp simpleApp = new SimpleApp() {
      @Override
      public String sayHello(String name) {
        return "Abdu";
      }
    };

    System.out.println(simpleApp.sayHello("abdu"));

    // ini kalau menggunakan lambda
    SimpleApp simpleApp2 = (String name) -> {
      return "Abdu";
    };

    System.out.println(simpleApp2.sayHello("eunha"));

    // cara membuat lambda
    SimpleApp simpleApp3 = (name) -> {
      return "Abdu";
    };

    // kalo isi kode didalam lambda nya cuma satu baris maka bs disingkat
    SimpleApp simpleApp4 = (String name) -> "Hello " + name;
    SimpleApp simpleApp5 = (name) -> "Hello " + name;
    SimpleApp simpleApp6 = name -> "Hello " + name;
  }
}
