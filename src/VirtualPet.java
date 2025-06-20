class VirtualPet {
    String nome;

    int idadeDoPet = 0;

    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int nivelDeCansaco = 50;

    int nivelHigiene = 100;

    public VirtualPet(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;
        System.out.println(nome + " foi alimentado. O nível de fome diminuiu.");
    }

    public void brincar() {
        nivelFelicidade += 10;
        nivelHigiene -= 10;
        System.out.println(nome + " está brincando e se sentindo mais feliz.");
        nivelDeCansaco += 10;
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + nome + ":");
        System.out.println("Idade: " + idadeDoPet);
        System.out.println("Nível de fome: " + nivelDeFome);
        System.out.println("Nível de felicidade: " + nivelFelicidade);
        System.out.println("Nível de cansaço: " + nivelDeCansaco);
        System.out.println("Nível de higiene: " + nivelHigiene);
    }

    public void descansar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por Quantas Horas " + nome + " Deveria Descansar? (Escolha de 1 a 8)");
        int horas_de_sono = scanner.nextInt();

        if (horas_de_sono < 1 || horas_de_sono > 8) {
            System.out.println("Periodo de Tempo Inválido. Por Gentileza, Tente Outra Vez...");
            descansar();
        }

        int reducaoCansaco = horas_de_sono * 12;
        nivelDeCansaco = Math.max(0, nivelDeCansaco - reducaoCansaco);

        System.out.println(nome + " Descansou por " + horas_de_sono + " Horas e Recuperou " + reducaoCansaco + " Pontos de Energia!");

        if (horas_de_sono == 8) {
            nivelDeCansaco = 0;
            System.out.println(nome + " Descansou o Suficiente e Sente-se Completamente Revigorade!");
        }
    }

    public void higiene() {
        nivelHigiene = 100;
        System.out.println(nome + " está tão limpinho que chega a reluzir!");
    }

    public void passarTempo() {

        System.out.println("\n~~~ Algum Tempo Se Passou... ~~~");

        idadeDoPet += 1;
        System.out.println(nome + " fez anos! Agora, " + nome + " tem " + idadeDoPet + " anos de idade! Esperamos que tenha tido um ótimo dia do bolo, " + nome + "!~");

        nivelDeFome += 3;
        System.out.println(nome + " está ficando mais faminto com o passar do tempo.");

        nivelFelicidade -= 3;
        System.out.println(nome + " sentiu-se para baixo ao refletir sobre a escuridão eterna que acompanha a morte...");

        nivelDeCansaco += 10;
        System.out.println(nome + " está ficando mais cansado com o passar do tempo.");

        nivelHigiene -= 3;
        System.out.println(nome + " está ficando mais sujinho com o passar do tempo.");

        if (nivelDeFome > 70) {
        System.out.println(nome + " Está com Muita Fome!");
    }

        if (nivelFelicidade < 30) {
        System.out.println(nome + " Está se Sentindo Triste...");
    }

        if (nivelDeCansaco > 70) {
        System.out.println(nome + " Está Muito Cansado!");
    }

        if (nivelHigiene < 30) {
        System.out.println(nome + " Está Muito Sujinho!");
    }
}

    public boolean verificarSaude() {
        if (nivelDeFome >= 100) {
            System.out.println(nome + " morreu de fome! Você não cuidou bem delu...");
            return true;
        }
        if (nivelFelicidade <= 0) {
            System.out.println(nome + " ficou tão triste que fugiu! Você não o deu atenção o suficiente...");
            return true;
        }
        if (nivelDeCansaco >= 100) {
            System.out.println(nome + " desmaiou de cansaço! Você não o deixou repousar...");
            return true;
        }
        if (nivelHigiene <= 0) {
            System.out.println(nome + " ficou doente por estar muito sujo! Você não cuidou de sua higiene...");
            return true;
        }
        return false;
    }

    public boolean verificarVitoria() {
        return idadeDoPet >= 50;
    }
}
    public void passarTempo() {
        nivelDeFome += 5;
        System.out.println(nome + " está ficando mais faminto com o passar do tempo.");
    }
}
