/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

/**
 *
 * @author meteh
 */
public class Context {
    private StrategyInterface strat;
    public Context(StrategyInterface x)
    {
        this.strat=x;
    }
    public void sortla(int[] arrayYeni)
    {
        strat.sortArray(arrayYeni);
    }
    
    
}
