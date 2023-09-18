public class Carro extends VeiculoTerrestre{
    private int assentos;
    private int portas;
    
    public Carro(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int assentos, int portas) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel,
                codigoRenavam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.assentos = assentos;
        this.portas = portas;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    
}
