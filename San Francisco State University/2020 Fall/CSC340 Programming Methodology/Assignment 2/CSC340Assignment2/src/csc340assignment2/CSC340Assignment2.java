package csc340assignment2;

import java.util.Collection;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class CSC340Assignment2 {

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Multimap<String, String> Keyword = ArrayListMultimap.create();
    }
    
    public enum enumKeywords{
        
        Arrow("Arrow", "Noun", "Here is one arrow: <IMG> -=>> </IMG>"),
        
        Book1("Book", "Noun", "A set of pages."),
        Book2("Book", "Noun", " A written work published in printed or electronic form."),
        Book3("Book", "Verb", "To arrange for someone to have a seat on a plane."),
        Book4("Book", "Verb", "To arrange something on a particular date."),
        
        Distinct1("Distinct", "Adjective", "Familiar. Worked in Java."),
        Distinct2("Distinct", "Adjective", "Unique. No duplicates. Clearly different or of a different kind."),
        Distinct3("Distinct", "Adverb", "Uniquely. Written 'distinctly'."),
        Distinct4("Distinct", "Noun", "A keyword in this assignment."),
        Distinct5("Distinct", "Noun", "A keyword in this assignment."),
        Distinct6("Distinct", "Noun", "A keyword in this assignment."),
        Distinct7("Distinct", "Noun", "An advanced search option."),
        Distinct8("Distinct", "Noun", "Distinct is a parameter in this assignment."),
        
        Placeholder1("Placeholder", "Adjective", "To be updated..."),
        Placeholder2("Placeholder", "Adjective", "To be updated..."),
        Placeholder3("Placeholder", "Adverb", "To be updated..."),
        Placeholder4("Placeholder", "Conjunction", "To be updated..."),
        Placeholder5("Placeholder", "Interjection", "To be updated..."),
        Placeholder6("Placeholder", "Noun", "To be updated..."),
        Placeholder7("Placeholder", "Noun", "To be updated..."),
        Placeholder8("Placeholder", "Noun", "To be updated..."),
        Placeholder9("Placeholder", "Preposition", "To be updated..."),
        Placeholder10("Placeholder", "Pronoun", "To be updated..."),
        Placeholder11("Placeholder", "Verb", "To be updated..."),
        
        Reverse1("Reverse", "Adjective", "On back side."),
        Reverse2("Reverse", "Adjective", "Opposite to usual or previous arrangement."),
        Reverse3("Reverse", "Noun", "A dictionary program's parameter."),
        Reverse4("Reverse", "Noun", "Change to opposite direction."),
        Reverse5("Reverse", "Noun", "The opposite."),
        Reverse6("Reverse", "Noun", "To be updated..."),
        Reverse7("Reverse", "Noun", "To be updated..."),
        Reverse8("Reverse", "Noun", "To be updated..."),
        Reverse9("Reverse", "Noun", "To be updated..."),
        Reverse10("Reverse", "Verb", "Change something to opposite."),
        Reverse11("Reverse", "Verb", "Go back."),
        Reverse12("Reverse", "Verb", "Revoke ruling."),
        Reverse13("Reverse", "Verb", "To be updated..."),
        Reverse14("Reverse", "Verb", "To be updated..."),
        Reverse15("Reverse", "Verb", "Turn something inside out.");
        
        
        private String eKey;
        private String ePOSpeech;
        private String eDefinition;
        
        private enumKeywords(String eKey, String ePOSpeech, String eDefinition){
        this.eKey = eKey;
        this.ePOSpeech = ePOSpeech;
        this.eDefinition = eDefinition;
        }
             
        public String geteKey() {
            return eKey;    
        }
        
        public String getePOSpeech(){
            return ePOSpeech;
        }
        
        public String geteDefinition(){
            return eDefinition;
        }
        
        @Override
        public String toString() {
            return this.eKey + ", " + this.ePOSpeech + ", " + this.eDefinition;
        }
                        
    }
           
}
