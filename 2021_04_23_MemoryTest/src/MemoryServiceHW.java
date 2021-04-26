public class MemoryServiceHW {
    //Задача метода: какой макс.неразрывный кусок памяти я могу использовать для работы сейчас
    public static int getMaxAvailebleMemory(){
        int res = Integer.MAX_VALUE;
        int mid = res/2;
        while (true){
            try {
                byte[] ar = new byte[res/2];
                return res/2;
            }catch (OutOfMemoryError e){
                res--;
            }
        }
    }
}
