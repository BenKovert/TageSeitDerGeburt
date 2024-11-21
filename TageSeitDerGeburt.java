void main() {
    var AktJahr = Long.parseLong(readln("Bitte geben sie das aktuelle Jahr an: ")); /// Aktuelles Jahr wird gefragt
    var AktMonat = Long.parseLong(readln("Bitte geben sie den aktuellen Monat an: ")); /// Aktueller Monat wird gefragt
    var AktTag = Long.parseLong(readln("Bitte geben sie den aktuellen Tag an: ")); /// Aktueller Tag wird gefragt

    var GebJahr = Long.parseLong(readln("Bitte geben sie das Geburtsjahr an: ")); /// Geburtsjahr wird gefragt
    var GebMonat = Long.parseLong(readln("Bitte geben sie den Geburtsmonat an: ")); /// Geburtsmonat wird gefragt
    var GebTag = Long.parseLong(readln("Bitte geben sie den Geburtstag an: ")); /// Geburtstag wird gefragt

    long [] MonatsTage = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    println("Insgesamt sind es " + TageGeburtsJahr(GebJahr, AktJahr));

}

boolean istSchaltjahr(long GebJahr) {
    if (GebJahr % 4 == 0 && (GebJahr % 100 != 0 || GebJahr % 400 == 0)) {
        return true;
    } else {
        return false;
    }

}





long TageGeburtsJahr (long GebJahr, long AktJahr) {

GebJahr = GebJahr +1;
    while (GebJahr < AktJahr) {
        var TageJahr = 0;
        if (istSchaltjahr(GebJahr)) {
            TageJahr = TageJahr + 366;
        } else {
            TageJahr = TageJahr + 365;
        }
    
    } 

}
