package ContractPayment.src.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data

    private LocalDate dueDate; // Data de vencimento da parcela
    private Double amount;     // Valor da parcela

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    // Getters e setters
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    @Override
    public String toString() {
        // Retorna a data formatada e o valor da parcela
        return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
    }
}