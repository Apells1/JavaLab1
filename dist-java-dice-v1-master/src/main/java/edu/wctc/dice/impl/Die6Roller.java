package edu.wctc.dice.impl;
import edu.wctc.dice.iface.RollDie;
import java.util.Random;
public class Die6Roller implements RollDie{
    @Override
    public int rollDie(){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

}
