package classlambda;

public class StringUtil {
  public static boolean isLowerCase(String value){
    for(int i = 0; i < value.toCharArray().length; i++){
      if(!Character.isLowerCase(i)){
        return false;
      }
    }

    return true;
  }
}
