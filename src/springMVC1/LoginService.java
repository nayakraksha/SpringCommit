package springMVC1;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean check(String login,String password)
	{
		if(login.equals("raksha")&&(password.equals("123")))
		return true;
		else
			return false;
		
	}

}
