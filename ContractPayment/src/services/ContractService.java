package ContractPayment.src.services;

import java.time.LocalDate;
import ContractPayment.src.entities.Contract;
import ContractPayment.src.entities.Installment;

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService; // Serviço de pagamento online injetado

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    // Processa o contrato, dividindo em parcelas e aplicando juros/taxas
    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months; // Valor base de cada parcela
        for (int i = 0; i < months; i++) {
            LocalDate dueDate =  contract.getDate().plusMonths(i); // Calcula a data de vencimento
            double interest = onlinePaymentService.interest(basicQuota, i); // Calcula juros
            double fee = onlinePaymentService.paymentFee(basicQuota + interest); // Calcula taxa
            double quota = basicQuota + interest + fee; // Valor final da parcela
            contract.getInstallments().add(new Installment(dueDate, quota)); // Adiciona parcela ao contrato
        }
    }
}