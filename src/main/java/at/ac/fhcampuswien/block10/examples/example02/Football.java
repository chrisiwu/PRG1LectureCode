package at.ac.fhcampuswien.block10.examples.example02;

// extended interface
public interface Football extends Sports {
    void homeTeamScored(int points);

    void visitingTeamScored(int points);

    void endOfQuarter(int quarter);
}