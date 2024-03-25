
package com.example.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Login_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "LoginResponse");
    private final static QName _Logout_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "Logout");
    private final static QName _LogoutResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "LogoutResponse");
    private final static QName _SearchGTINfromDatamarkSystemByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByGTIN");
    private final static QName _SearchGTINfromDatamarkSystemByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByGTINResponse");
    private final static QName _SearchGTINfromDatamarkSystemByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByModifiedTime");
    private final static QName _SearchGTINfromDatamarkSystemByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByModifiedTimeResponse");
    private final static QName _SearchPartiesByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchPartiesByModifiedTime");
    private final static QName _SearchPartiesByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchPartiesByModifiedTimeResponse");
    private final static QName _SearchSimpleTradeitemsByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime");
    private final static QName _SearchSimpleTradeitemsByModifiedTime2_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime2");
    private final static QName _SearchSimpleTradeitemsByModifiedTime2Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime2Response");
    private final static QName _SearchSimpleTradeitemsByModifiedTime3_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime3");
    private final static QName _SearchSimpleTradeitemsByModifiedTime3Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime3Response");
    private final static QName _SearchSimpleTradeitemsByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTimeResponse");
    private final static QName _SearchTradeitemsByGLN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLN");
    private final static QName _SearchTradeitemsByGLNAndModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLNAndModifiedTime");
    private final static QName _SearchTradeitemsByGLNAndModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLNAndModifiedTimeResponse");
    private final static QName _SearchTradeitemsByGLNResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLNResponse");
    private final static QName _SearchTradeitemsByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByModifiedTime");
    private final static QName _SearchTradeitemsByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByModifiedTimeResponse");
    private final static QName _SearchTradeitemsByName_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByName");
    private final static QName _SearchTradeitemsByNameResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByNameResponse");
    private final static QName _SearchTradeitemsByOKRB007_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByOKRB007");
    private final static QName _SearchTradeitemsByOKRB007Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByOKRB007Response");
    private final static QName _SearchTradeitemsByTNVED_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByTNVED");
    private final static QName _SearchTradeitemsByTNVEDResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByTNVEDResponse");
    private final static QName _CleanTradeitemsOfPoolByDeleteTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "cleanTradeitemsOfPoolByDeleteTime");
    private final static QName _CleanTradeitemsOfPoolByDeleteTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "cleanTradeitemsOfPoolByDeleteTimeResponse");
    private final static QName _GetCheckGTIN29_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCheckGTIN29");
    private final static QName _GetCheckGTIN29Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCheckGTIN29Response");
    private final static QName _GetClassificator_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getClassificator");
    private final static QName _GetClassificatorResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getClassificatorResponse");
    private final static QName _GetCurrentTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCurrentTime");
    private final static QName _GetCurrentTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCurrentTimeResponse");
    private final static QName _GetFullPartyByGLN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFullPartyByGLN");
    private final static QName _GetFullPartyByGLNResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFullPartyByGLNResponse");
    private final static QName _GetFunctionalnameByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTIN");
    private final static QName _GetFunctionalnameByGTIN2_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTIN2");
    private final static QName _GetFunctionalnameByGTIN2Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTIN2Response");
    private final static QName _GetFunctionalnameByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTINResponse");
    private final static QName _GetOldHeaderReq_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderReq");
    private final static QName _GetOldHeaderReqResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderReqResponse");
    private final static QName _GetOldHeaderResp_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderResp");
    private final static QName _GetOldHeaderRespResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderRespResponse");
    private final static QName _GetOldParty_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldParty");
    private final static QName _GetOldPartyResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldPartyResponse");
    private final static QName _GetOldTradeitem_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldTradeitem");
    private final static QName _GetOldTradeitemResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldTradeitemResponse");
    private final static QName _GetPartyByGLN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByGLN");
    private final static QName _GetPartyByGLNResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByGLNResponse");
    private final static QName _GetPartyByUNP_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByUNP");
    private final static QName _GetPartyByUNPResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByUNPResponse");
    private final static QName _GetQuotaImportInfo_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getQuotaImportInfo");
    private final static QName _GetQuotaImportInfoResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getQuotaImportInfoResponse");
    private final static QName _GetSimpleTradeitemsByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getSimpleTradeitemsByGTIN");
    private final static QName _GetSimpleTradeitemsByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getSimpleTradeitemsByGTINResponse");
    private final static QName _GetTIImageKindsByGTINs_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTIImageKindsByGTINs");
    private final static QName _GetTIImageKindsByGTINsResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTIImageKindsByGTINsResponse");
    private final static QName _GetTradeitemByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTIN");
    private final static QName _GetTradeitemByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTINResponse");
    private final static QName _GetTradeitemByGTINshort_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTINshort");
    private final static QName _GetTradeitemByGTINshortResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTINshortResponse");
    private final static QName _GetTradeitemsByGTINs_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINs");
    private final static QName _GetTradeitemsByGTINsResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINsResponse");
    private final static QName _GetTradeitemsByGTINsShort_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINsShort");
    private final static QName _GetTradeitemsByGTINsShortResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINsShortResponse");
    private final static QName _GetTradeitemsOfPoolByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsOfPoolByModifiedTime");
    private final static QName _GetTradeitemsOfPoolByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsOfPoolByModifiedTimeResponse");
    private final static QName _GetVariantByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getVariantByGTIN");
    private final static QName _GetVariantByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getVariantByGTINResponse");
    private final static QName _Tradeitem_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "tradeitem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTIN }
     * 
     */
    public SearchGTINfromDatamarkSystemByGTIN createSearchGTINfromDatamarkSystemByGTIN() {
        return new SearchGTINfromDatamarkSystemByGTIN();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTINResponse }
     * 
     */
    public SearchGTINfromDatamarkSystemByGTINResponse createSearchGTINfromDatamarkSystemByGTINResponse() {
        return new SearchGTINfromDatamarkSystemByGTINResponse();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByModifiedTime }
     * 
     */
    public SearchGTINfromDatamarkSystemByModifiedTime createSearchGTINfromDatamarkSystemByModifiedTime() {
        return new SearchGTINfromDatamarkSystemByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByModifiedTimeResponse }
     * 
     */
    public SearchGTINfromDatamarkSystemByModifiedTimeResponse createSearchGTINfromDatamarkSystemByModifiedTimeResponse() {
        return new SearchGTINfromDatamarkSystemByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTime }
     * 
     */
    public SearchPartiesByModifiedTime createSearchPartiesByModifiedTime() {
        return new SearchPartiesByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTimeResponse }
     * 
     */
    public SearchPartiesByModifiedTimeResponse createSearchPartiesByModifiedTimeResponse() {
        return new SearchPartiesByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTime createSearchSimpleTradeitemsByModifiedTime() {
        return new SearchSimpleTradeitemsByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime2 }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTime2 createSearchSimpleTradeitemsByModifiedTime2() {
        return new SearchSimpleTradeitemsByModifiedTime2();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime2Response }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTime2Response createSearchSimpleTradeitemsByModifiedTime2Response() {
        return new SearchSimpleTradeitemsByModifiedTime2Response();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime3 }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTime3 createSearchSimpleTradeitemsByModifiedTime3() {
        return new SearchSimpleTradeitemsByModifiedTime3();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime3Response }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTime3Response createSearchSimpleTradeitemsByModifiedTime3Response() {
        return new SearchSimpleTradeitemsByModifiedTime3Response();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTimeResponse }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTimeResponse createSearchSimpleTradeitemsByModifiedTimeResponse() {
        return new SearchSimpleTradeitemsByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLN }
     * 
     */
    public SearchTradeitemsByGLN createSearchTradeitemsByGLN() {
        return new SearchTradeitemsByGLN();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTime }
     * 
     */
    public SearchTradeitemsByGLNAndModifiedTime createSearchTradeitemsByGLNAndModifiedTime() {
        return new SearchTradeitemsByGLNAndModifiedTime();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTimeResponse }
     * 
     */
    public SearchTradeitemsByGLNAndModifiedTimeResponse createSearchTradeitemsByGLNAndModifiedTimeResponse() {
        return new SearchTradeitemsByGLNAndModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNResponse }
     * 
     */
    public SearchTradeitemsByGLNResponse createSearchTradeitemsByGLNResponse() {
        return new SearchTradeitemsByGLNResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTime }
     * 
     */
    public SearchTradeitemsByModifiedTime createSearchTradeitemsByModifiedTime() {
        return new SearchTradeitemsByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTimeResponse }
     * 
     */
    public SearchTradeitemsByModifiedTimeResponse createSearchTradeitemsByModifiedTimeResponse() {
        return new SearchTradeitemsByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByName }
     * 
     */
    public SearchTradeitemsByName createSearchTradeitemsByName() {
        return new SearchTradeitemsByName();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByNameResponse }
     * 
     */
    public SearchTradeitemsByNameResponse createSearchTradeitemsByNameResponse() {
        return new SearchTradeitemsByNameResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007 }
     * 
     */
    public SearchTradeitemsByOKRB007 createSearchTradeitemsByOKRB007() {
        return new SearchTradeitemsByOKRB007();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007Response }
     * 
     */
    public SearchTradeitemsByOKRB007Response createSearchTradeitemsByOKRB007Response() {
        return new SearchTradeitemsByOKRB007Response();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVED }
     * 
     */
    public SearchTradeitemsByTNVED createSearchTradeitemsByTNVED() {
        return new SearchTradeitemsByTNVED();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVEDResponse }
     * 
     */
    public SearchTradeitemsByTNVEDResponse createSearchTradeitemsByTNVEDResponse() {
        return new SearchTradeitemsByTNVEDResponse();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTime }
     * 
     */
    public CleanTradeitemsOfPoolByDeleteTime createCleanTradeitemsOfPoolByDeleteTime() {
        return new CleanTradeitemsOfPoolByDeleteTime();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTimeResponse }
     * 
     */
    public CleanTradeitemsOfPoolByDeleteTimeResponse createCleanTradeitemsOfPoolByDeleteTimeResponse() {
        return new CleanTradeitemsOfPoolByDeleteTimeResponse();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29 }
     * 
     */
    public GetCheckGTIN29 createGetCheckGTIN29() {
        return new GetCheckGTIN29();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29Response }
     * 
     */
    public GetCheckGTIN29Response createGetCheckGTIN29Response() {
        return new GetCheckGTIN29Response();
    }

    /**
     * Create an instance of {@link GetClassificator }
     * 
     */
    public GetClassificator createGetClassificator() {
        return new GetClassificator();
    }

    /**
     * Create an instance of {@link GetClassificatorResponse }
     * 
     */
    public GetClassificatorResponse createGetClassificatorResponse() {
        return new GetClassificatorResponse();
    }

    /**
     * Create an instance of {@link GetCurrentTime }
     * 
     */
    public GetCurrentTime createGetCurrentTime() {
        return new GetCurrentTime();
    }

    /**
     * Create an instance of {@link GetCurrentTimeResponse }
     * 
     */
    public GetCurrentTimeResponse createGetCurrentTimeResponse() {
        return new GetCurrentTimeResponse();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLN }
     * 
     */
    public GetFullPartyByGLN createGetFullPartyByGLN() {
        return new GetFullPartyByGLN();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLNResponse }
     * 
     */
    public GetFullPartyByGLNResponse createGetFullPartyByGLNResponse() {
        return new GetFullPartyByGLNResponse();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTIN }
     * 
     */
    public GetFunctionalnameByGTIN createGetFunctionalnameByGTIN() {
        return new GetFunctionalnameByGTIN();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTIN2 }
     * 
     */
    public GetFunctionalnameByGTIN2 createGetFunctionalnameByGTIN2() {
        return new GetFunctionalnameByGTIN2();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTIN2Response }
     * 
     */
    public GetFunctionalnameByGTIN2Response createGetFunctionalnameByGTIN2Response() {
        return new GetFunctionalnameByGTIN2Response();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTINResponse }
     * 
     */
    public GetFunctionalnameByGTINResponse createGetFunctionalnameByGTINResponse() {
        return new GetFunctionalnameByGTINResponse();
    }

    /**
     * Create an instance of {@link GetOldHeaderReq }
     * 
     */
    public GetOldHeaderReq createGetOldHeaderReq() {
        return new GetOldHeaderReq();
    }

    /**
     * Create an instance of {@link GetOldHeaderReqResponse }
     * 
     */
    public GetOldHeaderReqResponse createGetOldHeaderReqResponse() {
        return new GetOldHeaderReqResponse();
    }

    /**
     * Create an instance of {@link GetOldHeaderResp }
     * 
     */
    public GetOldHeaderResp createGetOldHeaderResp() {
        return new GetOldHeaderResp();
    }

    /**
     * Create an instance of {@link GetOldHeaderRespResponse }
     * 
     */
    public GetOldHeaderRespResponse createGetOldHeaderRespResponse() {
        return new GetOldHeaderRespResponse();
    }

    /**
     * Create an instance of {@link GetOldParty }
     * 
     */
    public GetOldParty createGetOldParty() {
        return new GetOldParty();
    }

    /**
     * Create an instance of {@link GetOldPartyResponse }
     * 
     */
    public GetOldPartyResponse createGetOldPartyResponse() {
        return new GetOldPartyResponse();
    }

    /**
     * Create an instance of {@link GetOldTradeitem }
     * 
     */
    public GetOldTradeitem createGetOldTradeitem() {
        return new GetOldTradeitem();
    }

    /**
     * Create an instance of {@link GetOldTradeitemResponse }
     * 
     */
    public GetOldTradeitemResponse createGetOldTradeitemResponse() {
        return new GetOldTradeitemResponse();
    }

    /**
     * Create an instance of {@link GetPartyByGLN }
     * 
     */
    public GetPartyByGLN createGetPartyByGLN() {
        return new GetPartyByGLN();
    }

    /**
     * Create an instance of {@link GetPartyByGLNResponse }
     * 
     */
    public GetPartyByGLNResponse createGetPartyByGLNResponse() {
        return new GetPartyByGLNResponse();
    }

    /**
     * Create an instance of {@link GetPartyByUNP }
     * 
     */
    public GetPartyByUNP createGetPartyByUNP() {
        return new GetPartyByUNP();
    }

    /**
     * Create an instance of {@link GetPartyByUNPResponse }
     * 
     */
    public GetPartyByUNPResponse createGetPartyByUNPResponse() {
        return new GetPartyByUNPResponse();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfo }
     * 
     */
    public GetQuotaImportInfo createGetQuotaImportInfo() {
        return new GetQuotaImportInfo();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfoResponse }
     * 
     */
    public GetQuotaImportInfoResponse createGetQuotaImportInfoResponse() {
        return new GetQuotaImportInfoResponse();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTIN }
     * 
     */
    public GetSimpleTradeitemsByGTIN createGetSimpleTradeitemsByGTIN() {
        return new GetSimpleTradeitemsByGTIN();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTINResponse }
     * 
     */
    public GetSimpleTradeitemsByGTINResponse createGetSimpleTradeitemsByGTINResponse() {
        return new GetSimpleTradeitemsByGTINResponse();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINs }
     * 
     */
    public GetTIImageKindsByGTINs createGetTIImageKindsByGTINs() {
        return new GetTIImageKindsByGTINs();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINsResponse }
     * 
     */
    public GetTIImageKindsByGTINsResponse createGetTIImageKindsByGTINsResponse() {
        return new GetTIImageKindsByGTINsResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTIN }
     * 
     */
    public GetTradeitemByGTIN createGetTradeitemByGTIN() {
        return new GetTradeitemByGTIN();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINResponse }
     * 
     */
    public GetTradeitemByGTINResponse createGetTradeitemByGTINResponse() {
        return new GetTradeitemByGTINResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINshort }
     * 
     */
    public GetTradeitemByGTINshort createGetTradeitemByGTINshort() {
        return new GetTradeitemByGTINshort();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINshortResponse }
     * 
     */
    public GetTradeitemByGTINshortResponse createGetTradeitemByGTINshortResponse() {
        return new GetTradeitemByGTINshortResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINs }
     * 
     */
    public GetTradeitemsByGTINs createGetTradeitemsByGTINs() {
        return new GetTradeitemsByGTINs();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsResponse }
     * 
     */
    public GetTradeitemsByGTINsResponse createGetTradeitemsByGTINsResponse() {
        return new GetTradeitemsByGTINsResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShort }
     * 
     */
    public GetTradeitemsByGTINsShort createGetTradeitemsByGTINsShort() {
        return new GetTradeitemsByGTINsShort();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShortResponse }
     * 
     */
    public GetTradeitemsByGTINsShortResponse createGetTradeitemsByGTINsShortResponse() {
        return new GetTradeitemsByGTINsShortResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTime }
     * 
     */
    public GetTradeitemsOfPoolByModifiedTime createGetTradeitemsOfPoolByModifiedTime() {
        return new GetTradeitemsOfPoolByModifiedTime();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTimeResponse }
     * 
     */
    public GetTradeitemsOfPoolByModifiedTimeResponse createGetTradeitemsOfPoolByModifiedTimeResponse() {
        return new GetTradeitemsOfPoolByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link GetVariantByGTIN }
     * 
     */
    public GetVariantByGTIN createGetVariantByGTIN() {
        return new GetVariantByGTIN();
    }

    /**
     * Create an instance of {@link GetVariantByGTINResponse }
     * 
     */
    public GetVariantByGTINResponse createGetVariantByGTINResponse() {
        return new GetVariantByGTINResponse();
    }

    /**
     * Create an instance of {@link Tradeitem }
     * 
     */
    public Tradeitem createTradeitem() {
        return new Tradeitem();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29Req }
     * 
     */
    public GetCheckGTIN29Req createGetCheckGTIN29Req() {
        return new GetCheckGTIN29Req();
    }

    /**
     * Create an instance of {@link ApiHeaderRequest }
     * 
     */
    public ApiHeaderRequest createApiHeaderRequest() {
        return new ApiHeaderRequest();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29Resp }
     * 
     */
    public GetCheckGTIN29Resp createGetCheckGTIN29Resp() {
        return new GetCheckGTIN29Resp();
    }

    /**
     * Create an instance of {@link ApiHeaderResponse }
     * 
     */
    public ApiHeaderResponse createApiHeaderResponse() {
        return new ApiHeaderResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShortReq }
     * 
     */
    public GetTradeitemsByGTINsShortReq createGetTradeitemsByGTINsShortReq() {
        return new GetTradeitemsByGTINsShortReq();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShortResp }
     * 
     */
    public GetTradeitemsByGTINsShortResp createGetTradeitemsByGTINsShortResp() {
        return new GetTradeitemsByGTINsShortResp();
    }

    /**
     * Create an instance of {@link ShortTradeItem }
     * 
     */
    public ShortTradeItem createShortTradeItem() {
        return new ShortTradeItem();
    }

    /**
     * Create an instance of {@link Gdsntradeitemclassification }
     * 
     */
    public Gdsntradeitemclassification createGdsntradeitemclassification() {
        return new Gdsntradeitemclassification();
    }

    /**
     * Create an instance of {@link TradeitemAddons }
     * 
     */
    public TradeitemAddons createTradeitemAddons() {
        return new TradeitemAddons();
    }

    /**
     * Create an instance of {@link FoodBeverageInformation }
     * 
     */
    public FoodBeverageInformation createFoodBeverageInformation() {
        return new FoodBeverageInformation();
    }

    /**
     * Create an instance of {@link HazardousGoods }
     * 
     */
    public HazardousGoods createHazardousGoods() {
        return new HazardousGoods();
    }

    /**
     * Create an instance of {@link Brandname }
     * 
     */
    public Brandname createBrandname() {
        return new Brandname();
    }

    /**
     * Create an instance of {@link BrandnamePK }
     * 
     */
    public BrandnamePK createBrandnamePK() {
        return new BrandnamePK();
    }

    /**
     * Create an instance of {@link FmpContent }
     * 
     */
    public FmpContent createFmpContent() {
        return new FmpContent();
    }

    /**
     * Create an instance of {@link FmpContentPK }
     * 
     */
    public FmpContentPK createFmpContentPK() {
        return new FmpContentPK();
    }

    /**
     * Create an instance of {@link SpecTechnicalCharacteristics }
     * 
     */
    public SpecTechnicalCharacteristics createSpecTechnicalCharacteristics() {
        return new SpecTechnicalCharacteristics();
    }

    /**
     * Create an instance of {@link SpecTechnicalCharacteristicsPK }
     * 
     */
    public SpecTechnicalCharacteristicsPK createSpecTechnicalCharacteristicsPK() {
        return new SpecTechnicalCharacteristicsPK();
    }

    /**
     * Create an instance of {@link FoodBeverageMicrobiological }
     * 
     */
    public FoodBeverageMicrobiological createFoodBeverageMicrobiological() {
        return new FoodBeverageMicrobiological();
    }

    /**
     * Create an instance of {@link FoodBeverageMicrobiologicalPK }
     * 
     */
    public FoodBeverageMicrobiologicalPK createFoodBeverageMicrobiologicalPK() {
        return new FoodBeverageMicrobiologicalPK();
    }

    /**
     * Create an instance of {@link TradeitemTbAttVal }
     * 
     */
    public TradeitemTbAttVal createTradeitemTbAttVal() {
        return new TradeitemTbAttVal();
    }

    /**
     * Create an instance of {@link TradeitemTbAttValPK }
     * 
     */
    public TradeitemTbAttValPK createTradeitemTbAttValPK() {
        return new TradeitemTbAttValPK();
    }

    /**
     * Create an instance of {@link FoodBeverageDietRelated }
     * 
     */
    public FoodBeverageDietRelated createFoodBeverageDietRelated() {
        return new FoodBeverageDietRelated();
    }

    /**
     * Create an instance of {@link FoodPhysiochemicalCharact }
     * 
     */
    public FoodPhysiochemicalCharact createFoodPhysiochemicalCharact() {
        return new FoodPhysiochemicalCharact();
    }

    /**
     * Create an instance of {@link FoodPhysiochemicalCharactPK }
     * 
     */
    public FoodPhysiochemicalCharactPK createFoodPhysiochemicalCharactPK() {
        return new FoodPhysiochemicalCharactPK();
    }

    /**
     * Create an instance of {@link TradeitemTbSpec }
     * 
     */
    public TradeitemTbSpec createTradeitemTbSpec() {
        return new TradeitemTbSpec();
    }

    /**
     * Create an instance of {@link Tradeitemsuppliers }
     * 
     */
    public Tradeitemsuppliers createTradeitemsuppliers() {
        return new Tradeitemsuppliers();
    }

    /**
     * Create an instance of {@link TradeitemsuppliersPK }
     * 
     */
    public TradeitemsuppliersPK createTradeitemsuppliersPK() {
        return new TradeitemsuppliersPK();
    }

    /**
     * Create an instance of {@link FoodBeverageNutrient }
     * 
     */
    public FoodBeverageNutrient createFoodBeverageNutrient() {
        return new FoodBeverageNutrient();
    }

    /**
     * Create an instance of {@link FoodBeverageNutrientPK }
     * 
     */
    public FoodBeverageNutrientPK createFoodBeverageNutrientPK() {
        return new FoodBeverageNutrientPK();
    }

    /**
     * Create an instance of {@link Tradeitemformdescription }
     * 
     */
    public Tradeitemformdescription createTradeitemformdescription() {
        return new Tradeitemformdescription();
    }

    /**
     * Create an instance of {@link TradeitemformdescriptionPK }
     * 
     */
    public TradeitemformdescriptionPK createTradeitemformdescriptionPK() {
        return new TradeitemformdescriptionPK();
    }

    /**
     * Create an instance of {@link AudioVideoConnector }
     * 
     */
    public AudioVideoConnector createAudioVideoConnector() {
        return new AudioVideoConnector();
    }

    /**
     * Create an instance of {@link AudioVideoConnectorPK }
     * 
     */
    public AudioVideoConnectorPK createAudioVideoConnectorPK() {
        return new AudioVideoConnectorPK();
    }

    /**
     * Create an instance of {@link FoodBeverageServingInfo }
     * 
     */
    public FoodBeverageServingInfo createFoodBeverageServingInfo() {
        return new FoodBeverageServingInfo();
    }

    /**
     * Create an instance of {@link Nextlowerleveltiinformation }
     * 
     */
    public Nextlowerleveltiinformation createNextlowerleveltiinformation() {
        return new Nextlowerleveltiinformation();
    }

    /**
     * Create an instance of {@link Childtradeitem }
     * 
     */
    public Childtradeitem createChildtradeitem() {
        return new Childtradeitem();
    }

    /**
     * Create an instance of {@link ChildtradeitemPK }
     * 
     */
    public ChildtradeitemPK createChildtradeitemPK() {
        return new ChildtradeitemPK();
    }

    /**
     * Create an instance of {@link Variant }
     * 
     */
    public Variant createVariant() {
        return new Variant();
    }

    /**
     * Create an instance of {@link VariantPK }
     * 
     */
    public VariantPK createVariantPK() {
        return new VariantPK();
    }

    /**
     * Create an instance of {@link FmpContentInformation }
     * 
     */
    public FmpContentInformation createFmpContentInformation() {
        return new FmpContentInformation();
    }

    /**
     * Create an instance of {@link FoodBeverageAllergyRelated }
     * 
     */
    public FoodBeverageAllergyRelated createFoodBeverageAllergyRelated() {
        return new FoodBeverageAllergyRelated();
    }

    /**
     * Create an instance of {@link FoodBeverageAllergyRelatedPK }
     * 
     */
    public FoodBeverageAllergyRelatedPK createFoodBeverageAllergyRelatedPK() {
        return new FoodBeverageAllergyRelatedPK();
    }

    /**
     * Create an instance of {@link FoodCertificationInformation }
     * 
     */
    public FoodCertificationInformation createFoodCertificationInformation() {
        return new FoodCertificationInformation();
    }

    /**
     * Create an instance of {@link Subbrand }
     * 
     */
    public Subbrand createSubbrand() {
        return new Subbrand();
    }

    /**
     * Create an instance of {@link SubbrandPK }
     * 
     */
    public SubbrandPK createSubbrandPK() {
        return new SubbrandPK();
    }

    /**
     * Create an instance of {@link FoodBevergeAdditiveInfo }
     * 
     */
    public FoodBevergeAdditiveInfo createFoodBevergeAdditiveInfo() {
        return new FoodBevergeAdditiveInfo();
    }

    /**
     * Create an instance of {@link FoodBevergeAdditiveInfoPK }
     * 
     */
    public FoodBevergeAdditiveInfoPK createFoodBevergeAdditiveInfoPK() {
        return new FoodBevergeAdditiveInfoPK();
    }

    /**
     * Create an instance of {@link Tradeitemdescription }
     * 
     */
    public Tradeitemdescription createTradeitemdescription() {
        return new Tradeitemdescription();
    }

    /**
     * Create an instance of {@link TradeitemdescriptionPK }
     * 
     */
    public TradeitemdescriptionPK createTradeitemdescriptionPK() {
        return new TradeitemdescriptionPK();
    }

    /**
     * Create an instance of {@link Tradeitemrb }
     * 
     */
    public Tradeitemrb createTradeitemrb() {
        return new Tradeitemrb();
    }

    /**
     * Create an instance of {@link Tradeitemcertificate }
     * 
     */
    public Tradeitemcertificate createTradeitemcertificate() {
        return new Tradeitemcertificate();
    }

    /**
     * Create an instance of {@link TradeitemcertificatePK }
     * 
     */
    public TradeitemcertificatePK createTradeitemcertificatePK() {
        return new TradeitemcertificatePK();
    }

    /**
     * Create an instance of {@link Tradeitemggr }
     * 
     */
    public Tradeitemggr createTradeitemggr() {
        return new Tradeitemggr();
    }

    /**
     * Create an instance of {@link Tradeitemtscertificate }
     * 
     */
    public Tradeitemtscertificate createTradeitemtscertificate() {
        return new Tradeitemtscertificate();
    }

    /**
     * Create an instance of {@link Tradeitemtsdeclaration }
     * 
     */
    public Tradeitemtsdeclaration createTradeitemtsdeclaration() {
        return new Tradeitemtsdeclaration();
    }

    /**
     * Create an instance of {@link Tradeitemtsggr }
     * 
     */
    public Tradeitemtsggr createTradeitemtsggr() {
        return new Tradeitemtsggr();
    }

    /**
     * Create an instance of {@link Tpneutraltiinformation }
     * 
     */
    public Tpneutraltiinformation createTpneutraltiinformation() {
        return new Tpneutraltiinformation();
    }

    /**
     * Create an instance of {@link Tradeitemmarking }
     * 
     */
    public Tradeitemmarking createTradeitemmarking() {
        return new Tradeitemmarking();
    }

    /**
     * Create an instance of {@link Tradeitemhierarchy }
     * 
     */
    public Tradeitemhierarchy createTradeitemhierarchy() {
        return new Tradeitemhierarchy();
    }

    /**
     * Create an instance of {@link Suggestedretailprice }
     * 
     */
    public Suggestedretailprice createSuggestedretailprice() {
        return new Suggestedretailprice();
    }

    /**
     * Create an instance of {@link Tradeitemcountryoforigin }
     * 
     */
    public Tradeitemcountryoforigin createTradeitemcountryoforigin() {
        return new Tradeitemcountryoforigin();
    }

    /**
     * Create an instance of {@link TradeitemcountryoforiginPK }
     * 
     */
    public TradeitemcountryoforiginPK createTradeitemcountryoforiginPK() {
        return new TradeitemcountryoforiginPK();
    }

    /**
     * Create an instance of {@link Barcodetype }
     * 
     */
    public Barcodetype createBarcodetype() {
        return new Barcodetype();
    }

    /**
     * Create an instance of {@link BarcodetypePK }
     * 
     */
    public BarcodetypePK createBarcodetypePK() {
        return new BarcodetypePK();
    }

    /**
     * Create an instance of {@link Tradeitemmeasurements }
     * 
     */
    public Tradeitemmeasurements createTradeitemmeasurements() {
        return new Tradeitemmeasurements();
    }

    /**
     * Create an instance of {@link Diameter }
     * 
     */
    public Diameter createDiameter() {
        return new Diameter();
    }

    /**
     * Create an instance of {@link DiameterPK }
     * 
     */
    public DiameterPK createDiameterPK() {
        return new DiameterPK();
    }

    /**
     * Create an instance of {@link Grossweight }
     * 
     */
    public Grossweight createGrossweight() {
        return new Grossweight();
    }

    /**
     * Create an instance of {@link GrossweightPK }
     * 
     */
    public GrossweightPK createGrossweightPK() {
        return new GrossweightPK();
    }

    /**
     * Create an instance of {@link Height }
     * 
     */
    public Height createHeight() {
        return new Height();
    }

    /**
     * Create an instance of {@link HeightPK }
     * 
     */
    public HeightPK createHeightPK() {
        return new HeightPK();
    }

    /**
     * Create an instance of {@link Netweight }
     * 
     */
    public Netweight createNetweight() {
        return new Netweight();
    }

    /**
     * Create an instance of {@link NetweightPK }
     * 
     */
    public NetweightPK createNetweightPK() {
        return new NetweightPK();
    }

    /**
     * Create an instance of {@link Depth }
     * 
     */
    public Depth createDepth() {
        return new Depth();
    }

    /**
     * Create an instance of {@link DepthPK }
     * 
     */
    public DepthPK createDepthPK() {
        return new DepthPK();
    }

    /**
     * Create an instance of {@link Drainedweight }
     * 
     */
    public Drainedweight createDrainedweight() {
        return new Drainedweight();
    }

    /**
     * Create an instance of {@link DrainedweightPK }
     * 
     */
    public DrainedweightPK createDrainedweightPK() {
        return new DrainedweightPK();
    }

    /**
     * Create an instance of {@link Netcontent }
     * 
     */
    public Netcontent createNetcontent() {
        return new Netcontent();
    }

    /**
     * Create an instance of {@link NetcontentPK }
     * 
     */
    public NetcontentPK createNetcontentPK() {
        return new NetcontentPK();
    }

    /**
     * Create an instance of {@link Width }
     * 
     */
    public Width createWidth() {
        return new Width();
    }

    /**
     * Create an instance of {@link WidthPK }
     * 
     */
    public WidthPK createWidthPK() {
        return new WidthPK();
    }

    /**
     * Create an instance of {@link Catalogueprice }
     * 
     */
    public Catalogueprice createCatalogueprice() {
        return new Catalogueprice();
    }

    /**
     * Create an instance of {@link Tradeitemcountryofassembly }
     * 
     */
    public Tradeitemcountryofassembly createTradeitemcountryofassembly() {
        return new Tradeitemcountryofassembly();
    }

    /**
     * Create an instance of {@link TradeitemcountryofassemblyPK }
     * 
     */
    public TradeitemcountryofassemblyPK createTradeitemcountryofassemblyPK() {
        return new TradeitemcountryofassemblyPK();
    }

    /**
     * Create an instance of {@link Tradeitemunitindicator }
     * 
     */
    public Tradeitemunitindicator createTradeitemunitindicator() {
        return new Tradeitemunitindicator();
    }

    /**
     * Create an instance of {@link Packagingmarking }
     * 
     */
    public Packagingmarking createPackagingmarking() {
        return new Packagingmarking();
    }

    /**
     * Create an instance of {@link Packagemarksdietallergen }
     * 
     */
    public Packagemarksdietallergen createPackagemarksdietallergen() {
        return new Packagemarksdietallergen();
    }

    /**
     * Create an instance of {@link PackagemarksdietallergenPK }
     * 
     */
    public PackagemarksdietallergenPK createPackagemarksdietallergenPK() {
        return new PackagemarksdietallergenPK();
    }

    /**
     * Create an instance of {@link Pckgmarkedexpirationdatetype }
     * 
     */
    public Pckgmarkedexpirationdatetype createPckgmarkedexpirationdatetype() {
        return new Pckgmarkedexpirationdatetype();
    }

    /**
     * Create an instance of {@link PckgmarkedexpirationdatetypePK }
     * 
     */
    public PckgmarkedexpirationdatetypePK createPckgmarkedexpirationdatetypePK() {
        return new PckgmarkedexpirationdatetypePK();
    }

    /**
     * Create an instance of {@link Packagemarkshygienic }
     * 
     */
    public Packagemarkshygienic createPackagemarkshygienic() {
        return new Packagemarkshygienic();
    }

    /**
     * Create an instance of {@link PackagemarkshygienicPK }
     * 
     */
    public PackagemarkshygienicPK createPackagemarkshygienicPK() {
        return new PackagemarkshygienicPK();
    }

    /**
     * Create an instance of {@link Packagemarksethical }
     * 
     */
    public Packagemarksethical createPackagemarksethical() {
        return new Packagemarksethical();
    }

    /**
     * Create an instance of {@link PackagemarksethicalPK }
     * 
     */
    public PackagemarksethicalPK createPackagemarksethicalPK() {
        return new PackagemarksethicalPK();
    }

    /**
     * Create an instance of {@link Packagemarksfreefrom }
     * 
     */
    public Packagemarksfreefrom createPackagemarksfreefrom() {
        return new Packagemarksfreefrom();
    }

    /**
     * Create an instance of {@link PackagemarksfreefromPK }
     * 
     */
    public PackagemarksfreefromPK createPackagemarksfreefromPK() {
        return new PackagemarksfreefromPK();
    }

    /**
     * Create an instance of {@link Packagemarksenvironment }
     * 
     */
    public Packagemarksenvironment createPackagemarksenvironment() {
        return new Packagemarksenvironment();
    }

    /**
     * Create an instance of {@link PackagemarksenvironmentPK }
     * 
     */
    public PackagemarksenvironmentPK createPackagemarksenvironmentPK() {
        return new PackagemarksenvironmentPK();
    }

    /**
     * Create an instance of {@link Classcomplianceregulationcode }
     * 
     */
    public Classcomplianceregulationcode createClasscomplianceregulationcode() {
        return new Classcomplianceregulationcode();
    }

    /**
     * Create an instance of {@link ClasscomplianceregulationcodePK }
     * 
     */
    public ClasscomplianceregulationcodePK createClasscomplianceregulationcodePK() {
        return new ClasscomplianceregulationcodePK();
    }

    /**
     * Create an instance of {@link Tradeitemdateinformation }
     * 
     */
    public Tradeitemdateinformation createTradeitemdateinformation() {
        return new Tradeitemdateinformation();
    }

    /**
     * Create an instance of {@link Functionalname }
     * 
     */
    public Functionalname createFunctionalname() {
        return new Functionalname();
    }

    /**
     * Create an instance of {@link FunctionalnamePK }
     * 
     */
    public FunctionalnamePK createFunctionalnamePK() {
        return new FunctionalnamePK();
    }

    /**
     * Create an instance of {@link Tradeitemrbspec }
     * 
     */
    public Tradeitemrbspec createTradeitemrbspec() {
        return new Tradeitemrbspec();
    }

    /**
     * Create an instance of {@link Tradeitemtradechannel }
     * 
     */
    public Tradeitemtradechannel createTradeitemtradechannel() {
        return new Tradeitemtradechannel();
    }

    /**
     * Create an instance of {@link TradeitemtradechannelPK }
     * 
     */
    public TradeitemtradechannelPK createTradeitemtradechannelPK() {
        return new TradeitemtradechannelPK();
    }

    /**
     * Create an instance of {@link FoodBeverageNutrientInfo }
     * 
     */
    public FoodBeverageNutrientInfo createFoodBeverageNutrientInfo() {
        return new FoodBeverageNutrientInfo();
    }

    /**
     * Create an instance of {@link TvFeature }
     * 
     */
    public TvFeature createTvFeature() {
        return new TvFeature();
    }

    /**
     * Create an instance of {@link TvFeaturePK }
     * 
     */
    public TvFeaturePK createTvFeaturePK() {
        return new TvFeaturePK();
    }

    /**
     * Create an instance of {@link FoodBeverageCheeseInform }
     * 
     */
    public FoodBeverageCheeseInform createFoodBeverageCheeseInform() {
        return new FoodBeverageCheeseInform();
    }

    /**
     * Create an instance of {@link FoodBevergeIngredientInform }
     * 
     */
    public FoodBevergeIngredientInform createFoodBevergeIngredientInform() {
        return new FoodBevergeIngredientInform();
    }

    /**
     * Create an instance of {@link FoodBeverageIngredient }
     * 
     */
    public FoodBeverageIngredient createFoodBeverageIngredient() {
        return new FoodBeverageIngredient();
    }

    /**
     * Create an instance of {@link FoodBeverageIngredientPK }
     * 
     */
    public FoodBeverageIngredientPK createFoodBeverageIngredientPK() {
        return new FoodBeverageIngredientPK();
    }

    /**
     * Create an instance of {@link AudioVideoPhoto }
     * 
     */
    public AudioVideoPhoto createAudioVideoPhoto() {
        return new AudioVideoPhoto();
    }

    /**
     * Create an instance of {@link ProductYieldInformation }
     * 
     */
    public ProductYieldInformation createProductYieldInformation() {
        return new ProductYieldInformation();
    }

    /**
     * Create an instance of {@link ProductYieldInformationPK }
     * 
     */
    public ProductYieldInformationPK createProductYieldInformationPK() {
        return new ProductYieldInformationPK();
    }

    /**
     * Create an instance of {@link Productrange }
     * 
     */
    public Productrange createProductrange() {
        return new Productrange();
    }

    /**
     * Create an instance of {@link ProductrangePK }
     * 
     */
    public ProductrangePK createProductrangePK() {
        return new ProductrangePK();
    }

    /**
     * Create an instance of {@link FoodBeverageMarketingInform }
     * 
     */
    public FoodBeverageMarketingInform createFoodBeverageMarketingInform() {
        return new FoodBeverageMarketingInform();
    }

    /**
     * Create an instance of {@link FoodBeverageMarketingInformPK }
     * 
     */
    public FoodBeverageMarketingInformPK createFoodBeverageMarketingInformPK() {
        return new FoodBeverageMarketingInformPK();
    }

    /**
     * Create an instance of {@link Targetmarketinformation }
     * 
     */
    public Targetmarketinformation createTargetmarketinformation() {
        return new Targetmarketinformation();
    }

    /**
     * Create an instance of {@link TargetmarketinformationPK }
     * 
     */
    public TargetmarketinformationPK createTargetmarketinformationPK() {
        return new TargetmarketinformationPK();
    }

    /**
     * Create an instance of {@link FoodBeveragePreparation }
     * 
     */
    public FoodBeveragePreparation createFoodBeveragePreparation() {
        return new FoodBeveragePreparation();
    }

    /**
     * Create an instance of {@link FoodBeveragePreparationPK }
     * 
     */
    public FoodBeveragePreparationPK createFoodBeveragePreparationPK() {
        return new FoodBeveragePreparationPK();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNReq }
     * 
     */
    public SearchTradeitemsByGLNReq createSearchTradeitemsByGLNReq() {
        return new SearchTradeitemsByGLNReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNResp }
     * 
     */
    public SearchTradeitemsByGLNResp createSearchTradeitemsByGLNResp() {
        return new SearchTradeitemsByGLNResp();
    }

    /**
     * Create an instance of {@link GetPartyByUNPReq }
     * 
     */
    public GetPartyByUNPReq createGetPartyByUNPReq() {
        return new GetPartyByUNPReq();
    }

    /**
     * Create an instance of {@link GetPartyByUNPResp }
     * 
     */
    public GetPartyByUNPResp createGetPartyByUNPResp() {
        return new GetPartyByUNPResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVEDReq }
     * 
     */
    public SearchTradeitemsByTNVEDReq createSearchTradeitemsByTNVEDReq() {
        return new SearchTradeitemsByTNVEDReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVEDResp }
     * 
     */
    public SearchTradeitemsByTNVEDResp createSearchTradeitemsByTNVEDResp() {
        return new SearchTradeitemsByTNVEDResp();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTimeReq }
     * 
     */
    public GetTradeitemsOfPoolByModifiedTimeReq createGetTradeitemsOfPoolByModifiedTimeReq() {
        return new GetTradeitemsOfPoolByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTimeResp }
     * 
     */
    public GetTradeitemsOfPoolByModifiedTimeResp createGetTradeitemsOfPoolByModifiedTimeResp() {
        return new GetTradeitemsOfPoolByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTINReq }
     * 
     */
    public SearchGTINfromDatamarkSystemByGTINReq createSearchGTINfromDatamarkSystemByGTINReq() {
        return new SearchGTINfromDatamarkSystemByGTINReq();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTINResp }
     * 
     */
    public SearchGTINfromDatamarkSystemByGTINResp createSearchGTINfromDatamarkSystemByGTINResp() {
        return new SearchGTINfromDatamarkSystemByGTINResp();
    }

    /**
     * Create an instance of {@link ApiHeaderResponseWithDataSource }
     * 
     */
    public ApiHeaderResponseWithDataSource createApiHeaderResponseWithDataSource() {
        return new ApiHeaderResponseWithDataSource();
    }

    /**
     * Create an instance of {@link SimpleTradeitem }
     * 
     */
    public SimpleTradeitem createSimpleTradeitem() {
        return new SimpleTradeitem();
    }

    /**
     * Create an instance of {@link GetShortTradeitemByGTINReq }
     * 
     */
    public GetShortTradeitemByGTINReq createGetShortTradeitemByGTINReq() {
        return new GetShortTradeitemByGTINReq();
    }

    /**
     * Create an instance of {@link GetShortTradeitemByGTINResp }
     * 
     */
    public GetShortTradeitemByGTINResp createGetShortTradeitemByGTINResp() {
        return new GetShortTradeitemByGTINResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTimeReq }
     * 
     */
    public SearchTradeitemsByModifiedTimeReq createSearchTradeitemsByModifiedTimeReq() {
        return new SearchTradeitemsByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTimeResp }
     * 
     */
    public SearchTradeitemsByModifiedTimeResp createSearchTradeitemsByModifiedTimeResp() {
        return new SearchTradeitemsByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTINReq }
     * 
     */
    public GetFunctionalnameByGTINReq createGetFunctionalnameByGTINReq() {
        return new GetFunctionalnameByGTINReq();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTINResp }
     * 
     */
    public GetFunctionalnameByGTINResp createGetFunctionalnameByGTINResp() {
        return new GetFunctionalnameByGTINResp();
    }

    /**
     * Create an instance of {@link GetClassificatorReq }
     * 
     */
    public GetClassificatorReq createGetClassificatorReq() {
        return new GetClassificatorReq();
    }

    /**
     * Create an instance of {@link GetClassificatorResp }
     * 
     */
    public GetClassificatorResp createGetClassificatorResp() {
        return new GetClassificatorResp();
    }

    /**
     * Create an instance of {@link ClassificatorUnit }
     * 
     */
    public ClassificatorUnit createClassificatorUnit() {
        return new ClassificatorUnit();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByNameReq }
     * 
     */
    public SearchTradeitemsByNameReq createSearchTradeitemsByNameReq() {
        return new SearchTradeitemsByNameReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByNameResp }
     * 
     */
    public SearchTradeitemsByNameResp createSearchTradeitemsByNameResp() {
        return new SearchTradeitemsByNameResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007Req }
     * 
     */
    public SearchTradeitemsByOKRB007Req createSearchTradeitemsByOKRB007Req() {
        return new SearchTradeitemsByOKRB007Req();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007Resp }
     * 
     */
    public SearchTradeitemsByOKRB007Resp createSearchTradeitemsByOKRB007Resp() {
        return new SearchTradeitemsByOKRB007Resp();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTINReq }
     * 
     */
    public GetSimpleTradeitemsByGTINReq createGetSimpleTradeitemsByGTINReq() {
        return new GetSimpleTradeitemsByGTINReq();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTINResp }
     * 
     */
    public GetSimpleTradeitemsByGTINResp createGetSimpleTradeitemsByGTINResp() {
        return new GetSimpleTradeitemsByGTINResp();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLNReq }
     * 
     */
    public GetFullPartyByGLNReq createGetFullPartyByGLNReq() {
        return new GetFullPartyByGLNReq();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLNResp }
     * 
     */
    public GetFullPartyByGLNResp createGetFullPartyByGLNResp() {
        return new GetFullPartyByGLNResp();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link PartyAddons }
     * 
     */
    public PartyAddons createPartyAddons() {
        return new PartyAddons();
    }

    /**
     * Create an instance of {@link Securityusers }
     * 
     */
    public Securityusers createSecurityusers() {
        return new Securityusers();
    }

    /**
     * Create an instance of {@link SecurityusersAddons }
     * 
     */
    public SecurityusersAddons createSecurityusersAddons() {
        return new SecurityusersAddons();
    }

    /**
     * Create an instance of {@link Userpools }
     * 
     */
    public Userpools createUserpools() {
        return new Userpools();
    }

    /**
     * Create an instance of {@link UserpoolsPK }
     * 
     */
    public UserpoolsPK createUserpoolsPK() {
        return new UserpoolsPK();
    }

    /**
     * Create an instance of {@link Userpoolscontent }
     * 
     */
    public Userpoolscontent createUserpoolscontent() {
        return new Userpoolscontent();
    }

    /**
     * Create an instance of {@link UserpoolscontentPK }
     * 
     */
    public UserpoolscontentPK createUserpoolscontentPK() {
        return new UserpoolscontentPK();
    }

    /**
     * Create an instance of {@link Securityauthorities }
     * 
     */
    public Securityauthorities createSecurityauthorities() {
        return new Securityauthorities();
    }

    /**
     * Create an instance of {@link SecurityauthoritiesPK }
     * 
     */
    public SecurityauthoritiesPK createSecurityauthoritiesPK() {
        return new SecurityauthoritiesPK();
    }

    /**
     * Create an instance of {@link SecurityauthoritiesAddons }
     * 
     */
    public SecurityauthoritiesAddons createSecurityauthoritiesAddons() {
        return new SecurityauthoritiesAddons();
    }

    /**
     * Create an instance of {@link Pools }
     * 
     */
    public Pools createPools() {
        return new Pools();
    }

    /**
     * Create an instance of {@link PoolsPK }
     * 
     */
    public PoolsPK createPoolsPK() {
        return new PoolsPK();
    }

    /**
     * Create an instance of {@link Poolscontent }
     * 
     */
    public Poolscontent createPoolscontent() {
        return new Poolscontent();
    }

    /**
     * Create an instance of {@link PoolscontentPK }
     * 
     */
    public PoolscontentPK createPoolscontentPK() {
        return new PoolscontentPK();
    }

    /**
     * Create an instance of {@link PostAddress }
     * 
     */
    public PostAddress createPostAddress() {
        return new PostAddress();
    }

    /**
     * Create an instance of {@link PostAddressPK }
     * 
     */
    public PostAddressPK createPostAddressPK() {
        return new PostAddressPK();
    }

    /**
     * Create an instance of {@link Streetaddressone }
     * 
     */
    public Streetaddressone createStreetaddressone() {
        return new Streetaddressone();
    }

    /**
     * Create an instance of {@link StreetaddressonePK }
     * 
     */
    public StreetaddressonePK createStreetaddressonePK() {
        return new StreetaddressonePK();
    }

    /**
     * Create an instance of {@link Alternatepartyidentification }
     * 
     */
    public Alternatepartyidentification createAlternatepartyidentification() {
        return new Alternatepartyidentification();
    }

    /**
     * Create an instance of {@link AlternatepartyidentificationPK }
     * 
     */
    public AlternatepartyidentificationPK createAlternatepartyidentificationPK() {
        return new AlternatepartyidentificationPK();
    }

    /**
     * Create an instance of {@link Quotaimport }
     * 
     */
    public Quotaimport createQuotaimport() {
        return new Quotaimport();
    }

    /**
     * Create an instance of {@link QuotaimportAddos }
     * 
     */
    public QuotaimportAddos createQuotaimportAddos() {
        return new QuotaimportAddos();
    }

    /**
     * Create an instance of {@link Partyroles }
     * 
     */
    public Partyroles createPartyroles() {
        return new Partyroles();
    }

    /**
     * Create an instance of {@link PartyrolesPK }
     * 
     */
    public PartyrolesPK createPartyrolesPK() {
        return new PartyrolesPK();
    }

    /**
     * Create an instance of {@link Bankaccounts }
     * 
     */
    public Bankaccounts createBankaccounts() {
        return new Bankaccounts();
    }

    /**
     * Create an instance of {@link Banks }
     * 
     */
    public Banks createBanks() {
        return new Banks();
    }

    /**
     * Create an instance of {@link BanksPK }
     * 
     */
    public BanksPK createBanksPK() {
        return new BanksPK();
    }

    /**
     * Create an instance of {@link LegalName }
     * 
     */
    public LegalName createLegalName() {
        return new LegalName();
    }

    /**
     * Create an instance of {@link LegalNamePK }
     * 
     */
    public LegalNamePK createLegalNamePK() {
        return new LegalNamePK();
    }

    /**
     * Create an instance of {@link Contactname }
     * 
     */
    public Contactname createContactname() {
        return new Contactname();
    }

    /**
     * Create an instance of {@link ContactnamePK }
     * 
     */
    public ContactnamePK createContactnamePK() {
        return new ContactnamePK();
    }

    /**
     * Create an instance of {@link Chiefname }
     * 
     */
    public Chiefname createChiefname() {
        return new Chiefname();
    }

    /**
     * Create an instance of {@link ChiefnamePK }
     * 
     */
    public ChiefnamePK createChiefnamePK() {
        return new ChiefnamePK();
    }

    /**
     * Create an instance of {@link Partyrb }
     * 
     */
    public Partyrb createPartyrb() {
        return new Partyrb();
    }

    /**
     * Create an instance of {@link Partytaxinformation }
     * 
     */
    public Partytaxinformation createPartytaxinformation() {
        return new Partytaxinformation();
    }

    /**
     * Create an instance of {@link Partygcp }
     * 
     */
    public Partygcp createPartygcp() {
        return new Partygcp();
    }

    /**
     * Create an instance of {@link PartygcpPK }
     * 
     */
    public PartygcpPK createPartygcpPK() {
        return new PartygcpPK();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link CityPK }
     * 
     */
    public CityPK createCityPK() {
        return new CityPK();
    }

    /**
     * Create an instance of {@link Streetaddresstwo }
     * 
     */
    public Streetaddresstwo createStreetaddresstwo() {
        return new Streetaddresstwo();
    }

    /**
     * Create an instance of {@link StreetaddresstwoPK }
     * 
     */
    public StreetaddresstwoPK createStreetaddresstwoPK() {
        return new StreetaddresstwoPK();
    }

    /**
     * Create an instance of {@link LegalShortName }
     * 
     */
    public LegalShortName createLegalShortName() {
        return new LegalShortName();
    }

    /**
     * Create an instance of {@link LegalShortNamePK }
     * 
     */
    public LegalShortNamePK createLegalShortNamePK() {
        return new LegalShortNamePK();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Communicaionchannel }
     * 
     */
    public Communicaionchannel createCommunicaionchannel() {
        return new Communicaionchannel();
    }

    /**
     * Create an instance of {@link CommunicaionchannelPK }
     * 
     */
    public CommunicaionchannelPK createCommunicaionchannelPK() {
        return new CommunicaionchannelPK();
    }

    /**
     * Create an instance of {@link Secondarygovernmentarea }
     * 
     */
    public Secondarygovernmentarea createSecondarygovernmentarea() {
        return new Secondarygovernmentarea();
    }

    /**
     * Create an instance of {@link SecondarygovernmentareaPK }
     * 
     */
    public SecondarygovernmentareaPK createSecondarygovernmentareaPK() {
        return new SecondarygovernmentareaPK();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTimeReq }
     * 
     */
    public CleanTradeitemsOfPoolByDeleteTimeReq createCleanTradeitemsOfPoolByDeleteTimeReq() {
        return new CleanTradeitemsOfPoolByDeleteTimeReq();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTimeResp }
     * 
     */
    public CleanTradeitemsOfPoolByDeleteTimeResp createCleanTradeitemsOfPoolByDeleteTimeResp() {
        return new CleanTradeitemsOfPoolByDeleteTimeResp();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINReq }
     * 
     */
    public GetTradeitemByGTINReq createGetTradeitemByGTINReq() {
        return new GetTradeitemByGTINReq();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTimeReq }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTimeReq createSearchSimpleTradeitemsByModifiedTimeReq() {
        return new SearchSimpleTradeitemsByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTimeResp }
     * 
     */
    public SearchSimpleTradeitemsByModifiedTimeResp createSearchSimpleTradeitemsByModifiedTimeResp() {
        return new SearchSimpleTradeitemsByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINResp }
     * 
     */
    public GetTradeitemByGTINResp createGetTradeitemByGTINResp() {
        return new GetTradeitemByGTINResp();
    }

    /**
     * Create an instance of {@link GetVariantByGTINReq }
     * 
     */
    public GetVariantByGTINReq createGetVariantByGTINReq() {
        return new GetVariantByGTINReq();
    }

    /**
     * Create an instance of {@link GetVariantByGTINResp }
     * 
     */
    public GetVariantByGTINResp createGetVariantByGTINResp() {
        return new GetVariantByGTINResp();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsReq }
     * 
     */
    public GetTradeitemsByGTINsReq createGetTradeitemsByGTINsReq() {
        return new GetTradeitemsByGTINsReq();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsResp }
     * 
     */
    public GetTradeitemsByGTINsResp createGetTradeitemsByGTINsResp() {
        return new GetTradeitemsByGTINsResp();
    }

    /**
     * Create an instance of {@link SearchSimpleImportTradeitemsByModifiedTimeReq }
     * 
     */
    public SearchSimpleImportTradeitemsByModifiedTimeReq createSearchSimpleImportTradeitemsByModifiedTimeReq() {
        return new SearchSimpleImportTradeitemsByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchSimpleImportTradeitemsByModifiedTimeResp }
     * 
     */
    public SearchSimpleImportTradeitemsByModifiedTimeResp createSearchSimpleImportTradeitemsByModifiedTimeResp() {
        return new SearchSimpleImportTradeitemsByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTimeReq }
     * 
     */
    public SearchTradeitemsByGLNAndModifiedTimeReq createSearchTradeitemsByGLNAndModifiedTimeReq() {
        return new SearchTradeitemsByGLNAndModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTimeResp }
     * 
     */
    public SearchTradeitemsByGLNAndModifiedTimeResp createSearchTradeitemsByGLNAndModifiedTimeResp() {
        return new SearchTradeitemsByGLNAndModifiedTimeResp();
    }

    /**
     * Create an instance of {@link LogoutReq }
     * 
     */
    public LogoutReq createLogoutReq() {
        return new LogoutReq();
    }

    /**
     * Create an instance of {@link LogoutResp }
     * 
     */
    public LogoutResp createLogoutResp() {
        return new LogoutResp();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfoReq }
     * 
     */
    public GetQuotaImportInfoReq createGetQuotaImportInfoReq() {
        return new GetQuotaImportInfoReq();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfoResp }
     * 
     */
    public GetQuotaImportInfoResp createGetQuotaImportInfoResp() {
        return new GetQuotaImportInfoResp();
    }

    /**
     * Create an instance of {@link GetPartyByGLNReq }
     * 
     */
    public GetPartyByGLNReq createGetPartyByGLNReq() {
        return new GetPartyByGLNReq();
    }

    /**
     * Create an instance of {@link GetPartyByGLNResp }
     * 
     */
    public GetPartyByGLNResp createGetPartyByGLNResp() {
        return new GetPartyByGLNResp();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINsReq }
     * 
     */
    public GetTIImageKindsByGTINsReq createGetTIImageKindsByGTINsReq() {
        return new GetTIImageKindsByGTINsReq();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINsResp }
     * 
     */
    public GetTIImageKindsByGTINsResp createGetTIImageKindsByGTINsResp() {
        return new GetTIImageKindsByGTINsResp();
    }

    /**
     * Create an instance of {@link TiImageKinds }
     * 
     */
    public TiImageKinds createTiImageKinds() {
        return new TiImageKinds();
    }

    /**
     * Create an instance of {@link LoginReq }
     * 
     */
    public LoginReq createLoginReq() {
        return new LoginReq();
    }

    /**
     * Create an instance of {@link LoginResp }
     * 
     */
    public LoginResp createLoginResp() {
        return new LoginResp();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTimeReq }
     * 
     */
    public SearchPartiesByModifiedTimeReq createSearchPartiesByModifiedTimeReq() {
        return new SearchPartiesByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTimeResp }
     * 
     */
    public SearchPartiesByModifiedTimeResp createSearchPartiesByModifiedTimeResp() {
        return new SearchPartiesByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "Logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByGTIN")
    public JAXBElement<SearchGTINfromDatamarkSystemByGTIN> createSearchGTINfromDatamarkSystemByGTIN(SearchGTINfromDatamarkSystemByGTIN value) {
        return new JAXBElement<SearchGTINfromDatamarkSystemByGTIN>(_SearchGTINfromDatamarkSystemByGTIN_QNAME, SearchGTINfromDatamarkSystemByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByGTINResponse")
    public JAXBElement<SearchGTINfromDatamarkSystemByGTINResponse> createSearchGTINfromDatamarkSystemByGTINResponse(SearchGTINfromDatamarkSystemByGTINResponse value) {
        return new JAXBElement<SearchGTINfromDatamarkSystemByGTINResponse>(_SearchGTINfromDatamarkSystemByGTINResponse_QNAME, SearchGTINfromDatamarkSystemByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByModifiedTime")
    public JAXBElement<SearchGTINfromDatamarkSystemByModifiedTime> createSearchGTINfromDatamarkSystemByModifiedTime(SearchGTINfromDatamarkSystemByModifiedTime value) {
        return new JAXBElement<SearchGTINfromDatamarkSystemByModifiedTime>(_SearchGTINfromDatamarkSystemByModifiedTime_QNAME, SearchGTINfromDatamarkSystemByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByModifiedTimeResponse")
    public JAXBElement<SearchGTINfromDatamarkSystemByModifiedTimeResponse> createSearchGTINfromDatamarkSystemByModifiedTimeResponse(SearchGTINfromDatamarkSystemByModifiedTimeResponse value) {
        return new JAXBElement<SearchGTINfromDatamarkSystemByModifiedTimeResponse>(_SearchGTINfromDatamarkSystemByModifiedTimeResponse_QNAME, SearchGTINfromDatamarkSystemByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchPartiesByModifiedTime")
    public JAXBElement<SearchPartiesByModifiedTime> createSearchPartiesByModifiedTime(SearchPartiesByModifiedTime value) {
        return new JAXBElement<SearchPartiesByModifiedTime>(_SearchPartiesByModifiedTime_QNAME, SearchPartiesByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchPartiesByModifiedTimeResponse")
    public JAXBElement<SearchPartiesByModifiedTimeResponse> createSearchPartiesByModifiedTimeResponse(SearchPartiesByModifiedTimeResponse value) {
        return new JAXBElement<SearchPartiesByModifiedTimeResponse>(_SearchPartiesByModifiedTimeResponse_QNAME, SearchPartiesByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime> createSearchSimpleTradeitemsByModifiedTime(SearchSimpleTradeitemsByModifiedTime value) {
        return new JAXBElement<SearchSimpleTradeitemsByModifiedTime>(_SearchSimpleTradeitemsByModifiedTime_QNAME, SearchSimpleTradeitemsByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime2")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime2> createSearchSimpleTradeitemsByModifiedTime2(SearchSimpleTradeitemsByModifiedTime2 value) {
        return new JAXBElement<SearchSimpleTradeitemsByModifiedTime2>(_SearchSimpleTradeitemsByModifiedTime2_QNAME, SearchSimpleTradeitemsByModifiedTime2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime2Response")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime2Response> createSearchSimpleTradeitemsByModifiedTime2Response(SearchSimpleTradeitemsByModifiedTime2Response value) {
        return new JAXBElement<SearchSimpleTradeitemsByModifiedTime2Response>(_SearchSimpleTradeitemsByModifiedTime2Response_QNAME, SearchSimpleTradeitemsByModifiedTime2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime3")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime3> createSearchSimpleTradeitemsByModifiedTime3(SearchSimpleTradeitemsByModifiedTime3 value) {
        return new JAXBElement<SearchSimpleTradeitemsByModifiedTime3>(_SearchSimpleTradeitemsByModifiedTime3_QNAME, SearchSimpleTradeitemsByModifiedTime3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime3Response")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime3Response> createSearchSimpleTradeitemsByModifiedTime3Response(SearchSimpleTradeitemsByModifiedTime3Response value) {
        return new JAXBElement<SearchSimpleTradeitemsByModifiedTime3Response>(_SearchSimpleTradeitemsByModifiedTime3Response_QNAME, SearchSimpleTradeitemsByModifiedTime3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTimeResponse")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTimeResponse> createSearchSimpleTradeitemsByModifiedTimeResponse(SearchSimpleTradeitemsByModifiedTimeResponse value) {
        return new JAXBElement<SearchSimpleTradeitemsByModifiedTimeResponse>(_SearchSimpleTradeitemsByModifiedTimeResponse_QNAME, SearchSimpleTradeitemsByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLN")
    public JAXBElement<SearchTradeitemsByGLN> createSearchTradeitemsByGLN(SearchTradeitemsByGLN value) {
        return new JAXBElement<SearchTradeitemsByGLN>(_SearchTradeitemsByGLN_QNAME, SearchTradeitemsByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLNAndModifiedTime")
    public JAXBElement<SearchTradeitemsByGLNAndModifiedTime> createSearchTradeitemsByGLNAndModifiedTime(SearchTradeitemsByGLNAndModifiedTime value) {
        return new JAXBElement<SearchTradeitemsByGLNAndModifiedTime>(_SearchTradeitemsByGLNAndModifiedTime_QNAME, SearchTradeitemsByGLNAndModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLNAndModifiedTimeResponse")
    public JAXBElement<SearchTradeitemsByGLNAndModifiedTimeResponse> createSearchTradeitemsByGLNAndModifiedTimeResponse(SearchTradeitemsByGLNAndModifiedTimeResponse value) {
        return new JAXBElement<SearchTradeitemsByGLNAndModifiedTimeResponse>(_SearchTradeitemsByGLNAndModifiedTimeResponse_QNAME, SearchTradeitemsByGLNAndModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLNResponse")
    public JAXBElement<SearchTradeitemsByGLNResponse> createSearchTradeitemsByGLNResponse(SearchTradeitemsByGLNResponse value) {
        return new JAXBElement<SearchTradeitemsByGLNResponse>(_SearchTradeitemsByGLNResponse_QNAME, SearchTradeitemsByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByModifiedTime")
    public JAXBElement<SearchTradeitemsByModifiedTime> createSearchTradeitemsByModifiedTime(SearchTradeitemsByModifiedTime value) {
        return new JAXBElement<SearchTradeitemsByModifiedTime>(_SearchTradeitemsByModifiedTime_QNAME, SearchTradeitemsByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByModifiedTimeResponse")
    public JAXBElement<SearchTradeitemsByModifiedTimeResponse> createSearchTradeitemsByModifiedTimeResponse(SearchTradeitemsByModifiedTimeResponse value) {
        return new JAXBElement<SearchTradeitemsByModifiedTimeResponse>(_SearchTradeitemsByModifiedTimeResponse_QNAME, SearchTradeitemsByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByName")
    public JAXBElement<SearchTradeitemsByName> createSearchTradeitemsByName(SearchTradeitemsByName value) {
        return new JAXBElement<SearchTradeitemsByName>(_SearchTradeitemsByName_QNAME, SearchTradeitemsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByNameResponse")
    public JAXBElement<SearchTradeitemsByNameResponse> createSearchTradeitemsByNameResponse(SearchTradeitemsByNameResponse value) {
        return new JAXBElement<SearchTradeitemsByNameResponse>(_SearchTradeitemsByNameResponse_QNAME, SearchTradeitemsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByOKRB007")
    public JAXBElement<SearchTradeitemsByOKRB007> createSearchTradeitemsByOKRB007(SearchTradeitemsByOKRB007 value) {
        return new JAXBElement<SearchTradeitemsByOKRB007>(_SearchTradeitemsByOKRB007_QNAME, SearchTradeitemsByOKRB007 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByOKRB007Response")
    public JAXBElement<SearchTradeitemsByOKRB007Response> createSearchTradeitemsByOKRB007Response(SearchTradeitemsByOKRB007Response value) {
        return new JAXBElement<SearchTradeitemsByOKRB007Response>(_SearchTradeitemsByOKRB007Response_QNAME, SearchTradeitemsByOKRB007Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVED }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVED }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByTNVED")
    public JAXBElement<SearchTradeitemsByTNVED> createSearchTradeitemsByTNVED(SearchTradeitemsByTNVED value) {
        return new JAXBElement<SearchTradeitemsByTNVED>(_SearchTradeitemsByTNVED_QNAME, SearchTradeitemsByTNVED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVEDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVEDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByTNVEDResponse")
    public JAXBElement<SearchTradeitemsByTNVEDResponse> createSearchTradeitemsByTNVEDResponse(SearchTradeitemsByTNVEDResponse value) {
        return new JAXBElement<SearchTradeitemsByTNVEDResponse>(_SearchTradeitemsByTNVEDResponse_QNAME, SearchTradeitemsByTNVEDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "cleanTradeitemsOfPoolByDeleteTime")
    public JAXBElement<CleanTradeitemsOfPoolByDeleteTime> createCleanTradeitemsOfPoolByDeleteTime(CleanTradeitemsOfPoolByDeleteTime value) {
        return new JAXBElement<CleanTradeitemsOfPoolByDeleteTime>(_CleanTradeitemsOfPoolByDeleteTime_QNAME, CleanTradeitemsOfPoolByDeleteTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "cleanTradeitemsOfPoolByDeleteTimeResponse")
    public JAXBElement<CleanTradeitemsOfPoolByDeleteTimeResponse> createCleanTradeitemsOfPoolByDeleteTimeResponse(CleanTradeitemsOfPoolByDeleteTimeResponse value) {
        return new JAXBElement<CleanTradeitemsOfPoolByDeleteTimeResponse>(_CleanTradeitemsOfPoolByDeleteTimeResponse_QNAME, CleanTradeitemsOfPoolByDeleteTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCheckGTIN29")
    public JAXBElement<GetCheckGTIN29> createGetCheckGTIN29(GetCheckGTIN29 value) {
        return new JAXBElement<GetCheckGTIN29>(_GetCheckGTIN29_QNAME, GetCheckGTIN29 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCheckGTIN29Response")
    public JAXBElement<GetCheckGTIN29Response> createGetCheckGTIN29Response(GetCheckGTIN29Response value) {
        return new JAXBElement<GetCheckGTIN29Response>(_GetCheckGTIN29Response_QNAME, GetCheckGTIN29Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassificator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClassificator }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getClassificator")
    public JAXBElement<GetClassificator> createGetClassificator(GetClassificator value) {
        return new JAXBElement<GetClassificator>(_GetClassificator_QNAME, GetClassificator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassificatorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClassificatorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getClassificatorResponse")
    public JAXBElement<GetClassificatorResponse> createGetClassificatorResponse(GetClassificatorResponse value) {
        return new JAXBElement<GetClassificatorResponse>(_GetClassificatorResponse_QNAME, GetClassificatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCurrentTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCurrentTime")
    public JAXBElement<GetCurrentTime> createGetCurrentTime(GetCurrentTime value) {
        return new JAXBElement<GetCurrentTime>(_GetCurrentTime_QNAME, GetCurrentTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCurrentTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCurrentTimeResponse")
    public JAXBElement<GetCurrentTimeResponse> createGetCurrentTimeResponse(GetCurrentTimeResponse value) {
        return new JAXBElement<GetCurrentTimeResponse>(_GetCurrentTimeResponse_QNAME, GetCurrentTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFullPartyByGLN")
    public JAXBElement<GetFullPartyByGLN> createGetFullPartyByGLN(GetFullPartyByGLN value) {
        return new JAXBElement<GetFullPartyByGLN>(_GetFullPartyByGLN_QNAME, GetFullPartyByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLNResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFullPartyByGLNResponse")
    public JAXBElement<GetFullPartyByGLNResponse> createGetFullPartyByGLNResponse(GetFullPartyByGLNResponse value) {
        return new JAXBElement<GetFullPartyByGLNResponse>(_GetFullPartyByGLNResponse_QNAME, GetFullPartyByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTIN")
    public JAXBElement<GetFunctionalnameByGTIN> createGetFunctionalnameByGTIN(GetFunctionalnameByGTIN value) {
        return new JAXBElement<GetFunctionalnameByGTIN>(_GetFunctionalnameByGTIN_QNAME, GetFunctionalnameByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTIN2")
    public JAXBElement<GetFunctionalnameByGTIN2> createGetFunctionalnameByGTIN2(GetFunctionalnameByGTIN2 value) {
        return new JAXBElement<GetFunctionalnameByGTIN2>(_GetFunctionalnameByGTIN2_QNAME, GetFunctionalnameByGTIN2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTIN2Response")
    public JAXBElement<GetFunctionalnameByGTIN2Response> createGetFunctionalnameByGTIN2Response(GetFunctionalnameByGTIN2Response value) {
        return new JAXBElement<GetFunctionalnameByGTIN2Response>(_GetFunctionalnameByGTIN2Response_QNAME, GetFunctionalnameByGTIN2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTINResponse")
    public JAXBElement<GetFunctionalnameByGTINResponse> createGetFunctionalnameByGTINResponse(GetFunctionalnameByGTINResponse value) {
        return new JAXBElement<GetFunctionalnameByGTINResponse>(_GetFunctionalnameByGTINResponse_QNAME, GetFunctionalnameByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderReq")
    public JAXBElement<GetOldHeaderReq> createGetOldHeaderReq(GetOldHeaderReq value) {
        return new JAXBElement<GetOldHeaderReq>(_GetOldHeaderReq_QNAME, GetOldHeaderReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReqResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReqResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderReqResponse")
    public JAXBElement<GetOldHeaderReqResponse> createGetOldHeaderReqResponse(GetOldHeaderReqResponse value) {
        return new JAXBElement<GetOldHeaderReqResponse>(_GetOldHeaderReqResponse_QNAME, GetOldHeaderReqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderResp")
    public JAXBElement<GetOldHeaderResp> createGetOldHeaderResp(GetOldHeaderResp value) {
        return new JAXBElement<GetOldHeaderResp>(_GetOldHeaderResp_QNAME, GetOldHeaderResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderRespResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderRespResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderRespResponse")
    public JAXBElement<GetOldHeaderRespResponse> createGetOldHeaderRespResponse(GetOldHeaderRespResponse value) {
        return new JAXBElement<GetOldHeaderRespResponse>(_GetOldHeaderRespResponse_QNAME, GetOldHeaderRespResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldParty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldParty }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldParty")
    public JAXBElement<GetOldParty> createGetOldParty(GetOldParty value) {
        return new JAXBElement<GetOldParty>(_GetOldParty_QNAME, GetOldParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldPartyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldPartyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldPartyResponse")
    public JAXBElement<GetOldPartyResponse> createGetOldPartyResponse(GetOldPartyResponse value) {
        return new JAXBElement<GetOldPartyResponse>(_GetOldPartyResponse_QNAME, GetOldPartyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldTradeitem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldTradeitem }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldTradeitem")
    public JAXBElement<GetOldTradeitem> createGetOldTradeitem(GetOldTradeitem value) {
        return new JAXBElement<GetOldTradeitem>(_GetOldTradeitem_QNAME, GetOldTradeitem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldTradeitemResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldTradeitemResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldTradeitemResponse")
    public JAXBElement<GetOldTradeitemResponse> createGetOldTradeitemResponse(GetOldTradeitemResponse value) {
        return new JAXBElement<GetOldTradeitemResponse>(_GetOldTradeitemResponse_QNAME, GetOldTradeitemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByGLN")
    public JAXBElement<GetPartyByGLN> createGetPartyByGLN(GetPartyByGLN value) {
        return new JAXBElement<GetPartyByGLN>(_GetPartyByGLN_QNAME, GetPartyByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByGLNResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByGLNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByGLNResponse")
    public JAXBElement<GetPartyByGLNResponse> createGetPartyByGLNResponse(GetPartyByGLNResponse value) {
        return new JAXBElement<GetPartyByGLNResponse>(_GetPartyByGLNResponse_QNAME, GetPartyByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByUNP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByUNP }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByUNP")
    public JAXBElement<GetPartyByUNP> createGetPartyByUNP(GetPartyByUNP value) {
        return new JAXBElement<GetPartyByUNP>(_GetPartyByUNP_QNAME, GetPartyByUNP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByUNPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByUNPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByUNPResponse")
    public JAXBElement<GetPartyByUNPResponse> createGetPartyByUNPResponse(GetPartyByUNPResponse value) {
        return new JAXBElement<GetPartyByUNPResponse>(_GetPartyByUNPResponse_QNAME, GetPartyByUNPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getQuotaImportInfo")
    public JAXBElement<GetQuotaImportInfo> createGetQuotaImportInfo(GetQuotaImportInfo value) {
        return new JAXBElement<GetQuotaImportInfo>(_GetQuotaImportInfo_QNAME, GetQuotaImportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getQuotaImportInfoResponse")
    public JAXBElement<GetQuotaImportInfoResponse> createGetQuotaImportInfoResponse(GetQuotaImportInfoResponse value) {
        return new JAXBElement<GetQuotaImportInfoResponse>(_GetQuotaImportInfoResponse_QNAME, GetQuotaImportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getSimpleTradeitemsByGTIN")
    public JAXBElement<GetSimpleTradeitemsByGTIN> createGetSimpleTradeitemsByGTIN(GetSimpleTradeitemsByGTIN value) {
        return new JAXBElement<GetSimpleTradeitemsByGTIN>(_GetSimpleTradeitemsByGTIN_QNAME, GetSimpleTradeitemsByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getSimpleTradeitemsByGTINResponse")
    public JAXBElement<GetSimpleTradeitemsByGTINResponse> createGetSimpleTradeitemsByGTINResponse(GetSimpleTradeitemsByGTINResponse value) {
        return new JAXBElement<GetSimpleTradeitemsByGTINResponse>(_GetSimpleTradeitemsByGTINResponse_QNAME, GetSimpleTradeitemsByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINs }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTIImageKindsByGTINs")
    public JAXBElement<GetTIImageKindsByGTINs> createGetTIImageKindsByGTINs(GetTIImageKindsByGTINs value) {
        return new JAXBElement<GetTIImageKindsByGTINs>(_GetTIImageKindsByGTINs_QNAME, GetTIImageKindsByGTINs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTIImageKindsByGTINsResponse")
    public JAXBElement<GetTIImageKindsByGTINsResponse> createGetTIImageKindsByGTINsResponse(GetTIImageKindsByGTINsResponse value) {
        return new JAXBElement<GetTIImageKindsByGTINsResponse>(_GetTIImageKindsByGTINsResponse_QNAME, GetTIImageKindsByGTINsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTIN")
    public JAXBElement<GetTradeitemByGTIN> createGetTradeitemByGTIN(GetTradeitemByGTIN value) {
        return new JAXBElement<GetTradeitemByGTIN>(_GetTradeitemByGTIN_QNAME, GetTradeitemByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTINResponse")
    public JAXBElement<GetTradeitemByGTINResponse> createGetTradeitemByGTINResponse(GetTradeitemByGTINResponse value) {
        return new JAXBElement<GetTradeitemByGTINResponse>(_GetTradeitemByGTINResponse_QNAME, GetTradeitemByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshort }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTINshort")
    public JAXBElement<GetTradeitemByGTINshort> createGetTradeitemByGTINshort(GetTradeitemByGTINshort value) {
        return new JAXBElement<GetTradeitemByGTINshort>(_GetTradeitemByGTINshort_QNAME, GetTradeitemByGTINshort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTINshortResponse")
    public JAXBElement<GetTradeitemByGTINshortResponse> createGetTradeitemByGTINshortResponse(GetTradeitemByGTINshortResponse value) {
        return new JAXBElement<GetTradeitemByGTINshortResponse>(_GetTradeitemByGTINshortResponse_QNAME, GetTradeitemByGTINshortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINs }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINs")
    public JAXBElement<GetTradeitemsByGTINs> createGetTradeitemsByGTINs(GetTradeitemsByGTINs value) {
        return new JAXBElement<GetTradeitemsByGTINs>(_GetTradeitemsByGTINs_QNAME, GetTradeitemsByGTINs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINsResponse")
    public JAXBElement<GetTradeitemsByGTINsResponse> createGetTradeitemsByGTINsResponse(GetTradeitemsByGTINsResponse value) {
        return new JAXBElement<GetTradeitemsByGTINsResponse>(_GetTradeitemsByGTINsResponse_QNAME, GetTradeitemsByGTINsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShort }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINsShort")
    public JAXBElement<GetTradeitemsByGTINsShort> createGetTradeitemsByGTINsShort(GetTradeitemsByGTINsShort value) {
        return new JAXBElement<GetTradeitemsByGTINsShort>(_GetTradeitemsByGTINsShort_QNAME, GetTradeitemsByGTINsShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINsShortResponse")
    public JAXBElement<GetTradeitemsByGTINsShortResponse> createGetTradeitemsByGTINsShortResponse(GetTradeitemsByGTINsShortResponse value) {
        return new JAXBElement<GetTradeitemsByGTINsShortResponse>(_GetTradeitemsByGTINsShortResponse_QNAME, GetTradeitemsByGTINsShortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsOfPoolByModifiedTime")
    public JAXBElement<GetTradeitemsOfPoolByModifiedTime> createGetTradeitemsOfPoolByModifiedTime(GetTradeitemsOfPoolByModifiedTime value) {
        return new JAXBElement<GetTradeitemsOfPoolByModifiedTime>(_GetTradeitemsOfPoolByModifiedTime_QNAME, GetTradeitemsOfPoolByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsOfPoolByModifiedTimeResponse")
    public JAXBElement<GetTradeitemsOfPoolByModifiedTimeResponse> createGetTradeitemsOfPoolByModifiedTimeResponse(GetTradeitemsOfPoolByModifiedTimeResponse value) {
        return new JAXBElement<GetTradeitemsOfPoolByModifiedTimeResponse>(_GetTradeitemsOfPoolByModifiedTimeResponse_QNAME, GetTradeitemsOfPoolByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVariantByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVariantByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getVariantByGTIN")
    public JAXBElement<GetVariantByGTIN> createGetVariantByGTIN(GetVariantByGTIN value) {
        return new JAXBElement<GetVariantByGTIN>(_GetVariantByGTIN_QNAME, GetVariantByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVariantByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVariantByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getVariantByGTINResponse")
    public JAXBElement<GetVariantByGTINResponse> createGetVariantByGTINResponse(GetVariantByGTINResponse value) {
        return new JAXBElement<GetVariantByGTINResponse>(_GetVariantByGTINResponse_QNAME, GetVariantByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tradeitem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tradeitem }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "tradeitem")
    public JAXBElement<Tradeitem> createTradeitem(Tradeitem value) {
        return new JAXBElement<Tradeitem>(_Tradeitem_QNAME, Tradeitem.class, null, value);
    }

}
