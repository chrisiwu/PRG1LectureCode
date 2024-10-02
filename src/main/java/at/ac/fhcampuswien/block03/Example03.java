package at.ac.fhcampuswien.block03;

public class Example03 {
    public static void main(String[] args) {
        // calling the method from another class
        Example02_01.showErrorMsg();
        Example02_02.showErrorMsg("other class"); // values passed to the method
    }
}