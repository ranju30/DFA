import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransitionsTest {

    @Test
    public void shouldProcessATransitionForValidPath(){
        Transitions transitions = new Transitions();
        transitions.setTransitions("q1","q2","1");
        String state = transitions.processTransitions("q1","1");
        assertEquals("q2",state);
    }

    @Test
    public void shouldNotProcessATransitionForValidPath(){
        Transitions transitions = new Transitions();
        transitions.setTransitions("q1","q2","1");
        String state = transitions.processTransitions("q2","1");
        assertEquals(null,state);
    }
    
}
