/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kennedy
 */
public class Frutas {

    private String nome;
    private int quantidade;
    private int id;

    public Frutas(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Frutas() {
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {

        return "Fruta: " + nome + ", quantidade: " + quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Frutas other = (Frutas) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public void addQtdd(int q) {
        this.quantidade = this.quantidade + q;

    }

    public static List<Frutas> getFrutas() {
        List<Frutas> frutas = new ArrayList<>();//Já cria o Array de objetos e chama na classe principal 
        try {

            DB db = new DB();
            String query = "SELECT * FROM fruta;";
            ResultSet rs = db.select(query);
            while (rs.next()) {
                frutas.add(new Frutas(rs.getInt("id"), rs.getString("descricao"), rs.getInt("quantidade")));
            }
            return frutas;
        } catch (SQLException e) {
            Logger.getLogger(Frutas.class.getName()).log(Level.SEVERE, null, e);
            return frutas;
        }
    }

    public void update() {
        try {
            DB db = new DB();
            String query = "UPDATE fruta SET descricao = ?, quantidade = ? WHERE id = ?;";
            PreparedStatement stmt = db.createUpdateDelete(query);
            stmt.setString(1, this.nome);
            stmt.setInt(2, this.quantidade);
            stmt.setInt(3, this.id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            Logger.getLogger(Frutas.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void save() {
        try {
            DB db = new DB();
            String query = "INSERT INTO fruta ( descricao, quantidade) VALUES ( ?, ? );";
            PreparedStatement stmt = db.createUpdateDelete(query);
            stmt.setString(1, this.nome);
            stmt.setInt(2, this.quantidade);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            Logger.getLogger(Frutas.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
