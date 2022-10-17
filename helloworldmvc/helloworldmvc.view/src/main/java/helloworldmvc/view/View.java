package helloworldmvc.view;

import helloworldmvc.Contract.IView;

public class View implements IView{
	public String displayMessage(String message) {
		System.out.println();
		return message;
		
	}

}
