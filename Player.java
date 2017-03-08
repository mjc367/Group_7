/*
    This Interface will be used to build a player for our tournament
    database. Each player will have a name, tag, unique Id, rank,
    and sponsors.
*/
public interface Player {

    // Put constructor here

    /*
        This function will be used to get the name
        of the player.
        @param - id - unique player id
    */
    void getName();

    /*
        This function will be used to get the tag
        of the player
        @param - id - unique player id
    */
    void getTag();

    /*
        This function will be used to get the unique
        id of the player
        @param - name - name of the player
        @param - tag - the tag of the player
    */
    void getId();

    /*
        This function will be used to get the rank
        of the player
        @param - id - unique player id
    */
    void getRank();

    /*
        This function will be used to get any
        sponsors the player may have
        @param - id - unique player id
    */
    void getSponsor();

}
