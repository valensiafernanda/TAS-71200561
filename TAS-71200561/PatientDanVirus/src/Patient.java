import java.util.Vector;

public class Patient {
    private int DIE=0;
    private int ALIVE=1;
    private int m_state;
    private int m_resistance;

    public Patient(){

    }

    public void InitResistance(){

    }

    public void DoStart(){

    }

    public void TakeMedicine(){

    }

    public void DoDie(){

    }

    public int getState(){
        return m_state;
    }

    public void setState(int state) {
        this.m_state = m_state;
    }

    public int getResistance() {
        return m_resistance;
    }

    public void setResistance(int resistance) {
        this.m_resistance = m_resistance;
    }

    public Vector<Virus> getVirusList(){

    }

    public void setVirusList(Vector<Virus>){

    }
}
