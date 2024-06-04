import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }

        //analiseCandidato(1900.0);
        //analiseCandidato(2000.0);
        //analiseCandidato(2200.0);
        //selecaoCandidatos();
        //imprimirSelecionados();

    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
    

        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }
    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
// método que irá imprimir candidatos selecionados
    static void imprimirSelecionados(){
//utilizando indices
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatosSelecionados.length; indice++){
            System.out.println((indice+1)+"° candidato selecionado é "+ candidatosSelecionados[indice]);
        }
// forma abreviada
        for(String candidato: candidatosSelecionados){
            System.out.println("O candidato selecionado é " + candidato);
        }

    }
//Metodo que seleciona os candidatos do array, de acordo com o salario pretendido
    static void selecaoCandidatos(){
// Array com a lista de candidatos
String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
int candidatosSelecionados = 0;  // inteiro que armazena a quantidade de candidatos selecionados
int candidatoAtual = 0; // inteiro que armazena o indice do elemento
while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){ 
    String candidato = candidatos[candidatoAtual]; // String que seleciona apenas um candidato por vez, de acordo com a posição determinada por candidatoAtual
    double salarioPretendido = valorPretendido(); // double que armazena valor do salário gerado aleatóriamente pelo método valorPretendido
    System.out.println("O candidato " + candidato + " solicitou este valor " + salarioPretendido + "de salário.");
    double baseSalarial = 2000.0;
    //if clauses
    if (salarioPretendido <= baseSalarial){
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
    }
    candidatoAtual++;
}
    }
    //Metodo que analisa os candidatos de acordo com o salario pretendido
    static void analiseCandidato (double salarioPretendido){
        double baseSalarial = 2000.0;
        if (salarioPretendido < baseSalarial){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioPretendido == baseSalarial){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRAPROPOSTA");
        }else 
            System.out.println("AGUARDANDO RESUTADO DOS DEMAIS CANDIDATOS");
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
