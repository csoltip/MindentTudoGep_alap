package modell;

import java.util.Arrays;

public class Gep {
    private boolean[] lottoszamok;

    public Gep() {
        lottoszamok = new boolean[91];
        Arrays.fill(lottoszamok, false);
        sorsol();
    }

    public void sorsol(){
        int db = 0;
        while(db < 5){
            int sz = velSzam();
            if(!lottoszamok[sz]){
                lottoszamok[sz] = true;
                db++;
            }
        }
    }
    
    private int velSzam(){
        return velSzam(1, 90);
    }
    
    private int velSzam(int min, int max){
        return (int)(Math.random()*(max-min+1))+min;
    }
    
    public String getNyeroSzamokStr(){
        return "1,2,3,4,5";
    }
    
    public int[] getNyeroSzamok(){
        return new int[]{1,2,3,4,5};
    }

    
}
