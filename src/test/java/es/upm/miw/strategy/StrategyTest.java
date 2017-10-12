package es.upm.miw.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void testStrategy() {
        Context context = new Context(new ConcreteStrategySum());
        assertEquals(15, context.executeStrategy(10, 5));
        context = new Context(new ConcreteStrategyMult());
        assertEquals(50, context.executeStrategy(10, 5));
        context = new Context(new ConcreteStrategyDivide());
        assertEquals(2, context.executeStrategy(10, 5));
    }

}
