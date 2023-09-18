
package es.uned.scc.grados.appdist.trabajos.ws.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.uned.scc.grados.appdist.trabajos.ws.soap package. 
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

    private final static QName _OperationInfo_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "OperationInfo");
    private final static QName _SignalData_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "SignalData");
    private final static QName _SignalParameters_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "SignalParameters");
    private final static QName _WaveForm_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "WaveForm");
    private final static QName _GetSignalParameters_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "getSignalParameters");
    private final static QName _GetSignalParametersResponse_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "getSignalParametersResponse");
    private final static QName _GetSignalValue_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "getSignalValue");
    private final static QName _GetSignalValueResponse_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "getSignalValueResponse");
    private final static QName _IsRunning_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "isRunning");
    private final static QName _IsRunningResponse_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "isRunningResponse");
    private final static QName _SetSignalParameters_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "setSignalParameters");
    private final static QName _SetSignalParametersResponse_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "setSignalParametersResponse");
    private final static QName _Start_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "start");
    private final static QName _StartResponse_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "startResponse");
    private final static QName _Stop_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "stop");
    private final static QName _StopResponse_QNAME = new QName("http://ws.trabajos.appdist.grados.scc.uned.es/", "stopResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.uned.scc.grados.appdist.trabajos.ws.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperationInfo }
     * 
     */
    public OperationInfo createOperationInfo() {
        return new OperationInfo();
    }

    /**
     * Create an instance of {@link SignalData }
     * 
     */
    public SignalData createSignalData() {
        return new SignalData();
    }

    /**
     * Create an instance of {@link SignalParameters }
     * 
     */
    public SignalParameters createSignalParameters() {
        return new SignalParameters();
    }

    /**
     * Create an instance of {@link GetSignalParameters }
     * 
     */
    public GetSignalParameters createGetSignalParameters() {
        return new GetSignalParameters();
    }

    /**
     * Create an instance of {@link GetSignalParametersResponse }
     * 
     */
    public GetSignalParametersResponse createGetSignalParametersResponse() {
        return new GetSignalParametersResponse();
    }

    /**
     * Create an instance of {@link GetSignalValue }
     * 
     */
    public GetSignalValue createGetSignalValue() {
        return new GetSignalValue();
    }

    /**
     * Create an instance of {@link GetSignalValueResponse }
     * 
     */
    public GetSignalValueResponse createGetSignalValueResponse() {
        return new GetSignalValueResponse();
    }

    /**
     * Create an instance of {@link IsRunning }
     * 
     */
    public IsRunning createIsRunning() {
        return new IsRunning();
    }

    /**
     * Create an instance of {@link IsRunningResponse }
     * 
     */
    public IsRunningResponse createIsRunningResponse() {
        return new IsRunningResponse();
    }

    /**
     * Create an instance of {@link SetSignalParameters }
     * 
     */
    public SetSignalParameters createSetSignalParameters() {
        return new SetSignalParameters();
    }

    /**
     * Create an instance of {@link SetSignalParametersResponse }
     * 
     */
    public SetSignalParametersResponse createSetSignalParametersResponse() {
        return new SetSignalParametersResponse();
    }

    /**
     * Create an instance of {@link Start }
     * 
     */
    public Start createStart() {
        return new Start();
    }

    /**
     * Create an instance of {@link StartResponse }
     * 
     */
    public StartResponse createStartResponse() {
        return new StartResponse();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link StopResponse }
     * 
     */
    public StopResponse createStopResponse() {
        return new StopResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "OperationInfo")
    public JAXBElement<OperationInfo> createOperationInfo(OperationInfo value) {
        return new JAXBElement<OperationInfo>(_OperationInfo_QNAME, OperationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignalData }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "SignalData")
    public JAXBElement<SignalData> createSignalData(SignalData value) {
        return new JAXBElement<SignalData>(_SignalData_QNAME, SignalData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignalParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignalParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "SignalParameters")
    public JAXBElement<SignalParameters> createSignalParameters(SignalParameters value) {
        return new JAXBElement<SignalParameters>(_SignalParameters_QNAME, SignalParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WaveForm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WaveForm }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "WaveForm")
    public JAXBElement<WaveForm> createWaveForm(WaveForm value) {
        return new JAXBElement<WaveForm>(_WaveForm_QNAME, WaveForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignalParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSignalParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "getSignalParameters")
    public JAXBElement<GetSignalParameters> createGetSignalParameters(GetSignalParameters value) {
        return new JAXBElement<GetSignalParameters>(_GetSignalParameters_QNAME, GetSignalParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignalParametersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSignalParametersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "getSignalParametersResponse")
    public JAXBElement<GetSignalParametersResponse> createGetSignalParametersResponse(GetSignalParametersResponse value) {
        return new JAXBElement<GetSignalParametersResponse>(_GetSignalParametersResponse_QNAME, GetSignalParametersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignalValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSignalValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "getSignalValue")
    public JAXBElement<GetSignalValue> createGetSignalValue(GetSignalValue value) {
        return new JAXBElement<GetSignalValue>(_GetSignalValue_QNAME, GetSignalValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignalValueResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSignalValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "getSignalValueResponse")
    public JAXBElement<GetSignalValueResponse> createGetSignalValueResponse(GetSignalValueResponse value) {
        return new JAXBElement<GetSignalValueResponse>(_GetSignalValueResponse_QNAME, GetSignalValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsRunning }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsRunning }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "isRunning")
    public JAXBElement<IsRunning> createIsRunning(IsRunning value) {
        return new JAXBElement<IsRunning>(_IsRunning_QNAME, IsRunning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsRunningResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsRunningResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "isRunningResponse")
    public JAXBElement<IsRunningResponse> createIsRunningResponse(IsRunningResponse value) {
        return new JAXBElement<IsRunningResponse>(_IsRunningResponse_QNAME, IsRunningResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSignalParameters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetSignalParameters }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "setSignalParameters")
    public JAXBElement<SetSignalParameters> createSetSignalParameters(SetSignalParameters value) {
        return new JAXBElement<SetSignalParameters>(_SetSignalParameters_QNAME, SetSignalParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSignalParametersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetSignalParametersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "setSignalParametersResponse")
    public JAXBElement<SetSignalParametersResponse> createSetSignalParametersResponse(SetSignalParametersResponse value) {
        return new JAXBElement<SetSignalParametersResponse>(_SetSignalParametersResponse_QNAME, SetSignalParametersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Start }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Start }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "start")
    public JAXBElement<Start> createStart(Start value) {
        return new JAXBElement<Start>(_Start_QNAME, Start.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StartResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "startResponse")
    public JAXBElement<StartResponse> createStartResponse(StartResponse value) {
        return new JAXBElement<StartResponse>(_StartResponse_QNAME, StartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Stop }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Stop }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "stop")
    public JAXBElement<Stop> createStop(Stop value) {
        return new JAXBElement<Stop>(_Stop_QNAME, Stop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.trabajos.appdist.grados.scc.uned.es/", name = "stopResponse")
    public JAXBElement<StopResponse> createStopResponse(StopResponse value) {
        return new JAXBElement<StopResponse>(_StopResponse_QNAME, StopResponse.class, null, value);
    }

}
