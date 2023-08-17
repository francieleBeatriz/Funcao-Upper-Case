/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.upper;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class toUpperCase {
    static String palavra;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para converter seus caracteres em Maiúsculas: ");
        palavra = scanner.next();
        
       upper();
    }
    public static void upper(){
        //Variável string para armazenar a palavra em maiúsculo.
        String maiuscula = "";
        //Variável para converter a letra char em um inteiro.
        int minusculaInt;
        
        //O programa se repitirá até o número correspondente ao tamanho da palavra digitada.
        for(int i = 0; i < palavra.length(); i++){
            
            if(palavra.charAt(i) >= 97 && palavra.charAt(i) <= 122){
                //a variavel minusculaInt recebe uma letra, que é convertida em inteiro e depois é realizada a subtração.
                 minusculaInt = (int) palavra.charAt(i) - 32;
                 //A variável maiuscula atribui a ela mesma somando com a variável minusculaInt, que é transformada em char.
                 maiuscula = maiuscula + (char) minusculaInt;
            }
            else{
                //Caso uma das letras digitadas já seja maiúscula, ela já é atribuida diretamente na variável maiúscula.
                 maiuscula = maiuscula + palavra.charAt(i );
            }
        }
        System.out.println(maiuscula);
    }
}
