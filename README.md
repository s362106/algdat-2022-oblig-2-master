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

I oppgave 4 startet vi med lage metoden int indeksTil(T verdi) ved å sjekke om verdi er null for så å returnere -1. 
Videre hadde vi en node p som traverserer fra hode til hale vha neste-peker og en for-løkke som returnerer indeksen 
om den finnes, ellers returnerer den -1. Så lagde vi metoden boolean inneholder(T verdi) som skulle returnere true  
hvis listen inneholdt verdi, dette gjorde vi enkelt med metoden vi nettopp lagde, indeksTil(T verdi), ved å la metoden
sjekke om indeksTil(verdi) ikke vil returnere -1.

I oppgave 5 så brukte vi en ... til å ...

I oppgave 6 skulle vi lage metode boolean fjern(T verdi) skal fjerne verdi fra listen og så returnere true. Og om verdi 
ikke er i listen eller er null returnerer den false. Vi løste denne vha 3 hjelpepekere p, q, r. Vi bruker r til å gå 
gjennom listen, og q som forgjengeren til r, p er forgjengeren igjen til q. Vi har en while-løkke som kjører mens r ikke
er null, og brytes når vi har funnet verdi, ellers vil den peke til neste. Vi sjekker først hvis den første fjernes, 
altså hode, og flytter bare hode til neste node og setter hode.forrige lik null for å fjerne verdi fra lenken. Og om
listen kun består av ett element fjerner vi den ved å sette hode og hale lik null. Så sjekker vi om den siste fjernes, 
altså halen, og bare flytter hale til noden rett før og setter hale.neste lik null. Siste tilfelle er da at verdi i 
midten fjernes, og da setter vi nodene en fram , p=q q=r r=r.neste, også lar p.neste være r og r.forrige være lik p, 
da vil q bli fjernet. Til slutt reduserer vi antallet og øker endringene, og returnerer true. Også har vi metoden T 
fjern(int indeks) hvor vi gjør mye av det samme, men returnerer verdien på posisjon indeks isteden. Vi bruker 
indeksKontroll() for å sjekke indeks først. Her bruker vi hjelpevariabel temp til å lagre verdien som fjernes. Hvis 
den første skal fjernes (hode), lagrer vi først verdien i temp, så sjekker vi om listen består av ett element for så 
å sette hode og hale lik null, ellers setter vi hode til neste node og hodens.forrige lik null. Om det ikke er første 
element ser vi om det er hale som fjernes, da setter vi hale til noden rett før og hale.neste lik null. Dette gjør vi 
vha hjelpepekere p og q, hvor p peker på noden før indeks og q er etter p, så noden som skal fjernes. Om det ikke er 
halen som skal fjernes har vi en hjelpepeker r som er q.neste, vi fjerner da q ved å sette p.neste være r og r.forrige 
være lik p. Vi returnerer da verdien, og glemmer selvfølgelig ikke å redusere antall og øke endringer.

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
