package com.example.appmedidas.model;

public class Pessoa {
    private String nome;
    private double peso, altura;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, double peso, double altura, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public double imc(){
        return peso/(Math.pow(altura, 2));
    }

    public String resultado(){
        double doublevalor = imc();
            if(doublevalor <=17){
                return "Magreza. Você está MUITO abaixo do peso!";
            }
            else if(doublevalor<=18.5){
                return "Você está abaixo do peso!";
            }
            else if(doublevalor <=24.99){
                return "Parabéns! Você está no seu peso ideal.";
            }
            else if(doublevalor<=29.99){
                return "Você está acima do peso!";
            }
            else if(doublevalor<=34.99){
                return "Você está na Obesidade Grau 1.";
            }
            else if(doublevalor<=39.99){
                return "Você está na Obesidade Grau 2 (Severa).";
            }
            else if(doublevalor>=40){
                return "Você está na Obesidade Grau 3 (Mórbida)!";
            }

            return "Algum erro ocorreu. Tente novamente.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
