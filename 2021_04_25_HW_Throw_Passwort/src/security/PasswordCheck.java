package security;

public class PasswordCheck {

//    public static void main(String[] args) {
//        String password = "qhW5!m9c";
//
//        try {
//            boolean checked = check(password);
//            System.out.println(checked);
//        } catch (IllegalPasswordExeption e) {
//            System.out.println(e.getMessages());;
//        }
//    }


    public static boolean check (String password) throws IllegalPasswordExeption {
        if(password==null) throw new IllegalArgumentException("null");
        if(password.length()<8) throw new IllegalPasswordExeption("Wrong length");
        if(password.contains(" ")) throw new IllegalPasswordExeption("Wrong symbol");


        return true;
        }

    }

