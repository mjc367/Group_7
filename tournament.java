/**
 * This is a tournament class
 */
public interface tournament {

    /*
        This function will be used to set the
        name of the Tournament
        @param - name - unique tournament name
    */
    void setName();


    /*
        This function will be used to get the
        name of the tournament
    */
    void getName();


    /*
        This function will be used to set the
        amount of competitors
        @param - num - number of competitors
    */
    void setEntrents();


    /*
        This function will be used to get the
        amount of competitors
    */
    void getEntrents();

    /*
        This function will be used to start
        the given tournament
    */
    void startTourn();

    /*
        This function will be used to end
        the given tournament
    */
    void endTourn();
}
