package astronomypack;

public class SkyCoordinates {

	private double altitude;
	private double azimuth;
	private double zenith;	
	
	public SkyCoordinates(double altitude, double azimuth, double zenith) {
		super();
		this.altitude = altitude;
		this.azimuth = azimuth;
		this.zenith = zenith;
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public double getAzimuth() {
		return azimuth;
	}
	
	public void setAzimuth(double azimuth) {
		this.azimuth = azimuth;
	}
	
	public double getZenith() {
		return zenith;
	}
	
	public void setZenith(double zenith) {
		this.zenith = zenith;
	}

	@Override
	public String toString() {
		return "[altitude=" + altitude + ", azimuth=" + azimuth
				+ ", zenith=" + zenith + "]";
	}

}
