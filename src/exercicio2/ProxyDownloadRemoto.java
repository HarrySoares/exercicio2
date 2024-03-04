package exercicio2;

class ProxyDownloadRemoto implements DownloadRemoto {
    private DownloadRemotoReal downloadReal;
    private int contadorDownloads;

    public ProxyDownloadRemoto() {
        this.downloadReal = new DownloadRemotoReal();
        this.contadorDownloads = 0;
    }

    @Override
    public void realizarDownload(String arquivo) {
        // Verifica se o usuário tem permissão para realizar o download
        if (verificarPermissaoUsuario()) {
            // Se tiver permissão, chama o serviço real para realizar o download
            downloadReal.realizarDownload(arquivo);
            // Atualiza o contador de downloads no Proxy
            contadorDownloads++;
        } else {
            System.out.println("Acesso negado. Você não tem permissão para fazer downloads.");
        }
    }

    @Override
    public int obterContadorDownloads() {
        return contadorDownloads;
    }

    private boolean verificarPermissaoUsuario() {
        // Simula a verificação de permissão do usuário (pode ser mais complexo em um sistema real)
        // Neste exemplo, todos os usuários têm permissão para fazer downloads
        return true;
    }
}