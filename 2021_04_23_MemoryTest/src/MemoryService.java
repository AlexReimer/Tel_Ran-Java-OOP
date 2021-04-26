import javax.jws.Oneway;

public class MemoryService {

    //Задача метода: какой макс.неразрывный кусок памяти я могу использовать для работы сейчас
    public static int getMaxAvailebleMemory(){
        int res = Integer.MAX_VALUE;
        while (true){
            try {
                byte[] ar = new byte[res];
                return res;
            }catch (OutOfMemoryError e){
                res--;
            }
        }
    }
}
