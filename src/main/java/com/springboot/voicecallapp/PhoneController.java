import java.net.URISyntaxException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
RequestMapping("/api/v1")
public class PhoneController {
	public static final String ACCOUNT_SID = "ACeafb305c07f871f3f02ec6467b0cb111";
	public static final String AUTH_TOKEN = "shoud be your auth ID can copy from TWILIO site";
	public static final String fromNumber="+12055484081";
	public static final String toNumber="+91 9527495733";
	static{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	}
	
	GetMapping("/voicecall")
	public void makeVoiceCall() throws URISyntaxException {
		Call call = Call.creator(new PhoneNumber("+14155551212"), new PhoneNumber("+15017250604"),
		        new URI("http://demo.twilio.com/docs/voice.xml")).create();
		  System.out.println(call.getSid());
	}
} 
