# Desafio: Sintaxe - Conta Banco

## Descrição
Este projeto tem como objetivo exercitar os conceitos de sintaxe em Java, criando um programa que recebe e exibe informações bancárias inseridas pelo usuário via terminal.

## Tecnologias Utilizadas
- Java
- Scanner (para entrada de dados)
- Terminal e argumentos `main`
- Concatenação e manipulação de Strings

## Estrutura do Projeto
O projeto possui a classe `ContaTerminal.java`, que será responsável por capturar os dados do usuário e exibi-los conforme o formato exigido.

## Regras de Declaração de Variáveis
O programa utiliza os seguintes atributos:

| Atributo      | Tipo     | Exemplo        |
|--------------|---------|---------------|
| Numero       | Inteiro | 1021          |
| Agencia      | Texto   | 067-8         |
| Nome Cliente | Texto   | MARIO ANDRADE |
| Saldo        | Decimal | 237.48        |

## Funcionamento
1. O programa solicita os seguintes dados ao usuário:
   - Número da conta
   - Número da agência
   - Nome do cliente
   - Saldo inicial da conta

2. O usuário insere os dados no terminal.
3. O sistema exibe uma mensagem personalizada com as informações fornecidas:
   
   ```
   Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.
   ```

## Exemplo de Execução
**Entrada do Usuário:**
```
Por favor, digite o número da conta:
1021
Agora, digite o número da agência:
067-8
Digite seu nome, por favor:
MARIO ANDRADE
Por favor, agora digite o saldo da conta:
237.48
```

**Saída Esperada:**
```
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo de R$237.48 já está disponível para saque.
```

## Autor
Projeto criado como parte de um desafio do bootcamp Java, junto a DIO.

