# Conversor de Moedas

Este é um  conversor de moedas desenvolvido em Java no curso da Alura jutamento com a Oracle no programa ONE - Oracle Next Education. Nele foi  utilizado a API de taxas de câmbio para converter entre várias moedas. O projeto permite ao usuário interagir com um menu no console para realizar conversões de moedas com base nas taxas de câmbio fornecidas.

## Funcionalidades

- Exibe um menu interativo no console para o usuário escolher a opção de conversão de moedas.
- Permite que o usuário insira o valor e escolha as moedas de origem e destino para a conversão.
- Realiza a conversão com base nas taxas de câmbio fornecidas (simuladas ou extraídas de uma API).
- Apresenta o valor convertido conforme a escolha do usuário.
- Possui validação para garantir que as moedas inseridas sejam válidas.

## Como Rodar o Projeto

### Requisitos

- Java 17 ou superior
- Biblioteca Gson (para parsing JSON)

### Passos para Executar

1. **Clone este repositório:**

   ```bash
   git clone https://github.com/seu-usuario/conversor-de-moedas.git

2. Navegue até o diretório do projeto: cd conversor-de-moedas
3. Compile e execute o programa: Se estiver usando um IDE como o Eclipse, basta abrir o projeto e executar a classe FiltrarMoedas.java.

Caso prefira rodar via terminal, você pode compilar e executar o código com os seguintes comandos:

javac -cp ".:gson-2.8.8.jar" Alura/ConversorDeMoedas/FiltrarMoedas.java  
java -cp ".:gson-2.8.8.jar" Alura.ConversorDeMoedas.FiltrarMoedas  

4. Interaja com o programa:

O programa exibirá um menu para você escolher a opção de conversão.
Você poderá inserir o valor a ser convertido e as moedas de origem e destino.

Exemplo de Execução

Escolha uma opção de conversão:  
1 - Converter Moeda  
2 - Sair  

Digite a opção: 1  

Digite o valor a ser convertido:  
100  

Digite a moeda de origem (ex: USD, BRL, ARS):  
USD  

Digite a moeda de destino (ex: USD, BRL, ARS):  
BRL  

O valor convertido de USD para BRL é: 530.0








