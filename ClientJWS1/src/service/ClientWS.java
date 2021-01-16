package service;

import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

public class ClientWS {

	public static void main(String[] args) throws ServiceException, RemoteException {
		
		BanqueWS st = new BanqueServiceServiceLocator().getBanqueWSPort(); 
		double res = st.conversionEuroToDh(800);
		System.out.println(res);
		
	

}
}
