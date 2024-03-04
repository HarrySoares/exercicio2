package exercicio2;

public class Exercicio2 {
 public static void main(String[] args) {
        // Uso do Proxy para realizar downloads
        DownloadRemoto proxy = new ProxyDownloadRemoto();

        // Realiza três downloads
        proxy.realizarDownload("Arquivo1.txt");
        proxy.realizarDownload("Arquivo2.zip");
        proxy.realizarDownload("Arquivo3.doc");

        // Obtém o contador de downloads do Proxy
        System.out.println("Total de Downloads: " + proxy.obterContadorDownloads());
    }
}