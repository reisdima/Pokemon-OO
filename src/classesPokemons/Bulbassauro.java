package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoPlanta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Pokemon tipo planta 100hp
 * @author Arthur
 */
public class Bulbassauro extends TipoPlanta {

    /**
      *
      * Pokemon
     */
    public Bulbassauro() {
        imagem = "Bulbassauro.png";
        nome = "Bulbassauro";
        this.healthPoints =100;
        this.maxHealthPoints = 100;
        nomeTipo = "Planta";
        tipo = 5; // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        habilidades[0] = "Vine Whip"; habilidades[1] = "Power Whip"; habilidades[2] = "Seed Bomb";habilidades[3] = "Passar";
        setVantagem();
    }
    
  
    
}
