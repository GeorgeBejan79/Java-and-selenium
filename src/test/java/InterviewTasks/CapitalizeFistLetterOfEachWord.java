package InterviewTasks;

public class CapitalizeFistLetterOfEachWord {
    public static void main(String[] args) {


//    String str = "welcome to java";
//
//    // uppercase first letter of each word
//    String output = Arrays.stream(str.split("\\s+"))
//            .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
//            .collect(Collectors.joining(" "));
//
//// print the string
//System.out.println(output);
// Welcome To Java


    String str = "everyone loves java so much";

//    // stores each characters to a char array
//    char[] charArray = str.toCharArray();
//    boolean foundSpace = true;
//
//    for(int i = 0; i < charArray.length; i++) {
//
//        // if the array element is a letter
//        if(Character.isLetter(charArray[i])) {
//
//            // check space is present before the letter
//            if(foundSpace) {
//
//                // change the letter into uppercase
//                charArray[i] = Character.toUpperCase(charArray[i]);
//                foundSpace = false;
//            }
//        }
//
//        else {
//            // if the new character is not character
//            foundSpace = true;
//        }
//    }
//
//    // convert the char array to the string
//    str = String.valueOf(charArray);
//    System.out.println( str);

            //Split sentence into words
//            String words[]=str.split("\\s");
//            String newString ="";
//
//            for(String w: words){
//                String first = w.substring(0,1);      //First Letter
//                String rest = w.substring(1);         //Rest of the letters
//
//                //Concatenete and reassign after
//                //converting the first letter to uppercase
//                newString+=first.toUpperCase()+ rest+ " ";
//            }
//
//            //trim to remove the last redundant blank space
//            System.out.println(newString.trim());

        String result="";
        String [] arr =str.split(" ");
        for(int i=0; i<arr.length; i++){
            if(Character.isLetter(arr[i].charAt(0))){
                arr[i]= String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1);
                result+=arr[i]+" ";
            }
        }
        System.out.println(result);
}
}
