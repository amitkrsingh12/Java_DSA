package Generic;

public class PairUse{
    public static void main(String args[])
    {
        Pair<String,Integer> pInned = new Pair<>("Generic",100);
        Pair<Pair<String,Integer>,String> pA = new Pair<>();

        pA.setSecond("abcd");
        System.out.println(pA.getSecond());

        Pair<String,Integer> pSI = new Pair<>("abc",10);

//        Pair<String> p = new Pair<>();
//        System.out.println(p.getFirst() + " " + p.getSecond());
//        Pair <String> ps = new Pair<String>("amit","singh");
//        System.out.println(ps.getFirst() + " " + ps.getSecond());
//
//        Pair <Integer> pI = new Pair<Integer>(10,20);
//        System.out.println(pI.getFirst() + " " + pI.getSecond());
    }

}
