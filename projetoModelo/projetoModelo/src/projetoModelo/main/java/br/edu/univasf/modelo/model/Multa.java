package projetoModelo.main.java.br.edu.univasf.modelo.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Multa {
	
    private String dataEmissao;
    private String dataVencimento;
    private int diasDeSuspensao;
    private boolean paga;

    

    public Multa(String dataEmissao, String dataVencimento, int diasDeSuspensao) {
		super();
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.diasDeSuspensao = diasDeSuspensao;
		this.paga = false; // A multa começa como não paga
	}






	public String getDataEmissao() {
		return dataEmissao;
	}



	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}



	public String getDataVencimento() {
		return dataVencimento;
	}



	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}



	public int getDiasDeSuspensao() {
		return diasDeSuspensao;
	}



	public void setDiasDeSuspensao(int diasDeSuspensao) {
		this.diasDeSuspensao = diasDeSuspensao;
	}



	public boolean isPaga() {
		return paga;
	}



	public void setPaga(boolean paga) {
		this.paga = paga;
	}



	public void pagar() {
        this.paga = true;
        this.diasDeSuspensao=0;
    }



	@Override
	public String toString() {
		return "Multa [dataEmissao= " + dataEmissao + ", dataVencimento= " + dataVencimento
				+ ", diasDeSuspensao= " + diasDeSuspensao + ", paga= " + paga + "]";
	}

	
}
