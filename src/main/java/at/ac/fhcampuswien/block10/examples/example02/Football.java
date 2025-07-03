package at.ac.fhcampuswien.block10.examples.example02;

// extended interface
/* interface extension build up a type hierarchy
   classes implementing extended interface must
     implement the methods of the base interface
     and the methods of the extended interface */
public interface Football extends Sports {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}