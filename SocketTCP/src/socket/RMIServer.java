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
public class RMIServer {
    public static void main(String[] args) {
        try {
            // Tạo một đối tượng register
//            LoaiNgheNghiepRmi loaiNgheNghiepRmi = new LoaiNgheNghiepRmiImp();

            // Đăng ký đối tượng loaiNgheNghiepRmi với RMI Registry
            Registry registry = LocateRegistry.createRegistry(1099);
//            registry.rebind("loaiNgheNghiepRmi", loaiNgheNghiepRmi);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
