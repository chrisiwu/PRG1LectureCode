package at.ac.fhcampuswien.block10.examples.example02;

public interface Football extends Sports {
    public void homeTeamScored(int points);

    public void visitingTeamScored(int points);

    public void endOfQuarter(int quarter);
}