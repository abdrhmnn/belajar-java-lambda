package main;

import java.util.function.Supplier;

public class LazyParameter {
  // lazy parameter adalah parameter yang hanya di eksekusi ketika di akses
  // by default java tidak support lazy parameter
  // maka dri itu bisa memanfaatkan lambda

  public static void main(String[] args) {
    // ini walaupun value nya dibawah 80
    // kode yg ada didalam getName() tetap dijalankan
    // artinya parameter `name` itu akan selalu di akses, tidak pedulikan kondisi nya
    testScore(70, getName());

    // maka konversi ke bentuk lambda
    // parameter `name` baru akan diakses jika value nya diatas 80 kalau dibawah
    // fungsi getName() nya tidak dijalankan dan akan masuk ke kondisi else nya
    testScoreWithLambda(90, () -> getName());
  }

  public static void testScore(int value, String name){
    if(value > 80){
      System.out.println("Selamat! " + name + " anda lulus!");
    }else{
      System.out.println("Anda gagal!");
    }
  }

  public static void testScoreWithLambda(int value, Supplier<String> name){
    if(value > 80){
      System.out.println("Selamat! " + name.get() + " anda lulus!");
    }else{
      System.out.println("Anda gagal!");
    }
  }

  public static String getName(){
    System.out.println("fungsi getName() dipanggil!");
    return "abdu";
  }
}
