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

I oppgave 1 så gikk vi frem ved å først lage metoden antall. Dette gjøres enkelt ved å bare skrive "retrun antall;".
Deretter skulle vi lage boolean tom() som skal retunere true eller false for om listen er tom eller ikke. 
For at listen skal være tom må hode være lik null-true, hvis det ikke er dette tilfellet er den ikke tom-false.
Deretter skulle vi lage konstruktør for dobbeltLenketListe, hvor vi først sjekker tabellen a == null, hvis dette stemmer
så kaster vi et nullPoint-unntak til brukeren. Deretter sjekker vi hvis lengen er større enn 0, her sjekker vi med en while løkke
første elementet i listen som ikke er null. Deretter lages hode i et if-kall som sjekker hvis elementet != null så lages hode!
Så blir hale satt til verdien hode. Deretter hentes et og et verdi fra tabellen a, som vi definerer som nye noder og som halen peker på. Til
slutt økes antallet. 

I oppgave 2 så brukte vi en en StringBuilder for å lage metodene toString() og omvendtString(). Hvis listen 
 er returnerer vi "[]", ellers hadde vi en node p som traverserer fra hode til hale vha neste- og forrige-peker
hhv for toString() og omvendtString(). For metoden boolean leggInn(T verdi) startet vi med en requireNonNull-metode
for å ikke tillate null-verdier. Om listen er tom på forhånd satte vi hode og hale til å peke på den nye noden 
med forrige- og neste-peker som null. Om listen ikke er tom på forhånd satte vi verdien bakerst og satte hale og 
hale.neste peke på den nye noden med forrige-peker som hale og neste-peker som null. Til slutt økte vi variablene
antall og endringer, og returnerte true.

I oppgave 3a) så gikk frem ved at vi lagde en privat hjelpetabell finnNode(), vi starter med å lage et if-kall som sjekker idenks mindre enn antall delt på 2, 
hvis dette stemmer så er indeksen mot venstre i listen og dermed starter vi fra hode. Ellers hvis det er større enn halvparten starter vi på hale.
Deretter lager vi hent(), hvor det kalles idekskontroll, med false parameter. Det metoden gjør er å hente posisjonens verdi, nemlig T-verdien som er posisjonen for en node.
Så lager vi metoden oppdater(), starter med at det kreves at nyverdi ikke kan være null! Deretter opprettes en peker, som peker på noden sin indeks-posisjon. Deretter oppreter vi gammelVerdi
som har verdien til pekeren. Øker endringer og dermed setter gammelVerdi til å være lik nynyverdi. og retunerer gammelverdi! Oppgave 3b) lager vi metoden subliste(), først implementerer vi fraTilKontrolleren fra kompendiet. Deretter lager vi et Array
fra vår Liste i koden. Så definerer vi intervallet som er til-fra, og sjekker om intervallet er mindre enn 1 ved et if-kall. Hvis dette stemmer retunerer vi array-en liste-(en instans av klassen DobbeltLenketListe)). 
Så lager vi en "nåværende" node- som finner noder fra intervallet fra. Vi løper gjennom et forløkke fra det intervallet som vi først hadde definert
og deretter legger verdien til "nåværende" node inn i array-listen vår. Den nåværende blir satt til å være nåværende.neste. og vi retunerer array-listen til slutt. 

I oppgave 4 startet vi med lage metoden int indeksTil(T verdi) ved å sjekke om verdi er null for så å returnere -1. 
Videre hadde vi en node p som traverserer fra hode til hale vha neste-peker og en for-løkke som returnerer indeksen 
om den finnes, ellers returnerer den -1. Så lagde vi metoden boolean inneholder(T verdi) som skulle returnere true  
hvis listen inneholdt verdi, dette gjorde vi enkelt med metoden vi nettopp lagde, indeksTil(T verdi), ved å la metoden
sjekke om indeksTil(verdi) ikke vil returnere -1.

I oppgave 5 startet vi med å utvikle metoden leggInn(), vi starter med et krav som gjør at verdi ikke kan være null. Vi sjekker deretter
indeks > antall og indeks < 0 hvis dette stemmer kaster vi en unntak om at indeksen er større eller lik antallet. Deretter lager vi en if-kall som sjekker om antall == 0 og indeks == 0
og lager en ny node som er hode og hale som er lik hverandre, hvor neste og forrige peker på null. Hvis indeks == antall så lager vi en ny hale, også hale sin forrige.neste peker, peker på ny hale.
Hvis indeks == 0, så oppdaterer vi hode med et ny node forrige som null og neste peker som gamle hode. Noden som kommer etter hode sin forrige peker skal peke på hode. Hvis ikke disse tilfellene stemmer så lager vi en ny node p som peker på hode. Løper gjennom en løkke
dobbelLenketListen og vi finner posisjonen til noden, deretter lager vi en ny node p, som har verdien verdi. Forrige pekeren peker på p.forrige og neste pekeren til den ny noden peker på forrige p. 
Altså at begge pekerne peker på samme noe

