
public class Player {

    private String name;
    private String tag;
    private int id;
    private int rank;
    private String sponsor;

    // constructor
    public Player(String name){

        this.name = name;

    }

    // name
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    // tag
    public String getTag(){
        return this.tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    // id
    public void setID(int num){
        this.id = num;
    }
    public int getID(){
        return this.id;
    }

    // rank
    public void setRank(int num){
        this.rank += num;
    }

    public int getRank(){
        return this.rank;
    }

    //sponsor
    public void setSponsor(String name){
        this.sponsor = name;
    }

    public String getSponsor(){
        return this.sponsor;
    }

    public static void main(String[] args) {
        System.out.println("hELLO");
    }
}