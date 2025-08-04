public class UpperCaseFirstLetter {

    public static String UpperCase(String str){

        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(Character.toUpperCase(ch));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
               sb.append(str.charAt(i));
               
               sb.append(Character.toUpperCase(str.charAt(i+1)));
               i++;
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
      String str = "iam going out ";
      System.out.println(UpperCase(str));
    }
}
