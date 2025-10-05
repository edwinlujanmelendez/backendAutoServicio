package pe.movilbus.autoservicio.beans;

import java.util.HashSet;
import java.util.Set;

public class LiquidacionBusSispas extends GenericBean implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private ItinerarioSispas itinerario;
	private BusSispas bus;
	private Double total;
	
	private Set<GastoBusSispas> gastoBuses = new HashSet<GastoBusSispas>(0);

	public LiquidacionBusSispas() {
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public ItinerarioSispas getItinerario() {
		return this.itinerario;
	}
	public void setItinerario(ItinerarioSispas itinerario) {
		this.itinerario = itinerario;
	}

	public BusSispas getBus() {
		return this.bus;
	}
	public void setBus(BusSispas bus) {
		this.bus = bus;
	}

	public Double getTotal() {
		return this.total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Set<GastoBusSispas> getGastoBuses() {
		return this.gastoBuses;
	}
	public void setGastoBuses(Set<GastoBusSispas> gastoBuses) {
		this.gastoBuses = gastoBuses;
	}

}
