package BattleMage.v00;

import java.util.ArrayList;
import java.util.List;

public class Character {

    //ATRIBUTOS
    private String name;
    private String atribute1;
    private String atribute2;
    private final int spellPower = 10;

    private float life;



    //CONSTRUTOR

    public Character(String name, String atribute1, String atribute2) {
        this.name = name;
        setAtribute1(atribute1);
        setAtribute2(atribute2);
        this.life = 100.0f;
    }


    //METODOS

    public void detalheMago(){
        System.out.println("------- detalhes do mago -------");
        System.out.println("nome: " + getName());
        System.out.println("Atributos: " + getAtribute1() + " and " + getAtribute2());
        System.out.println("");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtribute1() {
        return atribute1;
    }

    public void setAtribute1(String atribute1) {
        if(getListOfAtributes().contains(atribute1)) this.atribute1 = atribute1;
        else {
            System.out.println("Atributo inválido.");
            this.atribute1 = null;
        }
    }

    public String getAtribute2() {
        return atribute2;
    }

    public void setAtribute2(String atribute2) {
        if(getListOfAtributes().contains(atribute2)) this.atribute2 = atribute2;
        else {
            System.out.println("Atributo inválido.");
            this.atribute2 = null;
        }
    }

    public int getSpellPower() {
        return spellPower;
    }

    public List<String> getListOfAtributes() {

        List<String> listaAtributos = new ArrayList<>();
        listaAtributos.add("hydro");
        listaAtributos.add("pyro");
        listaAtributos.add("earth");
        listaAtributos.add("wind");
        listaAtributos.add("grass");
        listaAtributos.add("steel");
        listaAtributos.add("thunder");
        listaAtributos.add("poison");

        return listaAtributos;
    }
    public float takeDamage(float damage){
        life = life-damage;
        if (life <0) life=0;
        return life;
    }
    public float getLife(){
        return life;
    }

}
