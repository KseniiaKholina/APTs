public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        StringBuilder result = new StringBuilder();
           for (int i = 0; i < rights.length; i++) {
            if (rights[i]<minPermission) {
                result.append("D");

            }
            if (rights[i]>= minPermission) {
                result.append("A");
            }
           }
           return result.toString();
    }
    public static void main(String[] args) {
        
    }
 }
