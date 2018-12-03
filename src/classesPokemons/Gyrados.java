package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoAgua;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Pokemon tipo agua 150hp
 * @author Arthur
 */
public class Gyrados extends TipoAgua {

    public Gyrados() {
        imagem = "Gyrados.png";
        nome = "Gyrados";
        this.healthPoints =150;
        this.maxHealthPoints = 150;
        nomeTipo="Agua";
        tipo = 0;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] ="Waterfall";
        habilidades[1]="HydroPump";
        habilidades[2]="Outrage";
        habilidades[3] = "Passar";
        setVantagem();
        
    }
    
  
    
}
