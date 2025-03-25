public boolean closeFar(int a, int b, int c) {
  
  boolean bClose = Math.abs(a - b) <= 1;
        boolean cClose = Math.abs(a - c) <= 1;
        boolean bFar = Math.abs(b - c) >= 2;
        
        return (bClose && !cClose && bFar) || (cClose && !bClose && bFar);
    }
