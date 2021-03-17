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
        System.out.println("___________________");

        IPrintable[] printableMassM = getPrintableElemnts(ar);
        printArray(printableMassM);

    }

    private static void displayPrintable(MassMedia[] ar) {
        //tests
        if (ar == null || ar.length == 0) {
            System.out.println("Wrong MassMedia array");
            return;
        }
        //search only print-media and print them out
        for (MassMedia a : ar) {
            if (a instanceof IPrintable) {
                ((IPrintable) a).print();
            }
            //the same
//                IPrintable temp = (IPrintable) a;
//                temp.print();
//                System.out.println(a);
        }
    }

    //count size of new array
    private static int countPrintable(MassMedia[] ar) {
        if (ar == null || ar.length == 0) {
            System.out.println("Wrong MassMedia array");
            return 0;
        }
        int res = 0;
        for (MassMedia m : ar) {
            if (m instanceof IPrintable) {
                res++;
            }
        }
        return res;
    }

    public static IPrintable[] getPrintableElemnts(MassMedia[] ar) {
        if (ar == null || ar.length == 0) {
            System.out.println("Wrong MassMedia array");
            return null;
        }

        int length = countPrintable(ar);

        IPrintable[] printableMassM = new IPrintable[length];

//		int i = 0;
//		for (MassMedia m : ar) {
//			if (m instanceof IPrintable) {
//				printableMassM[i++] = (IPrintable) m;
////				i++;
//			}
//		}
//		i				  j
//		{P P W NP W J J}  {NP, J, J}
        for (int i = 0, j = 0; i < ar.length; i++) {
            if (ar[i] instanceof IPrintable)
                printableMassM[j++] = (IPrintable) ar[i];
        }
        return printableMassM;
    }

    private static void printArray(IPrintable[] ar) {
        if (ar == null || ar.length == 0)
            System.out.println("Wrong IPrintable array");

        for (IPrintable ip : ar) {
            System.out.println(ip);
        }
    }






//    private static IPrintable[] getPrintableElements(MassMedia[] ar) {
//       //count size of new array
//        int size = 0;
//        for (MassMedia p : ar) {
//            if (p instanceof IPrintable) {
//                size++;
//            }
//            //fill new array in
//            IPrintable[] arr = new IPrintable[size];
//            int i = 0;
//            for (MassMedia b : ar) {
//                if (b instanceof IPrintable) {
//                    arr[i++] = (IPrintable) b;
//                }
//            }
//            return arr;
//        }
//        return null;
//    }
}

