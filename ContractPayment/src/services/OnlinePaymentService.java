package ContractPayment.src.services;

// Interface para serviços de pagamento online
public interface OnlinePaymentService {

    Double paymentFee(Double amount); // Calcula a taxa de pagamento
    Double interest(Double amount, Integer months); // Calcula o juro mensal
}