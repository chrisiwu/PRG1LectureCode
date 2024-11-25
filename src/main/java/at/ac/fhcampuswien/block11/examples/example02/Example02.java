package at.ac.fhcampuswien.block11.examples.example02;

public class Example02 {
    // any given object can be represented as Object type
    String text1 = "text";
    Object textString1 = "another string";
    Object textString2 = text1;

    // Object type to String won't work
    Object textString3 = "another string";
//    String text2 = textString3; // WON'T WORK!
}