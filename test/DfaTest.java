import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class DfaTest {

    ArrayList<String> states;
    String initialState;
    ArrayList<String> alphabets;
    Transitions  transitions;
    ArrayList<String> finalStates;

    @Before
    public void model() {
        states = new ArrayList<String>();
        states.add("q1");
        states.add("q2");

        initialState = "q1";

        alphabets = new ArrayList<String>();
        alphabets.add("1");
        alphabets.add("0");
        alphabets.add("1");

        finalStates = new ArrayList<String>();
        finalStates.add("q2");

        transitions = new Transitions();
        transitions.setTransitions("q1","q2","1");
        transitions.setTransitions("q2","q1","0");
        transitions.setTransitions("q1","q2","1");
    }

    @Test
    public void shouldProcessAStringAndReturnTrueForValidTransition() {
        Tuple tuple = new Tuple(states, initialState, alphabets, finalStates, transitions);
        Dfa dfa = new Dfa(tuple);
        assertTrue(dfa.process());
    }

    @Test
    public void shouldProcessAStringAndReturnFalseWhenTransitionIsNotPossible() {
        alphabets = new ArrayList<String>();
        alphabets.add("1");
        alphabets.add("0");
        alphabets.add("2");
        Tuple tuple = new Tuple(states, initialState, alphabets, finalStates, transitions);
        Dfa dfa = new Dfa(tuple);
        assertFalse(dfa.process());
    }
}
