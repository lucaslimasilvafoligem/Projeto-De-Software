public class Venda {
   private Double lucro;
   private Double entrada;
   private Double saida;

   public Venda(Double lucro, Double entrada, Double saida) {
    validarValor(lucro);
    validarValor(entrada);
    validarValor(saida);
    this.lucro = lucro;
    this.entrada = entrada;
    this.saida = saida;
   }

   private void validarValor(Double dinheiro) {
    if(Valida.isNull(dinheiro) || !Valida.validarValor(dinheiro)) {
        throw new IllegalArgumentException("Valor invalido");
    }
   }

   public Double getLucro() {return lucro;}

   public Double getEntrada() {return entrada;}

   public Double getSaida() {return saida;}

}
