package InterviewTasks;
    import java.util.*;
    public class Solution {
        public static void main(String[] args) {
            String S="sfgbaushlhokkhsd";
            System.out.println(S);
            System.out.println();

        }
        public String solution(String S) {
            Set<Character> vowelsSet = new HashSet<>();
            Map<Character, Integer> vowelCounter = new TreeMap<>();
            vowelsSet.add('a');
            vowelsSet.add('e');
            vowelsSet.add('i');
            vowelsSet.add('o');
            vowelsSet.add('u');
            S = S.toLowerCase();
            for(int i = 0; i < S.length(); i++){
                if(vowelsSet.contains(S.charAt(i))){
                    if(vowelCounter.containsKey(S.charAt(i))){
                        vowelCounter.put(
                                S.charAt(i),
                                vowelCounter.get(S.charAt(i)) + 1
                        );
                    }
                    else{
                        vowelCounter.put(S.charAt(i), 1);
                    }
                }
            }
            Map<Character, Integer> sortedFilteredMap = new HashMap<Character, Integer>();
            for(Character vowel: vowelCounter.keySet()){
                Integer counter = vowelCounter.get(vowel);
                Character commonVowel = vowel;
                for(Character differentVowel: vowelCounter.keySet()){
                    if(differentVowel == vowel)
                        continue;
                    else {
                        if(vowelCounter.get(differentVowel) > counter){
                            commonVowel = differentVowel;
                            counter = vowelCounter.get(differentVowel);
                        }
                    }
                }
                sortedFilteredMap.put(commonVowel, counter);
            }
            Map<Character, Integer> sortedMap = new TreeMap<>(sortedFilteredMap);
            String result = "";
            int counter = 1;
            for(Map.Entry<Character, Integer> entry : sortedMap.entrySet()){
                if(counter == 1)
                    result = entry.getKey() + " appears " + entry.getValue() +
                            ((entry.getValue() == 1)?" time":" times");
                else
                    result += "\n" + entry.getKey() + " appears " + entry.getValue() +
                            ((entry.getValue() == 1)?" time":" times");
                counter++;
            }
            return result;
        }
    }
