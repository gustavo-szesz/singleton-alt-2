package org.example;

public class Main {
    public static void main(String[] args) {
        // Instancia únida de GlobalConfigSingleton
        GlobalConfigSingleton config = GlobalConfigSingleton.getInstance();

        // Definindo as variaves de configuração
        config.setConfig("server_url", "http://up.edu.com.br");
        config.setConfig("max_connections", "100");
        config.setConfig("timeout", "30");

        // Retrieve and print the configuration values
        System.out.println("Server URL: " + config.getConfig("server_url"));
        System.out.println("Max Connections: " + config.getConfig("max_connections"));
        System.out.println("Timeout: " + config.getConfig("timeout"));
    }
}