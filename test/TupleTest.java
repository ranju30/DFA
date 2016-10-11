import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class TupleTest {
    Tuple tuple;

    @Before
    public void model() {
        ArrayList<String> states = new ArrayList<String>();
        states.add("q1");
        states.add("q2");

        String initialState = "q1";

        ArrayList<String> alphabets = new ArrayList<String>();
        alphabets.add("1");
        alphabets.add("0");
        alphabets.add("1");

        ArrayList<String> finalStates = new ArrayList<String>();
        finalStates.add("q2");

        ArrayList<ArrayList<String>> transitions = new ArrayList<ArrayList<String>>();

        ArrayList<String> firstTransitions = new ArrayList<String>();
        firstTransitions.add("q1");
        firstTransitions.add("1");
        firstTransitions.add("q2");
        ArrayList<String> secondTransitions = new ArrayList<String>();
        secondTransitions.add("q2");
        secondTransitions.add("0");
        secondTransitions.add("q1");
        ArrayList<String> thirdTransitions = new ArrayList<String>();
        firstTransitions.add("q1");
        firstTransitions.add("1");
        firstTransitions.add("q2");
        transitions.add(firstTransitions);
        transitions.add(secondTransitions);
        transitions.add(thirdTransitions);

        tuple = new Tuple(states, initialState, alphabets, finalStates, transitions);
    }

    @Test
    public void shouldGetAllState() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("q1");
        expected.add("q2");
        assertTrue(tuple.getStates().equals(expected));
    }

    @Test
    public void shouldGetInitialState() {
        String expected = "q1";
        assertTrue(tuple.getInitialState().equals(expected));
    }

    @Test
    public void shouldGetAlphabets() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("1");
        expected.add("0");
        expected.add("1");
        assertTrue(tuple.getAlphabets().equals(expected));
    }

    @Test
    public void shouldGetFinalStates() {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("q2");
        assertTrue(tuple.getFinalStates().equals(expected));
    }

    @Test
    public void shouldGetAllTransitions() {
        ArrayList<ArrayList<String>> expected = new ArrayList<ArrayList<String>>();

        ArrayList<String> firstTransitions = new ArrayList<String>();
        firstTransitions.add("q1");
        firstTransitions.add("1");
        firstTransitions.add("q2");
        ArrayList<String> secondTransitions = new ArrayList<String>();
        secondTransitions.add("q2");
        secondTransitions.add("0");
        secondTransitions.add("q1");
        ArrayList<String> thirdTransitions = new ArrayList<String>();
        firstTransitions.add("q1");
        firstTransitions.add("1");
        firstTransitions.add("q2");
        expected.add(firstTransitions);
        expected.add(secondTransitions);
        expected.add(thirdTransitions);
        assertTrue(tuple.getAllTransitions().equals(expected));
    }
}
