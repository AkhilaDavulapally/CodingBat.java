public int makeChocolate(int small, int big, int goal) {
  int maxBigBars = goal / 5; 
        int bigBarsUsed = Math.min(big, maxBigBars); 
        int remainingWeight = goal - (bigBarsUsed * 5); 
        
        if (remainingWeight <= small) {
            return remainingWeight; 
        } else {
            return -1; 
        }
}
