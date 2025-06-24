# CarRental - Estudo de Interface em Java

Este projeto é um estudo prático sobre o uso de interfaces em Java, utilizando como exemplo um sistema simples de aluguel de carros.

## Objetivo
Demonstrar como a interface `TaxService` pode ser utilizada para criar um sistema flexível de cálculo de impostos, permitindo a implementação de diferentes regras fiscais sem alterar a estrutura principal do programa.

## Funcionalidades
- Simulação de aluguel de carro, informando modelo, datas e valores.
- Cálculo automático do valor do aluguel e do imposto, utilizando a interface `TaxService`.
- Implementação de diferentes serviços de imposto (exemplo: `BrazilTaxService`).

## Estrutura do Projeto
- `model.entities` - Entidades principais do sistema (`CarRental`, `Vehicle`, `Invoice`).
- `model.services` - Serviços, incluindo a interface `TaxService` e suas implementações.
- `application` - Classe principal (`Program`) para execução e testes.

## Destaque: Interface `TaxService`
A interface `TaxService` define o contrato para cálculo de imposto. Isso permite que diferentes regras de imposto sejam implementadas e utilizadas de forma intercambiável, promovendo flexibilidade e reutilização de código.

```java
public interface TaxService {
    double tax(double amount);
}
```

## Como executar
1. Compile o projeto com o JDK instalado.
2. Execute a classe `Program` para simular um aluguel de carro e ver o cálculo do imposto em ação.

---

Este projeto é voltado para fins didáticos, focando no conceito de interfaces em Java.