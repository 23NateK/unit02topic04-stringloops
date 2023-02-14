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
public static boolean hasRepeatedConsecutives(String a){
  boolean answer=false;
  for(int n=0;n<a.length()-2;n++){
    if(a.substring(n,n+1).equals(a.substring(n+1,n+2))){
      answer=true;
    }
  }
return answer;
}
public static String reverseWords(String a){
  String output="";
  for(int x=a.length()-1;x>0;x--){
    int n=a.lastIndexOf(" ",x-1);
    int n2=a.indexOf(" ", n+1);
    if(n2==-1){
      n2=x+1;
    }
    //newstring = newstring+a.substring(len-n-1,len-n);
    String word=a.substring(n+1,n2);
    word.split(" ");
    x=x-word.length();
    output=output+" "+word;
  }
  return output;
}
  public static void main(String[] args) {

    // testing of static methods goes here
    //System.out.println(reverseCharacters("academy"));
    //System.out.println(Arrays.toString(indexesOfAll("attack","a")));
    //System.out.println(hasRepeatedConsecutives("rook"));
    System.out.println(reverseWords("the quick brown fox"));
}
}