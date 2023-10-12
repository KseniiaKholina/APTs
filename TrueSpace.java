public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
        long count = 0;
        
        for (int file_size : sizes) {
            if (file_size == 0) {
                count += 0;
            } else if (file_size <= clusterSize) {
                count += 1;
            } else {
                int whole = (int) Math.ceil((double) file_size / clusterSize);
                count += whole;
            }
        }
        return clusterSize * count;
    }
}
