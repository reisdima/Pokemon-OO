/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposPokemon;

import pokemon.TipoPokemon;
import pokemon.Pokemon;

/**
 *
 * @author ice
 */
public class TipoAgua extends Pokemon implements TipoPokemon {

   

    @Override
    public void setVantagem() { // retornar array list (lita de tipos, pokemon)
        // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        vantagens.add(2);
        vantagens.add(4);
    }

}
