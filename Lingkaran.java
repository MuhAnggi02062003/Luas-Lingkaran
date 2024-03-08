/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran;

/**
 *
 * @author asus
 */
public class Lingkaran {
    private double radius; // Properti radius lingkaran

    // Constructor untuk inisialisasi radius
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metode untuk menghitung luas lingkaran
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}
