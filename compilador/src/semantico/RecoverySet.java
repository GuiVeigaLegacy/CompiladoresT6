//UNIVERSIDADE DO VALE DO ITAJAÍ - UNIVALI
//Escola do Mar, Ciência e Tecnologia
//Curso de Ciência da Computação – Campus Kobrasol
//Disciplina: Compiladores
//Professor:  Alessandro Mueller
//Alunos:     Guilherme Veiga, Bruno Frassetto e Fabio Volkmann Coelho

package semantico;


import java.util.HashSet;
import java.util.Iterator;

public class RecoverySet extends HashSet {

    public RecoverySet() {
        super();
    }

    public RecoverySet(int t) {
        this.add(new Integer(t));
    }

    public boolean contains(int t) {
        return super.contains(new Integer(t));
    }

    public RecoverySet union(RecoverySet s) {
        RecoverySet t = null;
        if (s != null) {
            t = (RecoverySet) this.clone();
            t.addAll(s);
        }

        return t;
    }

    public RecoverySet remove(int n) {
        RecoverySet t = (RecoverySet) this.clone();
        t.remove(new Integer(n));
        return t;
    }

    public String toString() {
        Iterator it = this.iterator();
        String s = "";
        int k;

        while (it.hasNext()) {
            k = ((Integer) it.next());
            s += langX.im(k) + " ";
        }

        return s;
    }
}
