package pokemon;

import utilidades.Utils;

public class Pokeball {
    public TIPOPokeballs tipo;
    public int probafilidadCaptura= 0;

    public Pokeball(){
        int numeroAzar= Utils.pedirNumeroAleatorio(1,3);
        switch (numeroAzar){
            case 1:
                this.tipo = TIPOPokeballs.BASICA;
                this.probafilidadCaptura = 20;
                break;
            case 2:
                this.tipo = TIPOPokeballs.SUPER;
                this.probafilidadCaptura = 50;

                break;
            case 3:
                this.tipo = TIPOPokeballs.ULTRA;
                this.probafilidadCaptura = 80;
                break;
            default:
                this.tipo = TIPOPokeballs.BASICA;
        }
    }
}
