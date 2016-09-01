package work;
/**
 * A class to simulate rolling many dice and finding the ratio of snake eyes.
 * 
 * @author Lewis et al., CST200 team.
 */

public class Base_A03Q2
{
    
    //Note: you should not need to change the Die class.
    public static class Die
    {
        
        private final int MAX = 6;
        
        private int faceValue;
        
        public Die()
        {
            faceValue = 1;
        }
        public int roll()
        {
            faceValue = (int)(Math.random() * MAX) + 1;
            
            return faceValue;
        }
        
        public void setFaceValue(int value)
        {
            if(value > 0 && value <= MAX)
                faceValue = value;
        }
        
        public int getFaceValue()
        {
            return faceValue;
        }
        
        public String toString()
        {
            String result = Integer.toString(faceValue);
            
            return result;
        }
    }    
    
    public static class PairOfDice
    {        
        //TODO: complete me.
    }

    public static void main(String[] args) {
        final int ROLLS = 500;
        int count = 0;
        
        //TODO: initialize the pair of dice method
        
        
        for(int roll = 1; roll <= ROLLS; roll++)
        {
            //TODO: roll the die pair and count the number of snake eyes.
            //      snake eyes occur when both dice roll one.
        }
        
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of snake eyes: " + count);
        System.out.println("Ratio: " + (double)count / ROLLS);
    }
    
}
