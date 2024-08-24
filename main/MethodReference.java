package main;

import java.util.function.Function;
import java.util.function.Predicate;

import classlambda.StringUtil;

public class MethodReference {
  public static void main(String[] args) {
    // method reference ini bisa digunakan ketika hanya memanggil fungsi nya saja tanpa ada kondisi tambahan

    // jadi ini cth method reference dgn method static
    // dimana tipe data dri param isLowerCase itu hrs sama dgn param generic dri method lambda interface nya
    // begitupun dengan return valuenya
    Predicate<String> predicate = StringUtil::isLowerCase;
    System.out.println(predicate.test("abdu"));
    
    // method reference di parameter
    // method nya kudu tanpa parameter br bs dipergunakan
    Function<String, Integer> function = String::length;
  }
  
  // klo untuk method yg non static itu hrs buat method di dalam objek yg sama atau bs juga
  // pakai dri objek yg lain
  // cth method reference non static yg didalam objek yg sama
  public void run(){
    Predicate<String> predicate = this::isLowerCase;
    System.out.println(predicate.test("abdu"));
  }

  // cth method reference non static yg di pakai dari objek yg lain
  public void run2(){
    MethodReference methodReference = new MethodReference();
    Predicate<String> predicate = methodReference::isLowerCase;
    System.out.println(predicate.test("abdu"));
  }

  public boolean isLowerCase(String value){
    for(int i = 0; i < value.toCharArray().length; i++){
      if(!Character.isLowerCase(i)){
        return false;
      }
    }

    return true;
  }
}
