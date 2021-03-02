public class IdadeFuncao {
    private int d;
    private int meses;
    private int anos;
    private String s = "";

    public void setDias(int d){

        anos = d/365;
        d %= 365;
        meses = d/30;
        d %= 30;

        s += d;
    }
    public String getDias(){
        return s;
    }
    public int getMeses(){
        return meses;
    }
    public int getAnos(){
        return anos;
    }
}
