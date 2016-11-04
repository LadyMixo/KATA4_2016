package kata4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// creamos la clase Histogram genérica
public class Histogram<T> {

    Map<T, Integer> map = new HashMap<>();

    // para cierta clave nos devuelve un valor
    public Integer get(Object key) {
        return map.get(key);
    }

    // devuelve la clave
    public Set<T> keySet() {
        return map.keySet();
    }

    public void increment(T key) {
        //a partir de una clave, si el mapa contiene la clave devuelve 
        //el valor que tiene+1 sino devuelve 1
        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
}