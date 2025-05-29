class VirtualPet {
    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;

    public VirtualPet(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;
        System.out.println(nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade += 10;
        System.out.println(nome + " está brincando e se sentindo mais feliz.");
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + nome + ":");
        System.out.println("Nível de fome: " + nivelDeFome);
        System.out.println("Nível de felicidade: " + nivelFelicidade);
    }

    public void passarTempo() {
        nivelDeFome += 5;
        System.out.println(nome + " está ficando mais faminto com o passar do tempo.");
    }
}