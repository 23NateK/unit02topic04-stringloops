import java.util.Arrays;

import javax.swing.text.StyleConstants;

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
public static int[] indexesOfAll(String a,String letter){
int [] values = new int[0];
int len = a.length();
for (int n=1;n<len;n++){
  if (a.substring(n-1, n).equals(letter)){
      int[] copyList = new int[values.length+1];
      for(int x = 0; x< values.length; x++){
        copyList[x] = values[x];
      }
      copyList[copyList.length-1] = n;
      values = copyList;
  }
}
return values;
}
  public static void main(String[] args) {

    // testing of static methods goes here
    //System.out.println(reverseCharacters("academy"));
    System.out.println(Arrays.toString(indexesOfAll("attack","a")));
  }
}