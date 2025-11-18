package com.xworkz.checkedexception.event;

import java.security.acl.AclNotFoundException;
import java.rmi.activation.ActivationException;
import java.rmi.AlreadyBoundException;
import org.omg.CORBA.portable.ApplicationException;
import java.awt.AWTException;
import java.util.prefs.BackingStoreException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.security.auth.RefreshFailedException;
import javax.swing.text.BadLocationException;
import javax.management.BadStringOperationException;
import java.util.concurrent.BrokenBarrierException;
import java.security.cert.CertificateException;
import java.lang.CloneNotSupportedException;
import java.util.zip.DataFormatException;
import javax.transaction.xa.XAException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.security.auth.DestroyFailedException;
import java.util.concurrent.ExecutionException;
import javax.swing.tree.ExpandVetoException;
import java.awt.FontFormatException;
import java.security.GeneralSecurityException;
import org.ietf.jgss.GSSException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.InterruptedException;
import java.beans.IntrospectionException;
import java.io.InvalidObjectException;
import javax.sound.midi.InvalidMidiDataException;
import java.util.prefs.InvalidPreferencesFormatException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import javax.management.JMException;
import javax.xml.crypto.KeySelectorException;
import java.lang.invoke.LambdaConversionException;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import javax.sound.sampled.LineUnavailableException;
import javax.xml.bind.MarshalException;
import javax.sound.midi.MidiUnavailableException;
import javax.activation.MimeTypeParseException;
import javax.naming.NamingException;
import java.awt.geom.NoninvertibleTransformException;
import java.rmi.NotBoundException;
import java.nio.channels.NotYetConnectedException;
import java.text.ParseException;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.print.PrinterException;
import javax.print.PrintException;
import java.security.PrivilegedActionException;
import java.beans.PropertyVetoException;
import java.lang.ReflectiveOperationException;
import org.omg.CORBA.portable.RemarshalException;
import org.xml.sax.SAXException;
import javax.script.ScriptException;
import java.rmi.server.ServerNotActiveException;
import javax.xml.soap.SOAPException;
import java.sql.SQLException;
import java.util.concurrent.TimeoutException;
import java.util.TooManyListenersException;
import javax.xml.transform.TransformerException;
import java.lang.instrument.UnmodifiableClassException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.awt.datatransfer.UnsupportedFlavorException;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.crypto.URIReferenceException;
import java.net.URISyntaxException;
import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.stream.XMLStreamException;
import javax.xml.xpath.XPathException;

public class CheckedException {

    public void aclNotFoundException() throws AclNotFoundException {
        System.out.println("Throwing AclNotFoundException");
        throw new AclNotFoundException();
    }

    public void activationException() throws ActivationException {
        System.out.println("Throwing ActivationException");
        throw new ActivationException();
    }

    public void alreadyBoundException() throws AlreadyBoundException {
        System.out.println("Throwing AlreadyBoundException");
        throw new AlreadyBoundException();
    }

    public void applicationException() throws ApplicationException {
        System.out.println("Throwing ApplicationException");
        throw new ApplicationException(null, null);
    }

    public void awtException() throws AWTException {
        System.out.println("Throwing AWTException");
        throw new AWTException("");
    }

    public void backingStoreException() throws BackingStoreException {
        System.out.println("Throwing BackingStoreException");
        throw new BackingStoreException("");
    }

    public void badAttributeValueExpException() throws BadAttributeValueExpException {
        System.out.println("Throwing BadAttributeValueExpException");
        throw new BadAttributeValueExpException("");
    }

    public void badBinaryOpValueExpException() throws BadBinaryOpValueExpException {
        System.out.println("Throwing BadBinaryOpValueExpException");
        throw new BadBinaryOpValueExpException(null);
    }

    public void badLocationException() throws BadLocationException {
        System.out.println("Throwing BadLocationException");
        throw new BadLocationException("", 0);
    }

    public void badStringOperationException() throws BadStringOperationException {
        System.out.println("Throwing BadStringOperationException");
        throw new BadStringOperationException("");
    }

    public void brokenBarrierException() throws BrokenBarrierException {
        System.out.println("Throwing BrokenBarrierException");
        throw new BrokenBarrierException();
    }

