public abstract class VeiculoAereo extends Veiculo{
    private int rodas;
    private String potencia;
    public VeiculoAereo(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int rodas, String potencia) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel,
                codigoRenavam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.rodas = rodas;
        this.potencia = potencia;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
           
}
