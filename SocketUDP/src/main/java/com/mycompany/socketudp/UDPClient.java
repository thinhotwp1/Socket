
package com.mycompany.socketudp;

import java.net.DatagramPacket;

import java.net.DatagramSocket;

import java.net.InetAddress;

public class UDPClient {

    public static void main(String args[]) {

        try {

            //tạo kết nối udp socket

            DatagramSocket socket = new DatagramSocket();

            //tạo các chuỗi byte

            byte[] inData = new byte[1024];

            byte[] outData = new byte[1024];

            //ip or hostname của  server udp

            InetAddress IP = InetAddress.getByName("localhost");

            //chuỗi dữ liệu gửi tới udp server

            String data = "hello kaka";

     outData = data.getBytes();

            //gửi dữ liệu tới server udp

            DatagramPacket sendPkt = new DatagramPacket(outData, outData.length, IP, 8000);

            System.out.println("ready connect server");

            socket.send(sendPkt);

            socket.setSoTimeout(10000);

            System.out.println("connect server success");

            //chờ nhận dữ liệu từ udp server gửi về

            DatagramPacket recievePkt = new DatagramPacket(inData, inData.length);

            System.out.println("ready receive message from server)");

            socket.receive(recievePkt);

            System.out.println("receive messag");

            System.out.println("Replay from Server: " + new String(recievePkt.getData()));

        } catch (Exception e) {

            System.out.println("error connect udp server");

        }

    }

}