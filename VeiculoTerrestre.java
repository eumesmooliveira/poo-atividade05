public abstract class VeiculoTerrestre extends Veiculo {
    private int eixos;
    private double pesoLiquido;
    private double pesoTotal;

    public VeiculoTerrestre(int codigo, String nome, String modelo, String cor, String chassi, String placa,
            int anoModelo, int anoFabricacao, String fabricante, String tipoCombustivel, String codigoRenavam,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int eixos,
            double pesoLiquido, double pesoTotal) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, fabricante, tipoCombustivel,
                codigoRenavam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo);
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public double getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    
    
}