package ContractPayment.src.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import ContractPayment.src.entities.Contract;
import ContractPayment.src.entities.Installment;
import ContractPayment.src.services.ContractService;
import ContractPayment.src.services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o padrão de localização para US (ponto como separador decimal)
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt(); // Lê o número do contrato
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt); // Lê e converte a data
        System.out.println("contract value: ");
        double totalValue = sc.nextDouble(); // Lê o valor total do contrato

        // Cria o contrato com os dados informados
        Contract obj = new Contract(number, totalValue, date);

        System.out.println("Enter number of installments: ");
        int n = sc.nextInt(); // Lê o número de parcelas

        // Cria o serviço de contrato, injetando o serviço de pagamento Paypal
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, n); // Processa o contrato, gerando as parcelas

        System.out.println("Installments: ");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment); // Exibe cada parcela
        }

        sc.close();
    }
}
