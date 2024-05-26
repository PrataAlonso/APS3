package Auxiliar;
    import java.util.Random;
public class ProtocoloIdGen {
    Random rand = new Random();
    
    public int geradorId(){
        return rand.nextInt(99999)+00000;
    }
}
