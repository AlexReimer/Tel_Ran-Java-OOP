public class XyBalance_Solution {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby")); //     → true
        System.out.println(xyBalance("aaxbb")); // → false
        System.out.println(xyBalance("yaaxbb")); // → false
    }

    //1. Check if X exists in String
    //2. Check if Y goes after X
    //3. Method " Contains"; "IndexOf"
    //4. Method "Substring"
    private static boolean xyBalance(String input) {
        int indexOfX = -1;
        int indexOfY = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'x') {
                indexOfX = i;
            }
        }
        if (indexOfX != -1) {
            for (int i = indexOfX; i < input.length(); i++) {
                if (input.charAt(i) == 'y') {
                    indexOfY = i;
                }
            }
        }
        return indexOfY != -1;
    }

}
