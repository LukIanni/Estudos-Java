package ContractPayment.src.services;

// Implementação do serviço de pagamento simulando o PayPal
public class PaypalService implements OnlinePaymentService {

    private static final double FEE_PERCENTAGE = 0.02; // Taxa de 2%
    private static final double MONTHLY_INTEREST = 0.01; // Juros de 1% ao mês

    @Override
    public Double paymentFee(Double amount) {
        return amount * FEE_PERCENTAGE; // Calcula a taxa sobre o valor
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * MONTHLY_INTEREST * months; // Calcula juros simples
    }
}