package appl;

import interfaces.IPrintable;
import items.*;

public class MassMediaAppl {
    public static void main(String[] args) {
        MassMedia[] ar = {
                new Newspaper("Daily express", "209309-217162", 26),
                new Newspaper("Morning news", "217162-209309", 18),
                new Newspaper("Evening star", "217162-930920", 15),
                new Journal("Hunting", "309-217-209309", 120, true),
                new Journal("Time", "9309309-217-20", 110, true),
                new Journal("Spiegel", "930-21793090", 90, true),
                new NewsPortal("Gadgets", "www.gadgets-N1.eu"),
                new NewsPortal("Hqoiuqwoiu", "www.Hqoiuqwoiu.com"),
                new WebSite("klaskjls", "www.klaskjls-09812.com"),
                new WebSite("skjlskla", "www.skjlskla-1234.com"),
        };

        displayPrintable(ar);
     //   getPrintableElements(ar);

    }

    private static void displayPrintable(MassMedia[] ar) {
        for (MassMedia a : ar) {
            if (a instanceof IPrintable) {
                IPrintable temp = (IPrintable) a;
                temp.print();
                System.out.println(a);
            }
        }
    }

//    private static IPrintable[] getPrintableElements(MassMedia[] ar) {
//        int size = 0;
//        for (MassMedia p : ar) {
//            if (p instanceof IPrintable) {
//                size++;
//            }
//            IPrintable[] arr = new IPrintable[size];
//            for (MassMedia b : ar) {
//                if (b instanceof IPrintable) {
//                    arr [b] = ar [b];
//                }
//            }
//        }
//        return arr;
//    }

}
