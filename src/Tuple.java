import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tuple {


    private ArrayList<String> states;
    private String initialState;
    private ArrayList<String> alphabets;
    private ArrayList<String> finalStates;
    private Map<String, Map<String, String>> transitions;

    public Tuple(ArrayList<String> states, String initialState, ArrayList<String> alphabets, ArrayList<String> finalStates, Map transitions) {

        this.states = states;
        this.initialState = initialState;
        this.alphabets = alphabets;
        this.finalStates = finalStates;
        this.transitions = transitions;
    }

    public ArrayList<String> getStates() {
        return states;
    }

    public String getInitialState() {
        return initialState;
    }

    public ArrayList<String> getAlphabets() {
        return alphabets;
    }

    public ArrayList<String> getFinalStates() {
        return finalStates;
    }

    public Map getAllTransitions() {
        return transitions;
    }
}
