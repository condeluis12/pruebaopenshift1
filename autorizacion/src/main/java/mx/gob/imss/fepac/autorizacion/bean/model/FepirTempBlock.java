package mx.gob.imss.fepac.autorizacion.bean.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fepirTempBlock")
public class FepirTempBlock implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_FepirTempBlock")
	private Integer idFepirTempBlock;
	@Column(name = "valor", nullable = false)
	private String valor;

	public FepirTempBlock() {
		super();
	}

	public FepirTempBlock(Integer idFepirTempBlock, String valor) {
		super();
		this.idFepirTempBlock = idFepirTempBlock;
		this.valor = valor;
	}

	public FepirTempBlock(String valor) {
		super();
		this.valor = valor;
	}

	public Integer getIdFepirTempBlock() {
		return idFepirTempBlock;
	}

	public void setIdFepirTempBlock(Integer idFepirTempBlock) {
		this.idFepirTempBlock = idFepirTempBlock;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "FepirTempBlockBean [idFepirTempBlock=" + idFepirTempBlock + ", valor=" + valor + "]";
	}

}
