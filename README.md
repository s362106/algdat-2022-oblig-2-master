# Obligatorisk oppgave 2 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
Oppgaven er levert av følgende studenter:
* Fahmi Mohammed, S362106, s362106@oslomet.no 
* Behdad Nikkhah, S362085, s362085@oslomet.no 
* Teresa Pham, S345368, s345368@oslomet.no

# Arbeidsfordeling

I oppgaven har vi hatt følgende arbeidsfordeling:
* Behdad har hatt hovedansvar for oppgave 1, 3, og 5. 
* Teresa har hatt hovedansvar for oppgave 2, 4, og 6. 
* Fahmi har hatt hovedansvar for oppgave 7,8 og 9. 
* Vi har i fellesskap løst oppgave 10. 

# Oppgavebeskrivelse

I oppgave 1 så gikk vi frem ved å ...

I oppgave 2 så brukte vi en en StringBuilder for å lage metodene toString() og omvendtString(). Hvis listen 
 er returnerer vi "[]", ellers hadde vi en node p som traverserer fra hode til hale vha neste- og forrige-peker
hhv for toString() og omvendtString(). For metoden boolean leggInn(T verdi) startet vi med en requireNonNull-metode
for å ikke tillate null-verdier. Om listen er tom på forhånd satte vi hode og hale til å peke på den nye noden 
med forrige- og neste-peker som null. Om listen ikke er tom på forhånd satte vi verdien bakerst og satte hale og 
hale.neste peke på den nye noden med forrige-peker som hale og neste-peker som null. Til slutt økte vi variablene
antall og endringer, og returnerte true.

I oppgave 3 så brukte vi en ... til å ...

I oppgave 4 så brukte vi en ... til å ...

I oppgave 5 så brukte vi en ... til å ...

I oppgave 6 så brukte vi en ... til å ...

I oppgave 7 metode-1 så deklarerte og initierte vi en Node denne som peker på hode etterpå
brukte vi en for-løkke som kjører antall-1 ganger. I forløkken fant vi neste Node som kommer etter denne.
Etterpå nullet vi ut forrige og neste pekerne til Noden denne før vi satte denne som lik neste. Utenfor løkken nullet vi ut hode og hale
og satte antall til 0 før vi økte endringer med 1.
I metode-2 er det det som er i løkken som endres. Her tilkaller vi metoden fjern(0). Den fjerner bare første element i den
DobellLenkede listen. Her brukte den mye lengre tid enn metode-1.

I oppgave 8a så sjekket vi først at iteratorendringer og endringer ikke er ulike og at det finnes neste element.
Vi lagret denne sin verdi og satte denne som sin neste før vi returnerte den midlertidige verdien.
I oppgave 8b returnerte vi en ny DobbeltLenketListeIterator();
I oppgave 8c brukte vi finnNode() hjelpemetoden til å finne Noden med indeksen.
I oppgave 8d brukte først indeksKontroll metoden før vi lagde og returnerte ny DobbeltLenketListeIterator.

I oppgave 9 så brukte vi en ... til å ...

I oppgave 10 så brukte vi en ... til å ...
