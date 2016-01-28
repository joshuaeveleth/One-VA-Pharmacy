
package gov.va.med.cds.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClinicalDataServiceSynchronousInterface", targetNamespace = "http://client.cds.med.va.gov")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ClinicalDataServiceSynchronousInterface {


    /**
     * 
     * @param in2
     * @param in1
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public String deleteClinicalData(
        @WebParam(name = "in0", partName = "in0")
        String in0,
        @WebParam(name = "in1", partName = "in1")
        String in1,
        @WebParam(name = "in2", partName = "in2")
        String in2);

    /**
     * 
     * @param in2
     * @param in1
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public String readClinicalData(
        @WebParam(name = "in0", partName = "in0")
        String in0,
        @WebParam(name = "in1", partName = "in1")
        String in1,
        @WebParam(name = "in2", partName = "in2")
        String in2);

    /**
     * 
     * @param in2
     * @param in1
     * @param in3
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public String readClinicalData1(
        @WebParam(name = "in0", partName = "in0")
        String in0,
        @WebParam(name = "in1", partName = "in1")
        String in1,
        @WebParam(name = "in2", partName = "in2")
        String in2,
        @WebParam(name = "in3", partName = "in3")
        String in3);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public boolean isAlive();

    /**
     * 
     * @param in2
     * @param in1
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public String updateClinicalData(
        @WebParam(name = "in0", partName = "in0")
        String in0,
        @WebParam(name = "in1", partName = "in1")
        String in1,
        @WebParam(name = "in2", partName = "in2")
        String in2);

    /**
     * 
     * @param in2
     * @param in1
     * @param in3
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public String createClinicalData1(
        @WebParam(name = "in0", partName = "in0")
        String in0,
        @WebParam(name = "in1", partName = "in1")
        String in1,
        @WebParam(name = "in2", partName = "in2")
        String in2,
        @WebParam(name = "in3", partName = "in3")
        boolean in3);

    /**
     * 
     * @param in2
     * @param in1
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public String appendClinicalData(
        @WebParam(name = "in0", partName = "in0")
        String in0,
        @WebParam(name = "in1", partName = "in1")
        String in1,
        @WebParam(name = "in2", partName = "in2")
        String in2);

    /**
     * 
     * @param in2
     * @param in1
     * @param in0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "out", partName = "out")
    public String createClinicalData(
        @WebParam(name = "in0", partName = "in0")
        String in0,
        @WebParam(name = "in1", partName = "in1")
        String in1,
        @WebParam(name = "in2", partName = "in2")
        String in2);

}
