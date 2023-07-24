import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = { "Alana", "Beatriz", "Marcos", "Douglas", "Fabi", "Jorge", "Rejane", "Magda" };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Alana", "Beatriz", "Marcos", "Douglas", "Fabi", "Jorge", "Rejane", "Magda" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {

                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");

                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Alana", "Beatriz", "Marcos", "Douglas", "Renato" };

        System.out.println("Imprimindo a lista de candidatos");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);

        }
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado é " + candidato);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + ", na " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas realizadas");

        }

    }
}
