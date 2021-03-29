public class StringBuilderIntro {
    public static void main(String[] args) {
        String str = "Hello";
        str = str + "!";

        StringBuilder sb = new StringBuilder();
        System.out.println("sb length = " + sb.length() + ", sb capacity = " + sb.capacity());
        sb = new StringBuilder(200);
        System.out.println("sb length = " + sb.length() + ", sb capacity = " + sb.capacity());
        sb = new StringBuilder("Hello");
        System.out.println("sb length = " + sb.length() + ", sb capacity = " + sb.capacity());
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        String test = sb.toString();
        System.out.println(sb.capacity() + " " + test.length());

        //===============================================================
        long timeNow = System.currentTimeMillis();
        //System.out.println(timeNow);
        int maxIterations = 1_000_000;
        long timeStamp = System.currentTimeMillis();
        concatUsingString(maxIterations);
        System.out.println("Time string: " + (System.currentTimeMillis()-timeStamp));
        timeStamp = System.currentTimeMillis();
        concatUsingStringBuilder(maxIterations);
        System.out.println("Time stringBuilder: " + (System.currentTimeMillis()-timeStamp));

    }

    private static void concatUsingString(int maxIterations) {
        String str = new String();
        while(maxIterations>0) {
            str+="a";
            maxIterations--;
        }
    }

    private static void concatUsingStringBuilder(int maxIterations) {
        StringBuilder sb = new StringBuilder();
        while(maxIterations>0) {
            sb.append("a");
            maxIterations--;
        }
    }
}
