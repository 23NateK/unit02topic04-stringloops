public class StringLoops {

  // static methods go here
public static String reverseCharacters(String a){
  String newstring = "";
  int len = a.length();
  for (int n=0;n<len;n++){
  newstring = newstring+a.substring(len-n-1,len-n);
  }
return newstring;
}
  public static void main(String[] args) {

    // testing of static methods goes here
    System.out.println(reverseCharacters("academy"));
  }
}