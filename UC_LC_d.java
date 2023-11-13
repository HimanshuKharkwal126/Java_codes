import java.util.*;
class UC_LC_d{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String name=sc.nextLine();
        int uc=0,lc=0,digitc=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isUpperCase(ch)){
                uc+=1;
            }else if(Character.isLowerCase(ch)){
                lc+=1;
            }else{
                digitc+=1;
            }
        }
System.out.println(uc);           // for total upper case letters;
System.out.println(lc);           // for total lower case letters:
System.out.println(digitc);       // for total digits:
System.out.println(((float)uc/name.length())*100);       // for % of length of upper case letters:
System.out.println(((float)lc/name.length())*100);       // for % of length of small case letters:
System.out.println(((float)digitc/name.length())*100);   // for % of length of digits:
    }
}