I oppgave 6 skulle vi lage metode boolean fjern(T verdi) som skal fjerne verdi fra listen og returnere true. Og om verdi 
ikke er i listen eller er null returnerer den false. Her brukte vi 3 hjelpepekere; r til å gå gjennom listen, og q som 
forgjengeren til r, p er forgjengeren igjen til q. Vi har en while-løkke som kjører mens r ikke er null, og brytes når 
vi har funnet verdi, ellers vil den peke til neste. Vi sjekker først om det er den første som fjernes, altså hode, og 
flytter bare hode til neste node og setter hode.forrige lik null for å fjerne verdi fra lenken. Og om listen kun består 
av ett element fjerner vi den ved å sette hode og hale lik null. Så sjekker vi om den siste fjernes, altså halen, og 
bare flytter hale til noden rett før og setter hale.neste lik null. Siste tilfelle er da at verdi i midten fjernes, og 
da setter vi nodene ett hakk videre , p=q r=r.neste, også lar p.neste peke på r og r.forrige påke på p, da vil q 
bli fjernet. Til slutt reduserer vi antallet og øker endringene, og returnerer true. Vi har også metoden T 
fjern(int indeks) hvor vi gjør mye av det samme, men returnerer verdien på posisjon indeks isteden. Vi bruker 
indeksKontroll() for å sjekke indeks først. Her bruker vi hjelpevariabel temp til å lagre verdien som fjernes. Og 
sjekker tilfellene om det er hode som skal fjernes, om listen bare har ett element som i forrige metode. Om det ikke er første 
element ser vi om det er hale som fjernes, og fjerner på samme måte som metoden før; vha hjelpepekere p og q, hvor p 
peker på noden før indeks og q er etter p, altså noden som skal fjernes. Om det ikke er halen som skal fjernes har vi 
en hjelpepeker r som er q.neste, vi fjerner da q ved å sette p.neste til å peke på r og r.forrige på p. Vi returnerer 
da verdien, og glemmer selvfølgelig ikke å redusere antall og øke endringer.

I oppgave 7 metode-1 så deklarerte og initierte vi en Node denne som peker på hode etterpå
brukte vi en for-løkke som kjører antall-1 ganger. I forløkken fant vi neste Node som kommer etter denne.
Etterpå nullet vi ut forrige og neste pekerne til Noden denne før vi satte denne som lik neste. Utenfor løkken nullet vi ut hode og hale
og satte antall til 0 før vi økte endringer med 1.
I metode-2 er det det som er i løkken som endres. Her tilkaller vi metoden fjern(0). Den fjerner bare første element i den
DobbeltLenkede listen. Her brukte den mye lengre tid enn metode-1.

I oppgave 8a så sjekket vi først at iteratorendringer og endringer ikke er ulike og at det finnes neste element.
Vi lagret denne sin verdi og satte denne som sin neste før vi returnerte den midlertidige verdien.
I oppgave 8b returnerte vi en ny DobbeltLenketListeIterator().
I oppgave 8c brukte vi finnNode() hjelpemetoden til å finne Noden med indeksen og kodet resten av konstruktøren som vanlig.
I oppgave 8d brukte først indeksKontroll metoden før vi lagde og returnerte ny DobbeltLenketListeIterator.

I oppgave 9 så testet vi først om iteratorendringer og endringer var like i tillegg så sjekket vi at fjernOK er lik sann/true.
Etter det så satt vi fjernOK til å være usann/false, før vi sjekket om det bare er ett element i listen.
Hvis antall er lik 1, så setter vi den som både hode og hale og nuller den ut.
Hvis ikke, så sjekker vi om den siste skal slettes og oppdaterer hale. Vi satt hale lik sin forrige også neste pekeren til den nye halen nulles ut.
Hvis ikke, så sjekker vi om den første skal slettes og oppdaterer hode. Bruker samme prinsipp som vi brukte til å oppdatere hale,
bare at her nuller vi forrige pekeren til den nye hoden.
Hvis ikke, så lager vi en ny node p av noden vi skal slette. Så oppdaterer vi neste pekeren til noden som kommer før p til å peke på noden som kommer etter p og det samme motsatt vei.
Fordi noden p ikke har noen pekere som peker på den, vil den bli fanget opp av javas garbage collector.
Til slutt minker vi antall med 1 og øker både endringer og iteratorendringer med 1.

I oppgave 10 så sjekket vi først at listen ikke er tom og så brukte vi to for-løkker i hverandre. Inne i den andre løkka så bruker komparator c til å sammenligne to elemeneter som vi henter ved hjelp av hent() metoden i grensesnittet Liste.
Komparatoren returnerer -1 hvis første element er større enn andre element, 0 hvis de er like, eller 1 hvis andre element er større enn første.
Så sjekker med en if-setning om komparatoren returnerer -1. I if-setningen så lagrer vi verdien til første element i komparatoren.
Så oppdaterer vi verdien som står i posisjonen til første element, med verdien til andre element. Til slutt oppdaterer vi verdien til andre element til å være lik den midlertidige verdien.
