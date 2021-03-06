
package cn.edu.nju.soa.definition;

import edu.nju.soa.model.tns.AuthVerifyType;
import edu.nju.soa.model.tns.IdNotFoundException;
import edu.nju.soa.model.tns.PswErrorException;
import edu.nju.soa.model.tns.VerifyType;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyAuth", targetNamespace = "http://jw.nju.edu.cn/model")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MyAuth {


    /**
     * Auth controller
     * @param parameters {@link AuthVerifyType}
     * @return
     *     returns cn.edu.nju.jw.model.VerifyType
     * @throws IdNotFoundException {@link IdNotFoundException} cannot find id
     * @throws PswErrorException {@link PswErrorException} password error
     */
    @WebMethod(action = "auth/verify")
    @WebResult(name = "验证信息", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
    @Action(input = "auth/verifyRequest", output = "auth/verifyResponse", fault = {
        @FaultAction(className = IdNotFoundException.class, value = "auth/verify/Fault/IdNotFoundException"),
        @FaultAction(className = PswErrorException.class, value = "auth/verify/Fault/PswErrorException")
    })
    VerifyType verify(
            @WebParam(name = "认证请求", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
                    AuthVerifyType parameters)
        throws IdNotFoundException, PswErrorException
    ;

}
