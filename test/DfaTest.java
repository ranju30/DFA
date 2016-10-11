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
    Map<String, Map<String, String>> transitions;
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

        transitions = new HashMap<String, Map<String, String>>();
        transitions.put("q1", new HashMap<String, String>());
        transitions.get("q1").put("1", "q2");
        transitions.put("q2", new HashMap<String, String>());
        transitions.get("q2").put("0", "q1");
        transitions.put("q1", new HashMap<String, String>());
        transitions.get("q1").put("1", "q2");
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
