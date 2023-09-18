public class Onibus extends VeiculoTerrestre{
    private int assentos:
    private int qtdeMotores;
    private int qtdeOcupantes;
    
    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int assentos, int qtdeMotores, int qtdeOcupantes) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel,
                codigoRenavam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.assentos = assentos;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    
}
