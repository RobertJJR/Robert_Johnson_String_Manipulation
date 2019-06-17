public class StringManipulator{
    public String trimAndConcat(String x, String y){
        String newStr = x.trim() + y.trim();
        return newStr;
    }   
    public Integer getIndexOrNull(String x, char y){
       Integer theIndex = x.indexOf(y);
       if (theIndex == -1)
        return null;
     else
        return theIndex;
    }       
    public Integer getIndexOrNull(String x, String y){
        Integer subStrng = x.indexOf(y);
        if (subStrng == -1)
            return null;
        else   
            return subStrng;
    }
    public String  concatSubstring(String str1, int num1, int num2, String str2){
        String subStr = str1.substring(num1, num2);
        String concat = subStr + str2;
        return concat;
    }
}
  