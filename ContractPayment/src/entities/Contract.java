package ContractPayment.src.entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Contract {

    private Integer number; // Número do contrato
    private Double totalValue; // Valor total do contrato
    private LocalDate date; // Data do contrato
    
    private List<Installment> installments = new ArrayList<>(); // Lista de parcelas

    public Contract() {
    }

    public Contract(Integer number, Double totalValue, LocalDate date) {
        this.number = number;
        this.totalValue = totalValue;
        this.date = date;
    }

    // Getters e setters
    public Integer getNumber() { return number; }
    public void setNumber(Integer number) { this.number = number; }

    public Double getTotalValue() { return totalValue; }
    public void setTotalValue(Double totalValue) { this.totalValue = totalValue; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public List<Installment> getInstallments() { return installments; }
}