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
        String s = Arrays.toString(getNyeroSzamok());
        /* s tartalma: "[1,2,3,4,5]" */
        /* megoldás String műveltekkel: */
        //s = s.substring(1, s.length()-1);
        //s = s.substring(s.indexOf("[")+1, s.lastIndexOf("]"));
        s = s.substring(1, s.lastIndexOf("]"));
        return s;
    }
    
    public int[] getNyeroSzamok(){
        int[] szamok = new int[5];
        int db = 0;
        for (int i = 1; i < lottoszamok.length; i++) {
            if(lottoszamok[i]){
                szamok[db++] = i;
            }
        }
        return szamok;
    }
}
