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
public class Squirtle extends TipoAgua {

    public Squirtle() {
        imagem = "Squirtle.png";
        nome = "Squirtle";
        nomeTipo = "Agua";
        this.healthPoints =100;
        this.maxHealthPoints = 100;
        tipo = 0; // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        habilidades[0] = "Bubble"; habilidades[1] = "Water Pulse"; habilidades[2] = "Aqua Tail"; habilidades[3] = "Passar";
        setVantagem();
    }
    
  
    
}
