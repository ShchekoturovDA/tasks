package org.tasks;


public class Main {
    public static void main(String[] args) {
        Mods thirt = (a) -> a % 13 == 0;
        CompStr leng = (str1, str2) -> {
            if(str1.length() >= str2.length()){
                return str1;
            }else{
                return str2;
            }
        };
        Expr disc = (a, b, c) -> b * b - 4 * a * c;

        System.out.println(thirt.thirteen(39));
        System.out.println(thirt.thirteen(76));

        System.out.println(leng.lengthCom("To be or not to be", "Last rites"));
        System.out.println(leng.lengthCom("Back in black", "Nothing the same"));

        System.out.println(disc.discrim(39, 64, 12));
        System.out.println(disc.discrim(76, 12, 23));

    }
}