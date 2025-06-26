# ContractPayment

Este projeto Java simula o processamento de contratos com parcelamento de pagamentos, utilizando um serviço de pagamento online (exemplo: PayPal). O objetivo é demonstrar conceitos de orientação a objetos, interfaces e injeção de dependências em Java.

## Estrutura do Projeto

- `src/application/Program.java`: Classe principal, responsável pela interação com o usuário e execução do fluxo principal.
- `src/entities/Contract.java`: Representa um contrato, contendo número, valor total, data e lista de parcelas.
- `src/entities/Installment.java`: Representa uma parcela do contrato, com data de vencimento e valor.
- `src/services/ContractService.java`: Serviço responsável por processar o contrato e gerar as parcelas.
- `src/services/OnlinePaymentService.java`: Interface para serviços de pagamento online.
- `src/services/PaypalService.java`: Implementação do serviço de pagamento online, simulando regras do PayPal.

## Como funciona

1. O usuário informa os dados do contrato e o número de parcelas.
2. O sistema divide o valor total em parcelas, aplicando juros e taxas conforme o serviço de pagamento.
3. As parcelas são exibidas com data de vencimento e valor final.

## Exemplo de uso

```
Enter contract data
Number: 1234
Date (dd/MM/yyyy): 25/06/2025
Contract value: 600.00
Enter number of installments: 3
Installments:
25/06/2025 - 206.04
25/07/2025 - 208.08
25/08/2025 - 210.12
```

## Autor

Projeto para fins de estudo de Java e orientação a objetos.
