public class ExeptionIntro {

    public static void main(String[] args) {
        System.out.println("Start program");

        try {
            Integer number = getNumber(args[0]);
            System.out.println(number + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            //сообщение об ошибке в месседже
            System.out.println(e.getMessage());
            //  System.out.println("Index 0 out of bounds for length 0");
        } catch (NumberFormatException e) {
            System.out.println("Args not number");
        }
        //catch на любой случай
        catch (Exception e) {
            System.out.println("All exeptions");
        }

        System.out.println("End program");

        //======================================
       try {
           boolean res = isNumber(args[0]);
           System.out.println(res);
       }catch (Exception e ) {
           System.out.println(e.getMessage());
       }finally {
           System.out.println("End end end programmm!!!");
       }
    }

    private static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static Integer getNumber(String str) {
        return Integer.parseInt(str);
    }
}
