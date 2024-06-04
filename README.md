# Processo Seletivo

Este repositório contém um programa Java simples para simular um processo seletivo, incluindo a tentativa de contato com candidatos, análise de suas pretensões salariais, e seleção de candidatos com base em um salário base.

## Estrutura do Projeto

O projeto contém uma única classe principal, `ProcessoSeletivo`, que inclui vários métodos para simular diferentes partes de um processo seletivo.

## Funcionalidades

### Entrando em Contato

O método `entrandoEmContato` tenta ligar para um candidato até três vezes. Se o candidato atender (simulado pelo método atender), a tentativa é registrada. Caso contrário, o programa continua tentando até atingir o limite de três tentativas.

### Seleção de Candidatos

O método `selecaoCandidatos` percorre um array de candidatos e seleciona aqueles cuja pretensão salarial (gerada aleatoriamente) está dentro do limite aceitável (definido pela base salarial). Apenas os primeiros cinco candidatos que atendem ao critério são selecionados.

### Análise de Candidato

O método `analiseCandidato` analisa a pretensão salarial em comparação com a base salarial e determina a ação apropriada: ligar para o candidato, fazer uma contraproposta ou aguardar.

### Imprimir Selecionados 

O método `imprimirSelecionados()` é responsável por imprimir a lista de candidatos selecionados de duas maneiras diferentes: utilizando índices e utilizando um loop aprimorado (enhanced for loop). Aqui está uma explicação detalhada das funcionalidades dentro do método.
