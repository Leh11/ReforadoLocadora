package Padrao;

public class Adress {
    private String email;
    private String cpf;

    public Adress(){

    }
    public Adress(String email, String cpf){
        this.setEmail(email);
        this.setCpf(cpf);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
