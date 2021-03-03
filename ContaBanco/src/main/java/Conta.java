public class Conta {
    protected String tipo;
    private float saldo;
    public int numConta;
    private String dono;
    private boolean status;

    public String getTipo() {
        return tipo;
    }


    public Conta() {
        this.saldo = 0;
        this.setStatus(false);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);

        if (t == "cc"){
           setSaldo(50);
        }else if (t == "cp"){
            setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso!");
    }


    public void fecharConta(){
        if (saldo > 0){
            System.out.println("Dinheiro na conta");
        }else if (saldo < 0){
            System.out.println("Conta em debito");
        }else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }


    public void depositar(float i){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + i);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else {
            System.out.println("Abra uma conta primeiro para fazer um deposito ");
        }
    }


    public void sacar(float i){
        if (this.getStatus() == true){
            if (this.getSaldo() >= i){
                setSaldo(getSaldo() - i);
            System.out.println("Saque realizado na conta " + this.getDono());
            }else {
                System.out.println("saldo insuficiente");
            }
        }else {
            System.out.println("impossivel sacar, abra uma conta primeiro");
        }
    }


    public void pagarMensalidade(){
        float v = 0;
        if (this.getTipo() == "cc"){
            v = 12;
        }else if (this.getTipo() == "cp"){
            v = 20;
        }
        if (this.getStatus() == true){
            if (getSaldo() > v){
                saldo -= v;
            }else {
                System.out.println("impossivel pagar");
            }
        }
    }


    public void estadoAtual(){
        System.out.println("-------------------------");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

}
