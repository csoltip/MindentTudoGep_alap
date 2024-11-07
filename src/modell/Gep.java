package modell;

public class Gep {
    private boolean[] lottoszamok;

    public Gep() {
        lottoszamok = new boolean[91];
    }

    public String getNyeroSzamokStr(){
        return "1,2,3,4,5";
    }
    
    public int[] getNyeroSzamok(){
        return new int[]{1,2,3,4,5};
    }

    
}
