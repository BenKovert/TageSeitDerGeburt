int gebjahrtage = switch (GebTag){  
    case 1 -> 31- GebTag;
    case 2 -> if (Schaltjahr=true){
    29- GebTag;}
    else {28- GebTag;}
    case 3 -> 31- GebTag;
    case 4 -> 30- GebTag;
    case 5 -> 31- GebTag;
    case 6 -> 30- GebTag;
    case 7 -> 31- GebTag;
    case 8 -> 31- GebTag;
    case 9 -> 30- GebTag;
    case 10 -> 31- GebTag;
    case 11 -> 30- GebTag;
    case 12 -> 31- GebTag;
    default -> 0;
    
    };


int langermonat [] = {1,3,5,7,8,10,12};
int kurzermonat [] = {4,6,9,11};

int alterIJ(int AktJahr, int GebJahr){
    return AktJahr*GebJahr;
}

int alterIM(int GebMonat, int AktMonat){
    if (AktMonat<GebMonat){
        return AktMonat+12-GebMonat;
    } else {
        return AktMonat-GebMonat;
}
}

int alterIT(int AktTag; int GebTag;){
if (AktTag<GebTag){
    return AktTag+30-GebTag;
} else {
    return AktTag-GebTag;
}
}



int gebjahrmonate = switch(GebMonat) {
case 1 -> if (Schaltjahr=true) { 
    return  29+31+30+31+30+31+31+30+31+30+31;
} else {
    return  28+31+30+31+30+31+31+30+31+30+31;
}
case 2 -> 31+30+31+30+31+31+30+31+30+31;
case 3 -> 30+31+30+31+31+30+31+30+31;
case 4 -> 31+30+31+31+30+31+30+31;
case 5 -> 30+31+31+30+31+30+31;
case 6 -> 31+31+30+31+30+31;
case 7 -> 31+30+31+30+31;
case 8 -> 30+31+30+31;
case 9 -> 31+30+31;
case 10 -> 30+31;
case 11 -> 31;
case 12 -> 0;
}



void main (){

    var AktJahr = Integer.parseInt(readln("Bitte geben sie das aktuelle Jahr an: ")); /// Aktuelles Jahr wird gefragt
    var AktMonat = Integer.parseInt(readln("Bitte geben sie den aktuellen Monat an: ")); /// Aktueller Monat wird gefragt
    var AktTag = Integer.parseInt(readln("Bitte geben sie den aktuellen Tag an: ")); /// Aktueller Tag wird gefragt

    var GebJahr = Integer.parseInt(readln("Bitte geben sie das Geburtsjahr an: ")); /// Geburtsjahr wird gefragt
    var GebMonat = Integer.parseInt(readln("Bitte geben sie den Geburtsmonat an: ")); /// Geburtsmonat wird gefragt
    var GebTag = Integer.parseInt(readln("Bitte geben sie den Geburtsmonat an: ")); /// Geburtstag wird gefragt


}
