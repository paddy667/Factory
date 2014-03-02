package astronomypack;

public class AutoTelescopeFactory extends TelescopeFactory {
	
	protected Telescope createTelescope(String s){
		if (s.equals("AutoAnySkyTelescope")){
			return new AutoAnySkyTelescope();
		}
		else if(s.equals("AutoAnySkyPlusTelescope"))
			return new AutoAnySkyPlusTelescope();
		else
			return new AutoAnySuperSkyTelescope();
	}

}
