package pokemon;

import java.util.ArrayList;

/**
 *Classe pokemon contem todos atributos vida,mana,tipo
 * @author joao
 */
public class Pokemon {
	
    /**
     *Nome do pokemon
     */
    protected String nome;
    protected String nomeTipo;
    protected int tipo;
    protected String[] habilidades = new String[4];
    protected float[] multiHabilidades = {2,1.5f,1,0};
    protected int[] manaPoints = {75,50,25,0};
    protected float healthPoints;
    protected float danoAtual = 10;
    protected float danoPadrao = 10;
    protected float dano;
    
    protected int maxHealthPoints;
    public String imagem;
    public ArrayList<Integer> vantagens = new ArrayList();
    private int habilidadeEscolhida;
    
    
    public int getMaxHP(){
        return maxHealthPoints;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNomeTipo(){
        return nomeTipo;
    }
    
    public void setNomeTipo(String nomeTipo){
        this.nomeTipo=nomeTipo;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public void setTipo(int tipo){
        this.tipo=tipo;
    }
    
    public String[] getHabilidades(){
        return habilidades;
    }
    
    public float getHealthPoints(){
        return healthPoints;
    }
    
    public void setHealthPoints(float healthPoints){
        this.healthPoints=healthPoints;
    }

    public float calculaAtaque(int index){
            dano = danoAtual;
            dano = dano * multiHabilidades[index];
            return dano;
        }
    
    public float getDanoAtual(){
        return danoAtual;
    }
    
    public void setDanoAtual(float danoAtual){
       this.danoAtual = danoAtual;
    }
    
    public void setVantagens(){
        
    }
    
    public void setHabilidadeEscolhida(int i){
        habilidadeEscolhida = i-1;
    }
    
    public int getHabilidadeEscolhida(){
        return habilidadeEscolhida;
    }
    
    public float getDanoPadrao(){
        return danoPadrao;
    }
}