    public void certificateException() throws CertificateException {
        System.out.println("Throwing CertificateException");
        throw new CertificateException();
    }

    public void cloneNotSupportedException() throws CloneNotSupportedException {
        System.out.println("Throwing CloneNotSupportedException");
        throw new CloneNotSupportedException();
    }

    public void dataFormatException() throws DataFormatException {
        System.out.println("Throwing DataFormatException");
        throw new DataFormatException();
    }

    public void datatypeConfigurationException() throws DatatypeConfigurationException {
        System.out.println("Throwing DatatypeConfigurationException");
        throw new DatatypeConfigurationException();
    }

    public void destroyFailedException() throws DestroyFailedException {
        System.out.println("Throwing DestroyFailedException");
        throw new DestroyFailedException();
    }

    public void executionException() throws ExecutionException {
        System.out.println("Throwing ExecutionException");
        throw new ExecutionException(new Throwable());
    }

    public void expandVetoException() throws ExpandVetoException {
        System.out.println("Throwing ExpandVetoException");
        throw new ExpandVetoException(null);
    }

    public void fontFormatException() throws FontFormatException {
        System.out.println("Throwing FontFormatException");
        throw new FontFormatException("");
    }

    public void generalSecurityException() throws GeneralSecurityException {
        System.out.println("Throwing GeneralSecurityException");
        throw new GeneralSecurityException();
    }

    public void gssException() throws GSSException {
        System.out.println("Throwing GSSException");
        throw new GSSException(0);
    }

    public void illegalClassFormatException() throws IllegalClassFormatException {
        System.out.println("Throwing IllegalClassFormatException");
        throw new IllegalClassFormatException();
    }

    public void interruptedException() throws InterruptedException {
        System.out.println("Throwing InterruptedException");
        throw new InterruptedException();
    }

    public void introspectionException() throws IntrospectionException {
        System.out.println("Throwing IntrospectionException");
        throw new IntrospectionException("");
    }

    public void invalidMidiDataException() throws InvalidMidiDataException {
        System.out.println("Throwing InvalidMidiDataException");
        throw new InvalidMidiDataException();
    }

    public void invalidPreferencesFormatException() throws InvalidPreferencesFormatException {
        System.out.println("Throwing InvalidPreferencesFormatException");
        throw new InvalidPreferencesFormatException("", null);
    }

    public void invalidTargetObjectTypeException() throws InvalidTargetObjectTypeException {
        System.out.println("Throwing InvalidTargetObjectTypeException");
        throw new InvalidTargetObjectTypeException("");
    }

    public void ioException() throws IOException {
        System.out.println("Throwing IOException");
        throw new IOException();
    }

    public void jaxbException() throws JAXBException {
        System.out.println("Throwing JAXBException");
        throw new JAXBException("");
    }

    public void jmException() throws JMException {
        System.out.println("Throwing JMException");
        throw new JMException();
    }

    public void keySelectorException() throws KeySelectorException {
        System.out.println("Throwing KeySelectorException");
        throw new KeySelectorException();
    }

    public void lambdaConversionException() throws LambdaConversionException {
        System.out.println("Throwing LambdaConversionException");
        throw new LambdaConversionException();
    }

    public void lineUnavailableException() throws LineUnavailableException {
        System.out.println("Throwing LineUnavailableException");
        throw new LineUnavailableException();
    }

    public void marshalException() throws MarshalException {
        System.out.println("Throwing MarshalException");
        throw new MarshalException("");
    }

    public void midiUnavailableException() throws MidiUnavailableException {
        System.out.println("Throwing MidiUnavailableException");
        throw new MidiUnavailableException();
    }

    public void mimeTypeParseException() throws MimeTypeParseException {
        System.out.println("Throwing MimeTypeParseException");
        throw new MimeTypeParseException();
    }

    public void namingException() throws NamingException {
        System.out.println("Throwing NamingException");
        throw new NamingException();
    }

    public void noninvertibleTransformException() throws NoninvertibleTransformException {
        System.out.println("Throwing NoninvertibleTransformException");
        throw new NoninvertibleTransformException("");
    }

    public void notBoundException() throws NotBoundException {
        System.out.println("Throwing NotBoundException");
        throw new NotBoundException();
    }

    public void parseException() throws ParseException {
        System.out.println("Throwing ParseException");
        throw new ParseException("", 0);
    }

