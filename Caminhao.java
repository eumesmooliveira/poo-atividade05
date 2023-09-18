public class Caminhao extends VeiculoTerrestre{
    private int portas;

    public Caminhao(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int portas) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel,
                codigoRenavam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    
}
