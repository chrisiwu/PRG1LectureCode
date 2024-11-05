package at.ac.fhcampuswien.block10.examples.example02;

// extended interface
/* interface extension build up a type hierarchy
   classes implementing extended interface must
     implement the methods of the base interface
     and the methods of the extended interface */
public interface Hockey extends Sports, Event {
    public void homeGoalScored();

    public void visitingGoalScored();

    public void endOfPeriod(int period);

    public void overtimePeriod(int ot);
}