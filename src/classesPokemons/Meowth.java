package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoNormal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Pokemon
 * tipo normal 
 * 100 hp
 * @author Arthur
 */
public class Meowth extends TipoNormal {

    /**
     * 
     */
    public Meowth() {
        imagem = "Meowth.png";
        nome = "Meowth";
        this.healthPoints =100;
        this.maxHealthPoints = 100;
        nomeTipo="Normal";
        tipo = 3;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] ="Bite";
        habilidades[1]="Scratch";
        habilidades[2]="DarkPulse";
        habilidades[3] = "Passar";
        setVantagem();
    }
    
  
    
}
