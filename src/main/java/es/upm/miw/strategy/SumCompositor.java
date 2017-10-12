package es.upm.miw.strategy;

public class SumCompositor implements Compositor {

    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }

}
