package com.company;
import java.util.ArrayList;
import java.util.Random;

class RandomizedSet{
    int random =0;
    ArrayList<Integer> yesweCode = new ArrayList<Integer>();

    public RandomizedSet()
    {

    }

    public boolean insert(int val)
    {
        if(yesweCode.contains(val))
        {
            return false;
        }
        yesweCode.add(val);
        return true;
    }

    public boolean remove(int val)
    {
        if(yesweCode.contains(val))
        {
            Integer i = Integer.valueOf(val);
            yesweCode.remove(new Integer(i));
            return true;
        }
        return false;
    }

    public int getRandom()
    {
        Random randomMethod = new Random();
        int index = randomMethod.nextInt(yesweCode.size());
        return yesweCode.get(index);
    }

}
public class Main {

    public static void main(String[] args) {
	    RandomizedSet obj = new RandomizedSet();
        System.out.print(obj.insert(1));
        System.out.print(obj.remove(2));
        System.out.print(obj.insert(2));
        System.out.print(obj.remove(1));
        System.out.print(obj.getRandom());
    }
}
