package level2.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

       //- Exercici 2
        //
        //    Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers.
        //    Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” si el nombre és imparell.
        //    Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. Imprimeix el resultat.

        List<Integer> numbers = List.of(3, 55, 44, 22, 7, 8);

        System.out.println("Even or odd: "+Filter.filterStringsEvenerOdd(numbers));


    }
}
