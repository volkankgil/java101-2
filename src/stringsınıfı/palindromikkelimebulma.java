package stringsýnýfý;

public class palindromikkelimebulma {

    static boolean ispalindrom2(String str){
        String newStr = "";

        for(int i=str.length()-1;i>=0;i--){

            newStr+=str.charAt(i);

        }

        System.out.println(newStr);

        if(newStr.equals(str)){
            return true;

        }return false;
}
    static boolean ispalindrom(String str) {

         int i = 0;
         int j = str.length() - 1;


         while (i < j) {
             if (str.charAt(i) != str.charAt(j)) {
                 return false;
             } else {
                 i++;
                 j--;
             }
         }return true;
     }

    public static void main(String[] args) {
        System.out.println(ispalindrom2("kavak"));

        System.out.println("--------------");

        System.out.println(ispalindrom("marin"));
    }
}
