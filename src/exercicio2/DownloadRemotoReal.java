package exercicio2;

class DownloadRemotoReal implements DownloadRemoto {
    private int contadorDownloads;

    public DownloadRemotoReal() {
        this.contadorDownloads = 0;
    }

    @Override
    public void realizarDownload(String arquivo) {
        System.out.println("Realizando o download do arquivo: " + arquivo);
        // Atualiza o contador de downloads
        contadorDownloads++;
    }

    @Override
    public int obterContadorDownloads() {
        return contadorDownloads;
    }
}