    public void parserConfigurationException() throws ParserConfigurationException {
        System.out.println("Throwing ParserConfigurationException");
        throw new ParserConfigurationException();
    }

    public void printerException() throws PrinterException {
        System.out.println("Throwing PrinterException");
        throw new PrinterException();
    }

    public void printException() throws PrintException {
        System.out.println("Throwing PrintException");
        throw new PrintException();
    }

    public void privilegedActionException() throws PrivilegedActionException {
        System.out.println("Throwing PrivilegedActionException");
        throw new PrivilegedActionException(new Exception());
    }

    public void propertyVetoException() throws PropertyVetoException {
        System.out.println("Throwing PropertyVetoException");
        throw new PropertyVetoException("", null);
    }

    public void reflectiveOperationException() throws ReflectiveOperationException {
        System.out.println("Throwing ReflectiveOperationException");
        throw new ReflectiveOperationException();
    }

    public void refreshFailedException() throws RefreshFailedException {
        System.out.println("Throwing RefreshFailedException");
        throw new RefreshFailedException();
    }

    public void remarshalException() throws RemarshalException {
        System.out.println("Throwing RemarshalException");
        throw new RemarshalException();
    }

    public void saxException() throws SAXException {
        System.out.println("Throwing SAXException");
        throw new SAXException();
    }

    public void scriptException() throws ScriptException {
        System.out.println("Throwing ScriptException");
        throw new ScriptException("");
    }

    public void serverNotActiveException() throws ServerNotActiveException {
        System.out.println("Throwing ServerNotActiveException");
        throw new ServerNotActiveException();
    }

    public void soapException() throws SOAPException {
        System.out.println("Throwing SOAPException");
        throw new SOAPException();
    }

    public void sqlException() throws SQLException {
        System.out.println("Throwing SQLException");
        throw new SQLException();
    }

    public void timeoutException() throws TimeoutException {
        System.out.println("Throwing TimeoutException");
        throw new TimeoutException();
    }

    public void tooManyListenersException() throws TooManyListenersException {
        System.out.println("Throwing TooManyListenersException");
        throw new TooManyListenersException();
    }

    public void transformerException() throws TransformerException {
        System.out.println("Throwing TransformerException");
        throw new TransformerException("");
    }

    public void unmodifiableClassException() throws UnmodifiableClassException {
        System.out.println("Throwing UnmodifiableClassException");
        throw new UnmodifiableClassException();
    }

    public void unsupportedAudioFileException() throws UnsupportedAudioFileException {
        System.out.println("Throwing UnsupportedAudioFileException");
        throw new UnsupportedAudioFileException();
    }

    public void unsupportedCallbackException() throws UnsupportedCallbackException {
        System.out.println("Throwing UnsupportedCallbackException");
        throw new UnsupportedCallbackException(null);
    }

    public void unsupportedFlavorException() throws UnsupportedFlavorException {
        System.out.println("Throwing UnsupportedFlavorException");
        throw new UnsupportedFlavorException(null);
    }

    public void unsupportedLookAndFeelException() throws UnsupportedLookAndFeelException {
        System.out.println("Throwing UnsupportedLookAndFeelException");
        throw new UnsupportedLookAndFeelException("");
    }

    public void uriReferenceException() throws URIReferenceException {
        System.out.println("Throwing URIReferenceException");
        throw new URIReferenceException("", null);
    }

    public void uriSyntaxException() throws URISyntaxException {
        System.out.println("Throwing URISyntaxException");
        throw new URISyntaxException("", "");
    }

    public void xaException() throws XAException {
        System.out.println("Throwing XAException");
        throw new XAException();
    }

    public void xmlParseException() throws XMLParseException {
        System.out.println("Throwing XMLParseException");
        throw new XMLParseException(null, null);
    }

    public void xmlSignatureException() throws XMLSignatureException {
        System.out.println("Throwing XMLSignatureException");
        throw new XMLSignatureException();
    }

    public void xmlStreamException() throws XMLStreamException {
        System.out.println("Throwing XMLStreamException");
        throw new XMLStreamException();
    }

    public void xPathException() throws XPathException {
        System.out.println("Throwing XPathException");
        throw new XPathException("");
    }
}
