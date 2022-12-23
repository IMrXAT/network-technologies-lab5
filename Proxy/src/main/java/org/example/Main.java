package org.example;

import org.example.proxy.ProxySocks;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class Main {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getHostAddress());
        ProxySocks proxy = new ProxySocks(InetAddress.getLocalHost(), 5555);
        proxy.start();
    }
}