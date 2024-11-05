package at.ac.fhcampuswien.block10.examples.example02;

// extended interface
/* interface extension build up a type hierarchy
   classes implementing extended interface must
     implement the methods of the base interface
     and the methods of the extended interface */
public interface Hockey extends Sports, Event {
    void homeGoalScored();

    void visitingGoalScored();

    void endOfPeriod(int period);

    void overtimePeriod(int ot);
}