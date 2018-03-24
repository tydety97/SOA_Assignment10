
package cn.edu.nju.soa.definition;

import edu.nju.soa.model.tns.*;

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
@WebService(name = "StudentPort", targetNamespace = "http://jw.nju.edu.cn/model")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StudentPort {


    /**
     * get student info
     * @param parameters sid
     * @return
     *     returns cn.edu.nju.jw.model.StudentType
     * @throws IdNotFoundException cannot find id
     */
    @WebMethod(action = "student/getInfoById")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
    @Action(input = "student/getInfoByIdRequest", output = "student/getInfoByIdResponse", fault = {
        @FaultAction(className = IdNotFoundException.class, value = "student/getInfoById/Fault/IdNotFoundException")
    })
    StudentType getInfoById(
            @WebParam(name = "getInfoByIdElement", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
                    GetInfoByIdType parameters)
        throws IdNotFoundException
    ;

    /**
     * delete student info
     * @param parameters sid
     * @return
     *     returns cn.edu.nju.jw.model.StudentType
     * @throws IdNotFoundException cannot find id
     * @throws AuthorityException do not have authority
     */
    @WebMethod(action = "student/deleteInfoById")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
    @Action(input = "student/deleteInfoByIdRequest", output = "student/deleteInfoByIdResponse", fault = {
        @FaultAction(className = IdNotFoundException.class, value = "student/deleteInfoById/Fault/IdNotFoundException"),
        @FaultAction(className = AuthorityException.class, value = "student/deleteInfoById/Fault/AuthorityException")
    })
    StudentType deleteInfoById(
            @WebParam(name = "deleteInfoByIdElement", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
                    DeleteInfoByIdType parameters)
        throws AuthorityException, IdNotFoundException
    ;

    /**
     * add student info
     * @param parameters student info
     * @return
     *     returns cn.edu.nju.jw.model.StudentType
     * @throws IdNotFoundException cannot find id
     */
    @WebMethod(action = "student/addInfo")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
    @Action(input = "student/addInfoRequest", output = "student/addInfoResponse", fault = {
        @FaultAction(className = IdNotFoundException.class, value = "student/addInfo/Fault/AuthorityException")
    })
    StudentType addInfo(
            @WebParam(name = "addInfoElement", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
                    AddInfoType parameters)
        throws IdNotFoundException
    ;

    /**
     * update student info
     * @param parameters student info
     * @return
     *     returns cn.edu.nju.jw.model.StudentType
     * @throws IdNotFoundException cannot find student
     * @throws ScoreTypeException score type error
     * @throws AuthorityException do not have authority
     * @throws ScoreModifyException score modify error
     */
    @WebMethod(action = "student/updateInfo")
    @WebResult(name = "\u5b66\u751f", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
    @Action(input = "student/updateInfoRequest", output = "student/updateInfoResponse", fault = {
        @FaultAction(className = AuthorityException.class, value = "student/updateInfo/Fault/AuthorityException"),
        @FaultAction(className = IdNotFoundException.class, value = "student/updateInfo/Fault/IdNotFoundException"),
        @FaultAction(className = ScoreTypeException.class, value = "student/updateInfo/Fault/ScoreTypeException"),
        @FaultAction(className = ScoreModifyException.class, value = "student/updateInfo/Fault/ScoreModifyException")
    })
    StudentType updateInfo(
            @WebParam(name = "updateInfoElement", targetNamespace = "http://jw.nju.edu.cn/model", partName = "parameters")
                    StudentType parameters)
        throws AuthorityException, IdNotFoundException, ScoreModifyException, ScoreTypeException
    ;

}