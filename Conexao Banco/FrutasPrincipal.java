/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kennedy
 */
public class FrutasPrincipal {

    public static int getIndex(List<Frutas> frutas, String filter) {
        int i = 0;
        for (Frutas f : frutas) {
            if (f.getNome().toLowerCase().equals(filter.toLowerCase())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Frutas> fruta = Frutas.getFrutas();//Pegando o Array de public static List<Frutas> getFrutas()
        System.out.println("--------LISTA DE FRUTAS--------");
        
        for (Frutas f : fruta) {
            System.out.print(f.getId() + ", ");
            System.out.print(f.getNome() + ", ");
            System.out.println(f.getQuantidade());
        }

        int continuar = 1;

        while (continuar == 1) {

            System.out.print("Fruta: ");
            String nomeFruta = sc.next();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            int i = FrutasPrincipal.getIndex(fruta, nomeFruta);
            if (i != -1) {
                fruta.get(i).addQtdd(quantidade);
                fruta.get(i).update();//atualizando um registro que já existe e mudar a quantidade 
          
            } else {
                Frutas frutas = new Frutas();
                frutas.setNome(nomeFruta);
                frutas.setQuantidade(quantidade);               
                frutas.save();//insere 
                fruta.add(frutas);

            }
            fruta = Frutas.getFrutas();//adicionar ou atualizar ele faz outro select 
            System.out.print("Digitar 1 se desejar continuar, caso queira sair digite 0? ");
            continuar = sc.nextInt();
        }
        System.out.println(fruta);
    }

}
