public class Pokemon {
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    public Pokemon(String name, int hitPoints,String move,int movePower,int attackSpeed){
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }
    public Pokemon(){

    }
    //Get your methods
    public String getName(){
        return name;
    }
    public int getHitPoints(){
        return hitPoints;
    }
    public String getMove(){
        return move;
    }
    public int getMovePower(){
        return movePower;
    }
    public int getAttackSpeed(){
        return attackSpeed;
    }

    //Set your methods
    public void setName(String Name){
        this.name = Name;
    }
    public void setHitPoints(int HitPoints){
        this.hitPoints = HitPoints;
    }
    public void setMove(String Move){
        this.move = Move;
    }
    public void setMovePower(int MovePower){
        this.movePower = MovePower;
    }
    public void setAttackSpeed(int AttackSpeed){
        this.attackSpeed= AttackSpeed;
    }
    //Display methods
    public void displayPokemonStats(){
        System.out.printf("Name: %s\nHit Points: %d\nMove: %s\nMove Power: %d\nAttack Speed: %d",
                getName(),getHitPoints(),getMove(),getMovePower(),getAttackSpeed());
    }
}
