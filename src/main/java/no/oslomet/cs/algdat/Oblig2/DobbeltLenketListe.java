package no.oslomet.cs.algdat.Oblig2;


////////////////// class DobbeltLenketListe //////////////////////////////


import java.util.*;
import java.util.stream.Stream;


public class DobbeltLenketListe<T> implements Liste<T> {

    /**
     * Node class
     *
     * @param <T>
     */
    private static final class Node<T> {
        //jfoeifjeo
        private T verdi;                   // nodens verdi
        private Node<T> forrige, neste;    // pekere

        private Node(T verdi, Node<T> forrige, Node<T> neste) {
            this.verdi = verdi;
            this.forrige = forrige;
            this.neste = neste;
        }

        private Node(T verdi) {
            this(verdi, null, null);
        }
    }

    // instansvariabler
    private Node<T> hode;          // peker til den første i listen
    private Node<T> hale;          // peker til den siste i listen
    private int antall;            // antall noder i listen
    private int endringer;         // antall endringer i listen

    public DobbeltLenketListe() {
        hode = null;
        hale = null;

        endringer = 0;
        antall = 0;

    }

    public DobbeltLenketListe(T[] a) {
        int lengde = a.length;

        if (a == null){
            throw new NullPointerException("Tabellen a er null!");
        }
//finner den første elementet i a som ikke er lik null
        if (lengde > 0){
            int i = 0;
            while (i < lengde){
                T element = a[i];
                if (element != null){
                    //her lages hode
                    hode = new Node<>(a[i]);
                    antall++;
                    break;
                }
                i++;
            }
            hale = hode;
            if (hode != null){
                i++;
                while (i < lengde){
                    if (a[i] != null){
                        hale.neste = new Node<>(a[i],hale,null);
                        hale = hale.neste;
                        antall++;
                    }
                    i++;
                }
            }
        }
    }

    public Liste<T> subliste(int fra, int til) {

            fratilKontroll(antall,fra,til);

            Liste<T> array = new DobbeltLenketListe<>();

            int intervall = (til-fra);

            if (intervall < 1){
                return array;
            }

            Node<T> current = finnNode(fra);

            for(;intervall > 0;intervall--) {
                array.leggInn(current.verdi);
                current = current.neste;
            }
            return array;
    }


    private void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)
            throw new IndexOutOfBoundsException();

        if (til > tablengde){
            throw new IndexOutOfBoundsException();
        }

        if (fra > til)
            throw new IllegalArgumentException();
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public boolean tom() {
        if (hode == null){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean leggInn(T verdi) {
        Objects.requireNonNull(verdi, "Null-verdier er ikke tillatt");

        if (antall == 0) {
            hode = hale = new Node<>(verdi, null, null);
        } else {
            Node<T> p = new Node<>(verdi, hale, null);
            hale.neste = p;
            hale = p;
        }

        endringer++;
        antall++;
        return true;
    }

    @Override
    public void leggInn(int indeks, T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean inneholder(T verdi) {
        return indeksTil(verdi) != -1;
    }

    @Override
    public T hent(int indeks) {
        indeksKontroll(indeks,false);
        return finnNode(indeks).verdi;
    }

    // hjelpemetode
    private Node<T> finnNode(int indeks) {

        indeksKontroll(indeks, false);

        Node<T> current;

        if (indeks < antall / 2) {
            current = hode;
            for (int i = 0; i < indeks; i++) {
                current = current.neste;
            }
            return current;
        } else {
            current = hale;
            for (int i = antall - 1; i > indeks; i--) {
                current = current.forrige;
            }
            return current;
        }
    }

    @Override
    public int indeksTil(T verdi) {
        if (verdi == null) {
            return -1;
        }

        Node<T> p = hode;
        for (int i = 0; i < antall; i++) {
            if (p.verdi.equals(verdi)) {
                return i;
            }
            p = p.neste;
        }

        return -1;
    }

    @Override
    public T oppdater(int indeks, T nyverdi) {

        Objects.requireNonNull(nyverdi,"Ikke tillatt med null-verier!");

        indeksKontroll(indeks,false);

        Node<T> peker = finnNode(indeks);

        T gammelVerdi = peker.verdi;
        endringer++;
        peker.verdi = nyverdi;

        return gammelVerdi;

    }

    @Override
    public boolean fjern(T verdi) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T fjern(int indeks) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void nullstill() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        if (antall == 0) {
            return "[]";
        }

        Node<T> p = hode;
        StringBuilder s = new StringBuilder();
        s.append('[').append(p.verdi);
        p = p.neste;
        while (p != null) {
            s.append(',').append(' ').append(p.verdi);
            p = p.neste;
        }
        s.append(']');

        return s.toString();
    }

    public String omvendtString() {
        if (antall == 0) {
            return "[]";
        }

        Node<T> p = hale;
        StringBuilder s = new StringBuilder();
        s.append('[').append(p.verdi);
        p = p.forrige;
        while (p != null) {
            s.append(',').append(' ').append(p.verdi);
            p = p.forrige;
        }
        s.append(']');

        return s.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new DobbeltLenketListeIterator();
    }

    public Iterator<T> iterator(int indeks) {
        indeksKontroll(indeks, false);
        return new DobbeltLenketListeIterator(indeks);
    }

    private class DobbeltLenketListeIterator implements Iterator<T> {
        private Node<T> denne;
        private boolean fjernOK;
        private int iteratorendringer;

        private DobbeltLenketListeIterator() {
            denne = hode;     // p starter på den første i listen
            fjernOK = false;  // blir sann når next() kalles
            iteratorendringer = endringer;  // teller endringer
        }

        private DobbeltLenketListeIterator(int indeks) {
            denne = finnNode(indeks);
            fjernOK = false;
            iteratorendringer = endringer;
        }

        @Override
        public boolean hasNext() {
            return denne != null;
        }

        @Override
        public T next() {
            if (iteratorendringer != endringer) {
                throw new ConcurrentModificationException("Det er gjort endringer!");
            }
            if (!hasNext()) throw new NoSuchElementException("Listen er tom!");

            fjernOK = true;
            T temp = denne.verdi;
            denne = denne.neste;

            return temp;
        }

        @Override
        public void remove() {
            if(!fjernOK) {
                throw new IllegalStateException("Kan ikke fjerne noe element nå!");
            }
            if(iteratorendringer != endringer) {
                throw new ConcurrentModificationException("Iteratorendringer og endringer stemmer ikke med hverandre!");
            }
            if(antall == 1) hode = hale = null;

            if(denne == null) {
                hale = hale.forrige;
                hale.neste = null;
            }
            else if(denne.forrige == hode) {
                hode = hode.neste;
                hode.forrige = null;
            }
            else{
                Node<T> forrigeNode = denne.forrige;
                forrigeNode.forrige.neste = forrigeNode.neste;
                forrigeNode.neste.forrige = forrigeNode.forrige;
            }
            antall--;
            endringer++;
            iteratorendringer++;
        }

    } // class DobbeltLenketListeIterator

    public static <T> void sorter(Liste<T> liste, Comparator<? super T> c) {
        throw new UnsupportedOperationException();
    }


} // class DobbeltLenketListe


