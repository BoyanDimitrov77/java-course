package Town;

public class Town {
  
private String nameTown;
   private String contry;
   private int population;
   
   public Town(String nameTown,String contry,int population){
	   this.nameTown=nameTown;
	   this.contry=contry;
	   this.population=population;
	   
   }
   
   public String getNameTown() {
		return nameTown;
	}

	public void setNameTown(String nameTown) {
		this.nameTown = nameTown;
	}

	public String getContry() {
		return contry;
	}
	
	public void setContry(String contry) {
		this.contry = contry;
	}
	
	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		return (this.nameTown + this.contry +this.population).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Town other = (Town) obj;
		if (contry == null) {
			if (other.contry != null)
				return false;
		} else if (!contry.equals(other.contry))
			return false;
		if (nameTown == null) {
			if (other.nameTown != null)
				return false;
		} else if (!nameTown.equals(other.nameTown))
			return false;
		if (population != other.population)
			return false;
		return true;
	}


	public String toString(){
		return String.format("%s %s %d", this.nameTown,this.contry,this.population);
	}
	
	
}
