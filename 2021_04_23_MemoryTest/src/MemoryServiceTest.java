import org.junit.Test;

import static org.junit.Assert.*;

public class MemoryServiceTest {

    @Test
    public void memoryServiceTest(){
        //запроc инфы о памяти в наличии
        Runtime runtime = Runtime.getRuntime();

        System.out.printf("max free memory %d, max memory %d, total memory %d\n",
                runtime.freeMemory(), runtime.maxMemory(),runtime.totalMemory());

        int max = MemoryService.getMaxAvailebleMemory();
        //чтобы узнать сколько у меня рамаяти создаем массив байт чтобы узнать сколько байтов свободно памаяти
        byte[]ar = new byte[max];
        ar = null;

        boolean flag = false;
        try{
            //пытаюсь создаьт массив на олин больше макс,
            // чтобы проверить вся ли свободная память использована -> max+1 создать нельзя
            ar = new byte[max+1];
            flag = false;
        }catch(OutOfMemoryError e){
            flag = true;
        }
        //флаг сoобщит мне поднят он опущен чтобы понять
        assertTrue(flag);
     //   System.out.println("Max = " + m);
        System.out.printf("max free memory %d, max memory %d, total memory 5d\n",
                runtime.freeMemory(), runtime.maxMemory(),runtime.totalMemory());

    }


}