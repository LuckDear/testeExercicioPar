public class Par {
    private int i = 0;
    private String s = "";
    public void setFuncao(int i){
       int p = i;
        for (int c = 2;c <= p;c++ ){
            if (c%2 == 0){
                s += c + " ";
            }
        }
    }
    public String getS(){
        return s;
    }

}
