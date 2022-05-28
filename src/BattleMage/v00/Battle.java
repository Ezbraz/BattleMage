package BattleMage.v00;

import java.text.DecimalFormat;
import java.util.Random;

public class Battle {



    private static final DecimalFormat df = new DecimalFormat("0.00");
    private int roundCount;


    public int getMultiplierValueAtribute1(Character mageAttack, Character mageDefense){

        int countAtribute = 1;

        if (mageAttack.getAtribute1().equals("hydro")) {
            if(mageDefense.getAtribute1().equals("pyro") || mageDefense.getAtribute2().equals("pyro")){
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("earth") || mageDefense.getAtribute2().equals("earth")){
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute1().equals("pyro")) {
            if (mageDefense.getAtribute1().equals("wind") || mageDefense.getAtribute2().equals("wind")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("hydro") || mageDefense.getAtribute2().equals("hydro")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute1().equals("wind")) {
            if (mageDefense.getAtribute1().equals("earth") || mageDefense.getAtribute2().equals("earth")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("pyro") || mageDefense.getAtribute2().equals("pyro")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute1().equals("earth")) {
            if (mageDefense.getAtribute1().equals("hydro") || mageDefense.getAtribute2().equals("hydro")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("wind") || mageDefense.getAtribute2().equals("wind")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute1().equals("grass")) {
            if (mageDefense.getAtribute1().equals("poison") || mageDefense.getAtribute2().equals("poison")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("steel") || mageDefense.getAtribute2().equals("steel")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute1().equals("poison")) {
            if (mageDefense.getAtribute1().equals("thunder") || mageDefense.getAtribute2().equals("thunder")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("grass") || mageDefense.getAtribute2().equals("grass")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute1().equals("thunder")) {
            if (mageDefense.getAtribute1().equals("steel") || mageDefense.getAtribute2().equals("steel")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("poison") || mageDefense.getAtribute2().equals("poison")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute1().equals("steel")) {
            if (mageDefense.getAtribute1().equals("grass") || mageDefense.getAtribute2().equals("grass")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("thunder") || mageDefense.getAtribute2().equals("thunder")) {
                countAtribute--;
            }
        }

        return countAtribute;
    }

    public int getMultiplierValueAtribute2(Character mageAttack, Character mageDefense){

        int countAtribute = 1;

        if (mageAttack.getAtribute2().equals("hydro")) {
            if(mageDefense.getAtribute1().equals("pyro") || mageDefense.getAtribute2().equals("pyro")){
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("earth") || mageDefense.getAtribute2().equals("earth")){
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute2().equals("pyro")) {
            if (mageDefense.getAtribute1().equals("wind") || mageDefense.getAtribute2().equals("wind")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("hydro") || mageDefense.getAtribute2().equals("hydro")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute2().equals("wind")) {
            if (mageDefense.getAtribute1().equals("earth") || mageDefense.getAtribute2().equals("earth")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("pyro") || mageDefense.getAtribute2().equals("pyro")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute2().equals("earth")) {
            if (mageDefense.getAtribute1().equals("hydro") || mageDefense.getAtribute2().equals("hydro")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("wind") || mageDefense.getAtribute2().equals("wind")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute2().equals("grass")) {
            if (mageDefense.getAtribute1().equals("poison") || mageDefense.getAtribute2().equals("poison")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("steel") || mageDefense.getAtribute2().equals("steel")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute2().equals("poison")) {
            if (mageDefense.getAtribute1().equals("thunder") || mageDefense.getAtribute2().equals("thunder")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("grass") || mageDefense.getAtribute2().equals("grass")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute2().equals("thunder")) {
            if (mageDefense.getAtribute1().equals("steel") || mageDefense.getAtribute2().equals("steel")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("poison") || mageDefense.getAtribute2().equals("poison")) {
                countAtribute--;
            }
        }
        if (mageAttack.getAtribute2().equals("steel")) {
            if (mageDefense.getAtribute1().equals("grass") || mageDefense.getAtribute2().equals("grass")) {
                countAtribute++;
            } else if (mageDefense.getAtribute1().equals("thunder") || mageDefense.getAtribute2().equals("thunder")) {
                countAtribute--;
            }
        }

        return countAtribute;
    }


    public float getMultiplier(Character mageattack, Character magedefense){
        Random random = new Random();
        float critic = random.nextFloat(2.0f);
        return (getMultiplierValueAtribute1(mageattack, magedefense) + getMultiplierValueAtribute2(mageattack, magedefense))*critic;
    }

    public void duel(Character mageAttack, Character mageDefense){
        roundCount++;
        System.out.println("----------");
        System.out.println("Round " + roundCount);
        System.out.println(mageAttack.getName() + " attacks " + mageDefense.getName());
        float power = mageAttack.getSpellPower() * getMultiplier(mageAttack, mageDefense);
        System.out.println("against " + mageDefense.getName() + ", " + mageAttack.getName() + "'s power is " + df.format(power));
        System.out.println("actual life of " + mageDefense.getName() + ": " + df.format(mageDefense.takeDamage(power)));
        System.out.println("----------");
        System.out.println("");
    }
    public void setLoser(Character m01, Character m02){
        String loser = null;
        if(m01.getLife()<=0) loser = m01.getName();
        if(m02.getLife()<=0) loser = m02.getName();
        System.out.println("The loser is: " + loser);
    }
}
