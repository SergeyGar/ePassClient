package com.example.demo;

import com.example.demo.exception.InvalidLoginInputDataException;
import com.example.demo.exception.NullSessionTokenException;
import jakarta.xml.bind.JAXBElement;

import com.example.wsdl.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.datatype.XMLGregorianCalendar;


public class EPassClient extends WebServiceGatewaySupport {

    private ApiHeaderRequest headerRequest;

    private ObjectFactory objectFactory;


    @Value("${ePass.URL}")
    private String URL;


    public EPassClient(){
        init();
    }


    public EPassClient(String username, String password){
        init();
        login(username, password);
    }


    private void init(){

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.wsdl");

        setDefaultUri("http://www.epass.by:80/BEPTGlobalService");
        setUnmarshaller(marshaller);
        setMarshaller(marshaller);

        objectFactory = new ObjectFactory();

        headerRequest = objectFactory.createApiHeaderRequest();
    }


    public void login(String username, String password){

        LoginResponse loginResponse = loginToEPassService(username, password);

        if(loginResponse.getReturn().getErrorCode() == LoginEnum.OK){
            headerRequest.setSessiontoken(loginResponse.getReturn().getHeader().getSessiontoken());
        }
        else{
            throw new InvalidLoginInputDataException(loginResponse.getReturn().getErrorCode().name());
        }
    }


    private LoginResponse loginToEPassService(String username, String password) {

        LoginReq loginReq = objectFactory.createLoginReq();
        loginReq.setUsername(username);
        loginReq.setPassword(password);

        Login login = objectFactory.createLogin();

        login.setRequest(loginReq);

        JAXBElement<Login> jAXBElementLogin = objectFactory.createLogin(login);

        JAXBElement jAXBElementLoginResponse = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(
                URL,
                jAXBElementLogin,
                new SoapActionCallback("")
        );

        LoginResponse loginResponse = (LoginResponse) jAXBElementLoginResponse.getValue();
        return loginResponse;
    }


    public SearchPartiesByModifiedTimeResponse searchPartiesByModifiedTime(XMLGregorianCalendar fromDate,
                                                                       int recordCount,
                                                                       int startRecord,
                                                                       XMLGregorianCalendar toDate){
        if(headerRequest.getSessiontoken() == null){
            throw new NullSessionTokenException("User are not logged in");
        }
        SearchPartiesByModifiedTimeReq request = objectFactory.createSearchPartiesByModifiedTimeReq();
        request.setFromDate(fromDate);
        request.setRecordCount(recordCount);
        request.setStartRecord(startRecord);
        request.setToDate(toDate);
        request.setHeader(headerRequest);

        SearchPartiesByModifiedTime searchPartiesByModifiedTime = objectFactory.createSearchPartiesByModifiedTime();
        searchPartiesByModifiedTime.setRequest(request);

        JAXBElement<SearchPartiesByModifiedTime> jAXBElementSearchPartiesByModifiedTime =
                objectFactory.createSearchPartiesByModifiedTime(searchPartiesByModifiedTime);

        JAXBElement jAXBElementSearchPartiesByModifiedTimeResponse = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(
                URL,
                jAXBElementSearchPartiesByModifiedTime,
                new SoapActionCallback("")
        );

        SearchPartiesByModifiedTimeResponse searchPartiesByModifiedTimeResponse =
                (SearchPartiesByModifiedTimeResponse)  jAXBElementSearchPartiesByModifiedTimeResponse.getValue();
        return searchPartiesByModifiedTimeResponse;
    }


    public SearchSimpleTradeitemsByModifiedTime3Response searchSimpleTradeitemsByModifiedTime3(XMLGregorianCalendar fromDate,
                                                                                               int recordCount,
                                                                                               int startRecord,
                                                                                               XMLGregorianCalendar toDate){
        if(headerRequest.getSessiontoken() == null){
            throw new NullSessionTokenException("User are not logged in");
        }
        SearchSimpleTradeitemsByModifiedTimeReq request = objectFactory.createSearchSimpleTradeitemsByModifiedTimeReq();
        request.setFromDate(fromDate);
        request.setRecordCount(recordCount);
        request.setStartRecord(startRecord);
        request.setToDate(toDate);
        request.setHeader(headerRequest);

        SearchSimpleTradeitemsByModifiedTime3 searchSimpleTradeitemsByModifiedTime3 = objectFactory.createSearchSimpleTradeitemsByModifiedTime3();
        searchSimpleTradeitemsByModifiedTime3.setRequest(request);


        JAXBElement<SearchSimpleTradeitemsByModifiedTime3> jAXBElementSearchSimpleTradeitemsByModifiedTime3 =
                objectFactory.createSearchSimpleTradeitemsByModifiedTime3(searchSimpleTradeitemsByModifiedTime3);

        JAXBElement jAXBElementSearchSimpleTradeitemsByModifiedTime3Response = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(
                URL,
                jAXBElementSearchSimpleTradeitemsByModifiedTime3,
                new SoapActionCallback("")
        );

        SearchSimpleTradeitemsByModifiedTime3Response searchSimpleTradeitemsByModifiedTime3Response =
                (SearchSimpleTradeitemsByModifiedTime3Response) jAXBElementSearchSimpleTradeitemsByModifiedTime3Response.getValue();
        return searchSimpleTradeitemsByModifiedTime3Response;
    }


    public GetFullPartyByGLNResponse getFullPartyByGLN(long GLN){
        if(headerRequest.getSessiontoken() == null){
            throw new NullSessionTokenException("User are not logged in");
        }

        GetFullPartyByGLNReq request = objectFactory.createGetFullPartyByGLNReq();
        request.setGln(GLN);
        request.setHeader(headerRequest);

        GetFullPartyByGLN getFullPartyByGLN = objectFactory.createGetFullPartyByGLN();
        getFullPartyByGLN.setRequest(request);

        JAXBElement<GetFullPartyByGLN> jAXBElementGetFullPartyByGLNRequest =
                objectFactory.createGetFullPartyByGLN(getFullPartyByGLN);

        JAXBElement jAXBElementGetFullPartyByGLNResponse =
                (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(
                        URL,
                        jAXBElementGetFullPartyByGLNRequest,
                        new SoapActionCallback("")
                );

        GetFullPartyByGLNResponse getFullPartyByGLNResponse =
                (GetFullPartyByGLNResponse) jAXBElementGetFullPartyByGLNResponse.getValue();

        return getFullPartyByGLNResponse;
    }
}
