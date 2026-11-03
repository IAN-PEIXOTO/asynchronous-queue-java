package com.estudojava;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
               Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um cep que você queira");
        String cep = scanner.next();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
        .GET()
        .build();

        HttpResponse<String> response = client.send(
                request, 
                HttpResponse.BodyHandlers.ofString()
        );
        System.out.println(response.body());
        scanner.close();

        
    }
}