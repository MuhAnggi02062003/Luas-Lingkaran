/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

/**
 *
 * @author asus
 */
public class MainApp {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(7.0); // Membuat objek Lingkaran dengan radius 7

        double luas = lingkaran1.hitungLuas(); // Menghitung luas lingkaran

        System.out.println("Luas Lingkaran dengan radius " + lingkaran1.getRadius() + " adalah: " + luas);
    }
}