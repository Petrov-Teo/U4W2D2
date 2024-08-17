package entities;

import exceptions.StringNotValidException;

public class User implements Comparable<User> {
    int eta;
    private String nome;
    private String cognome;

    public User(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws StringNotValidException {
        if (nome.length() < 3) throw new StringNotValidException(nome);
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) throws StringNotValidException {
        if (cognome.length() < 3) throw new StringNotValidException(cognome);
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "User{" +
                "Nome='" + nome + '\'' +
                ", Cognome='" + cognome + '\'' +
                ", Eta='" + eta + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.cognome.compareTo(o.cognome);
    }
}



