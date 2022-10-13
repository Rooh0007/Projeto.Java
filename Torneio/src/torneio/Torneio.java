package torneio;

public class Torneio {

    private String nometorneio;
    private String idade;
    String infantil = "5 a 7";
    String juvenil = "8 a 10";
    String adolecente = "11 a 15";
    String adulto = "16 a 30";
    String senior = "acima de 30";

    public String getNometorneio(String infantil, String juvenil,
            String adolecente, String adulto, String senior) {
        return nometorneio;
    }

    public void setNometorneio(String nometorneio) {
        this.nometorneio = nometorneio;
        System.out.println("Sua categoria para o torneio é %s/n");
    }

    public String getIdade(String infantil, String juvenil,
            String adolecente, String adulto, String senior) {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

}
