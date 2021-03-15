package test.java.java_class.StringBuilderPr;
import java.util.Scanner;
public class PracticeStrings {
    public static void main(String[] args) {
        System.out.println("Enter your str: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Enter your word");
        String word = input.nextLine();
        //System.out.println("");
        int wordSize = word.length();
        int newStrSize = wordSize;
        int strSize = str.length();
        String newStr = "";
        /*if (strSize < wordSize) {
            if (strSize == 0 && wordSize == 1) {
                newStr += "";
            }
        }
        if (strSize == wordSize) {

            if (str.charAt(0) != word.charAt(0)) {
                if (strSize == 1 && wordSize == 1 ) {
                    newStr += str.charAt(0);
                }
                if (str.charAt(1) == word.charAt(1) ){
                    if(str.charAt(2) != word.charAt(2)) {
                    newStr += "";
                    }
                }
                if(str.charAt(2) == word.charAt(2)){
                        newStr += str.substring(0, word.length());
                    }
                }
                if (str.charAt(1) != word.charAt(1)) {
                    newStr += "";
                }
            if (str.charAt(0) == word.charAt(0)) {
                if (str.charAt(1) == word.charAt(1)) {
                    newStr += str.substring(0, word.length());
                }
                if (str.charAt(1) == word.charAt(1) && str.charAt(2) != word.charAt(2)) {

                newStr += "";}
            }}
            if (strSize > wordSize) {
                if (wordSize == 1) {

                    if (str.charAt(0) == word.charAt(0)) {
                        newStr += str.charAt(0);
                    }
                    if (str.charAt(1) == word.charAt(0)) {
                        newStr += str.charAt(0);
                    } else {
                        newStr += "";
                    }
                }
                if (wordSize == 2) {
                    if (str.charAt(0) == word.charAt(0) || str.charAt(1) == word.charAt(1) || str.startsWith(word)) {
                        newStr += str.substring(0, 2);
                    } else {
                        newStr += "";
                    }
                }
                if (wordSize >= 3) {
                    if (str.startsWith(word) || str.substring(1).contains(word.substring(1))) {
                        newStr += str.substring(0, word.length());
                    } else {
                        newStr += "";
                    }
                }
            }
            System.out.println(newStr);*/


        if (strSize > 3) {

            //if(wordSize==1 && word.charAt(0)==str.charAt(1)){
               // newStr=str.substring(0,1);
            //""+str.charAt(0);
           // }
            if(wordSize==2){
                //if (word.charAt(0)!=str.charAt(0)&&word.charAt(1)!=str.charAt(1)){
                //newStr = "";
                //}
                //if(  str.substring(0,1).equals(word.substring(0,1))){ //word.charAt(0)==str.charAt(0) && word.charAt(1)==str.charAt(1)){
                newStr=""+str.substring(0,1);//""+str.charAt(0)+str.charAt(1);
           // }
        }
            if(wordSize==3){
                if(word.charAt(0)!=str.charAt(0)){
                    if(word.charAt(1)!=str.charAt(1) && word.charAt(2)!=str.charAt(2)){
                newStr = "";
                }
                    if(str.substring(1,2).equals(word.substring(1,2))){//word.charAt(1)==str.charAt(1) && word.charAt(2)==str.charAt(2)){
                newStr=str.substring(0,word.length());
                    }
                }
                    if( str.substring(1,3).equals(word.substring(1,3))){  //word.charAt(0)==str.charAt(0) && word.charAt(1)==str.charAt(1) && word.charAt(2)==str.charAt(2)){
                newStr=str.substring(0,3);
            }
        }}
        if(strSize==3){
            if(wordSize==2 && (word.charAt(0)==str.charAt(0)&&word.charAt(1)!=str.charAt(1))&&(word.charAt(0)!=str.charAt(0)&&word.charAt(1)==str.charAt(1))){
                newStr+=str.substring(0,2);
            }
            if (wordSize==2 &&word.charAt(0)!=str.charAt(0)&&word.charAt(1) ==str.charAt(1)){
                newStr+=str.substring(0,2);
            }
            if(wordSize==3 && word.charAt(0)!=str.charAt(0)&&word.charAt(1)==str.charAt(1)&& word.charAt(2)!=str.charAt(2)){
                newStr+="";
            }if(wordSize==3&& word.charAt(0)!=str.charAt(0)&&word.charAt(1)==str.charAt(1)&& word.charAt(2)==str.charAt(2)){
                newStr+=str.substring(0,word.length());
            }
        }
        if(strSize==2){
            if(wordSize==0){
                newStr += "";
            }
            if(wordSize==1){
                if(word.charAt(0)==str.charAt(0)){
                    newStr+=str.charAt(0);
                }else{
                    newStr += "";
                }
            }
            if(wordSize==2){
                if(word.charAt(0)!=str.charAt(0)&&word.charAt(1)!=str.charAt(1)){
                    newStr += "";
                }
                if(word.charAt(0)==str.charAt(0)&&word.charAt(1)==str.charAt(1)){
                    newStr+=str.substring(0,2);
                }
            }
        }
        if (strSize==1&&wordSize==1){
            if(str.charAt(0)=='h'){
                newStr+=str.charAt(0)+"";
            }
        }
        if(strSize==0){
            if (wordSize==0){
                newStr += "";
            }else{
                newStr += "";
            }
        }
        if (strSize > 3) {
        if (wordSize > 3 && word.charAt(0) != str.charAt(0) && str.substring(1) == word.substring(1)) ;
        {
            newStr = str.substring(0, word.length());
        }}
            System.out.println(newStr);
        }
    }

