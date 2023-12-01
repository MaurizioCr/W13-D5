package Entities;

public abstract class elementoMultimediale {
    String titolo;
    int minutaggio;


    public elementoMultimediale(String titolo, int minutaggio){
        this.titolo=titolo;
        this.minutaggio=minutaggio;
    }
    public void play(){
        if (this.minutaggio>0){
        System.out.println("***** Hai premuto play *****");
        }
    }
}
