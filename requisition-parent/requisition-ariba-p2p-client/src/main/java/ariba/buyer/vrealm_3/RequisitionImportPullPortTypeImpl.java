
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ariba.buyer.vrealm_3;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.17
 * 2015-10-12T17:21:14.734+03:00
 * Generated source version: 2.7.17
 * 
 */

@javax.jws.WebService(
                      serviceName = "RequisitionImportPull",
                      portName = "RequisitionImportPullPortType",
                      targetNamespace = "urn:Ariba:Buyer:vrealm_3",
                      wsdlLocation = "RequisitionImportPull.wsdl",
                      endpointInterface = "ariba.buyer.vrealm_3.RequisitionImportPullPortType")
                      
public class RequisitionImportPullPortTypeImpl implements RequisitionImportPullPortType {

    private static final Logger LOG = Logger.getLogger(RequisitionImportPullPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see ariba.buyer.vrealm_3.RequisitionImportPullPortType#requisitionImportPullOperation(ariba.buyer.vrealm_3.RequisitionImportPullRequest  body )*
     */
    public ariba.buyer.vrealm_3.RequisitionImportPullReply requisitionImportPullOperation(RequisitionImportPullRequest body) { 
        LOG.info("Executing operation requisitionImportPullOperation");
        System.out.println(body);
        try {
            ariba.buyer.vrealm_3.RequisitionImportPullReply _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}