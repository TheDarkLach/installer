package monke.installer;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Constants 
{
	public static final String MC_LAUNCHER_ICON = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAMAAABEpIrGAAAACXBIWXMAAAsTAAALEwEAmpwYAAADAFBMVEVHcEz////////+/f27X0b+/f3Vm4D//f39+fj///////+5XEPUmHz////////////////+/f3////Vmn/Tk3boycH////////8+fj////////////89/T/+vThuK3Dc17//f3////////w3tj////////SlHv////////WnYP79vXUlXn37Of////WnIL+/f28Ykr+/f3////9+/u3Vz758e+9ZU7///////+/alTr0sv////////nx7/////////////u19HFdl/w3dj///+3Vz3//////////////////////////v7////////OjHv////HfGb////+6bz/1GzmxLv//v7////z5t/+/f3////////////////9+fn////////////aqZzXoZP////Jgm/////47+3////79vTAalT////////crqHSlYTRk4P9+vn////JjnbOmIC2dVvn0cT8+fiCYlX+79L9+/j59tfBgmmwinf58O3SnIPSh238+fj////8+fj58e758e2/Z079/Pz////IfWT///+/aVLAa1S+aFG6XkXXn4XXnoS/alO8YUm+Z1C9ZU28Y0vAbFXrvbG9ZEzCcFrWnIPVmX7UmH305eHqz8fNiXfLhnTFd2LltqHbn47YoYnesqfIe2b76OL03tfepJX8+ffWm4DYoIbBbljQj3304dv/6N+6XEPitqfcqZLap5r///n76+Tz497/8Ob37Oj54NnhurD/7un//frs0sby4Nn77urnxbX10cj46uX12M7t1Mvhs5/OhXH21Mjswbb47+zcp4/68e399e3///7/67berJ7drJb+9vLgq5Tpuqn94tXcpYv/5NrVno/Qk4Ppwa/jsaPgsqbuwLP14t3XopT79/bOiHXv2tHuxrvpy73bm4r528zSmY7hr5jy29HsvH7/8u3k1M/wvKn/33PPjHb/9tn4347z2sDjtZ//7L7ktZH+zWDuz8HntHnZm4v52dHLgGzw1cj0z77339TSlYb/6+HPC5a0AAAAiXRSTlMAmf4W/AT+AgEDTPv7JQ7zUuWc/fv/DDPx+mZxCP79/h3JOP5Akv57af79+/07/v78MPf5+vr+syr8+7mv/kVV5vv+++H82+uEYmAZ0s4i/of+xP7+/daiDSh/DXiy7p86H/r7wP507ZbsAjcP/v799Fz7/vf90f3++P75/uL+/uvk9OHd+u9Z/mgMg/0AAANQSURBVDjLY2BAAA4GXg0pQyDDT0oqEchDB+wM9pLLlhnHinMZ7dxp1A7kowIOBgX+W60Ga/8b899KTjovyYuugpPBY311nVOH9pw5yTtsk35GAUVQDYhweVNeUx84U0fruvKN0BOMaCZwMki/KipWW9M1Y/7mJf9sHaehK2BlUF1eclWtp2vylA0LtnVaYSjgYIjkv6LW3Tt5RvfU3nlYFAC54mFzlizZdmRSV1fXDkwrQK5gdu9k6tzc09XdO9cZiwJgQMoGM9nemDdl6gZR7AoUKs9VfPm4dHJ3r7LcQQ9EOHBwAgEHyASjzyHfz7ybPHVC/opOJQZW1Ojg4GTw2hIc8vXcgUm90+UKvCAOB5vMLCAgYK8ANFFF9n3Vh7cvn+XldoYXSmtw8UGttpFdvny3DysDg4zLstLXL/YAvcJ0Zvv69fsdpMAqZAQfsJhZ7ldhYEjbatk1cX6nfue2o6t5eHjYFp7VABngZzrDrJv7YACDhdFalqkTr3d27ps5S1OYra9Pe6EgH9AdXHd7erpZFvkyWD/iBgazXOfKTcKr2T4t1Ovv1zukC4wk6cMsE7rMFqRnHJo6qWvCxLmdD2etnvXNofHm7D62rXZAtzPe4e4GS/hP7O6aNHVd54HZmqe0mGOu8fQt1hEHOjJlBUv3pAkbzof2Tpg0YfKC+50bZwlf9mUIuikistAN6DcxwWNmZvNnTJaXn+KUOnnKPKAT9Hj+xDOf/Xv49xZ1oAEWpjN6Ju6aN7Gna+KStVMm3us83d+nfSWKwTNeVSgGFNgC6yb1TFbe3LtmyvyTM7p6d3XuY+vj2c4VEdbcUlvGC1SgfpylZ6qWrSsLi/IcswnT53bundXft183YPvVS5cu2gEVhE/jnhTYuWfFkxOdoVN61szpfDy7b9URd51NwsKnMr2BChQXGRgsUlRVDDIP28jSs2Bl597ZqzX7n6/WWyxy3BwYjnwNSw1MLjMyZDEwWC/iZvFnYjrZP7tfU1hPT+ToHiVQSr147Jf8NXVgiObE/Vi6dGNnZ+e6C/16ev2bnp71BCUIb5+mOAlBQ2CIsttUxsW18fMbSeqf3rpsh0RsNiSHs/KJRctAEhWfmFg0c2KkoZIKF5cuMyRBAQBWOTUWPTvg8gAAAABJRU5ErkJggg==";
	
	//private static final String BASE_URL = "https://github.com/TheDarkLach/installer/";
	
	private static String versionNumber = null;
	private static String json = null;
	
	public static String getVersionNumber()
	{
		if (versionNumber == null)
		{
			try
			{
				InputStream stream = FileHelper.getStreamFromUrl("https://raw.githubusercontent.com/TheDarkLach/installer/main/version.txt?token=AMBIJFZVCH7L32QKM7SDNADB2TXLI");
				InputStreamReader reader = new InputStreamReader(stream);
				BufferedReader buffReader = new BufferedReader(reader);
				versionNumber = buffReader.readLine();
				buffReader.close();
				reader.close();
				stream.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
				Installer.getInstance().die(e);
			}
		}
		
		
		return versionNumber;
	}
	
	public static InputStream getIcon()
	{
		return ClassLoader.getSystemResourceAsStream("assets/icon.png");
	}
	
	public static InputStream getJar() throws MalformedURLException, IOException
	{
		return FileHelper.getStreamFromUrl("https://drive.google.com/uc?export=download&id=1W55AgnJfIeK76QJRsV6tWLqCfX7H86S8");
	}
	public static InputStream getJson() throws MalformedURLException, IOException
	{
		
		return FileHelper.getStreamFromUrl("https://drive.google.com/uc?export=download&id=1G9KTOmc4zpWxrPVU_OdEkYoNgY838k83");
	}
	public static URL getAudio()
	{
		return ClassLoader.getSystemResource("assets/aucio.mp3");
	}


}
