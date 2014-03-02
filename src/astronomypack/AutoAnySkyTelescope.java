package astronomypack;

public class AutoAnySkyTelescope implements Telescope {
	
	private SkyCoordinates coords;
	private String view;
	
	@Override
	public void setCoordinates(SkyCoordinates coordinates) {
		coords=coordinates;

	}

	@Override
	public String showView() {
		//in real application this adjsuts the telescope to the requested coordinates and returns the image
		view = "AutoAnySkyTelescope showing the view of coordinates: \n\t" + coords.toString();
		return view;
	}

}
