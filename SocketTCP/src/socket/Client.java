/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author pc
 */
public class Client {
    public static void main(String[] args) {
        try {
            // Kết nối tới RMI Registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lấy đối tượng register.Calculator từ RMI Registry
//            LoaiNgheNghiepRmi loaiNgheNghiepRmi = (LoaiNgheNghiepRmi) registry.lookup("loaiNgheNghiepRmi");

            // Gọi phương thức từ xa
//            List<LoaiNgheNghiep> result = loaiNgheNghiepRmi.getAll();
//            System.out.println("Result: " + result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
