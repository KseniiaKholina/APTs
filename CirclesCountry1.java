public class CirclesCountry {
    int crosses = 0;
    public boolean IsInside(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2){
            
            boolean[] resultsQatam = new boolean[x.length];
            boolean[] resultsDest = new boolean[x.length];
            for (int i = 0; i : x; i < x.length; i++) {
                double dist_Qatam_circle = (x1-x[i])*(x1-x[i]) + (y1-y[i])*(y1-y[i]);
                double dist_dest_circle = (x2-x[i])*(x2-x[i]) + (y2-y[i])*(y2-y[i]);
                double r_sq = r[i]*r[i];
                resultsQatam[i] = dist_Qatam_circle < r_sq;
                resultsDest[i] = dist_dest_circle < r_sq;
            }
          
    return crosses; 

    }
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
            int crosses = 0;
            for (int k = 0; k < x.length; k++) {
            if (resultsQatam[k] != resultsDest[k]) {
                crosses++;
            }
        }
    return crosses; 
    }
    public static void main(String[] args) {
        
    }

 }