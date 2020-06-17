package Epam;

public class Program {

        public String remove(String str) {

            String a = str;

            if(str.length()<=2 && str.contains("A"))
                a = str.replace("A","");
            else if(str.contains("A")) {
                String firstPartOfString = str.substring(0,2);
                String lastPartOfString = str.substring(2,str.length());
                a = firstPartOfString.replace("A", "") + lastPartOfString;
            }
            return a;
        }
    }

