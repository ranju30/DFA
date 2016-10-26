import java.util.ArrayList;

public class Tuple {

    private ArrayList<String> states;
    private String initialState;
    private ArrayList<String> alphabets;
    private ArrayList<String> finalStates;
    private Transitions transitions;

    public Tuple(ArrayList<String> states, String initialState, ArrayList<String> alphabets, ArrayList<String> finalStates, Transitions transitions) {

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

    public Transitions getAllTransitions() {
        return transitions;
    }
}
