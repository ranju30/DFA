import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dfa {
    private Tuple tuple;
    private Map<String, Map<String, String>> allTransitions = new HashMap<String, Map<String, String>>();

    public Dfa(Tuple dfaTuple) {
        this.tuple = dfaTuple;
    }

    public boolean process() {
        String currentState = tuple.getInitialState();
        ArrayList<String> finalStates = tuple.getFinalStates();
        allTransitions = tuple.getAllTransitions();
        ArrayList<String> alphabets = tuple.getAlphabets();
        for (String alphabet : alphabets) {
            currentState = processTransition(currentState, alphabet);
        }
        return finalStates.contains(currentState);
    }

    private String processTransition(String currentState, String alphabet) {
        if (allTransitions.containsKey(currentState)) {
            return allTransitions.get(currentState).get(alphabet);
        }
        return null;
    }
}
