package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoEletrico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Pokemon 
 * Tipo eletrico
 * 100 de hp
 * @author Arthur
 */
public class Pikachu extends TipoEletrico {

    public Pikachu() {
        nome = "Pikachu";
        nomeTipo = "Eletrico";
        this.healthPoints =100;
        this.maxHealthPoints = 100;
        tipo = 1;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] = "Thunder Schock"; habilidades[1] = "Quick Attack"; habilidades[2] = "Thunderbolt";
        habilidades[3] = "Passar";
        setVantagem();
    }
    
  
    
}
