package main;

import modell.Gep;

public class MindentTudoGepProgram {

    public static void main(String[] args) {
        Gep gep = new Gep();
        String sz = gep.getNyeroSzamokStr();
        System.out.println("megjátszható számok (','): " + sz);
        int[] szamok = gep.getNyeroSzamok();
        System.out.println("megjátszható számok ('\\n'): ");
        for (int szam : szamok) {
            System.out.println(szam);
        }
        
        //System.out.println("új sorsolás után:");
        //gep.sorsol();
        //System.out.println(gep.getNyeroSzamokStr());
    }
    
}
