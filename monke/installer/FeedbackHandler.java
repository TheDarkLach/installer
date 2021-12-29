package monke.installer;

public class FeedbackHandler 
{
	//call from JS
	public void close()
	{
		Installer.getInstance().stopApp();
	}
}
