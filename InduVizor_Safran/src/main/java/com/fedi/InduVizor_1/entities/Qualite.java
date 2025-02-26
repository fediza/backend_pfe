	package com.fedi.InduVizor_1.entities;
	
	import java.util.Date;
	
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	
	
	
	@Entity
	public class Qualite {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)	
		private Long idQualite;
		private String Programme;
		private String Etape;
		private String Type;
		private String Mode;
		private String Effet;
		private long G ;
		private String causeDef;
		private String ActionPrev;
		private long F;
		private String ActionDet;
		private long D;
		private long IPR;
		private String ActionEnga;
		private String Responsable;
		private Date Delai;
		private String Status;
		private String Cond1;
		private String Cond2;
		private boolean EnRetard;
		
		
		
		
		public Qualite() {
			super();
	
			
			
		}
	
	
	
	
		public Long getIdQualite() {
			return idQualite;
		}
	
	
	
	
		public void setIdQualite(Long idQualite) {
			this.idQualite = idQualite;
		}
	
	
	
	
		public String getProgramme() {
			return Programme;
		}
	
	
	
	
		public void setProgramme(String programme) {
			Programme = programme;
		}
	
	
	
	
		public String getEtape() {
			return Etape;
		}
	
	
	
	
		public void setEtape(String etape) {
			Etape = etape;
		}
	
	
	
	
		public String getType() {
			return Type;
		}
	
	
	
	
		public void setType(String type) {
			Type = type;
		}
	
	
	
	
		public String getMode() {
			return Mode;
		}
	
	
	
	
		public void setMode(String mode) {
			Mode = mode;
		}
	
	
	
	
		public String getEffet() {
			return Effet;
		}
	
	
	
	
		public void setEffet(String effet) {
			Effet = effet;
		}
	
	
	
	
		public long getG() {
			return G;
		}
	
	
	
	
		public void setG(long g) {
			G = g;
		}
	
	
	
	
		public String getCauseDef() {
			return causeDef;
		}
	
	
	
	
		public void setCauseDef(String causeDef) {
			this.causeDef = causeDef;
		}
	
	
	
	
		public String getActionPrev() {
			return ActionPrev;
		}
	
	
	
	
		public void setActionPrev(String actionPrev) {
			ActionPrev = actionPrev;
		}
	
	
	
	
		public long getF() {
			return F;
		}
	
	
	
	
		public void setF(long f) {
			F = f;
		}
	
	
	
	
		public String getActionDet() {
			return ActionDet;
		}
	
	
	
	
		public void setActionDet(String actionDet) {
			ActionDet = actionDet;
		}
	
	
	
	
		public long getD() {
			return D;
		}
	
	
	
	
		public void setD(long d) {
			D = d;
		}
	
	
	
	
		public long getIPR() {
			return IPR;
		}
	
	
	
	
		public void setIPR(long iPR) {
			IPR = iPR;
		}
	
	
	
	
		public String getActionEnga() {
			return ActionEnga;
		}
	
	
	
	
		public void setActionEnga(String actionEnga) {
			ActionEnga = actionEnga;
		}
	
	
	
	
		public String getResponsable() {
			return Responsable;
		}
	
	
	
	
		public void setResponsable(String responsable) {
			Responsable = responsable;
		}
	
	
	
	
		public Date getDelai() {
			return Delai;
		}
	
	
	
	
		public void setDelai(Date delai) {
			Delai = delai;
		}
	
	
	
	
		public String getStatus() {
			return Status;
		}
	
	
	
	
		public void setStatus(String status) {
			Status = status;
		}
	
	
	
	
		public String getCond1() {
			return Cond1;
		}
	
	
	
	
		public void setCond1(String cond1) {
			Cond1 = cond1;
		}
	
	
	
	
		public String getCond2() {
			return Cond2;
		}
	
	
	
	
		public void setCond2(String cond2) {
			Cond2 = cond2;
		}
	
	
	
	
		public boolean isEnRetard() {
			return EnRetard;
		}
	
	
	
	
		public void setEnRetard(boolean enRetard) {
			EnRetard = enRetard;
		}
	
	
	
	
		@Override
		public String toString() {
			return "Qualite [idQualite=" + idQualite + ", Programme=" + Programme + ", Etape=" + Etape + ", Type=" + Type
					+ ", Mode=" + Mode + ", Effet=" + Effet + ", G=" + G + ", causeDef=" + causeDef + ", ActionPrev="
					+ ActionPrev + ", F=" + F + ", ActionDet=" + ActionDet + ", D=" + D + ", IPR=" + IPR + ", ActionEnga="
					+ ActionEnga + ", Responsable=" + Responsable + ", Delai=" + Delai + ", Status=" + Status + ", Cond1="
					+ Cond1 + ", Cond2=" + Cond2 + ", EnRetard=" + EnRetard + "]";
		}
	
	
	
	
		public Qualite(String programme, String etape, String type, String mode, String effet, long g, String causeDef,
				String actionPrev, long f, String actionDet, long d, long iPR, String actionEnga, String responsable,
				Date delai, String status, String cond1, String cond2, boolean enRetard) {
			super();
			Programme = programme;
			Etape = etape;
			Type = type;
			Mode = mode;
			Effet = effet;
			G = g;
			this.causeDef = causeDef;
			ActionPrev = actionPrev;
			F = f;
			ActionDet = actionDet;
			D = d;
			IPR = iPR;
			ActionEnga = actionEnga;
			Responsable = responsable;
			Delai = delai;
			Status = status;
			Cond1 = cond1;
			Cond2 = cond2;
			EnRetard = enRetard;
		}
		
		
	}
