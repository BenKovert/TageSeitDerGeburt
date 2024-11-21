import java.util.Scanner;
//Gängig in Java: Alle Werte werden in Klassen geschrieben
class TageSeitDerGeburt{

    public static void main (String[] args){ //Main-Methode muss umbenannt werden
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie das aktuelle Jahr an: ");
        int aktuellesJahr = Integer.parseInt(scanner.nextLine());

        //Var kann man verwenden, aber in Java ist es auch möglich, int, String, ... zuzuweisen. Viele Dozenten mögen es nicht, wenn var verwendet wird, aufgrund der unklarheit des Typen der Variable
        var AktJahr = Long.parseLong(readln("Bitte geben sie das aktuelle Jahr an: ")); /// Aktuelles Jahr wird gefragt
        var AktMonat = Long.parseLong(readln("Bitte geben sie den aktuellen Monat an: ")); /// Aktueller Monat wird gefragt
        var AktTag = Long.parseLong(readln("Bitte geben sie den aktuellen Tag an: ")); /// Aktueller Tag wird gefragt

        var GebJahr = Long.parseLong(readln("Bitte geben sie das Geburtsjahr an: ")); /// Geburtsjahr wird gefragt
        var GebMonat = Long.parseLong(readln("Bitte geben sie den Geburtsmonat an: ")); /// Geburtsmonat wird gefragt
        var GebTag = Long.parseLong(readln("Bitte geben sie den Geburtstag an: ")); /// Geburtstag wird gefragt
//Kommentare sind übringens nur zwei slashes
        /*Zeilenkommentare werden
        so
        verwendet
         */
        long[] MonatsTage = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //Wo verrechnest du die Tage des Monats? Ich kann die hier nicht sehen...

        println("Insgesamt sind es " + TageGeburtsJahr(GebJahr, AktJahr));

    }

    boolean istSchaltjahr ( long GebJahr){
        if (GebJahr % 4 == 0 && (GebJahr % 100 != 0 || GebJahr % 400 == 0)) {
            return true;
        } else {
            return false;
        }

    }


    long TageGeburtsJahr ( long GebJahr, long AktJahr)
    { //Wieso verwendest du hier long? Ist das wirklich nötig? Bzw. reicht da nicht ein Int aus? Int nimmt Werte bis: 2147483647

        GebJahr = GebJahr + 1;
//Alternativ in Java auch: GebJahr++;
        while (GebJahr < AktJahr) {//Wie beendest du diese Schleife? Ich erkenne hier kein Inkrement von GebJahr?
            var TageJahr = 0; //Wieso deklarierst du TageJahr hier? Das müsste immer 0+366 ergeben, da du es bei jedem Schleifendurchlauf zurücksetzt
            if (istSchaltjahr(GebJahr)) {
                TageJahr = TageJahr + 366;
            } else {
                TageJahr = TageJahr + 365;
            }

        }

    }
}
