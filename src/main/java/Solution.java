public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        double average = (t1+t2+t3+t4)/4;
        return average;
    }

    public int roundAverage(double average) {
        return (int)(average+0.5);
    }

    public boolean isPassing(int roundedAverage) {
        if (roundedAverage >= 65) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        int roundedValue = (int)Math.round(totalStock);
        return roundedValue;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // double hundredsPlace = (int)(userDouble/100);
        double tensPlace = (int)(userDouble%100/10);
        double onesPlace = (int)(userDouble%10);
        double tenthPlace = (int)(userDouble*10%10);
        double hunderedthPlace = (int)(userDouble*100%10);
        // hundredsPlace = (hundredsPlace + 1)%10;
        tensPlace = (tensPlace+1)%10;
        onesPlace = (onesPlace+1)%10;
        tenthPlace = (tenthPlace+1)%10;
        hunderedthPlace = (hunderedthPlace+1)%10;
        double newValue = (tensPlace * 10)+onesPlace+(tenthPlace*0.1)+(hunderedthPlace*0.01);   
        return newValue;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(199.12));
        //232.32
    }

}
