
public enum EnumEgs {
	toyota("White","900cc"),
	merc("Gray","2000cc"),
	mini("Green","1000cc"),
	doli("Blue","1600cc"),
	bmw("Black","1800cc");
	
	private final String carColour;
	private final String carCC;
	
	EnumEgs (String cCol, String cCC){
		carColour = cCol;
		carCC = cCC;
	}
	
	public String getColour() {
		return carColour;
	}
	public String getCC() {
		return carCC;
	}

}
