import java.util.Arrays;

public class Ship {
    int nSize;
    char nShip[];


    public Ship( int nSize ){
        this.nSize=nSize;
        nShip=new char[nSize];
        Arrays.fill(nShip,'0');
    }
}